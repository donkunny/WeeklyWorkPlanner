package com.lotte.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lotte.testService.TestService;

@Controller
public class EmpController {

	@Inject
	TestService service;
	
	@RequestMapping(value="/index")
	public void test(){
		
	}
}
