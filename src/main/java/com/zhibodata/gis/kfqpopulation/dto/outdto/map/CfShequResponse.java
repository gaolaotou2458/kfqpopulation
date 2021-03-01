package com.zhibodata.gis.kfqpopulation.dto.outdto.map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zhibodata.gis.kfqpopulation.dto.indto.resource.FeatureEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

@Data
public class CfShequResponse extends BaseJsonResponse  {

    @Id
    private String id;

    private Long objectid;

    private String classid;

    private String type;

    private String fuid;

    private String datasource;

    private String creator;

    private Date createdate;

    private String editor;

    private Date updatedate;

    private String remark;

    private String name;

    private String pyname;

    private String alias;

    private String shortname;

    private Double mj;

    private String region;

    private String usedname;

    private Double population;

    @Column(name = "shape_star")
    private Double shapeStar;

    @Column(name = "shape_stle")
    private Double shapeStle;

    private Double lon;

    private Double lat;

    private String centerPoint;


}
