package com.jfdeveloper.webscraperbackend.services;

import java.util.Date;
import java.util.List;

import com.jfdeveloper.webscraperbackend.entity.objects.StockEntity;
import com.jfdeveloper.webscraperbackend.entity.objects.HistoryEntity;

public interface StockService {
	
List<StockEntity> getScrape();

void saveStock(StockEntity stock);


}