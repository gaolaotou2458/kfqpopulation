package com.zhibodata.gis.kfqpopulation.dto.outdto.general;

import lombok.Data;

import java.util.List;

@Data
public class ImportantPeopleNumOutDto {


    private List<Integer> year;

    private List<ImportantPeopleNumInnerOutDto> importantPeopleNumInnerOutDtos;


}
