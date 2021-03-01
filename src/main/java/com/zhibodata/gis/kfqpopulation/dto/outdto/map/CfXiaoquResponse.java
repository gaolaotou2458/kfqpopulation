package com.zhibodata.gis.kfqpopulation.dto.outdto.map;

import com.zhibodata.gis.kfqpopulation.dto.indto.resource.FeatureEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "cf_xiaoqu")
@Data
public class CfXiaoquResponse extends BaseJsonResponse  {
    @Id
    private String id;

    private Long objectid;

    private String name;

    private String alias;

    private String pyname;

    private String jc;

    private String classid;

    private String type;

    private String standard;

    private String creditcode;

    private String state;

    private String region;

    private String layer;

    private String fuid;

    private String datasource;

    private String creator;

    private String editor;

    private String remark;

    private Double mj;

    private String createdate;

    private String updatedate;

    private String address;

    private String labelname;

    private String usedname;

    private Double lon;

    private Double lat;

    private String centerPoint;



}
