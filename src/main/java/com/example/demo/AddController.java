package com.example.demo;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;  

@Controller
public class AddController {
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	@RequestMapping("/add")
	public String home(HttpServletRequest request,Model m)
	{
		int a=Integer.parseInt(request.getParameter("num1"));
		int b=Integer.parseInt(request.getParameter("num2"));
		int c=a+b;
		m.addAttribute("sum",c);
		return "result";
	}

}
