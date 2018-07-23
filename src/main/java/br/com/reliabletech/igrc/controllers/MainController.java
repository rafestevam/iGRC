package br.com.reliabletech.igrc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/iGRC")
	public String teste(){
		return "iGRC";
	}
	
}
