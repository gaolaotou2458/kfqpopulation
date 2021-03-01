package com.zhibodata.gis.kfqpopulation.dto.outdto.map;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
public class HouseNumberListOutDto  {

    private String id;

    private String name;

    private String address;

    private String belong;

    private Integer height;

    private Integer number;

    private Integer upfloor;

    private Integer count;

}
