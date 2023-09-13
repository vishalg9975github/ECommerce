package com.industrial.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.industrial.project.model.UserDetails;
import com.industrial.project.service.UserDetailsService;

@RestController
@RequestMapping("/userDetails")
public class UserDetailsController {

	private static final Logger logger = LoggerFactory.getLogger(UserDetailsController.class);
	@Autowired
	private UserDetailsService userDetailsService;

	@PostMapping("/saveUserDetails")
	public UserDetails saveUserDetails(@RequestBody UserDetails userDetails) {

		logger.info("UserDetailsController class save method");
		UserDetails ud = userDetailsService.saveUserDetails(userDetails);
		return ud;
	}

}
