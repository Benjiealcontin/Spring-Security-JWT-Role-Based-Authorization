package com.operation.Authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"Controller", "Service", "Config", "Response", "UserDetailsService"})
@EntityScan("Entity")
@EnableJpaRepositories("Respository")
public class JwtAuthenticationWithRolesSpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtAuthenticationWithRolesSpringSecurityApplication.class, args);
	}

}
