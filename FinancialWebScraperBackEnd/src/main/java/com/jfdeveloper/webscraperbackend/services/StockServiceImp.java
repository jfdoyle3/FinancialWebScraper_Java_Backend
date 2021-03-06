package com.jfdeveloper.webscraperbackend.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jfdeveloper.webscraperbackend.dao.StocksDAO;
import com.jfdeveloper.webscraperbackend.entity.objects.StockEntity;


@Service
public class StockServiceImp implements StockService {

	@Autowired
	private StocksDAO stockDao;

	@Transactional
	@Override
	public List<StockEntity> getScrape() {
		return stockDao.getScrape();
	}

	@Transactional
	@Override
	public void saveStock(StockEntity stock) {
		stockDao.saveStock(stock);

	}

}