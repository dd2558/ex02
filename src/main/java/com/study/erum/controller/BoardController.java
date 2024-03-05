package com.study.erum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board") //board로 시작하는 경로는 게시판
public class BoardController {
	
	@GetMapping("save")
	public String saveFrom() {
		return "save";
	}
}
