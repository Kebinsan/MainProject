package com.project.smappy;

import com.project.smappy.classes.user.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class SmappyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmappyApplication.class, args);
	}
}
