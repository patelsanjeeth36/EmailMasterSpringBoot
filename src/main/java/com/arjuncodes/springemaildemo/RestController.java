package com.arjuncodes.springemaildemo;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	 @Autowired 
	 private EmailSenderService senderService;
	 
	@GetMapping("/getR")
	public void triggerMail() throws MessagingException {
//		  senderService.sendSimpleEmail("patelsanjeeth36@gmail.com", "This is email subject : OTP",
//		  "This is email body " + senderService.OTP());
		  System.out.println(senderService.OTP());
		  senderService.sendSimpleEmail("patelsanjeeth36@gmail.com", "OTP",
				  senderService.OTP());
		  
		  }
	

}
