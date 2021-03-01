package com.zhibodata.gis.kfqpopulation.dto.indto;

import lombok.Data;

@Data
public class GeneralHouseMemberInfoInDto extends PinWithPage {


    //建筑id
    private String buildingId;

    private String hzName;

    private String address;

}
