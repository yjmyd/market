package com.sell.market;

import com.alibaba.fastjson.JSONArray;
import com.sell.market.model.Closebill;
import com.sell.market.model.Customer;
import com.sell.market.service.SellMarketService;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liudan@huimin100.cn
 * @Title SellMarketTest
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company: huimin.cn
 * @Created on 2018/4/21 10:43
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SellMarketTest {



  @Autowired
  private SellMarketService sellMarketService;

  @Test
  public void findCustomerList(){
      List<Customer> customerList = sellMarketService.findCustomerList(new Customer());
    System.out.println(JSONArray.toJSONString(customerList));
  }

  @Test
  public void findCloseBillList(){
      List<Closebill> closeBillList = sellMarketService.findCloseBillList("2017-01","2018-01");
    System.out.println(JSONArray.toJSONString(closeBillList));
  }



}
