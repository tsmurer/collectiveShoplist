package com.tsmurer.shopjoin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.tsmurer.shopjoin"})
public class ShopjoinApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopjoinApplication.class, args);
	}

}
