package com.sell.market.controller;

import com.sell.market.model.Closebill;
import com.sell.market.model.Customer;
import com.sell.market.service.SellMarketService;
import com.sell.market.utils.JodaDateUtils;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author liudan@huimin100.cn
 * @Title MarketController
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company: huimin.cn
 * @Created on 2018/4/17 19:19
 */
@Controller
@RequestMapping("/market")
public class MarketController {

  @Autowired
  private SellMarketService sellMarketService;


  @RequestMapping("/currency")
  public String marketCurrency() {
    return "/market-currency-income";
  }
  @RequestMapping("/currencyIncom")
  @ResponseBody
  public List<Closebill> currencyIncom() {
    return sellMarketService.findCloseBillList("2017-01","2018-01");
  }

  /**
   * 月份列表
   * @return
   */
  @RequestMapping("/monthList")
  @ResponseBody
  public List getMonthList(){
    System.out.println("getMonth"+JodaDateUtils.getMonthList().size());
    return JodaDateUtils.getMonthList();
  }

  @RequestMapping("/customerList")
  @ResponseBody
  public List<Customer> getCumstomerList(){
    return sellMarketService.findCustomerList(new Customer());
  }

  @RequestMapping("/sellmarket")
  public String marketClient() {
    System.out.println(JodaDateUtils.getMonthList().size());
    return "client";
  }

}
