package com.jfdeveloper.webscraperbackend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {
	
	@GetMapping(path = "/stocks")
	public String findAll() {
		return "Stock Controller";
	}

}
