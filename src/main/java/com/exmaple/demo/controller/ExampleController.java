package com.exmaple.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.exmaple.demo.exception.ErrorObject;
import com.exmaple.demo.exception.InvalidInputException;

@RestController
@RequestMapping("/test")
public class ExampleController {
	
	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public String getTestString(){
		 ErrorObject apiError = new ErrorObject(HttpStatus.NOT_FOUND);
		throw new InvalidInputException("This is excpetion message",apiError);
	}
  
}
