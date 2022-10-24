package com.app.estock.serviceimpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.app.estock.dao.DaoInter;
import com.app.estock.entity.Company;
import com.app.estock.entity.StockPrice;
import com.app.estock.exception.StockIdNotFound;
import com.app.estock.service.ServiceInter;

@Service
public class ServiceImpl implements ServiceInter{
	
	@Autowired
	private DaoInter dao;

	@Override
	public StockPrice saveStockPrice(StockPrice stockPrice) {
		
		return dao.saveStockPrice(stockPrice);
	}

	@Override
	public List<StockPrice> getAllStockPrices() {
		// TODO Auto-generated method stub
		return dao.getAllStockPrices();
	}

	@Override
	public StockPrice findByStockId(Integer stockId) throws StockIdNotFound {
		// TODO Auto-generated method stub
		return dao.findByStockId(stockId);
	}


	@Override
	public void deleteByStockId(Integer stockId) {
		// TODO Auto-generated method stub
		dao.deleteByStockId(stockId);
	}

	@Override
	public void updateStockPrice(StockPrice stockPrice) {
		// TODO Auto-generated method stub
		dao.saveStockPrice(stockPrice);
	}


	@Override
	public List<StockPrice> getStockByCompanyCode(Integer companyCode) {
		
		return dao.getStockByCompanyCode(companyCode);
	}
	
	

}