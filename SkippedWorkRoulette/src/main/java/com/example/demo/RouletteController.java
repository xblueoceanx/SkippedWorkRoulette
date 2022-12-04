package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RouletteController {

	//スタート画面に遷移
	@RequestMapping("/")
	public String start() {

		return "input.html";

	}

	//ルーレット画面に遷移
	@RequestMapping("/Roulette")
	public String Roulette() {

		return "RouletteView.html";

	}

}
