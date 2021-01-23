package com.jfdeveloper.webscraperbackend.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jfdeveloper.webscraperbackend.entity.objects.Stock;

@Repository
public class StocksDAOImp implements StocksDAO {
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Stock> get() {
		Session currSession = entityManager.unwrap(Session.class);
		Query<Stock> query = currSession.createQuery("from datestamp", Stock.class);
		List<Stock> list = query.getResultList();
		return list;
	}
}
