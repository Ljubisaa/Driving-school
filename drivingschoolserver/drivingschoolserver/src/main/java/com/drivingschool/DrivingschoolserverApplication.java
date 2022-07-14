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


	public static void main(String[] args) {
		SpringApplication.run(DrivingschoolserverApplication.class, args);
}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("Starting code...");


	}

}
