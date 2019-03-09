package com.infoiv.restclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class RestclientApplication {

	@Value("${message:this is a default message!!!}")
	private String message;
	
	public static void main(String[] args) {
		SpringApplication.run(RestclientApplication.class, args);
	}
	
	@GetMapping(value="rest")
	public String getMessage() {
		
		return this.message;
	}

}
