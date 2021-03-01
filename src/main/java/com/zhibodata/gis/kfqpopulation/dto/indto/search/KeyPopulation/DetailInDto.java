package com.zhibodata.gis.kfqpopulation.dto.indto.search.KeyPopulation;

import com.zhibodata.gis.kfqpopulation.dto.indto.Pin;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * @author : WangFan
 * create at:  2020/11/17  9:22 AM
 * @ClassName DetailInDto
 * @description:
 * @Version 1.0
 */
@Getter
@Setter
public class DetailInDto extends Pin{


    @NotBlank(message = "详情id不能为空！")
    private String id;

    private String type;

    private Integer ageStart;

    private Integer ageEnd;

    public DetailInDto() {
    }

    public DetailInDto(String type) {
        this.type = type;
    }

    public DetailInDto(String type, Integer ageStart, Integer ageEnd) {
        this.type = type;
        this.ageStart = ageStart;
        this.ageEnd = ageEnd;
    }
}
