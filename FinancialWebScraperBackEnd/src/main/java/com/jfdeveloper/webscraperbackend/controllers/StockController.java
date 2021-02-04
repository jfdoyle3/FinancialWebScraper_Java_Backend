package com.jfdeveloper.webscraperbackend.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.jfdeveloper.webscraperbackend.entity.objects.StockEntity;
import com.jfdeveloper.webscraperbackend.services.StockService;
import com.jfdeveloper.webscraperbackend.web_scraper.Login;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class StockController {
	
	 @Autowired
	 private StockService stockService;
	 
	 @GetMapping("/stocks")
	 public List<StockEntity> get() {
	  return stockService.get();
	 }
	
	
	@GetMapping(path = "/scrape")
	public  void scrape() throws InterruptedException, IOException {
		Login.signIn();
		
	}

}






 

