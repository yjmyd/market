package com.sell.market.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@JsonSerialize(include = Inclusion.NON_NULL)
public class Customer implements Serializable {
    /**
     * 客户名称
     *
     * @mbg.generated
     */
    private String customername;

    /**
     * 客户编码
     *
     * @mbg.generated
     */
    private String customerno;

    /**
     * 客户级别
     *
     * @mbg.generated
     */
    private String customerlevel;

    /**
     * 上级客户
     *
     * @mbg.generated
     */
    private String upcustomer;

    /**
     * 所属部门
     *
     * @mbg.generated
     */
    private String aflfunction;

    /**
     * 工商注册
     *
     * @mbg.generated
     */
    private String busregistration;

    /**
     * 行业
     *
     * @mbg.generated
     */
    private String industry;

    /**
     * 详细地址
     *
     * @mbg.generated
     */
    private String detailedaddress;

    /**
     * 邮政编码
     *
     * @mbg.generated
     */
    private String zipcode;

    /**
     * 联系人
     *
     * @mbg.generated
     */
    private String people;

    /**
     * 电话
     *
     * @mbg.generated
     */
    private String phone;

    /**
     * 手机号码
     *
     * @mbg.generated
     */
    private String moblephone;

    /**
     * 传真
     *
     * @mbg.generated
     */
    private String fax;

    /**
     * 公司网址
     *
     * @mbg.generated
     */
    private String compurl;

    /**
     * 微博
     *
     * @mbg.generated
     */
    private String sina;

    /**
     * 总人数
     *
     * @mbg.generated
     */
    private Integer totalnumber;

    /**
     * 销售额
     *
     * @mbg.generated
     */
    private String sales;

    /**
     * 备注
     *
     * @mbg.generated
     */
    private String remaks;

    /**
     * 法定代表人
     *
     * @mbg.generated
     */
    private String legarepretive;

    /**
     * 注册资金
     *
     * @mbg.generated
     */
    private String registeredcapital;

    /**
     * 成立时间
     *
     * @mbg.generated
     */
    private String setuptime;

    /**
     * 合作状态
     *
     * @mbg.generated
     */
    private String cooperativestate;

    /**
     * 客户信誉
     *
     * @mbg.generated
     */
    private String customerreputation;

    /**
     * 客户资质
     *
     * @mbg.generated
     */
    private String customerquality;

    /**
     * 来自账套
     *
     * @mbg.generated
     */
    private String fromerpno;

    /**
     * CRM后台id自动生成
     *
     * @mbg.generated
     */
    private Integer id;

    private String ownname;

    private byte[] lastchangetime;

    //去年同比
    private Dispatchlist lastDispatchList;
    //实际达成
    private Dispatchlist currDispatchList;

    public Dispatchlist getLastDispatchList() {
        return lastDispatchList;
    }

    public void setLastDispatchList(Dispatchlist lastDispatchList) {
        this.lastDispatchList = lastDispatchList;
    }

    public Dispatchlist getCurrDispatchList() {
        return currDispatchList;
    }

    public void setCurrDispatchList(Dispatchlist currDispatchList) {
        this.currDispatchList = currDispatchList;
    }

    private static final long serialVersionUID = 1L;

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public String getCustomerno() {
        return customerno;
    }

    public void setCustomerno(String customerno) {
        this.customerno = customerno == null ? null : customerno.trim();
    }

    public String getCustomerlevel() {
        return customerlevel;
    }

    public void setCustomerlevel(String customerlevel) {
        this.customerlevel = customerlevel == null ? null : customerlevel.trim();
    }

    public String getUpcustomer() {
        return upcustomer;
    }

    public void setUpcustomer(String upcustomer) {
        this.upcustomer = upcustomer == null ? null : upcustomer.trim();
    }

    public String getAflfunction() {
        return aflfunction;
    }

    public void setAflfunction(String aflfunction) {
        this.aflfunction = aflfunction == null ? null : aflfunction.trim();
    }

    public String getBusregistration() {
        return busregistration;
    }

