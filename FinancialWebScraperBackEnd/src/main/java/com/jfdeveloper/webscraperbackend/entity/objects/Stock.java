package com.jfdeveloper.webscraperbackend.entity.objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stocktable")
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "date")
	private String dateTime;
	@Column(name = "symbol")
	private String symbol;
	@Column(name = "symbol")
	private String lastPrice;
	@Column(name = "symbol")
	private String priceChange;
	@Column(name = "symbol")
	private String changePercentage;
	@Column(name = "symbol")
	private String marketTime;
	@Column(name = "symbol")
	private String volume;
	@Column(name = "symbol")
	private String avgvol;
	@Column(name = "symbol")
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
