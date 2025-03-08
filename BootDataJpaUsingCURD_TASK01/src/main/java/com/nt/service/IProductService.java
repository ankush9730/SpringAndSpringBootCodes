package com.nt.service;

import java.util.Optional;

import com.nt.entity.Product;

public interface IProductService{

	public String insertProduct(Product product);
	public Iterable<Product> getAllProudcts();
	public Optional<Product> findProductById(Integer id);
	public void deleteProductById(Integer id);
}
