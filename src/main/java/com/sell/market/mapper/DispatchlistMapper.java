package com.sell.market.mapper;


import com.sell.market.model.Dispatchlist;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public interface DispatchlistMapper {
    int insert(Dispatchlist record);

    int insertSelective(Dispatchlist record);

    Dispatchlist getDispacheList(Map<String,Object> params);


}