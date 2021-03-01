package com.zhibodata.gis.kfqpopulation.dto.outdto.search;

import com.zhibodata.gis.kfqpopulation.dto.indto.Pin;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

/**
 * @author : WangFan
 * create at:  2020/11/13  4:23 PM
 * @ClassName PopulationCommonOutDto
 * @description:
 * @Version 1.0
 */
@Getter
@Setter
public class PopulationCommonOutDto {

    private String id;

    private String sfzh;

    private String xm;

    private String xb;

    private String hjdz;

    private String mz;

    private String hh;

    private String rylx;

    private Integer age;

    private String dhhm;



    public PopulationCommonOutDto (Object object){
        BeanUtils.copyProperties(object,this);
    }

}
