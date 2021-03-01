package com.zhibodata.gis.kfqpopulation.dto.indto.resource;

import com.zhibodata.gis.kfqpopulation.dto.indto.Page;
import com.zhibodata.gis.kfqpopulation.dto.indto.Pin;
import com.zhibodata.gis.kfqpopulation.dto.indto.PinWithPage;
import lombok.Data;

@Data
public class QueryMapLayerIndto extends PinWithPage {

    private String type;

    private String buildingId;

    private String name;

    private Integer age;

    private String sex;

    private String sfzh;

    private String rylx;

}
