package com.zhibodata.gis.kfqpopulation.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "dbby_population")
@Data
public class ViewDbbyPopulation {

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

    private String qsbzny;

    private String jzbzny;

    private String dylx;

//    private String layerId;


}
