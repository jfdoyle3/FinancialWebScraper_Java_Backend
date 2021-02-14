package com.jfdeveloper.webscraperbackend.dao;

import java.util.List;

import com.jfdeveloper.webscraperbackend.entity.objects.StockEntity;
<<<<<<< HEAD
=======
import com.jfdeveloper.webscraperbackend.entity.objects.HistoryEntity;
>>>>>>> main

public interface StocksDAO {

	List<StockEntity> get();
<<<<<<< HEAD
=======
	
	void save(StockEntity stocks);

	List<HistoryEntity> getHistory();

	HistoryEntity get(int id);

	HistoryEntity getSymbol(String symbol);
>>>>>>> main
}
