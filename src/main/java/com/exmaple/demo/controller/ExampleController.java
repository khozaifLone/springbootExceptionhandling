package com.exmaple.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.exmaple.demo.exception.ErrorObject;
import com.exmaple.demo.exception.InvalidInputException;

@RestController
@RequestMapping("/test")
public class ExampleController {

	@RequestMapping(value = "/test1/{name}", method = RequestMethod.GET)
	public String getTestString(@PathVariable("name") String name) {
		if (!name.matches(".*[a-z].*")) {
			ErrorObject apiError = new ErrorObject(HttpStatus.BAD_REQUEST);
			throw new InvalidInputException("Please pass the valid name.", apiError);
		}
		return "Hello!! " + name;

	}

}
