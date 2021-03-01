package com.zhibodata.gis.kfqpopulation.dto.outdto.general;

import com.zhibodata.gis.kfqpopulation.dto.indto.PinWithPage;
import lombok.Data;

/**
 * 户级别
 */
@Data
public class GeneralHouseMemberInfoOutDto  {
    private String id;
    //户主
    private String xm;

    // 身份证号
    private String sfzh;

    private String buildingName;

    private String xiaoqu;

    private String hjdz;

    private String xb;

    private String yhzgx;

    private Integer age;

    private String hklx;

    /**
     * 村社区
     */
    private String csq;

    private String streetName;

    private String hh;

}
