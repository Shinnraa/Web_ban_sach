package com.example.Web_ban_sach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
@SpringBootApplication(exclude = org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class)

public class WebBanSachApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebBanSachApplication.class, args);
	}

}
