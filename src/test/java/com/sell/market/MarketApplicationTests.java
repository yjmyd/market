package com.sell.market;

import com.sell.market.model.SuperMarket;
import com.sell.market.service.SellMarketService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MarketApplicationTests {

	@Autowired
	private SellMarketService sellMarketService;
	@Test
	public void contextLoads() {
		SuperMarket s = sellMarketService.getSuperMarketById(1);
		System.out.println(s.getBranchid());
	}

}
