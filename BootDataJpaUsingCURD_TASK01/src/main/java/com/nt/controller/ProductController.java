package com.nt.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.entity.Product;
import com.nt.service.IProductService;

@Component
public class ProductController {

	@Autowired
	private IProductService productservice;
	
	Scanner sc=new Scanner(System.in);
	
	public void addProduct() {
		 
		
		System.out.println("Enter the Product Name:");
		String name=sc.nextLine();
		
		System.out.println("Enter the product description:");
		String description=sc.nextLine();
		description=sc.nextLine();
		
		System.out.println("Enter the Product Price:");
		double price=sc.nextDouble();
		
		Product p1=new Product(null,name,description,price);
		System.err.println("Product Inserted Successfully...!");
		productservice.insertProduct(p1);
		
		//Product p2=new Product(id,name,description,price);
	}
	
	public void findProduct() {
		System.err.println("Product Find Successfully...!");
		System.out.println(productservice.findProductById(105));//chang by maually
	}
	
	public void delectById() {
		System.err.println("Product Deleted Successfully...!");
		productservice.deleteProductById(108);
	}
	 }
