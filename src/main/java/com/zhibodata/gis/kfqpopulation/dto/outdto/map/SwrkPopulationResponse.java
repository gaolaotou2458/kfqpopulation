package com.zhibodata.gis.kfqpopulation.dto.outdto.map;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;
@Data
public class SwrkPopulationResponse  extends  BaseJsonResponse{
    @Id
    private String id;

    private Integer objectid;

    private String rysbh;

    private String xm;

    private String xb;

    private Date csrq;

    private String mz;

    private String sfzh;

    private String ssxq;

    private String xzz;

//    private String yhzgxbm;
//
//    private String yhzgx;
//
//    private String hh;
//
//    private String pcsdm;
//
//    @Column(name = "pcsdm_xdl")
//    private String pcsdmXdl;
//
//    private String jcwh;
//
//    @Column(name = "jcwh_xdl")
//    private String jcwhXdl;
//
//    private String glzt;
//
//    @Column(name = "glzt_xdl")
//    private String glztXdl;
//
//    private String fjdm;
//
//    private String hklx;
//
//    private String jhr1sfzh;
//
//    private String jhr1xm;
//
//    private String jhgx1;
//
//    private String jhr2sfzh;
//
//    private String jhr2xm;
//
//    private String jhgx2;
//
//    private String qwdz;
//
//    private Date swsj;
//
//    private String swyy;
//
//    private String xzzbh;
//
//    private String qtzzbh;
//
//    private Date sfzqfrq;
//
//    private String sfzyxqx;
//
//    private Date cszqfrq;
//
//    private String sqrbh;
//
//    private String sqrxm;
//
//    private String jbrbh;
//
//    private String jbrxm;
//
//    private String tbrbh;
//
//    private String tbrxm;
//
//    private Date tbrq;
//
//    private String tbdw;
//
//    private String qyfw;
//
//    private String ywlx;
//
//    private String rkyy;
//
//    private Date rksj;
//
//    private String pzdw;
//
//    private String gdrbh;
//
//    private String gdrxm;
//
//    private Date gdsj;
//
//    private String gddwbh;
//
//    private String cszmbh;
//
//    private String jsyxm;
//
//    private String jsdw;
//
//    private String reserve01;
//
//    private Date reserve03;
//
//    private String sjdm;
//
//    private String sfzslyy;
//
//    private String sfzjjx;
//
//    private String swqtzz;
//
//    private Date gxrq;
//
//    private String pch;
//
//
//    private Date qcsj;

    private BigDecimal lon;

    private BigDecimal lat;


    private String centerPoint;


    private String swyyString;

    private Date swsj;




}
