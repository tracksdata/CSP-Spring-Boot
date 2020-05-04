package com.example.demo.web;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.ItemLine;
import com.example.demo.model.Order;
import com.example.demo.model.User;
import com.example.demo.repository.OrderRepository;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/v1/api/orders/{user}")
public class OrderController {

	@Autowired
	private OrderRepository orderRepository;

	@GetMapping
	public List<Order> getAll(String user) {
		return orderRepository.findAll();
	}

	@PostMapping
	public ResponseEntity<?> save(@PathVariable String user) {

		String url = "http://localhost:8081/v1/api/cart/" + user;

		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<ItemLine[]> response = restTemplate.getForEntity(url, ItemLine[].class);
		ItemLine[] itemLines = response.getBody();

		double totalAmount = Arrays.stream(itemLines).mapToDouble(line -> line.getItem().getPrice()).sum();

		Order order = new Order();
		
		order.setDate(new Date());
		//User userName=orderRepository.findUserByUser(user);
		User userName=new User();
		userName.setUserId("abc");
		userName.setPassword("password1$");
		userName.setUserRole("user");
		//order.setUser(userName);
		order.setAmount(totalAmount);
		

		//Order savedOrder = orderRepository.save(order);
		restTemplate.delete(url);

		return null;//ResponseEntity.status(HttpStatus.CREATED).body(savedOrder);

	}

}
