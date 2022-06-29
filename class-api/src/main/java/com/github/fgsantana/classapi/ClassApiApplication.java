package com.github.fgsantana.classapi;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@OpenAPIDefinition(info = @Info(title = "Basic REST API"))
@SpringBootApplication
public class ClassApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassApiApplication.class, args);
	}

}
