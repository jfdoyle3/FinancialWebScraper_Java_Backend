package com.jfdeveloper.webscraperbackend.services;

import java.util.List;

import com.jfdeveloper.webscraperbackend.entity.objects.StockEntity;

public interface StockService {
List<StockEntity> get();

void save(StockEntity stock);
  
}