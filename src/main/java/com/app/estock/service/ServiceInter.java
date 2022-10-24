package com.app.estock.service;

import java.util.List;

import com.app.estock.entity.Company;
import com.app.estock.entity.StockPrice;
//import com.app.estock.exception.CompanyNotFound;
import com.app.estock.exception.StockIdNotFound;


public interface ServiceInter {
	
	public StockPrice saveStockPrice(StockPrice stockprice);
	
	public List<StockPrice> getAllStockPrices();
	
	public StockPrice findByStockId(Integer stockId) throws StockIdNotFound;
	
	public void deleteByStockId(Integer stockId);
	
	public void updateStockPrice(StockPrice stockPrice);

	public List<StockPrice> getStockByCompanyCode(Integer companyCode);
	
	
}
