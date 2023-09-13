package com.industrial.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.industrial.project.model.UserDetails;
import com.industrial.project.repository.UserDetailsRepository;
import com.industrial.project.service.UserDetailsService;

@Service
public class UserDeatilsServiceImpl implements UserDetailsService {

	@Autowired
	private UserDetailsRepository userDetailsRepository;

	@Override
	public UserDetails saveUserDetails(UserDetails UserDetails) {
		UserDetails uDetail = userDetailsRepository.save(UserDetails);
		return uDetail;
	}

}
