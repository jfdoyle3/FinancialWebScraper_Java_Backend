package com.jfdeveloper.webscraperbackend.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jfdeveloper.webscraperbackend.services.StockServices;
import com.jfdeveloper.webscraperbackend.web_scraper.Login;


@RestController
// @CrossOrigin(origins = "http://localhost:4200")
public class StockController {
	
	//@Autowired
	//private StockServices stockServices;
	
	
	@GetMapping(path = "/stocks")
	public void findAll() throws InterruptedException, IOException {
		Login.signIn();
	}
	
//	@GetMapping(path="/testServices")
//		public Object StockService() {
//			return stockServices.displayStock().toString();
//		}
	

}
