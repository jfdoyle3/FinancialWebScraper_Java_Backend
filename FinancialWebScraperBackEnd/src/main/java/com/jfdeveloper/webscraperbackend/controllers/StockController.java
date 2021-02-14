package com.jfdeveloper.webscraperbackend.controllers;

import java.io.IOException;
<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> main
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.jfdeveloper.webscraperbackend.entity.objects.StockEntity;
import com.jfdeveloper.webscraperbackend.services.StockService;
import com.jfdeveloper.webscraperbackend.web_scraper.Login;


=======
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jfdeveloper.webscraperbackend.entity.objects.HistoryEntity;
import com.jfdeveloper.webscraperbackend.entity.objects.StockEntity;
import com.jfdeveloper.webscraperbackend.services.StockService;
import com.jfdeveloper.webscraperbackend.web_scraper.Login;
>>>>>>> main

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
	
<<<<<<< HEAD
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
=======
	@GetMapping("/history")
	public List<HistoryEntity> getHistory() {
		return stockService.getHistory();
	}
	

	@GetMapping(path = "/scrape")
	public void scrape() throws InterruptedException, IOException {
	//	List<Stock> stockList = Login.signIn();
		Login.signIn();
//		System.out.printf("Scraping table completed.\n%d items scraped.", stockList.size());
//		for (Stock stock : stockList) {
//			System.out.println(stock);
//		}
	}

	@PostMapping("/stocks")
	public StockEntity save(@RequestBody StockEntity stocks) {
		stockService.save(stocks);
		return stocks;
	}
	 @GetMapping("/history/{id}")
	 public HistoryEntity get(@PathVariable int id) {
	  return stockService.get(id);
	 }
>>>>>>> main

}






 

