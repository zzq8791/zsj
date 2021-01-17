package com.example.demo.service;

import java.util.Date;
import java.util.List;

import com.example.demo.domain.Stocktracking;

public interface StocktrackingService {

	List<Stocktracking> queryByTime(Date startTime , Date endTime);
	
	List<Stocktracking> queryBytrade(List<String> trades);
	
	void saveStocktrackings(List<Stocktracking>  stocktracking);
	
}
