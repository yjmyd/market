package com.sell.market.mapper;


import com.sell.market.model.SuperMarket;
import org.springframework.stereotype.Repository;

/**
 * 超市基础信息
 *
 * @author Requiem
 * @version 1.0
 * @date 2017/11/10
 */
@Repository
public interface MarketMapper {

  SuperMarket getSuperMarketById(Integer id);

  SuperMarket getSuperMarketByPhone(String mobile);

  Integer maxNumByLineId(Integer line_id);

}
