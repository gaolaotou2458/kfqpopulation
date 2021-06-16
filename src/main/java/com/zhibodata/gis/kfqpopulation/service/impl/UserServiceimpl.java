package com.zhibodata.gis.kfqpopulation.service.impl;

import cn.hutool.core.convert.Convert;
import cn.hutool.crypto.SecureUtil;
import com.zhibodata.gis.kfqpopulation.common.BusinessException;
import com.zhibodata.gis.kfqpopulation.common.EmBusinessError;
import com.zhibodata.gis.kfqpopulation.dto.indto.UserInDto;
import com.zhibodata.gis.kfqpopulation.dto.indto.user.LoginInfoOutDto;
import com.zhibodata.gis.kfqpopulation.dto.indto.user.UserInfoOutDto;
import com.zhibodata.gis.kfqpopulation.mapper.UserMapper;
import com.zhibodata.gis.kfqpopulation.model.User;
import com.zhibodata.gis.kfqpopulation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.Map;

//@CacheConfig(cacheNames = "kfqcache")
@Service
public class UserServiceimpl implements UserService {
    private final String  key = "0102030405060708";
    @Autowired
    private UserMapper userMapper;


    @Override
    public Map<String, Object> getUsers(UserInDto userInDto) {
        return null;
    }

    //@Cacheable(key = "#id")
    @Cacheable(keyGenerator = "myKeyGenerator")
    @Override
    public User getUserById(String id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public int deleteUser(String id) {
        return 0;
    }

    //    @Override
//    public Map<String, Object> getUsers(UserInDto userInDto) {
//        Map<String, Object> map = new HashMap<>();
//        PageHelper.startPage(userInDto.getPage(), userInDto.getSize());
//        Example example = new Example(User.class);
//        Example.Criteria criteria = example.createCriteria();
//        criteria.andEqualTo("deleteStatus","0");
//        example.orderBy("updateTime").desc();
//        TkSearchUtils.getAndLike(criteria, userInDto);
//        PageInfo<User> pageInfo = new PageInfo<>(userMapper.selectByExample(example));
//        map.put("dataList",pageInfo.getList());
//        map.put("totalPage", pageInfo.getPages());
//        map.put("total", pageInfo.getTotal());
//        return map;
//    }
//
//    @Override
//    public User getUserById(String id) {
//        Example example = new Example(User.class);
//        example.createCriteria().andEqualTo("id", id);
//        return userMapper.selectOneByExample(example);
//    }
//
//    @Override
//    @Transactional
//    public int addUser(User user) {
//        user.setId(IdUtil.randomUUID());
//        DefaultAttrUtils.setCreateAndUpdate(User.class, user);
//        user.setPassword(SecureUtil.md5(user.getPassword()));
//        return userMapper.insert(user);
//    }
//
//    @Override
//    public int updateUser(User user) {
//        Example example = new Example(User.class);
//        user.setPassword(SecureUtil.md5(user.getPassword()));
//        example.createCriteria().andEqualTo("id", user.getId());
//        DefaultAttrUtils.setUpdate(User.class, user);
//        return userMapper.updateByExampleSelective(user,example);
//    }
//
//    @Override
//    public int deleteUser(String id) {
//        Example example = new Example(User.class);
//        example.createCriteria().andEqualTo("id", id);
//        User user = userMapper.selectOneByExample(example);
//        user.setDeleteStatus("1");
//        DefaultAttrUtils.setUpdate(User.class, user);
//        return userMapper.updateByExampleSelective(user, example);
//    }
//
    @Override
    @Transactional
    public LoginInfoOutDto login(String userName, String passWord) throws BusinessException {
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userName", userName);
        String decryption = null;
        User user = null;
        try {
            //decryption = SecureUtil.des(key.getBytes()).decryptStr(passWord);
            //criteria.andEqualTo("password", SecureUtil.md5(decryption));
            criteria.andEqualTo("password", passWord);
            user = userMapper.selectOneByExample(example);
            if(user == null) {
                throw new BusinessException(EmBusinessError.LOGIN_FAIL);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessException(EmBusinessError.LOGIN_FAIL);
        }

        //插入登录日志
//        LoginLog loginLog = new LoginLog();
//        loginLog.setId(UUID.randomUUID().toString());
//        loginLog.setLoginAccount(userName);
//        loginLog.setLoginName(userName);
//        loginLog.setLoginTime(DateUtil.parse(DateUtil.now(), "yyyy-MM-dd"));
//        loginLogMapper.insertSelective(loginLog);

        LoginInfoOutDto loginInfoOutDto = Convert.convert(LoginInfoOutDto.class, user);
//        Example example2 = new Example(Role.class);
//        example2.createCriteria().andEqualTo("id", user.getRoleId());
//        Role role = roleMapper.selectOneByExample(example2);
//        loginInfoOutDto.setRole(role);


        return loginInfoOutDto;
    }

    @Override
    public UserInfoOutDto getUserInfoById(String id) {
        return null;
    }

    @Override
    public User getUserByUserName(String userName) {
        Example example = new Example(User.class);
        example.createCriteria().andEqualTo("userName", userName);
        User user = userMapper.selectOneByExample(example);
        return user;
    }
//
//    @Override
//    public UserInfoOutDto getUserInfoById(String id) {
//        Example example = new Example(User.class);
//        example.createCriteria().andEqualTo("id", id);
//        User user = userMapper.selectOneByExample(example);
//        PartOrg partOrg = partOrgMapper.selectByPrimaryKey(user.getPartOrgId());
//        UserInfoOutDto userInfoOutDto = Convert.convert(UserInfoOutDto.class, user);
//        userInfoOutDto.setPartOrg(partOrg);
//        return userInfoOutDto;
//


}
