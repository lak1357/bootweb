package com.example.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController {
	
	
	@RequestMapping(method=RequestMethod.GET, path = "/user")
	public ResponseEntity<String> getUsers()
	{
		return new ResponseEntity<String>("Hello User",HttpStatus.OK);
	}
	

}
