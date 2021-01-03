package com.jfdeveloper.webscraperbackend.entity.objects;

public class Stock {

	private String symbol;
	private String lastPrice;
	private String priceChange;
	private String changePercentage;
	private String marketTime;
	private String volume;
	private String avgvol;
	private String marketCap;

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

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public void setLastPrice(String lastPrice) {
		this.lastPrice = lastPrice;
	}

	public void setPriceChange(String priceChange) {
		this.priceChange = priceChange;
	}

	public void setChangePercentage(String changePercentage) {
		this.changePercentage = changePercentage;
	}

	public void setMarketTime(String marketTime) {
		this.marketTime = marketTime;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public void setAvgvol(String avgvol) {
		this.avgvol = avgvol;
	}

	public void setMarketCap(String marketCap) {
		this.marketCap = marketCap;
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
		return "Stock [symbol=" + symbol + ", lastPrice=" + lastPrice + ", priceChange=" + priceChange
				+ ", changePercentage=" + changePercentage + ", marketTime=" + marketTime + ", volume=" + volume
				+ ", avgvol=" + avgvol + ", marketCap=" + marketCap + "]";
	}

}
