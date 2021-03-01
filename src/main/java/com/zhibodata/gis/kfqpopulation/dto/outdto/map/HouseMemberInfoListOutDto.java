package com.zhibodata.gis.kfqpopulation.dto.outdto.map;

import lombok.Data;

@Data
public class HouseMemberInfoListOutDto {

    /**
     * 户主姓名
     */
    private String hzxm;

    /**
     * 户籍地址
     */
    private String hjdz;

    /**
     * 派出所
     */
    private String pcs;

    /**
     * 管理状态
     */
    private String glzt;

    /**
     * 归属社区
     */
    private String gssq;

}
