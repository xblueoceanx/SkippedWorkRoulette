package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Title {

	@RequestMapping("/title")
	public void start() {

		System.out.println("aa");

	}

}
