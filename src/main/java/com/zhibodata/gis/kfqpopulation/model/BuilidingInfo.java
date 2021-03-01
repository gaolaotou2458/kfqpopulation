package com.zhibodata.gis.kfqpopulation.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "builiding_info")
public class BuilidingInfo {
   private String sfzh;
   private String dhhm;

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }

    public String getDhhm() {
        return dhhm;
    }

    public void setDhhm(String dhhm) {
        this.dhhm = dhhm;
    }
}