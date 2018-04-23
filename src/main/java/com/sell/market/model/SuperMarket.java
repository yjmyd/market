package com.sell.market.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 客资实体类
 *
 * @author Requiem
 * @version 1.0
 * @date 2017/11/13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SuperMarket {

    private Integer sid;

    private String ssupermarket;

    private String saddress;

    private String stelephone;

    private Integer sstate;

    private Integer sscore;

    private String srelationpeople;

    private String ssupermarketcheck;

    private String recommender;

    private Integer sstorehouse;

    private Integer slineid;

    private Integer snum;

    private Integer ssquaremetre;

    private Integer suserid;

    private Integer susertype;

    private String userTypeName;
    private Integer sbusinesstype;
    /**
     * 环境分类 0:社区店 1:街道店 2:商圈店 3:写字楼店 4:连锁类 5:军/政大院店 6:工/矿企业店 7:景区/公园 8:医院 9:学校 10:批发 11:其他
     */
    private Integer sclassic;

    private Integer branchid;

    private Integer sdefinition;

    private Integer istest;

    private Double sxposition;

    private Double syposition;

    private String location;

    private String location_id;

    private Integer district_id;

    private String screateday;

    private String updatetime;


    private Integer stype;


    private String mobile;

    private String client;

    private String thirdIdentity;

    private String thirdIdentityValue;
    
    private Integer level;

}
