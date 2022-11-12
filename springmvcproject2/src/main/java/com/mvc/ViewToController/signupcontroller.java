package com.mvc.ViewToController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.UserDao.Userservice;
import com.mvc.model.User;

import org.springframework.web.bind.annotation.*;;


@Controller
public class signupcontroller {
@Autowired
	private Userservice Userservice;
	//process controller
	@RequestMapping("/contact")
	public String contact()
	{
		System.out.println("hi signup");
		return "signup";
	}
	
	//handler controller which specifies the final destination of signup.jsp
	
	
	@RequestMapping(path="/proccess",method=RequestMethod.POST)
	public String hadndleFormData(@ModelAttribute User user,Model model)	 
			
	{
		System.out.println(user);
	/*model.addAttribute("u",user.getUsername());
	model.addAttribute("p",user.getUserPassword());
	model.addAttribute("e",user.getUserEmail());*/
		return "success";
	
		/* @RequestParam("username") String user_name,
		 @RequestParam("userEmail") String user_Email,
		 @RequestParam("userPassword") String user_Password
	  System.out.println("your name is "+user_name);
	System.out.println("your email is "+user_Email);
	System.out.println("your password is "+user_Password);
	return "success";*/
	
		
		
		
	}}
		
	
	

