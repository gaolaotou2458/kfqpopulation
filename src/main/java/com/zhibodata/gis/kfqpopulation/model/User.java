package com.zhibodata.gis.kfqpopulation.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
@Table(name = "\"user\"")
public class User implements Serializable {


    private static final long serialVersionUID = -437381663758853326L;
    @Id
    private String id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_describe")
    private String userDescribe;

    @Column(name = "create_user")
    private String createUser;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_user")
    private String updateUser;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "delete_status")
    private String deleteStatus;

    /**
     * 角色id
     */
    @Column(name = "role_id")
    private String roleId;


    private String password;



    private String token;

    /**
     * PIN码
     */
    private String pin;

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
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return user_describe
     */
    public String getUserDescribe() {
        return userDescribe;
    }

    /**
     * @param userDescribe
     */
    public void setUserDescribe(String userDescribe) {
        this.userDescribe = userDescribe;
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
     * 获取角色id
     *
     * @return role_id - 角色id
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 设置角色id
     *
     * @param roleId 角色id
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }



    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }



    /**
     * @return token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * 获取PIN码
     *
     * @return pin - PIN码
     */
    public String getPin() {
        return pin;
    }

    /**
     * 设置PIN码
     *
     * @param pin PIN码
     */
    public void setPin(String pin) {
        this.pin = pin;
    }
}