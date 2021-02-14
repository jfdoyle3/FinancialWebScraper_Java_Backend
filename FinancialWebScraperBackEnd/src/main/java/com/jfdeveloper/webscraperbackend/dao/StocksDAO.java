package com.jfdeveloper.webscraperbackend.dao;

import java.util.List;

import com.jfdeveloper.webscraperbackend.entity.objects.StockEntity;
import com.jfdeveloper.webscraperbackend.entity.objects.HistoryEntity;


public interface StocksDAO {

	List<StockEntity> get();

	void save(StockEntity stocks);

	List<HistoryEntity> getHistory();

	HistoryEntity get(int id);

	List<HistoryEntity> getSymbol(String symbol);

}
