package com.webscraper.console;

public class Stock {

	 String symbol;
	 String lastPrice;
	 String priceChange;
	 String changePercentage;
	 String marketTime;
	 String volume;
	 String avgvol;
	 String marketCap;
	
	public Stock(String symbol, String lastPrice, String priceChange, String changePercentage, String marketTime,
			String volume, String avgvol, String marketCap) {
		this.symbol = symbol;
		this.lastPrice = lastPrice;
		this.priceChange = priceChange;
		this.changePercentage = changePercentage;
		this.marketTime = marketTime;
		this.volume = volume;
		this.avgvol = avgvol;
		this.marketCap = marketCap;
	}
	



}
