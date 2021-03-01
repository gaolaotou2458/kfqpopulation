package com.zhibodata.gis.kfqpopulation.dto.indto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
public class HouseInDto extends Page{

    private String name;


    private String address;


    private String number;

}
