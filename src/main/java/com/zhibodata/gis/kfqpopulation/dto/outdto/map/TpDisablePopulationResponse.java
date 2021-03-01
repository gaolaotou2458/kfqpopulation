package com.zhibodata.gis.kfqpopulation.dto.outdto.map;

import lombok.Data;

import javax.persistence.Column;

@Data
public class TpDisablePopulationResponse {

    private String id;

    private String sfzh;

    private String xm;

    private String xb;

    private String hjdz;

    private String mz;

    private String hh;

    private Double lon;

    private Double lat;

    private String rylx;

    private Integer age;

    private String glzt;

    private String mzbt;

    private String cjzh;

    private String cjlb;

    private String cjdj;

    private String sfpkjt;

    private String xxjzy;

    private String xxjd;

    private String nj;

    private String je;

    private String jkzk;

    private String bzjey;

    private String qsbzny;

    private String jzbzny;

    private String jzlx;

    private String znxsxm;

    private String zncjfmhjhr;

    private String znxxjzy;

    private String znxxjd;

    private String znnj;

    private String znje;

//    private String layerId;


    @Column(name = "is_cjxxjybt")
    private Integer isCjxxjybt;

    @Column(name = "is_zcshjzdxxx")
    private Integer isZcshjzdxxx;

    @Column(name = "is_tskncjrshjzdxxx")
    private Integer isTskncjrshjzdxxx;

    @Column(name = "is_cjrznjybtxx")
    private Integer isCjrznjybtxx;

    private String centerPoint;



}
