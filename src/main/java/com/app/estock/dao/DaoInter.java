package com.app.estock.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.estock.entity.Company;
import com.app.estock.entity.StockPrice;
import com.app.estock.exception.StockIdNotFound;


public interface DaoInter {

	public StockPrice saveStockPrice(StockPrice stockPrice);
	
	public List<StockPrice> getAllStockPrices();
	
	public StockPrice findByStockId(Integer stockId) throws StockIdNotFound;
	
	public void deleteByStockId(Integer stockId);

	public void updateStockPrice(StockPrice stockPrice);

	public List<StockPrice> getStockByCompanyCode(Integer companyCode);
	

}
