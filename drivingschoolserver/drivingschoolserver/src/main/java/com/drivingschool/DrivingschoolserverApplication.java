package com.drivingschool;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.drivingschool.model.Role;
import com.drivingschool.model.User;
import com.drivingschool.model.UserRole;
import com.drivingschool.service.UserService;

@SpringBootApplication
public class DrivingschoolserverApplication implements CommandLineRunner {

	@Autowired
	UserService userService;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(DrivingschoolserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("Starting code...");

//		User user = new User();
//
//		user.setFirstName("Ljubisa");
//		user.setLastName("Savic");
//		user.setUsername("Ljubisa");
//		user.setPassword(this.bCryptPasswordEncoder.encode("abc"));
//		user.setEmail("abc@gsg.com");
//		user.setProfile("default.png");
//
//		Role role1 = new Role();
//
//		role1.setRoleId(44L);
//		role1.setRoleName("ADMIN");
//
//		Set<UserRole> userRoleSet = new HashSet<>();
//		UserRole userRole = new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//
//		userRoleSet.add(userRole);
//
//		User user1 = this.userService.createUser(user, userRoleSet);
//		System.out.println(user1.getUsername());

	}

}
