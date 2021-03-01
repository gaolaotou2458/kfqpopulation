package com.zhibodata.gis.kfqpopulation.dto.indto;

import lombok.Data;

@Data
public class GeneralPeopleMemberInfoInDto extends PinWithPage {


    //建筑id
    private String houseAddress;

    private String villageName;

    private String houseNumber;



}
