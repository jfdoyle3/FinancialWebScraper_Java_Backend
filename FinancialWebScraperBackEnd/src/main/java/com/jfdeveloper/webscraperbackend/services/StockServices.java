package com.jfdeveloper.webscraperbackend.services;

import org.springframework.stereotype.Service;

import com.webscraper.console.Stock;

@Service
public class StockServices {

	public Stock displayStock() {
		return new Stock("1", "@", "3", "4", "5", "^", "7", "8");
	}

}
