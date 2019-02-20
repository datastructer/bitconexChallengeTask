package com.bitconex.challenge.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bitconex.challenge.domain.Product;
import com.bitconex.challenge.model.ProductRequestModel;
import com.bitconex.challenge.repository.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}
	
	@RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
	public Product createProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}
	
	
	@RequestMapping(value = "/deleteProduct", method = RequestMethod.POST)
	public boolean deleteProduct(@RequestBody ProductRequestModel productModel) {
		boolean result = true;
		Long productIdL = Long.valueOf(productModel.getProductId());
		try {
			productRepository.deleteById(productIdL);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
	
	@GetMapping("/productsById")
	public Optional<Product> getProductById(@RequestBody ProductRequestModel product) {
		return productRepository.findById(product.getProductId());
	}

}
