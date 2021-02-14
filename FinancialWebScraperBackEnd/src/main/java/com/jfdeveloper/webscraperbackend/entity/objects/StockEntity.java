package com.jfdeveloper.webscraperbackend.entity.objects;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "stocktable")
public class StockEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Temporal(TemporalType.DATE)
	@Column(name = "dateScraped")
	private Date dateScraped;
	@Column(name = "symbol")
	private String symbol;
	@Column(name = "lastPrice")
	private String lastPrice;
	@Column(name = "priceChange")
	private String priceChange;
	@Column(name = "changePercentage")
	private String changePercentage;
	@Column(name = "marketTime")
	private String marketTime;
	@Column(name = "volume")
	private String volume;
	@Column(name = "avgvol")
	private String avgvol;
	@Column(name = "marketCap")
	private String marketCap;


	@Override
	public String toString() {
		return "Stock [id=" + id+", dateStamp="+datestamp+ ", symbol=" + symbol + ", lastPrice=" + lastPrice
				+ ", priceChange=" + priceChange + ", changePercentage=" + changePercentage + ", marketTime="
				+ marketTime + ", volume=" + volume + ", avgvol=" + avgvol + ", marketCap=" + marketCap + "]";
	}
	
	// Setters

	public void setId(Integer id) {
		this.id = id;
	}

	public void setDateStamp(String dateStamp) {
		this.datestamp = dateStamp;
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

//  getters	
	
	public void getDateStamp(String dateStamp) {
		this.datestamp = dateStamp;
	}
	


	@Temporal(TemporalType.DATE)
	@Column(name = "dateScraped")
	private Date dateScraped;
	
	@Column(name = "symbol")
	private String symbol;
	
	@Column(name = "lastPrice")
	private String lastPrice;
	
	@Column(name = "priceChange")
	private String priceChange;
	
	@Column(name = "changePercentage")
	private String changePercentage;
	
	@Column(name = "marketTime")
	private String marketTime;
	
	@Column(name = "volume")
	private String volume;
	
	@Column(name = "avgvol")
	private String avgvol;
	
	@Column(name = "marketCap")
	private String marketCap;

	@Override
	public String toString() {
		return "Stock [id=" + id + ", dateScraped=" + dateScraped + ", symbol=" + symbol + ", lastPrice=" + lastPrice
				+ ", priceChange=" + priceChange + ", changePercentage=" + changePercentage + ", marketTime="
				+ marketTime + ", volume=" + volume + ", avgvol=" + avgvol + ", marketCap=" + marketCap + "]";
	}

	public Integer getId() {
		return id;
	}

	public Date getDateScraped() {
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

}
