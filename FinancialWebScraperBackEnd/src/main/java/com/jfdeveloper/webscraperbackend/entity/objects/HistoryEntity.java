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
@Table(name = "history")
public class HistoryEntity {
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
		return "Stock [id=" + id + "dateScraped=" + dateScraped + "symbol=" + symbol + ", lastPrice=" + lastPrice
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
