package com.sell.market.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Closebill implements Serializable {
    private String iid;

    private String cvouchid;

    private String csscode;

    private String cssname;

    private String cdwcode;

    private String cdwname;

    private BigDecimal iamount;

    private Date dvouchdate;

    private String cdeptcode;

    private String cdeptname;

    private String cdigest;

    private Integer createstatus;

    private Integer updatestatus;

    private Integer id;

    private String fromerpno;

    private String ccusname;
    private String months;
    private static final long serialVersionUID = 1L;

    public String getIid() {
        return iid;
    }

    public void setIid(String iid) {
        this.iid = iid == null ? null : iid.trim();
    }

    public String getCvouchid() {
        return cvouchid;
    }

    public void setCvouchid(String cvouchid) {
        this.cvouchid = cvouchid == null ? null : cvouchid.trim();
    }

    public String getCsscode() {
        return csscode;
    }

    public void setCsscode(String csscode) {
        this.csscode = csscode == null ? null : csscode.trim();
    }

    public String getCssname() {
        return cssname;
    }

    public void setCssname(String cssname) {
        this.cssname = cssname == null ? null : cssname.trim();
    }

    public String getCdwcode() {
        return cdwcode;
    }

    public void setCdwcode(String cdwcode) {
        this.cdwcode = cdwcode == null ? null : cdwcode.trim();
    }

    public String getCdwname() {
        return cdwname;
    }

    public void setCdwname(String cdwname) {
        this.cdwname = cdwname == null ? null : cdwname.trim();
    }

    public BigDecimal getIamount() {
        return iamount;
    }

    public void setIamount(BigDecimal iamount) {
        this.iamount = iamount;
    }

    public Date getDvouchdate() {
        return dvouchdate;
    }

    public void setDvouchdate(Date dvouchdate) {
        this.dvouchdate = dvouchdate;
    }

    public String getCdeptcode() {
        return cdeptcode;
    }

    public void setCdeptcode(String cdeptcode) {
        this.cdeptcode = cdeptcode == null ? null : cdeptcode.trim();
    }

    public String getCdeptname() {
        return cdeptname;
    }

    public void setCdeptname(String cdeptname) {
        this.cdeptname = cdeptname == null ? null : cdeptname.trim();
    }

    public String getCdigest() {
        return cdigest;
    }

    public void setCdigest(String cdigest) {
        this.cdigest = cdigest == null ? null : cdigest.trim();
    }

    public Integer getCreatestatus() {
        return createstatus;
    }

    public void setCreatestatus(Integer createstatus) {
        this.createstatus = createstatus;
    }

    public Integer getUpdatestatus() {
        return updatestatus;
    }

    public void setUpdatestatus(Integer updatestatus) {
        this.updatestatus = updatestatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFromerpno() {
        return fromerpno;
    }

    public void setFromerpno(String fromerpno) {
        this.fromerpno = fromerpno == null ? null : fromerpno.trim();
    }

    public String getCcusname() {
        return ccusname;
    }

    public void setCcusname(String ccusname) {
        this.ccusname = ccusname == null ? null : ccusname.trim();
    }

    public String getMonths() {
        return months;
    }

    public void setMonths(String months) {
        this.months = months;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", iid=").append(iid);
        sb.append(", cvouchid=").append(cvouchid);
        sb.append(", csscode=").append(csscode);
        sb.append(", cssname=").append(cssname);
        sb.append(", cdwcode=").append(cdwcode);
        sb.append(", cdwname=").append(cdwname);
        sb.append(", iamount=").append(iamount);
        sb.append(", dvouchdate=").append(dvouchdate);
        sb.append(", cdeptcode=").append(cdeptcode);
        sb.append(", cdeptname=").append(cdeptname);
        sb.append(", cdigest=").append(cdigest);
        sb.append(", createstatus=").append(createstatus);
        sb.append(", updatestatus=").append(updatestatus);
        sb.append(", id=").append(id);
        sb.append(", fromerpno=").append(fromerpno);
        sb.append(", ccusname=").append(ccusname);
        sb.append("]");
        return sb.toString();
    }


}