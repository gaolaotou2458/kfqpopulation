package com.zhibodata.gis.kfqpopulation.dto.outdto.map;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class BaseJsonResponse {

    @JsonIgnore
    private String geojson;


    public String getGeojson() {
        return geojson;
    }

    public void setGeojson(String geojson) {
        this.geojson = geojson;
    }
}
