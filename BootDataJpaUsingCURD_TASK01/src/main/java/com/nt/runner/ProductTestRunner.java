package com.nt.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.controller.ProductController;
import com.nt.service.ProductService;

@Component
public class ProductTestRunner implements CommandLineRunner {

	@Autowired
	private ProductService prodService;

	// Dependent class
	@Autowired
	private ProductController productController;
	Scanner sc = new Scanner(System.in);

	@Override
	public void run(String... args) throws Exception {

		try {
//			Product product = new Product(null, "Laptop", "i7,8GB RAM,512GB ROM", 53000d);
//			String result = prodService.insertProduct(product);
//			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {

			

			while (true) {

				System.out.println("===========================================");
				System.out.println("Option 1: Insert a new product by calling insertProduct(Product product).");
				System.out.println("Option 2: Retrieve all products by calling retrieveAllProducts().");
				System.out.println("Option 3: Find a product by its ID by calling findProductById(Long id)");
				System.out.println("Option 4: Delete a product by its ID by calling deleteProductById(Long id).");
				System.out.println("Option 5: Exit the application");
				System.out.println("===========================================");
				System.out.println();
				System.out.print("Enter Your Choice : ");
				int choice = sc.nextInt();
				switch (choice) {

				case 1:
					productController.addProduct();
					break;
					
				case 2:
					prodService.getAllProudcts();
					break;
					
				case 3:
					productController.findProduct();
					break;
					
				case 4:
					productController.delectById();
				case 5:
					System.exit(0);
					break;
					
					default :
					System.err.println("Invalid Input..! Try Again..!");
					break;
					
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
