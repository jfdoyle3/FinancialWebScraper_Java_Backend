package com.jfdeveloper.webscraperbackend.dao;


import java.util.List;

import com.jfdeveloper.webscraperbackend.entity.objects.StockEntity;
import com.jfdeveloper.webscraperbackend.entity.objects.HistoryEntity;

public interface StocksDAO {

	List<StockEntity> getScrape();

	void saveStock(StockEntity stocks);

	// History

	List<HistoryEntity> getHistory();

	HistoryEntity get(int id);

	List<HistoryEntity> findBySymbol(String symbol);

}
