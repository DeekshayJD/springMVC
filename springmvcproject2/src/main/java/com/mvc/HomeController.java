package com.mvc;

import java.util.ArrayList;
import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
@RequestMapping("/home")
	
public String home(Model model){
	
model.addAttribute("name","deekshay");
model.addAttribute("id",420);

		System.out.println("hello guys");
		return "index";
	}
	

@RequestMapping("/about")
	public String about()
	{
		System.out.println("hello girls");
		return "index2";
	}
@RequestMapping("/info")
public String info(){
	System.out.println("hai nikki");
	return "index3";
}
	
}
