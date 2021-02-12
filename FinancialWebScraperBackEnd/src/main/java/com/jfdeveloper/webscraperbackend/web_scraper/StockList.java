package com.jfdeveloper.webscraperbackend.web_scraper;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;

import com.jfdeveloper.webscraperbackend.web_scraper.objects.Stock;



public class StockList {

	public ArrayList<Stock> createStockList(ArrayList<String> tableData) {

		ArrayList<Stock> stockList = new ArrayList<Stock>();

		for (int rmve = 0; rmve < tableData.size(); rmve++) {
			tableData.remove("-");
			tableData.remove("USD");
		}
		int rows = (tableData.size() / 9) - 1;
		
		LocalDateTime todaysDate = LocalDateTime.now();
		DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String strTimeStamp = todaysDate.format(formatDate);

		Iterator<String> itr = tableData.iterator();

		for (int idx = 0; idx < rows; idx++) {
			Stock share = new Stock(strTimeStamp,itr.next(), itr.next(), itr.next(), itr.next(), itr.next(), itr.next(), itr.next(),
					itr.next());

			stockList.add(share);
		}

		return stockList;
	}

}
