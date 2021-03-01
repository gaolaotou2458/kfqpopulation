package com.zhibodata.gis.kfqpopulation.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "swrk_population")
public class SwrkPopulation {
    @Id
    private String id;

    private Integer objectid;

    private String rysbh;

    private String xm;

    private String xb;

    private Date csrq;

    private String mz;

    private String sfhm;

    private String ssxq;

    private String xzz;

    private String yhzgxbm;

    private String yhzgx;

    private String hh;

    private String pcsdm;

    @Column(name = "pcsdm_xdl")
    private String pcsdmXdl;

    private String jcwh;

    @Column(name = "jcwh_xdl")
    private String jcwhXdl;

    private String glzt;

    @Column(name = "glzt_xdl")
    private String glztXdl;

    private String fjdm;

    private String hklx;

    private String jhr1sfzh;

    private String jhr1xm;

    private String jhgx1;

    private String jhr2sfzh;

    private String jhr2xm;

    private String jhgx2;

    private String qwdz;

    private Date swsj;

    private String swyy;

    private String xzzbh;

    private String qtzzbh;

    private Date sfzqfrq;

    private String sfzyxqx;

    private Date cszqfrq;

    private String sqrbh;

    private String sqrxm;

    private String jbrbh;

    private String jbrxm;

    private String tbrbh;

    private String tbrxm;

    private Date tbrq;

    private String tbdw;

    private String qyfw;

    private String ywlx;

    private String rkyy;

    private Date rksj;

    private String pzdw;

    private String gdrbh;

    private String gdrxm;

    private Date gdsj;

    private String gddwbh;

    private String cszmbh;

    private String jsyxm;

    private String jsdw;

    private String reserve01;

    private Date reserve03;

    private String sjdm;

    private String sfzslyy;

    private String sfzjjx;

    private String swqtzz;

    private Date gxrq;

    private String pch;

    @Column(name = "create_time")
    private Date createTime;

    private Date qcsj;

    private BigDecimal lon;

    private BigDecimal lat;

    private String streetid;

    private String streetname;

    private Object geom;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return objectid
     */
    public Integer getObjectid() {
        return objectid;
    }

    /**
     * @param objectid
     */
    public void setObjectid(Integer objectid) {
        this.objectid = objectid;
    }

    /**
     * @return rysbh
     */
    public String getRysbh() {
        return rysbh;
    }

    /**
     * @param rysbh
     */
    public void setRysbh(String rysbh) {
        this.rysbh = rysbh;
    }

    /**
     * @return xm
     */
    public String getXm() {
        return xm;
    }

    /**
     * @param xm
     */
    public void setXm(String xm) {
        this.xm = xm;
    }

    /**
     * @return xb
     */
    public String getXb() {
        return xb;
    }

    /**
     * @param xb
     */
    public void setXb(String xb) {
        this.xb = xb;
    }

    /**
     * @return csrq
     */
    public Date getCsrq() {
        return csrq;
    }

    /**
     * @param csrq
     */
    public void setCsrq(Date csrq) {
        this.csrq = csrq;
    }

    /**
     * @return mz
     */
    public String getMz() {
        return mz;
    }

    /**
     * @param mz
     */
    public void setMz(String mz) {
        this.mz = mz;
    }

    /**
     * @return sfhm
     */
    public String getSfhm() {
        return sfhm;
    }

    /**
     * @param sfhm
     */
    public void setSfhm(String sfhm) {
        this.sfhm = sfhm;
    }

    /**
     * @return ssxq
     */
    public String getSsxq() {
        return ssxq;
    }

    /**
     * @param ssxq
     */
    public void setSsxq(String ssxq) {
        this.ssxq = ssxq;
    }

    /**
     * @return xzz
     */
    public String getXzz() {
        return xzz;
    }

    /**
     * @param xzz
     */
    public void setXzz(String xzz) {
        this.xzz = xzz;
    }

    /**
     * @return yhzgxbm
     */
    public String getYhzgxbm() {
        return yhzgxbm;
    }

    /**
     * @param yhzgxbm
     */
    public void setYhzgxbm(String yhzgxbm) {
        this.yhzgxbm = yhzgxbm;
    }

    /**
     * @return yhzgx
     */
    public String getYhzgx() {
        return yhzgx;
    }

    /**
     * @param yhzgx
     */
    public void setYhzgx(String yhzgx) {
        this.yhzgx = yhzgx;
    }

