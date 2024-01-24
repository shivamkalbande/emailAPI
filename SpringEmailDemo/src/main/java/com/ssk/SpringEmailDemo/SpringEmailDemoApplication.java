package com.ssk.SpringEmailDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.ssk.SpringEmailDemo.service.EmailSenderService;

@SpringBootApplication
public class SpringEmailDemoApplication {

//	@Autowired
//	private EmailSenderService senderService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringEmailDemoApplication.class, args);
	}
	
//	@EventListener(ApplicationReadyEvent.class)

//	public void sendMail() {
//		senderService.sendEmail("sskalbande_m19@ce.vjti.ac.in","Testing spring mail api","This is mail body");
//	}
}
