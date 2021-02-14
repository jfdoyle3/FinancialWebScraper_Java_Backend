package com.jfdeveloper.webscraperbackend.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jfdeveloper.webscraperbackend.entity.objects.HistoryEntity;

import com.jfdeveloper.webscraperbackend.services.HistoryService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/history")
public class HistoryController {

	@Autowired
	private HistoryService historyService;

	@GetMapping("/")
	public List<HistoryEntity> getHistory() {
		return historyService.getHistory();
	}

	@GetMapping("/id/{id}")
	public HistoryEntity get(@PathVariable int id) {
		return historyService.get(id);
	}

	@GetMapping("/symbol/{symbol}")
	public List<HistoryEntity> findBySymbol(@PathVariable String symbol) {
		return historyService.findBySymbol(symbol);
	}

	@GetMapping("/date/{date}")
	public List<HistoryEntity> findByDate(@PathVariable Date date) {
		return historyService.findByDate(date);
	}

}
