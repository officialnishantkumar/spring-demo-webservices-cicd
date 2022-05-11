package com.myapp.spring.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myapp.spring.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	//select * from devops_products where price>=
	Optional<List<Product>> findByPriceGreaterThanEqual(Double price);
	Optional<List<Product>> findByPrice(Double price);
	//select * from devops_products where productname= or price =
	Optional<List<Product>> findByProductNameOrPrice(String productName,Double price);
	
}
