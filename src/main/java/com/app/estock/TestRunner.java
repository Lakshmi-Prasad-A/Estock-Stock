package com.app.estock;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.estock.entity.Company;
import com.app.estock.entity.StockPrice;
import com.app.estock.repository.StockPriceRepository;

@Component
public class TestRunner implements CommandLineRunner {

//	@Autowired
//	private CompanyRepository crepo;
	
	@Autowired
	private StockPriceRepository srepo;
	
	public void run(String... args) throws Exception {
		
		//StockPrice s1 = new StockPrice(1011, 30.0, new Date());
		
		StockPrice s1 = new StockPrice(Integer.valueOf(1012), 30.87, new Date(),785);
		StockPrice s2 = new StockPrice(Integer.valueOf(1013), 40.87, new Date(),785);
		
//		Company c1 = new Company(1012, "SidhuEnterprises", "Sidhu", 12357L, "nse", Arrays.asList(s1,s2));
		
		
		srepo.save(s1);
		srepo.save(s2);
		
//		crepo.save(c1);
				

	}

}
