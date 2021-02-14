package com.jfdeveloper.webscraperbackend.dao;

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
	public List<StockEntity> get() {
		Session currSession = entityManager.unwrap(Session.class);

		Query<StockEntity> query = currSession.createQuery("SELECT a FROM Stock a", StockEntity.class);
		List<StockEntity> list = query.getResultList();
		return list;
	}

	@Override
	public void save(StockEntity stock) {

		Session currSession = entityManager.unwrap(Session.class);
		currSession.saveOrUpdate(stock);
	}

	@Override
	public List<HistoryEntity> getHistory() {
		Session currSession = entityManager.unwrap(Session.class);
		Query<HistoryEntity> query = currSession.createQuery("SELECT a FROM HistoryEntity a", HistoryEntity.class);
		List<HistoryEntity> list = query.getResultList();
		return list;
	}

	@Override
	public HistoryEntity get(int id) {
		Session currSession = entityManager.unwrap(Session.class);
		HistoryEntity stock = currSession.get(HistoryEntity.class, id);
		return stock;
	}

	@Override
	public List<HistoryEntity> getSymbol(String symbol) {
		Session currSession = entityManager.unwrap(Session.class);
		Query<HistoryEntity> query = currSession.createQuery("select a from HistoryEntity where symbol like a",
				HistoryEntity.class);
		List<HistoryEntity> listSymbols = query.getResultList();
		return listSymbols;
	}

}
