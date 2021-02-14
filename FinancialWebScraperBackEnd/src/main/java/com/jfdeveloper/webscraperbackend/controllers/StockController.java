package com.jfdeveloper.webscraperbackend.controllers;

import java.io.IOException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jfdeveloper.webscraperbackend.entity.objects.StockEntity;
import com.jfdeveloper.webscraperbackend.services.StockService;
import com.jfdeveloper.webscraperbackend.web_scraper.Login;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/stocks")
public class StockController {

	@Autowired
	private StockService stockService;

	@GetMapping("/")
	public List<StockEntity> getScrape() {
		return stockService.getScrape();
	}

	@GetMapping(path = "/scrape")
	public void scrape() throws InterruptedException, IOException {
		// List<Stock> stockList = Login.signIn();
		Login.signIn();
//		System.out.printf("Scraping table completed.\n%d items scraped.", stockList.size());
//		for (Stock stock : stockList) {
//			System.out.println(stock);
//		}
	}

	@PostMapping("/addStock")
	public StockEntity saveStock(@RequestBody StockEntity stocks) {
		stockService.saveStock(stocks);
		return stocks;
	}

}
