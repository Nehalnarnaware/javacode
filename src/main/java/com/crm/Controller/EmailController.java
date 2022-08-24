package com.crm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.utilites.EmailService;

@Controller
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	
	
	@RequestMapping("/sendEmail")
	public String showEmailpage(@RequestParam("email") String email, ModelMap model) {
		model.addAttribute("to", email);
		
	return "compose_email";
		
	}
	@RequestMapping("/send")
	public String sendEmail(@RequestParam("to") String to, @RequestParam("sub") String sub , @RequestParam("massage") String massage ,ModelMap model) {
		
		emailService.sendSimpleMessage(to, sub, massage);
		
		model.addAttribute("msg", "Email send !");
		return "compose_email";
	
	}
	

}
