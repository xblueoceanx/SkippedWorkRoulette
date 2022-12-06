package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

	//スタート画面からルーレット画面に遷移
	@PostMapping("/Roulette")
    public String toRedirect(RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("pushedBtn", "スタートボタン");
        return "RouletteView.html";
    }

}
