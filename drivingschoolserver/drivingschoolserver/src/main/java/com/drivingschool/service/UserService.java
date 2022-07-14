package com.drivingschool.service;

import java.util.Set;

import com.drivingschool.model.User;
import com.drivingschool.model.UserRole;

public interface UserService {

	public User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	public User getUser(String username);
	
	public void deleteUser(Long userId);
}
