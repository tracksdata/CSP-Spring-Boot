package com.cts.product.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.cts.product.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private JdbcTemplate jt;

	@Override
	public int count() {
		return jt.queryForObject("select count(*) from product", Integer.class);
	}

	@Override
	public int saveProduct(Product prod) {
		// TODO Auto-generated method stub
		String saveQuery = "insert into product values(?,?,?,?)";
		return jt.update(saveQuery, prod.getId(), prod.getDescription(), prod.getName(), prod.getPrice());
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		String selectQry = "select * from product";

		return jt.query(selectQry, new ResultSetExtractor<List<Product>>() {
			@Override
			public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {

				List<Product> prods = new ArrayList<>();
				while (rs.next()) {
					Product prod = new Product();
					prod.setId(rs.getInt("id"));
					prod.setName(rs.getString("name"));
					prod.setPrice(rs.getDouble("price"));
					prod.setDescription(rs.getString("description"));
					prods.add(prod);

				}

				return prods;
			}
		});
	}

	@Override
	public List<Product> findByName(String name) {

		String findByName = "select * from product where name like ?";

		return jt.query(findByName, new ResultSetExtractor<List<Product>>() {
			@Override
			public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {

				List<Product> prods = new ArrayList<>();
				while (rs.next()) {
					Product prod = new Product();
					prod.setId(rs.getInt("id"));
					prod.setName(rs.getString("name"));
					prod.setPrice(rs.getDouble("price"));
					prod.setDescription(rs.getString("description"));
					prods.add(prod);

				}

				return prods;
			}
		}, "%" + name + "%");
	}

	@Override
	public Product findById(int id) {

		String findById = "select * from product where id=?";
		return jt.query(findById, new ResultSetExtractor<Product>() {
			@Override
			public Product extractData(ResultSet rs) throws SQLException, DataAccessException {

				Product prod = null;
				if (rs.next()) {
					prod = new Product();
					prod.setId(rs.getInt("id"));
					prod.setName(rs.getString("name"));
					prod.setPrice(rs.getDouble("price"));
					prod.setDescription(rs.getString("description"));
				}

				return prod;
			}
		}, id);

	}

	@Override
	public int update(Product prod) {
		String updateQuery = "update product set name=?,description=?,price=? where id=?";

		Product p = findById(prod.getId());
		if (p != null) {
			return jt.update(updateQuery, prod.getName(), prod.getDescription(), prod.getPrice(), prod.getId());
		}

		return 0;
	}

	@Override
	public int delete(int id) {
		String deleteQry = "delete from  product where id=?";

		Product p = findById(id);
		if (p != null) {
			return jt.update(deleteQry, id);
		}

		return 0;
	}

}
