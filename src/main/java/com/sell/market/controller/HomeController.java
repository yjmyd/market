package com.sell.market.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liudan@huimin100.cn
 * @Title HomeController
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company: huimin.cn
 * @Created on 2018/4/24 16:44
 */
@Controller
public class HomeController {

  @RequestMapping("/")
  public String home(){
    return "index";
  }

}
