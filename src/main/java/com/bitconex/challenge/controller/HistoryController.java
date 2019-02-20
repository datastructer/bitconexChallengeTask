package com.bitconex.challenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bitconex.challenge.model.HistoryModel;
import com.bitconex.challenge.model.UserRequestModel;
import com.bitconex.challenge.repository.HistoryModelRepository;

@RestController
public class HistoryController {
	
	@Autowired
	private HistoryModelRepository userModelRepository;

	
	@RequestMapping(value = "/userHistory", method = RequestMethod.POST)
	public List<HistoryModel> userHistory(@RequestBody UserRequestModel user) {
		return  userModelRepository.getUserHistoryById(user.getUserId());

	}
	
	
}
