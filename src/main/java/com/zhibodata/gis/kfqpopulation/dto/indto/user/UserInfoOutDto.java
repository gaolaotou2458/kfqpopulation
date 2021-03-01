package com.zhibodata.gis.kfqpopulation.dto.indto.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Table(name = "\"user\"")
@Valid
@Data
public class UserInfoOutDto {

    private String id;

    @Column(name = "user_name")
    @NotEmpty(message="用户名不能为空！")
    private String userName;

    @Column(name = "user_describe")
    @NotEmpty(message="用户描述不能为空！")
    private String userDescribe;

    @Column(name = "create_user")
    private String createUser;


    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_user")
    private String updateUser;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "delete_status")
    private String deleteStatus;

    @Column(name = "role_id")
    private String roleId;

    @Column(name = "enterprise_id")
    private String enterpriseId;

    @NotEmpty(message="密码不能为空！")
    @Column(name = "\"password\"")
    private String password;

    @NotEmpty(message="所属党组织编号不能为空！")
    @Column(name = "part_org_id")
    private String partOrgId;


    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", userDescribe='" + userDescribe + '\'' +
                ", createUser='" + createUser + '\'' +
                ", createTime=" + createTime +
                ", updateUser='" + updateUser + '\'' +
                ", updateTime=" + updateTime +
                ", deleteStatus='" + deleteStatus + '\'' +
                ", roleId='" + roleId + '\'' +
                ", enterpriseId='" + enterpriseId + '\'' +
                ", password='" + password + '\'' +
                ", partOrgId='" + partOrgId + '\'' +
                '}';
    }
}