    /**
     * @return hh
     */
    public String getHh() {
        return hh;
    }

    /**
     * @param hh
     */
    public void setHh(String hh) {
        this.hh = hh;
    }

    /**
     * @return pcsdm
     */
    public String getPcsdm() {
        return pcsdm;
    }

    /**
     * @param pcsdm
     */
    public void setPcsdm(String pcsdm) {
        this.pcsdm = pcsdm;
    }

    /**
     * @return pcsdm_xdl
     */
    public String getPcsdmXdl() {
        return pcsdmXdl;
    }

    /**
     * @param pcsdmXdl
     */
    public void setPcsdmXdl(String pcsdmXdl) {
        this.pcsdmXdl = pcsdmXdl;
    }

    /**
     * @return jcwh
     */
    public String getJcwh() {
        return jcwh;
    }

    /**
     * @param jcwh
     */
    public void setJcwh(String jcwh) {
        this.jcwh = jcwh;
    }

    /**
     * @return jcwh_xdl
     */
    public String getJcwhXdl() {
        return jcwhXdl;
    }

    /**
     * @param jcwhXdl
     */
    public void setJcwhXdl(String jcwhXdl) {
        this.jcwhXdl = jcwhXdl;
    }

    /**
     * @return glzt
     */
    public String getGlzt() {
        return glzt;
    }

    /**
     * @param glzt
     */
    public void setGlzt(String glzt) {
        this.glzt = glzt;
    }

    /**
     * @return glzt_xdl
     */
    public String getGlztXdl() {
        return glztXdl;
    }

    /**
     * @param glztXdl
     */
    public void setGlztXdl(String glztXdl) {
        this.glztXdl = glztXdl;
    }

    /**
     * @return fjdm
     */
    public String getFjdm() {
        return fjdm;
    }

    /**
     * @param fjdm
     */
    public void setFjdm(String fjdm) {
        this.fjdm = fjdm;
    }

    /**
     * @return hklx
     */
    public String getHklx() {
        return hklx;
    }

    /**
     * @param hklx
     */
    public void setHklx(String hklx) {
        this.hklx = hklx;
    }

    /**
     * @return jhr1sfzh
     */
    public String getJhr1sfzh() {
        return jhr1sfzh;
    }

    /**
     * @param jhr1sfzh
     */
    public void setJhr1sfzh(String jhr1sfzh) {
        this.jhr1sfzh = jhr1sfzh;
    }

    /**
     * @return jhr1xm
     */
    public String getJhr1xm() {
        return jhr1xm;
    }

    /**
     * @param jhr1xm
     */
    public void setJhr1xm(String jhr1xm) {
        this.jhr1xm = jhr1xm;
    }

    /**
     * @return jhgx1
     */
    public String getJhgx1() {
        return jhgx1;
    }

    /**
     * @param jhgx1
     */
    public void setJhgx1(String jhgx1) {
        this.jhgx1 = jhgx1;
    }

    /**
     * @return jhr2sfzh
     */
    public String getJhr2sfzh() {
        return jhr2sfzh;
    }

    /**
     * @param jhr2sfzh
     */
    public void setJhr2sfzh(String jhr2sfzh) {
        this.jhr2sfzh = jhr2sfzh;
    }

    /**
     * @return jhr2xm
     */
    public String getJhr2xm() {
        return jhr2xm;
    }

    /**
     * @param jhr2xm
     */
    public void setJhr2xm(String jhr2xm) {
        this.jhr2xm = jhr2xm;
    }

    /**
     * @return jhgx2
     */
    public String getJhgx2() {
        return jhgx2;
    }

    /**
     * @param jhgx2
     */
    public void setJhgx2(String jhgx2) {
        this.jhgx2 = jhgx2;
    }

    /**
     * @return qwdz
     */
    public String getQwdz() {
        return qwdz;
    }

    /**
     * @param qwdz
     */
    public void setQwdz(String qwdz) {
        this.qwdz = qwdz;
    }

    /**
     * @return swsj
     */
    public Date getSwsj() {
        return swsj;
    }

    /**
     * @param swsj
     */
    public void setSwsj(Date swsj) {
        this.swsj = swsj;
    }

    /**
     * @return swyy
     */
    public String getSwyy() {
        return swyy;
    }

    /**
     * @param swyy
     */
    public void setSwyy(String swyy) {
        this.swyy = swyy;
    }

    /**
     * @return xzzbh
     */
    public String getXzzbh() {
        return xzzbh;
    }