    public void setBusregistration(String busregistration) {
        this.busregistration = busregistration == null ? null : busregistration.trim();
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getDetailedaddress() {
        return detailedaddress;
    }

    public void setDetailedaddress(String detailedaddress) {
        this.detailedaddress = detailedaddress == null ? null : detailedaddress.trim();
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people == null ? null : people.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMoblephone() {
        return moblephone;
    }

    public void setMoblephone(String moblephone) {
        this.moblephone = moblephone == null ? null : moblephone.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getCompurl() {
        return compurl;
    }

    public void setCompurl(String compurl) {
        this.compurl = compurl == null ? null : compurl.trim();
    }

    public String getSina() {
        return sina;
    }

    public void setSina(String sina) {
        this.sina = sina == null ? null : sina.trim();
    }

    public Integer getTotalnumber() {
        return totalnumber;
    }

    public void setTotalnumber(Integer totalnumber) {
        this.totalnumber = totalnumber;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales == null ? null : sales.trim();
    }

    public String getRemaks() {
        return remaks;
    }

    public void setRemaks(String remaks) {
        this.remaks = remaks == null ? null : remaks.trim();
    }

    public String getLegarepretive() {
        return legarepretive;
    }

    public void setLegarepretive(String legarepretive) {
        this.legarepretive = legarepretive == null ? null : legarepretive.trim();
    }

    public String getRegisteredcapital() {
        return registeredcapital;
    }

    public void setRegisteredcapital(String registeredcapital) {
        this.registeredcapital = registeredcapital == null ? null : registeredcapital.trim();
    }

    public String getSetuptime() {
        return setuptime;
    }

    public void setSetuptime(String setuptime) {
        this.setuptime = setuptime == null ? null : setuptime.trim();
    }

    public String getCooperativestate() {
        return cooperativestate;
    }

    public void setCooperativestate(String cooperativestate) {
        this.cooperativestate = cooperativestate == null ? null : cooperativestate.trim();
    }

    public String getCustomerreputation() {
        return customerreputation;
    }

    public void setCustomerreputation(String customerreputation) {
        this.customerreputation = customerreputation == null ? null : customerreputation.trim();
    }

    public String getCustomerquality() {
        return customerquality;
    }

    public void setCustomerquality(String customerquality) {
        this.customerquality = customerquality == null ? null : customerquality.trim();
    }

    public String getFromerpno() {
        return fromerpno;
    }

    public void setFromerpno(String fromerpno) {
        this.fromerpno = fromerpno == null ? null : fromerpno.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOwnname() {
        return ownname;
    }

    public void setOwnname(String ownname) {
        this.ownname = ownname == null ? null : ownname.trim();
    }

    public byte[] getLastchangetime() {
        return lastchangetime;
    }

    public void setLastchangetime(byte[] lastchangetime) {
        this.lastchangetime = lastchangetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", customername=").append(customername);
        sb.append(", customerno=").append(customerno);
        sb.append(", customerlevel=").append(customerlevel);
        sb.append(", upcustomer=").append(upcustomer);
        sb.append(", aflfunction=").append(aflfunction);
        sb.append(", busregistration=").append(busregistration);
        sb.append(", industry=").append(industry);
        sb.append(", detailedaddress=").append(detailedaddress);
        sb.append(", zipcode=").append(zipcode);
        sb.append(", people=").append(people);
        sb.append(", phone=").append(phone);
        sb.append(", moblephone=").append(moblephone);
        sb.append(", fax=").append(fax);
        sb.append(", compurl=").append(compurl);
        sb.append(", sina=").append(sina);
        sb.append(", totalnumber=").append(totalnumber);
        sb.append(", sales=").append(sales);
        sb.append(", remaks=").append(remaks);
        sb.append(", legarepretive=").append(legarepretive);
        sb.append(", registeredcapital=").append(registeredcapital);
        sb.append(", setuptime=").append(setuptime);
        sb.append(", cooperativestate=").append(cooperativestate);
        sb.append(", customerreputation=").append(customerreputation);
        sb.append(", customerquality=").append(customerquality);
        sb.append(", fromerpno=").append(fromerpno);
        sb.append(", id=").append(id);
        sb.append(", ownname=").append(ownname);
        sb.append(", lastchangetime=").append(lastchangetime);
        sb.append("]");
        return sb.toString();
    }


}