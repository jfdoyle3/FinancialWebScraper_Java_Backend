package com.jfdeveloper.webscraperbackend.services;

import java.util.List;

import com.jfdeveloper.webscraperbackend.entity.objects.StockEntity;
<<<<<<< HEAD

public interface StockService {
List<StockEntity> get();
=======
import com.jfdeveloper.webscraperbackend.entity.objects.HistoryEntity;

public interface StockService {
List<StockEntity> get();

void save(StockEntity stock);

List<HistoryEntity> getHistory();

HistoryEntity get(int id);
>>>>>>> main
  
}