package com.nt.repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
