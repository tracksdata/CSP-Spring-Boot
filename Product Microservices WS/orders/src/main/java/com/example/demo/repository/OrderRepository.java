package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Order;
import com.example.demo.model.User;

public interface OrderRepository extends JpaRepository<Order, Integer> { 
	
	//public User findUserByUser(String userName);

}
