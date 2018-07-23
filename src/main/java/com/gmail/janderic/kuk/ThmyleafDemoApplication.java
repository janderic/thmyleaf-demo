package com.gmail.janderic.kuk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.gmail.janderic.kuk"})
public class ThmyleafDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThmyleafDemoApplication.class, args);
	}
}
