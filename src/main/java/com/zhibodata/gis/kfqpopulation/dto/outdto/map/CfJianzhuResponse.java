package com.zhibodata.gis.kfqpopulation.dto.outdto.map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "cf_jianzhu")
@Data
public class CfJianzhuResponse extends BaseJsonResponse {
    @Id
    private String id;
//
//    @JsonIgnore
//    private Object geom;
//
//    private Long objectid;
//
    private String name;
//
//    private String shortname;
//
    private String address;


//
//    private String classid;
//
//    private String type;
//
//    private String state;
//
//    private String obligee;
//
//    private String zipcode;
//
//    private Long upfloor;
//
//    private String downfloor;
//
//    private String jzmj;
//
//    private BigDecimal zdmj;
//
//    private BigDecimal height;
//
//    private String used;
//
//    private String number;
//
//    private String structure;
//
//    private String belong;
//
//    private String region;
//
//    private String fuid;
//
//    private String datasource;
//
//    private String creator;
//
//    private String createdate;
//
//    private String editor;
//
//    private String updatedate;
//
//    private String csly;
//
//    private String lzhly;
//
//    private String jznl;
//
//    private String remark;
//
//    private Long jznl1;
//
//    private String belongid;
//
//    private String sscsq;
//
//    private String ssjdz;
//
//    private String labelname;
//
//    @Column(name = "gdb_geomat")
//    private String gdbGeomat;
//
//    private String isprotecte;
//
//    private String tscl;


    private String centerPoint;


}
