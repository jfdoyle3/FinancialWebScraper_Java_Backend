package com.webscraper.console;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class PostgresWriter {

	public void writeToDatabase(ArrayList<Stock> stockList) {
		Connection connection=null;
		try {

//			 connection = DriverManager.getConnection("jdbc:mysql://192.168.1.201/financialscraper",
//					"jfdoyle3", "Fl1pp3r6467");
			
			 connection = DriverManager .getConnection("jdbc:postgresql://localhost:5432/postgres",
	            "jfdoyle3", "DuM8041");

			String sql = "INSERT INTO stocktable (date_scraped, symbol, last_price,price_change,change_percentage,market_time,volume,avgvol,market_cap) values (?,?,?,?,?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(sql);

			for (int idx = 0; idx < stockList.size(); idx++) {
				statement.setString(1, stockList.get(idx).getDateScraped());
				statement.setString(2, stockList.get(idx).getSymbol());
				statement.setString(3, stockList.get(idx).getLastPrice());
				statement.setString(4, stockList.get(idx).getPriceChange());
				statement.setString(5, stockList.get(idx).getChangePercentage());
				statement.setString(6, stockList.get(idx).getMarketTime());
				statement.setString(7, stockList.get(idx).getVolume());
				statement.setString(8, stockList.get(idx).getAvgvol());
				statement.setString(9, stockList.get(idx).getMarketCap());

				statement.executeUpdate();

			}
			if (connection != null)
				connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}