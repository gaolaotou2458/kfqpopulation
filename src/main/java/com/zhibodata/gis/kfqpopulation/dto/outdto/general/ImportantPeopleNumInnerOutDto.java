package com.zhibodata.gis.kfqpopulation.dto.outdto.general;

import lombok.Data;

import java.util.List;

@Data
public class ImportantPeopleNumInnerOutDto {

    private String name ;

    private List<Integer> data;

    private String type;
}
