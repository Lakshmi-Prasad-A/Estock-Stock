package com.app.estock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.estock.entity.Company;
import com.app.estock.entity.StockPrice;
import com.app.estock.exception.StockIdNotFound;
import com.app.estock.service.ServiceInter;


@RestController
@RequestMapping(value = "/api/v1.0/market/stock")
public class Controller {
	
	@Autowired
	private ServiceInter ser;
	
	@RequestMapping( value = "/add",method = RequestMethod.POST)
	public StockPrice saveStockPrice(@RequestBody StockPrice stockprice) {
		return ser.saveStockPrice(stockprice);	
	}
	
	@RequestMapping(value="/getAll",method =RequestMethod.GET)
	public List<StockPrice> getCompanies(){
		return ser.getAllStockPrices();
	}	
	@RequestMapping(value="/getAll/{stockId}",method = RequestMethod.GET)
	public StockPrice findByStockId(@PathVariable Integer stockId) throws StockIdNotFound {
		return ser.findByStockId(stockId);
	}
	@RequestMapping(value="/delete/{stockId}",method=RequestMethod.DELETE)
	public void deleteByStockId(@PathVariable Integer stockId) {
		ser.deleteByStockId(stockId);
	}
	@RequestMapping(value="/add", method = RequestMethod.PUT)
	public void updateStockPrice(@RequestBody StockPrice stockPrice) {
		ser.updateStockPrice(stockPrice);
	}
	
	@RequestMapping(value="/getStockBycompanyCode/{companyCode}",method = RequestMethod.GET)
	public List<StockPrice> getStockByCompanyCode(@PathVariable Integer companyCode) throws StockIdNotFound {
		return ser.getStockByCompanyCode(companyCode);
	}
}
	