package com.jfdeveloper.webscraperbackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jfdeveloper.webscraperbackend.entity.objects.Stock;
import com.jfdeveloper.webscraperbackend.services.StockService;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class StockController {
	
	 @Autowired
	 private StockService stockService;
	 
	 @GetMapping("/stocks")
	 public List<Stock> get() {
	  return stockService.get();
	 }
	
	//@Autowired
	//private StockServices stockServices;
	
	
//	@GetMapping(path = "/stocks")
//	public  ArrayList<Stock> findAll() throws InterruptedException, IOException {
//		var stocks=Login.signIn();
//		return stocks;
//	}
//	@GetMapping(path = "/stocks")
//	public  ArrayList<Stock> findAll() throws InterruptedException, IOException {
//		var stocks=Login.signIn();
//		return stocks;
//	}
}






 

