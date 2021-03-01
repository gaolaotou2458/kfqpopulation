package com.zhibodata.gis.kfqpopulation.dto.indto.resource;

import com.zhibodata.gis.kfqpopulation.dto.indto.Pin;
import lombok.Data;

import java.util.List;

@Data
public class QuerySelectedLayerIndto extends Pin {
    private String layerList;

    private String id;


}
