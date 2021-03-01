package com.zhibodata.gis.kfqpopulation.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "tp_basic_population")
@Data
public class ViewTpBasicPopulation {

    private String id;

    private String sfzh;

    private String xm;

    private String xb;

    private String hjdz;

    private String mz;

    private String hh;

    private String lon;

    private String lat;

    private String rylx;

    private Integer age;


}
