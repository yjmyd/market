package com.sell.market.mapper;


import com.sell.market.model.Customer;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMapper {
    int deleteByPrimaryKey(String customername);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(String customername);

    List<Customer> findCustomList(Customer customer);

    List<Customer> findCustomerAndDispachList(Map<String,Object> params);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKeyWithBLOBs(Customer record);

    int updateByPrimaryKey(Customer record);


}