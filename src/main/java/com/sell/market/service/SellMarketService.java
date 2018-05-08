package com.sell.market.service;

import com.sell.market.model.Closebill;
import com.sell.market.model.Customer;
import com.sell.market.model.SuperMarket;
import java.util.List;

/**
 * @author liudan@huimin100.cn
 * @Title SellMarketService
 * @Description:
 * @Copyright: Copyright (c) 2017
 * @Company: huimin.cn
 * @Created on 2018/4/19 15:12
 */
public interface SellMarketService {

  SuperMarket getSuperMarketById(Integer id);

  List<Customer> findCustomerList(Customer customer);

  List<Closebill> findCloseBillList(String startTime, String endTime);


  List<Customer> findCustomerAndDispachList(String customerNo,String startTime, String endTime);

}
