package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class studentcontroller {
	@RequestMapping("/showform")
	
public String showform(Model themodel) {
		themodel.addAttribute("student", new Student());
		return "form";
		
	}
	@RequestMapping("/processform")
	 public String processform(@Valid @ModelAttribute("student") Student thestudent, BindingResult theBindingResult){
		{
			if(theBindingResult.hasErrors()) {
				return "form";
				
			}
			else {
				return "main-menu";
			}
		}
	
	
}
	}
