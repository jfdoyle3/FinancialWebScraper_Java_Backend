package com.webscraper.console;

public class Stock {

	private String dateScraped;
	private String symbol;
	private String lastPrice;
	private String priceChange;
	private String changePercentage;
	private String marketTime;
	private String volume;
	private String avgvol;
	private String marketCap;

	public Stock(String dateScraped, String symbol, String lastPrice, String priceChange, String changePercentage,
			String marketTime, String volume, String avgvol, String marketCap) {
		this.dateScraped = dateScraped;
		this.symbol = symbol;
		this.lastPrice = lastPrice;
		this.priceChange = priceChange;
		this.changePercentage = changePercentage;
		this.marketTime = marketTime;
		this.volume = volume;
		this.avgvol = avgvol;
		this.marketCap = marketCap;
	}

	public String getDateScraped() {
		return dateScraped;
	}

	public String getSymbol() {
		return symbol;
	}

	public String getLastPrice() {
		return lastPrice;
	}

	public String getPriceChange() {
		return priceChange;
	}

	public String getChangePercentage() {
		return changePercentage;
	}

	public String getMarketTime() {
		return marketTime;
	}

	public String getVolume() {
		return volume;
	}

	public String getAvgvol() {
		return avgvol;
	}

	public String getMarketCap() {
		return marketCap;
	}

	@Override
	public String toString() {
		return "Stock [dateScraped=" + dateScraped + ", symbol=" + symbol + ", lastPrice=" + lastPrice
				+ ", priceChange=" + priceChange + ", changePercentage=" + changePercentage + ", marketTime="
				+ marketTime + ", volume=" + volume + ", avgvol=" + avgvol + ", marketCap=" + marketCap + "]";
	}

}