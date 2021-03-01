package com.zhibodata.gis.kfqpopulation.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "elderly_population")
@Data
public class ViewElderlyPopulation {

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

//    private String layerId;




}
