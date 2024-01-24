package com.ssk.SpringEmailDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailControllor {

    @Autowired
    private EmailSenderService emailService;

    
    @PostMapping("/send1")
    public String sendEmail(
            @RequestParam String to,
            @RequestParam String subject,
            @RequestParam String body) {
        emailService.sendEmail(to, subject, body);
        return "Email sent successfully!";
    }
    
    @PostMapping("/send2")
    public String sendEmail(@RequestBody EmailData emailData) {
    	
    	System.out.println(emailData.getToEmail()+emailData.getSubject()+emailData.getBody());
        emailService.sendEmail(emailData.getToEmail(), 
        						emailData.getSubject(), 
        						emailData.getBody());
        return "Email sent successfully!";
    }
}
