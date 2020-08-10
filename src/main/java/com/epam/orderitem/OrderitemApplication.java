package com.epam.orderitem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages= {"com.epam.orderitem"})
@SpringBootApplication
@EnableJpaRepositories(basePackages = { "com.epam.orderitem.repository" })
@EntityScan("com.epam.orderitem.dto")
public class OrderitemApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderitemApplication.class, args);
	}

}
