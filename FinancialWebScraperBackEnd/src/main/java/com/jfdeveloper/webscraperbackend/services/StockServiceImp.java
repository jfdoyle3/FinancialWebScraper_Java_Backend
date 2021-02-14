package com.jfdeveloper.webscraperbackend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jfdeveloper.webscraperbackend.dao.StocksDAO;
import com.jfdeveloper.webscraperbackend.entity.objects.StockEntity;
import com.jfdeveloper.webscraperbackend.entity.objects.HistoryEntity;

@Service
public class StockServiceImp implements StockService {

	@Autowired
	private StocksDAO stockDao;

	@Transactional
	@Override
	public List<StockEntity> get() {
		return stockDao.get();
	}
	
	@Transactional
	 @Override
	 public void save(StockEntity stock) {
	  stockDao.save(stock);
	  
	 }

	
	@Transactional
	@Override
	public List<HistoryEntity> getHistory() {
		return stockDao.getHistory();
	}
	
	@Transactional
	 @Override
	 public HistoryEntity get(int id) {
	  return stockDao.get(id);
	 }

}