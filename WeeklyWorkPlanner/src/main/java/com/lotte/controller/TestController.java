/**
 * @author 김동혁
 */
package com.lotte.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lotte.testDTO.TestDTO;
import com.lotte.testService.TestService;

@Controller
public class TestController {

	@Inject
	TestService service;
	
	@RequestMapping(value="/listAll")
	public void listAll(Model model) throws Exception{
		model.addAttribute("list", service.listAll());
	}
	
	@RequestMapping(value="/index")
	public void index(Model model) throws Exception{
	}
}
