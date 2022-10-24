package com.app.estock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.estock.entity.StockPrice;

public interface StockPriceRepository extends JpaRepository<StockPrice, Integer> {

	public List<StockPrice> findBycompanyCode(Integer companyCode);

	
}
