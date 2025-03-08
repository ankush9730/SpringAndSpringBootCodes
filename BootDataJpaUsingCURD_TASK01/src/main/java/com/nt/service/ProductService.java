package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Product;
import com.nt.repository.ProductRepository;

@Service
public class ProductService implements IProductService {

	@Autowired
	private ProductRepository productRepo;

	@Override
	public String insertProduct(Product product) {
		// save the object(insert the record)
		Product productSaved = productRepo.save(product);
		// get the generated id value
		int iVal = productSaved.getProductId();
		return "Product Objecet Saved With id::" + iVal;

	}

	@Override
	public Iterable<Product> getAllProudcts() {
		Iterable<Product> p = productRepo.findAll();
		p.forEach(System.out::println);
		return p;
	}

	@Override
	public Optional<Product> findProductById(Integer id) {

		Optional<Product> opt = productRepo.findById(id);
		if (opt.isEmpty()) {
			return Optional.empty();
		}
		else
			return opt;

	}

	@Override
	public void deleteProductById(Integer id) {

		 productRepo.deleteById(id);
		
	}

}