    /**
     * @param xzzbh
     */
    public void setXzzbh(String xzzbh) {
        this.xzzbh = xzzbh;
    }

    /**
     * @return qtzzbh
     */
    public String getQtzzbh() {
        return qtzzbh;
    }

    /**
     * @param qtzzbh
     */
    public void setQtzzbh(String qtzzbh) {
        this.qtzzbh = qtzzbh;
    }

    /**
     * @return sfzqfrq
     */
    public Date getSfzqfrq() {
        return sfzqfrq;
    }

    /**
     * @param sfzqfrq
     */
    public void setSfzqfrq(Date sfzqfrq) {
        this.sfzqfrq = sfzqfrq;
    }

    /**
     * @return sfzyxqx
     */
    public String getSfzyxqx() {
        return sfzyxqx;
    }

    /**
     * @param sfzyxqx
     */
    public void setSfzyxqx(String sfzyxqx) {
        this.sfzyxqx = sfzyxqx;
    }

    /**
     * @return cszqfrq
     */
    public Date getCszqfrq() {
        return cszqfrq;
    }

    /**
     * @param cszqfrq
     */
    public void setCszqfrq(Date cszqfrq) {
        this.cszqfrq = cszqfrq;
    }

    /**
     * @return sqrbh
     */
    public String getSqrbh() {
        return sqrbh;
    }

    /**
     * @param sqrbh
     */
    public void setSqrbh(String sqrbh) {
        this.sqrbh = sqrbh;
    }

    /**
     * @return sqrxm
     */
    public String getSqrxm() {
        return sqrxm;
    }

    /**
     * @param sqrxm
     */
    public void setSqrxm(String sqrxm) {
        this.sqrxm = sqrxm;
    }

    /**
     * @return jbrbh
     */
    public String getJbrbh() {
        return jbrbh;
    }

    /**
     * @param jbrbh
     */
    public void setJbrbh(String jbrbh) {
        this.jbrbh = jbrbh;
    }

    /**
     * @return jbrxm
     */
    public String getJbrxm() {
        return jbrxm;
    }

    /**
     * @param jbrxm
     */
    public void setJbrxm(String jbrxm) {
        this.jbrxm = jbrxm;
    }

    /**
     * @return tbrbh
     */
    public String getTbrbh() {
        return tbrbh;
    }

    /**
     * @param tbrbh
     */
    public void setTbrbh(String tbrbh) {
        this.tbrbh = tbrbh;
    }

    /**
     * @return tbrxm
     */
    public String getTbrxm() {
        return tbrxm;
    }

    /**
     * @param tbrxm
     */
    public void setTbrxm(String tbrxm) {
        this.tbrxm = tbrxm;
    }

    /**
     * @return tbrq
     */
    public Date getTbrq() {
        return tbrq;
    }

    /**
     * @param tbrq
     */
    public void setTbrq(Date tbrq) {
        this.tbrq = tbrq;
    }

    /**
     * @return tbdw
     */
    public String getTbdw() {
        return tbdw;
    }

    /**
     * @param tbdw
     */
    public void setTbdw(String tbdw) {
        this.tbdw = tbdw;
    }

    /**
     * @return qyfw
     */
    public String getQyfw() {
        return qyfw;
    }

    /**
     * @param qyfw
     */
    public void setQyfw(String qyfw) {
        this.qyfw = qyfw;
    }

    /**
     * @return ywlx
     */
    public String getYwlx() {
        return ywlx;
    }

    /**
     * @param ywlx
     */
    public void setYwlx(String ywlx) {
        this.ywlx = ywlx;
    }

    /**
     * @return rkyy
     */
    public String getRkyy() {
        return rkyy;
    }

    /**
     * @param rkyy
     */
    public void setRkyy(String rkyy) {
        this.rkyy = rkyy;
    }

    /**
     * @return rksj
     */
    public Date getRksj() {
        return rksj;
    }

    /**
     * @param rksj
     */
    public void setRksj(Date rksj) {
        this.rksj = rksj;
    }

    /**
     * @return pzdw
     */
    public String getPzdw() {
        return pzdw;
    }

    /**
     * @param pzdw
     */
    public void setPzdw(String pzdw) {
        this.pzdw = pzdw;
    }

    /**
     * @return gdrbh
     */
    public String getGdrbh() {
        return gdrbh;
    }

