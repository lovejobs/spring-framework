package com.lovejobs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@Autowired
	ApplicationContext context;

	@RequestMapping("/hello/string")
	public String returnString() {
		for (String beanDefinitionName : context.getBeanDefinitionNames()) {
			System.out.println(beanDefinitionName);
		}
		return "index";
	}

	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
