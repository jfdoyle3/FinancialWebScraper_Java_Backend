package com.jfdeveloper.webscraperbackend.dao;

import java.util.List;

import com.jfdeveloper.webscraperbackend.entity.objects.StockEntity;

public interface StocksDAO {

	List<StockEntity> get();
}