    /**
     * @param gdrbh
     */
    public void setGdrbh(String gdrbh) {
        this.gdrbh = gdrbh;
    }

    /**
     * @return gdrxm
     */
    public String getGdrxm() {
        return gdrxm;
    }

    /**
     * @param gdrxm
     */
    public void setGdrxm(String gdrxm) {
        this.gdrxm = gdrxm;
    }

    /**
     * @return gdsj
     */
    public Date getGdsj() {
        return gdsj;
    }

    /**
     * @param gdsj
     */
    public void setGdsj(Date gdsj) {
        this.gdsj = gdsj;
    }

    /**
     * @return gddwbh
     */
    public String getGddwbh() {
        return gddwbh;
    }

    /**
     * @param gddwbh
     */
    public void setGddwbh(String gddwbh) {
        this.gddwbh = gddwbh;
    }

    /**
     * @return cszmbh
     */
    public String getCszmbh() {
        return cszmbh;
    }

    /**
     * @param cszmbh
     */
    public void setCszmbh(String cszmbh) {
        this.cszmbh = cszmbh;
    }

    /**
     * @return jsyxm
     */
    public String getJsyxm() {
        return jsyxm;
    }

    /**
     * @param jsyxm
     */
    public void setJsyxm(String jsyxm) {
        this.jsyxm = jsyxm;
    }

    /**
     * @return jsdw
     */
    public String getJsdw() {
        return jsdw;
    }

    /**
     * @param jsdw
     */
    public void setJsdw(String jsdw) {
        this.jsdw = jsdw;
    }

    /**
     * @return reserve01
     */
    public String getReserve01() {
        return reserve01;
    }

    /**
     * @param reserve01
     */
    public void setReserve01(String reserve01) {
        this.reserve01 = reserve01;
    }

    /**
     * @return reserve03
     */
    public Date getReserve03() {
        return reserve03;
    }

    /**
     * @param reserve03
     */
    public void setReserve03(Date reserve03) {
        this.reserve03 = reserve03;
    }

    /**
     * @return sjdm
     */
    public String getSjdm() {
        return sjdm;
    }

    /**
     * @param sjdm
     */
    public void setSjdm(String sjdm) {
        this.sjdm = sjdm;
    }

    /**
     * @return sfzslyy
     */
    public String getSfzslyy() {
        return sfzslyy;
    }

    /**
     * @param sfzslyy
     */
    public void setSfzslyy(String sfzslyy) {
        this.sfzslyy = sfzslyy;
    }

    /**
     * @return sfzjjx
     */
    public String getSfzjjx() {
        return sfzjjx;
    }

    /**
     * @param sfzjjx
     */
    public void setSfzjjx(String sfzjjx) {
        this.sfzjjx = sfzjjx;
    }

    /**
     * @return swqtzz
     */
    public String getSwqtzz() {
        return swqtzz;
    }

    /**
     * @param swqtzz
     */
    public void setSwqtzz(String swqtzz) {
        this.swqtzz = swqtzz;
    }

    /**
     * @return gxrq
     */
    public Date getGxrq() {
        return gxrq;
    }

    /**
     * @param gxrq
     */
    public void setGxrq(Date gxrq) {
        this.gxrq = gxrq;
    }

    /**
     * @return pch
     */
    public String getPch() {
        return pch;
    }

    /**
     * @param pch
     */
    public void setPch(String pch) {
        this.pch = pch;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return qcsj
     */
    public Date getQcsj() {
        return qcsj;
    }

    /**
     * @param qcsj
     */
    public void setQcsj(Date qcsj) {
        this.qcsj = qcsj;
    }

    /**
     * @return lon
     */
    public BigDecimal getLon() {
        return lon;
    }

    /**
     * @param lon
     */
    public void setLon(BigDecimal lon) {
        this.lon = lon;
    }

    /**
     * @return lat
     */
    public BigDecimal getLat() {
        return lat;
    }

    /**
     * @param lat
     */
    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    /**
     * @return streetid
     */
    public String getStreetid() {
        return streetid;
    }

    /**
     * @param streetid
     */
    public void setStreetid(String streetid) {
        this.streetid = streetid;
    }

    /**
     * @return streetname
     */
    public String getStreetname() {
        return streetname;
    }

    /**
     * @param streetname
     */
    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    /**
     * @return geom
     */
    public Object getGeom() {
        return geom;
    }

    /**
     * @param geom
     */
    public void setGeom(Object geom) {
        this.geom = geom;
    }
}