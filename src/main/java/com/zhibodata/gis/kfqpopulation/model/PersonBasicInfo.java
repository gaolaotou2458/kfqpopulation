package com.zhibodata.gis.kfqpopulation.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "person_basic_info")
public class PersonBasicInfo {
    @Id
    private String id;

    private String name;

    @Column(name = "personal_card")
    private Long personalCard;

    private Short sex;

    private Integer age;

    private String nation;

    @Column(name = "native_space")
    private String nativeSpace;

    @Column(name = "house_id")
    private Integer houseId;

    private Short type;

    @Column(name = "create_id")
    private String createId;

    @Column(name = "update_id")
    private String updateId;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "is_del")
    private Integer isDel;

    @Column(name = "is_dead")
    private Integer isDead;

    @Column(name = "is_flow")
    private Integer isFlow;

    @Column(name = "is_old")
    private Integer isOld;

    @Column(name = "is_disability")
    private Integer isDisability;

    @Column(name = "is_low")
    private Integer isLow;

    @Column(name = "is_five")
    private Integer isFive;

    @Column(name = "is_important")
    private Integer isImportant;

    @Column(name = "data_from")
    private String dataFrom;

    @Column(name = "update_cycle")
    private String updateCycle;

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
     * @return personal_card
     */
    public Long getPersonalCard() {
        return personalCard;
    }

    /**
     * @param personalCard
     */
    public void setPersonalCard(Long personalCard) {
        this.personalCard = personalCard;
    }

    /**
     * @return sex
     */
    public Short getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(Short sex) {
        this.sex = sex;
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
     * @return nation
     */
    public String getNation() {
        return nation;
    }

    /**
     * @param nation
     */
    public void setNation(String nation) {
        this.nation = nation;
    }

    /**
     * @return native_space
     */
    public String getNativeSpace() {
        return nativeSpace;
    }

    /**
     * @param nativeSpace
     */
    public void setNativeSpace(String nativeSpace) {
        this.nativeSpace = nativeSpace;
    }

    /**
     * @return house_id
     */
    public Integer getHouseId() {
        return houseId;
    }

    /**
     * @param houseId
     */
    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    /**
     * @return type
     */
    public Short getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Short type) {
        this.type = type;
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

    /**
     * @return is_del
     */
    public Integer getIsDel() {
        return isDel;
    }

    /**
     * @param isDel
     */
    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    /**
     * @return is_dead
     */
    public Integer getIsDead() {
        return isDead;
    }

    /**
     * @param isDead
     */
    public void setIsDead(Integer isDead) {
        this.isDead = isDead;
    }

    /**
     * @return is_flow
     */
    public Integer getIsFlow() {
        return isFlow;
    }

    /**
     * @param isFlow
     */
    public void setIsFlow(Integer isFlow) {
        this.isFlow = isFlow;
    }

    /**
     * @return is_old
     */
    public Integer getIsOld() {
        return isOld;
    }

    /**
     * @param isOld
     */
    public void setIsOld(Integer isOld) {
        this.isOld = isOld;
    }

    /**
     * @return is_disability
     */
    public Integer getIsDisability() {
        return isDisability;
    }

    /**
     * @param isDisability
     */
    public void setIsDisability(Integer isDisability) {
        this.isDisability = isDisability;
    }

    /**
     * @return is_low
     */
    public Integer getIsLow() {
        return isLow;
    }

    /**
     * @param isLow
     */
    public void setIsLow(Integer isLow) {
        this.isLow = isLow;
    }

    /**
     * @return is_five
     */
    public Integer getIsFive() {
        return isFive;
    }

    /**
     * @param isFive
     */
    public void setIsFive(Integer isFive) {
        this.isFive = isFive;
    }

    /**
     * @return is_important
     */
    public Integer getIsImportant() {
        return isImportant;
    }

    /**
     * @param isImportant
     */
    public void setIsImportant(Integer isImportant) {
        this.isImportant = isImportant;
    }

    /**
     * @return data_from
     */
    public String getDataFrom() {
        return dataFrom;
    }

    /**
     * @param dataFrom
     */
    public void setDataFrom(String dataFrom) {
        this.dataFrom = dataFrom;
    }

    /**
     * @return update_cycle
     */
    public String getUpdateCycle() {
        return updateCycle;
    }

    /**
     * @param updateCycle
     */
    public void setUpdateCycle(String updateCycle) {
        this.updateCycle = updateCycle;
    }
}