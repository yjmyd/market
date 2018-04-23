package com.sell.market.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Dispatchlist implements Serializable {
    private String dlxqid;

    private String dlid;

    private String cinvcode;

    private String cinvstd;

    private Date ddate;

    private String cwhcode;

    private BigDecimal iquantity;

    private String cwhname;

    private String cwhaddress;

    private Integer createstatus;

    private Integer updatestatus;

    private String id;

    private String fromerpno;

    private String ccuscode;

    private String ccusname;

    private String dw;

    private String tuno;

    private String zid;

    private String cinvccode;

    private String bk;

    private String txh;

    private Integer fhstatus;

    private static final long serialVersionUID = 1L;

    public String getDlxqid() {
        return dlxqid;
    }

    public void setDlxqid(String dlxqid) {
        this.dlxqid = dlxqid == null ? null : dlxqid.trim();
    }

    public String getDlid() {
        return dlid;
    }

    public void setDlid(String dlid) {
        this.dlid = dlid == null ? null : dlid.trim();
    }

    public String getCinvcode() {
        return cinvcode;
    }

    public void setCinvcode(String cinvcode) {
        this.cinvcode = cinvcode == null ? null : cinvcode.trim();
    }

    public String getCinvstd() {
        return cinvstd;
    }

    public void setCinvstd(String cinvstd) {
        this.cinvstd = cinvstd == null ? null : cinvstd.trim();
    }

    public Date getDdate() {
        return ddate;
    }

    public void setDdate(Date ddate) {
        this.ddate = ddate;
    }

    public String getCwhcode() {
        return cwhcode;
    }

    public void setCwhcode(String cwhcode) {
        this.cwhcode = cwhcode == null ? null : cwhcode.trim();
    }

    public BigDecimal getIquantity() {
        return iquantity;
    }

    public void setIquantity(BigDecimal iquantity) {
        this.iquantity = iquantity;
    }

    public String getCwhname() {
        return cwhname;
    }

    public void setCwhname(String cwhname) {
        this.cwhname = cwhname == null ? null : cwhname.trim();
    }

    public String getCwhaddress() {
        return cwhaddress;
    }

    public void setCwhaddress(String cwhaddress) {
        this.cwhaddress = cwhaddress == null ? null : cwhaddress.trim();
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFromerpno() {
        return fromerpno;
    }

    public void setFromerpno(String fromerpno) {
        this.fromerpno = fromerpno == null ? null : fromerpno.trim();
    }

    public String getCcuscode() {
        return ccuscode;
    }

    public void setCcuscode(String ccuscode) {
        this.ccuscode = ccuscode == null ? null : ccuscode.trim();
    }

    public String getCcusname() {
        return ccusname;
    }

    public void setCcusname(String ccusname) {
        this.ccusname = ccusname == null ? null : ccusname.trim();
    }

    public String getDw() {
        return dw;
    }

    public void setDw(String dw) {
        this.dw = dw == null ? null : dw.trim();
    }

    public String getTuno() {
        return tuno;
    }

    public void setTuno(String tuno) {
        this.tuno = tuno == null ? null : tuno.trim();
    }

    public String getZid() {
        return zid;
    }

    public void setZid(String zid) {
        this.zid = zid == null ? null : zid.trim();
    }

    public String getCinvccode() {
        return cinvccode;
    }

    public void setCinvccode(String cinvccode) {
        this.cinvccode = cinvccode == null ? null : cinvccode.trim();
    }

    public String getBk() {
        return bk;
    }

    public void setBk(String bk) {
        this.bk = bk == null ? null : bk.trim();
    }

    public String getTxh() {
        return txh;
    }

    public void setTxh(String txh) {
        this.txh = txh == null ? null : txh.trim();
    }

    public Integer getFhstatus() {
        return fhstatus;
    }

    public void setFhstatus(Integer fhstatus) {
        this.fhstatus = fhstatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dlxqid=").append(dlxqid);
        sb.append(", dlid=").append(dlid);
        sb.append(", cinvcode=").append(cinvcode);
        sb.append(", cinvstd=").append(cinvstd);
        sb.append(", ddate=").append(ddate);
        sb.append(", cwhcode=").append(cwhcode);
        sb.append(", iquantity=").append(iquantity);
        sb.append(", cwhname=").append(cwhname);
        sb.append(", cwhaddress=").append(cwhaddress);
        sb.append(", createstatus=").append(createstatus);
        sb.append(", updatestatus=").append(updatestatus);
        sb.append(", id=").append(id);
        sb.append(", fromerpno=").append(fromerpno);
        sb.append(", ccuscode=").append(ccuscode);
        sb.append(", ccusname=").append(ccusname);
        sb.append(", dw=").append(dw);
        sb.append(", tuno=").append(tuno);
        sb.append(", zid=").append(zid);
        sb.append(", cinvccode=").append(cinvccode);
        sb.append(", bk=").append(bk);
        sb.append(", txh=").append(txh);
        sb.append(", fhstatus=").append(fhstatus);
        sb.append("]");
        return sb.toString();
    }


}