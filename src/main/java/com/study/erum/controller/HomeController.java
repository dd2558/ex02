package com.study.erum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

/**
 * Handles requests for the application home page.
 */
@Controller
@Log4j
public class HomeController {
	
	@RequestMapping({"","/"}) //두개이상의 경로가 들어갈 경우 중괄호 (다중조건)
	public String home() {
		log.info("Welcome home!");
		return "index";
	}
	
}
