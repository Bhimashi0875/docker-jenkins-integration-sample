package com.javatechie.docker.jenkins.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerJenkinsIntegrationSampleApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to JavaTechie..");
		SpringApplication.run(DockerJenkinsIntegrationSampleApplication.class, args);
	}

}
