package com.myapp.spring

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.web.bind.annotation.GetMapping

@SpringBootApplication
class DevopsGroovyProductApplication extends SpringBootServletInitializer {

	static void main(String[] args) {
		SpringApplication.run(DevopsGroovyProductApplication, args)
	}

	@GetMapping
	def sayHello() {
		return "Hello"
	}
	
}
