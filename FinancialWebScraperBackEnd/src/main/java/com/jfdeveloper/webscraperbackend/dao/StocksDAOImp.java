package com.jfdeveloper.webscraperbackend.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jfdeveloper.webscraperbackend.entity.objects.HistoryEntity;
import com.jfdeveloper.webscraperbackend.entity.objects.StockEntity;

@Repository
public class StocksDAOImp implements StocksDAO {
	
	@Autowired
	private EntityManager entityManager;

	
	@Override
	public List<StockEntity> getScrape() {
		Session currSession = entityManager.unwrap(Session.class);
		Query<StockEntity> queryScraped = currSession.createQuery("SELECT a FROM StockEntity a", StockEntity.class);
		List<StockEntity> listScraped = queryScraped.getResultList();
		return listScraped;
	}
	
	@Override
	 public void saveStock(StockEntity stock) {
	  
	  Session currSession = entityManager.unwrap(Session.class);
	  currSession.saveOrUpdate(stock);
	}

	
	
	// History
	
	@Override
	public List<HistoryEntity> getHistory() {
		Session currSession = entityManager.unwrap(Session.class);
		Query<HistoryEntity> queryAllRecords = currSession.createQuery("SELECT a FROM HistoryEntity a", HistoryEntity.class);
		List<HistoryEntity> listAllRecords = queryAllRecords.getResultList();
		return listAllRecords;
	}
	
	@Override
	 public HistoryEntity get(int id) {
	  Session currSession = entityManager.unwrap(Session.class);
	  HistoryEntity stock= currSession.get(HistoryEntity.class, id);
	  return stock;
	 }
	

	@Override
	 public List<HistoryEntity> findBySymbol(String symbol) {
		Session currSession = entityManager.unwrap(Session.class);
		Query<HistoryEntity> querySymbol = currSession.createQuery("FROM HistoryEntity sym WHERE sym.symbol=:symbol", HistoryEntity.class);
		querySymbol.setParameter("symbol", symbol);
		List<HistoryEntity> listFoundSymbols = querySymbol.getResultList();
		return listFoundSymbols;
	 }
	
	
	@Override
	 public List<HistoryEntity> findByDate(Date date) {
		Session currSession = entityManager.unwrap(Session.class);
		Query<HistoryEntity> queryDates = currSession.createQuery("FROM HistoryEntity D WHERE D.date_scraped=:date", HistoryEntity.class);
		queryDates.setParameter("date_scraped", date);
		List<HistoryEntity> listFoundDates = queryDates.getResultList();
		return listFoundDates;
	 }


}
