package com.zhibodata.gis.kfqpopulation.model;

import javax.persistence.*;

@Table(name = "tp_basic_population_all")
public class TpBasicPopulationAll {
    @Id
    private String id;

    private String sfzh;

    private String xm;

    private String xb;

    private String hjdz;

    private String mz;

    private String hh;

    private String lon;

    private String lat;

    private String rylx;

    private Integer age;

    private Object geom;

    @Column(name = "center_point")
    private String centerPoint;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return sfzh
     */
    public String getSfzh() {
        return sfzh;
    }

    /**
     * @param sfzh
     */
    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }

    /**
     * @return xm
     */
    public String getXm() {
        return xm;
    }

    /**
     * @param xm
     */
    public void setXm(String xm) {
        this.xm = xm;
    }

    /**
     * @return xb
     */
    public String getXb() {
        return xb;
    }

    /**
     * @param xb
     */
    public void setXb(String xb) {
        this.xb = xb;
    }

    /**
     * @return hjdz
     */
    public String getHjdz() {
        return hjdz;
    }

    /**
     * @param hjdz
     */
    public void setHjdz(String hjdz) {
        this.hjdz = hjdz;
    }

    /**
     * @return mz
     */
    public String getMz() {
        return mz;
    }

    /**
     * @param mz
     */
    public void setMz(String mz) {
        this.mz = mz;
    }

    /**
     * @return hh
     */
    public String getHh() {
        return hh;
    }

    /**
     * @param hh
     */
    public void setHh(String hh) {
        this.hh = hh;
    }

    /**
     * @return lon
     */
    public String getLon() {
        return lon;
    }

    /**
     * @param lon
     */
    public void setLon(String lon) {
        this.lon = lon;
    }

    /**
     * @return lat
     */
    public String getLat() {
        return lat;
    }

    /**
     * @param lat
     */
    public void setLat(String lat) {
        this.lat = lat;
    }

    /**
     * @return rylx
     */
    public String getRylx() {
        return rylx;
    }

    /**
     * @param rylx
     */
    public void setRylx(String rylx) {
        this.rylx = rylx;
    }

    /**
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return geom
     */
    public Object getGeom() {
        return geom;
    }

    /**
     * @param geom
     */
    public void setGeom(Object geom) {
        this.geom = geom;
    }

    /**
     * @return center_point
     */
    public String getCenterPoint() {
        return centerPoint;
    }

    /**
     * @param centerPoint
     */
    public void setCenterPoint(String centerPoint) {
        this.centerPoint = centerPoint;
    }
}