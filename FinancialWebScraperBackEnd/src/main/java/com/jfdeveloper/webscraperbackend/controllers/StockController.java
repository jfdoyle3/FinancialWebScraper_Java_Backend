package com.jfdeveloper.webscraperbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jfdeveloper.webscraperbackend.services.StockServices;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StockController {
	
	@Autowired
	private StockServices stockServices;
	
	
	@GetMapping(path = "/stocks")
	public String findAll() {
		return "Stock Controller";
	}
	
	@GetMapping(path="/testServices")
		public Object StockService() {
			return stockServices.displayStock().toString();
		}
	

}
