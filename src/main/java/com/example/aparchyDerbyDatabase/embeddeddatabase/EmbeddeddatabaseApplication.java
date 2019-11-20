package com.example.aparchyDerbyDatabase.embeddeddatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.aparchyDerbyDatabase.embeddeddatabase.controller;"})
@ComponentScan(basePackages = {"com.example.aparchyDerbyDatabase.embeddeddatabase.service;"})
//@EnableSwagger2
public class EmbeddeddatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmbeddeddatabaseApplication.class, args);
	}

//	@Bean
//	   public Docket productApi() {
//	      return new Docket(DocumentationType.SWAGGER_2).select()
//	         .apis(RequestHandlerSelectors.basePackage("com.tutorialspoint.swaggerdemo")).build();
//	   }
}
