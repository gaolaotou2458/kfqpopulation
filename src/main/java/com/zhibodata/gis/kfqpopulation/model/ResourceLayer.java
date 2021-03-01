package com.zhibodata.gis.kfqpopulation.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "resource_layer")
public class ResourceLayer {
    @Id
    private String id;

    @Column(name = "parent_id")
    private String parentId;

    /**
     * 图层名称
     */
    private String name;

    /**
     * 图层图标
     */
    private String icon;

    @Column(name = "sort_num")
    private Integer sortNum;

    @Column(name = "delete_status")
    private String deleteStatus;

    @Column(name = "create_user")
    private String createUser;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_user")
    private String updateUser;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "property_name")
    private String propertyName;

    /**
     * 是否能够多选
     */
    private Boolean disabled;

    /**
     * 是否能够进行搜索
     */
    private Boolean searchabled;

    /**
     * 子图层id
     */
    @Column(name = "sub_layer_id")
    private String subLayerId;

    /**
     * 子图层name
     */
    @Column(name = "sub_layer_name")
    private String subLayerName;

    @Column(name = "layer_zoom")
    private Integer layerZoom;

    @Column(name = "layer_type")
    private Integer layerType;

    public Integer getLayerZoom() {
        return layerZoom;
    }

    public void setLayerZoom(Integer layerZoom) {
        this.layerZoom = layerZoom;
    }

    public Integer getLayerType() {
        return layerType;
    }

    public void setLayerType(Integer layerType) {
        this.layerType = layerType;
    }

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
     * @return parent_id
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取图层名称
     *
     * @return name - 图层名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置图层名称
     *
     * @param name 图层名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取图层图标
     *
     * @return icon - 图层图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图层图标
     *
     * @param icon 图层图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * @return sort_num
     */
    public Integer getSortNum() {
        return sortNum;
    }

    /**
     * @param sortNum
     */
    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    /**
     * @return delete_status
     */
    public String getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * @param deleteStatus
     */
    public void setDeleteStatus(String deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * @return create_user
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * @param createUser
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
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
     * @return update_user
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * @param updateUser
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
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

    /**
     * @return property_name
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * @param propertyName
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * 获取是否能够多选
     *
     * @return disabled - 是否能够多选
     */
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * 设置是否能够多选
     *
     * @param disabled 是否能够多选
     */
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * 获取是否能够进行搜索
     *
     * @return searchabled - 是否能够进行搜索
     */
    public Boolean getSearchabled() {
        return searchabled;
    }

    /**
     * 设置是否能够进行搜索
     *
     * @param searchabled 是否能够进行搜索
     */
    public void setSearchabled(Boolean searchabled) {
        this.searchabled = searchabled;
    }

    /**
     * 获取子图层id
     *
     * @return sub_layer_id - 子图层id
     */
    public String getSubLayerId() {
        return subLayerId;
    }

    /**
     * 设置子图层id
     *
     * @param subLayerId 子图层id
     */
    public void setSubLayerId(String subLayerId) {
        this.subLayerId = subLayerId;
    }

    /**
     * 获取子图层name
     *
     * @return sub_layer_name - 子图层name
     */
    public String getSubLayerName() {
        return subLayerName;
    }

    /**
     * 设置子图层name
     *
     * @param subLayerName 子图层name
     */
    public void setSubLayerName(String subLayerName) {
        this.subLayerName = subLayerName;
    }
}
