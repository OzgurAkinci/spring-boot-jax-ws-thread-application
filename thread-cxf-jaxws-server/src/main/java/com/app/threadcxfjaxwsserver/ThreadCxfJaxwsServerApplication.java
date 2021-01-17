package com.app.threadcxfjaxwsserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ThreadCxfJaxwsServerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ThreadCxfJaxwsServerApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ThreadCxfJaxwsServerApplication.class);
	}
}
