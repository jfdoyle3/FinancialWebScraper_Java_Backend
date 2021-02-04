package com.jfdeveloper.webscraperbackend.controllers;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jfdeveloper.webscraperbackend.entity.objects.Stock;
import com.jfdeveloper.webscraperbackend.services.StockServices;
import com.jfdeveloper.webscraperbackend.web_scraper.Login;
import com.jfdeveloper.webscraperbackend.web_scraper.StockList;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StockController {
	
	//@Autowired
	//private StockServices stockServices;
	
	
	@GetMapping(path = "/stocks")
	public  ArrayList<Stock> findAll() throws InterruptedException, IOException {
		var stocks=Login.signIn();
		return stocks;
	}
	
	

}
