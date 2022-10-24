package com.app.estock.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.estock.dao.DaoInter;
import com.app.estock.entity.Company;
import com.app.estock.entity.StockPrice;
import com.app.estock.exception.StockIdNotFound;
import com.app.estock.repository.StockPriceRepository;

@Repository
public class DaoImpl implements DaoInter {

	
	@Autowired
	public StockPriceRepository sprepo;
	
	@Autowired
	EntityManager entityManager;

	@Override
	public StockPrice saveStockPrice(StockPrice stockPrice) {
		
		return sprepo.save(stockPrice);
	}

	@Override
	public List<StockPrice> getAllStockPrices() {
		// TODO Auto-generated method stub
		return sprepo.findAll();
	}

	@Override
	public StockPrice findByStockId(Integer stockId)throws StockIdNotFound { 
		// TODO Auto-generated method stub
		return sprepo.findById(stockId).orElseThrow(()->new StockIdNotFound("Stock is not found with Id"+stockId));
	}

	@Override
	public void deleteByStockId(Integer stockId) {
		// TODO Auto-generated method stub
		sprepo.findById(stockId);
	}

	@Override
	public void updateStockPrice(StockPrice stockPrice) {
		// TODO Auto-generated method stub
		sprepo.save(stockPrice);
	}
	@Override
	public List<StockPrice> getStockByCompanyCode(Integer companyCode) {

		return sprepo.findBycompanyCode(companyCode);
	}
	
}
