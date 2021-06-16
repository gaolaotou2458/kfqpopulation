package com.zhibodata.gis.kfqpopulation.service;


import com.zhibodata.gis.kfqpopulation.common.BusinessException;
import com.zhibodata.gis.kfqpopulation.dto.indto.UserInDto;
import com.zhibodata.gis.kfqpopulation.dto.indto.user.LoginInfoOutDto;
import com.zhibodata.gis.kfqpopulation.dto.indto.user.UserInfoOutDto;
import com.zhibodata.gis.kfqpopulation.model.User;

import java.util.Map;

public interface UserService {

    Map<String, Object> getUsers(UserInDto userInDto);


    User getUserById(String id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(String id);

    LoginInfoOutDto login(String userName, String passWord) throws BusinessException;

    UserInfoOutDto getUserInfoById(String id);

    User getUserByUserName(String userName);
}
