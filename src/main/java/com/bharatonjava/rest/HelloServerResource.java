package com.bharatonjava.rest;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class HelloServerResource extends ServerResource{

	@Get
	public String greet(){
		return "Hello Bharat! here goes rest!";
	}
	
	@Delete
	public void deleteSomething(){
		System.out.println("server delete method called.");
	}
}
