package com.ibd.ibd;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class IbdApplication implements CommandLineRunner{


	public static void main(String[] args) {
		SpringApplication.run(IbdApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedMethods("PUT", "DELETE","GET","POST");
			}
		};
	}
}
