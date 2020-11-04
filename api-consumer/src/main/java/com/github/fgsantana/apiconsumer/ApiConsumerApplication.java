package com.github.fgsantana.apiconsumer;

import com.github.fgsantana.apiconsumer.client.ClassClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

public class ApiConsumerApplication {



	public static void main(String[] args) {
		SpringApplication.run(ApiConsumerApplication.class, args);
	}

}
