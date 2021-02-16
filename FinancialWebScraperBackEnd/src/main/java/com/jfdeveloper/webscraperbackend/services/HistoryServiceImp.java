package com.jfdeveloper.webscraperbackend.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jfdeveloper.webscraperbackend.dao.StocksDAO;

import com.jfdeveloper.webscraperbackend.entity.objects.HistoryEntity;

@Service
public class HistoryServiceImp implements HistoryService {

	@Autowired
	private StocksDAO stockDao;

	

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

	@Transactional
	@Override
	public List<HistoryEntity> findBySymbol(String symbol) {
		return stockDao.findBySymbol(symbol);
	}

	@Transactional
	@Override
	public List<HistoryEntity> findByDate(Date date) {
		return stockDao.findByDate(date);
	}
	

}