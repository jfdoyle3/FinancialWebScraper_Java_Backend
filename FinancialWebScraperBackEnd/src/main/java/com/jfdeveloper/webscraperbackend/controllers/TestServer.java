package com.jfdeveloper.webscraperbackend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestServer {
	
	
		@GetMapping(path = "/testing")
		public String helloWorld() {
			return "Web Server: Running";
		}


}
