package com.zhibodata.gis.kfqpopulation.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "dbh_population")
@Data
public class ViewDbhPopulation {

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

    private String bzjey;

    private String jtgx;

    private String hzxm;

    private String hzsfzhm;

    private String sfsw;

    private String jyzk;

    private String zbbz;

    private String ldnl;

    private String whcd;

    private String dbzh;

    private String yjnsrxjy;

//    private String layerId;

}
