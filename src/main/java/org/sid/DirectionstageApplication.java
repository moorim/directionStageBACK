package org.sid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.sid"})
public class DirectionstageApplication {

	public static void main(String[] args) {
		SpringApplication.run(DirectionstageApplication.class, args);
	}

}
