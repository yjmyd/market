package com.sell.market.mapper;


import com.sell.market.model.Dispatchlist;

public interface DispatchlistMapper {
    int insert(Dispatchlist record);

    int insertSelective(Dispatchlist record);
}