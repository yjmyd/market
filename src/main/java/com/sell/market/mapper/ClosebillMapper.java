package com.sell.market.mapper;


import com.sell.market.model.Closebill;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClosebillMapper {
    int deleteByPrimaryKey(String iid);

    int insert(Closebill record);

    int insertSelective(Closebill record);

    Closebill selectByPrimaryKey(String iid);

    List<Closebill> findCloseBillList(@Param("startTime") String startTime,@Param("endTime") String endTime);

    int updateByPrimaryKeySelective(Closebill record);

    int updateByPrimaryKey(Closebill record);
}