package com.zhibodata.gis.kfqpopulation.dto.indto;

import lombok.Data;

@Data
public class PinWithPage {
    private String pin;


    private String userName;

    private Integer page;

    private Integer size;

}
