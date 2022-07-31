package com.huabai.jenkins.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsDockerGithubIntegrationPipelineApplication {

	@GetMapping
	public String message(){

		return "welcome to Huabai Jenkins Pipeline!";
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDockerGithubIntegrationPipelineApplication.class, args);
	}

}
