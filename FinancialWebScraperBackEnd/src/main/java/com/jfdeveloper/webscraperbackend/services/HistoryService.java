package com.jfdeveloper.webscraperbackend.services;

import java.util.Date;
import java.util.List;

import com.jfdeveloper.webscraperbackend.entity.objects.HistoryEntity;

public interface HistoryService {

	List<HistoryEntity> getHistory();

	HistoryEntity get(int id);

	List<HistoryEntity> findBySymbol(String symbol);

}