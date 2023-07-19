package com.otekin.dev.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.otekin.dev.dto.UserRegistrationDto;
import com.otekin.dev.model.User;

public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto registrationDto);
	List<User> getAll();
}
