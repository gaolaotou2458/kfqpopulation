package com.zhibodata.gis.kfqpopulation.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "house_info")
public class HouseInfo {
    @Id
    private String id;

    @Column(name = "building_id")
    private String buildingId;

    private String name;

    private String address;

    @Column(name = "house_num")
    private Integer houseNum;

    private BigDecimal lat;

    private BigDecimal lng;

    @Column(name = "police_num")
    private BigDecimal policeNum;

    @Column(name = "create_id")
    private String createId;

    @Column(name = "update_id")
    private String updateId;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

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
     * @return building_id
     */
    public String getBuildingId() {
        return buildingId;
    }

    /**
     * @param buildingId
     */
    public void setBuildingId(String buildingId) {
        this.buildingId = buildingId;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return house_num
     */
    public Integer getHouseNum() {
        return houseNum;
    }

    /**
     * @param houseNum
     */
    public void setHouseNum(Integer houseNum) {
        this.houseNum = houseNum;
    }

    /**
     * @return lat
     */
    public BigDecimal getLat() {
        return lat;
    }

    /**
     * @param lat
     */
    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    /**
     * @return lng
     */
    public BigDecimal getLng() {
        return lng;
    }

    /**
     * @param lng
     */
    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    /**
     * @return police_num
     */
    public BigDecimal getPoliceNum() {
        return policeNum;
    }

    /**
     * @param policeNum
     */
    public void setPoliceNum(BigDecimal policeNum) {
        this.policeNum = policeNum;
    }

    /**
     * @return create_id
     */
    public String getCreateId() {
        return createId;
    }

    /**
     * @param createId
     */
    public void setCreateId(String createId) {
        this.createId = createId;
    }

    /**
     * @return update_id
     */
    public String getUpdateId() {
        return updateId;
    }

    /**
     * @param updateId
     */
    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}