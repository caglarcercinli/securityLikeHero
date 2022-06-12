package com.caglar.demo;

import com.caglar.demo.models.Role;
import com.caglar.demo.models.User;
import com.caglar.demo.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class DemoApplication {
	private final BCryptPasswordEncoder bCryptPasswordEncoder;

	public DemoApplication(BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(UserService userService) {
		return args -> {
			userService.save(Role.builder().name("ROLE_USER").build());
			userService.save(Role.builder().name("ROLE_ADMIN").build());

			userService.save(User.builder().name("John").username("jdoe").password("1234").build());

			userService.addRoleTo("jdoe","ROLE_USER");
		};
	}

}
