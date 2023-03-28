package com.example.binance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients
//@ComponentScan(basePackages = "com.example.binance.client")
public class BinanceApplication {
	public static void main(String[] args) {
		SpringApplication.run(BinanceApplication.class, args);
	}

}
