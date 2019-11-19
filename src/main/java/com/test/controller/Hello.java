package com.test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping("test")
public class Hello {
	
	@RequestMapping(value="hello",method=RequestMethod.GET,headers="Accept=application/json")
	public ResponseEntity getAssessment(){
		
		return new ResponseEntity<String>("Hello, Openshift deployement successfull",HttpStatus.OK);
		
	}

}
