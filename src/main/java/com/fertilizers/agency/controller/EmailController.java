package com.fertilizers.agency.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fertilizers.agency.service.EmailService;

@RestController()
@RequestMapping("/eamil")
public class EmailController
{

	@Autowired
	private EmailService emailService;

	@GetMapping(value = "/sendmail")
	public String sendmail()
	{

		emailService.sendMail("Add your ,mail address", "Test Subject", "Test mail");

		return "emailsent";
	}

}
