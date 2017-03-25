package com.example;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		
		String ip = "0";
		
		try 
		{
			InetAddress inet = InetAddress.getLocalHost();
			ip = inet.getHostAddress();
		} 
		catch (UnknownHostException e) 
		{
			e.printStackTrace();
		}
		
		model.put("message", this.message);
		model.put("author", "Lakshitha");
		model.put("created", "2019");
		model.put("host", ip);
		
		
		return "welcome";
	}

}