package com.bitconex.challenge.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bitconex.challenge.domain.Product;
import com.bitconex.challenge.domain.User;
import com.bitconex.challenge.domain.UserDTO;
import com.bitconex.challenge.model.UserRequestModel;
import com.bitconex.challenge.repository.ProductRepository;
import com.bitconex.challenge.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ProductRepository productRepository;

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public User createUser(@RequestBody UserDTO userDto) {
		Product product = productRepository.getProductById(new Long(userDto.getProductId()));
		User user = new User();
		if (userDto.getId()!=null)
			  user = userRepository.getUserById(new Long(userDto.getId()));
		if (user==null)	
			user= new User();
		user.setFullName(userDto.getFullName());
		List<Product> productList = new ArrayList<Product>();
		productList.add(product);
		user.setProduct(productList);
		return userRepository.save(user);
	}
	
	@RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
	public boolean deleteProduct(@RequestBody UserRequestModel userModel) {
		boolean result = true;
		Long userIdL = Long.valueOf(userModel.getUserId());
		try {
			userRepository.deleteById(userIdL);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
}
