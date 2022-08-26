package com.example.signerdemo;

import dependency.SomeBean;
import org.springframework.aot.AotDetector;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SignerDemoApplication {

	public static void main(String[] args) {
		boolean aot = AotDetector.useGeneratedArtifacts();
		System.out.println("AOT mode: " + aot);

		SpringApplication.run(SignerDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner clr(SomeBean someBean) {
		return args -> someBean.hello();
	}

}
