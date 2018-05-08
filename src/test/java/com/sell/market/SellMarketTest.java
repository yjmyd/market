package com.sell.market;

import com.alibaba.fastjson.JSONArray;
import com.sell.market.model.Closebill;
import com.sell.market.model.Customer;
import com.sell.market.model.Dispatchlist;
import com.sell.market.service.SellMarketService;
import com.sell.market.utils.TheHttpClient;
import java.util.Arrays;
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
  public void findCustomerList() {
    List<Customer> customerList = sellMarketService.findCustomerList(new Customer());
    System.out.println(JSONArray.toJSONString(customerList));
  }

  @Test
  public void findCloseBillList() {
    List<Closebill> closeBillList = sellMarketService.findCloseBillList("2017-01", "2018-01");
    System.out.println(JSONArray.toJSONString(closeBillList));
  }

  @Test
  public void testGetCustomerAndDispachList() {
    List<Customer> list = sellMarketService
        .findCustomerAndDispachList("东风汽车股份有限公司,耐世特汽车系统（苏州）有限公司,保定长安客车制造有限公司", "2017-01-01 00:00:00", "2018-01-01 00:00:00");
    list.stream().forEach(c -> {
      System.out.println(c.getCustomername());
      Dispatchlist dis = c.getLastDispatchList();
      if (dis != null) {
        System.out.println("iquantiry: " + dis.getIquantity());
      }
    });
  }

  @Test
  public void testBinarySearch(){
    int[] aa = {0,2,3,1,6,5,7,10,9};
      binarySearch(aa,3);
  }
  public int binarySearch(int[] keys,int key){
      Arrays.sort(keys);
      int start=0;
      int end = keys.length-1;
      while(start<=end){
          int middle = start +(end-start)/2;
        int middleKey = keys[middle];
        if(key>middleKey){
            start=middle+1;
        }else if(key<middleKey){
            end =middle - 1;
        }else{
          return middle;
        }
      }
      return -1;

  }


}
