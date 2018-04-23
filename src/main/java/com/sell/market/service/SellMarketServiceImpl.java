package com.sell.market.service;

import com.sell.market.mapper.ClosebillMapper;
import com.sell.market.mapper.CustomerMapper;
import com.sell.market.mapper.MarketMapper;
import com.sell.market.model.Closebill;
import com.sell.market.model.Customer;
import com.sell.market.model.SuperMarket;
import java.util.List;
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
    return closebillMapper.findCloseBillList(startTime,endTime);
  }
}
