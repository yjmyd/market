package com.sell.market.service;

import com.sell.market.mapper.ClosebillMapper;
import com.sell.market.mapper.CustomerMapper;
import com.sell.market.mapper.DispatchlistMapper;
import com.sell.market.mapper.MarketMapper;
import com.sell.market.model.Closebill;
import com.sell.market.model.Customer;
import com.sell.market.model.Dispatchlist;
import com.sell.market.model.SuperMarket;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liudan@huimin100.cn
 * @Title SellMarketServiceImpl
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company: huimin.cn
 * @Created on 2018/4/19 15:12
 */
@Service
public class SellMarketServiceImpl implements SellMarketService {

  @Autowired
  private MarketMapper marketMapper;
  @Autowired
  private CustomerMapper customerMapper;
  @Autowired
  private ClosebillMapper closebillMapper;
  @Autowired
  private DispatchlistMapper dispatchlistMapper;

  @Override
  public SuperMarket getSuperMarketById(Integer id) {

    return marketMapper.getSuperMarketById(id);
  }

  @Override
  public List<Customer> findCustomerList(Customer customer) {
    return customerMapper.findCustomList(customer);
  }

  @Override
  public List<Closebill> findCloseBillList(String startTime, String endTime) {
    return closebillMapper.findCloseBillList(startTime, endTime);
  }

  @Override
  public List<Customer> findCustomerAndDispachList(String customerNo, String startTime,
      String endTime) {
    Map<String, Object> params = new HashMap();
    params.put("list", Arrays.asList(customerNo.split(",")));
    List<Customer> cusList = customerMapper.findCustomerAndDispachList(params);
    for (Customer c : cusList) {
      Map<String, Object> param = new HashMap<>();
      param.put("cCusName", c.getCustomername());
      param.put("startTime", startTime);
      param.put("endTime", endTime);
      Dispatchlist lastDis = dispatchlistMapper.getDispacheList(param);
      param.put("startTime","2016-01-01 00:00:00");
      param.put("endTime", "2017-01-01 00:00:00");
      Dispatchlist currDis = dispatchlistMapper.getDispacheList(param);
      c.setLastDispatchList(lastDis);
      c.setCurrDispatchList(currDis);
    }
    return cusList;
  }


}
