package com.example.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;





@RestController
public class UserController {
	
	
	@RequestMapping(method=RequestMethod.GET, path = "/user")
	public ResponseEntity<String> getUsers()
	{
		return new ResponseEntity<String>("Hello User",HttpStatus.OK);
	}
	
	
	@RequestMapping(method=RequestMethod.POST, path = "/user")
	public ResponseEntity<User> greetUsers(@RequestBody User user)
	{
		user.setAddress("This value set from Backend Server");
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	

}
