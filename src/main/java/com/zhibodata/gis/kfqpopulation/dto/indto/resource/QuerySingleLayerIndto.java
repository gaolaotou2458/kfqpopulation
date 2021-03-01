package com.zhibodata.gis.kfqpopulation.dto.indto.resource;

import com.zhibodata.gis.kfqpopulation.dto.indto.Page;
import com.zhibodata.gis.kfqpopulation.dto.indto.PinWithPage;
import lombok.Data;

@Data
public class QuerySingleLayerIndto extends PinWithPage {

    private String layer;

    private String polygonString;

    private String keyword;

    private String id;

}
