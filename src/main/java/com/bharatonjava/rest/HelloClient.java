package com.bharatonjava.rest;

import org.restlet.resource.ClientResource;

public class HelloClient {

	public static void main(String[] args) throws Exception{
		
		ClientResource client = new ClientResource("http://localhost:8080/");
		client.get().write(System.out);
		client.delete();
	}
}
