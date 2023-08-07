package com.shanto.springboot_gradle_rest_sw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
//@EnableSwagger2
public class SpringbootGradleRestSwApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGradleRestSwApplication.class, args);
	}

}
