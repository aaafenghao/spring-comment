package com.fh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {


	public IndexController(){
		System.out.println("indexController初始化");
	}


	@GetMapping("index")
	@ResponseBody
	public String index(){
		return "index";
	}
}
