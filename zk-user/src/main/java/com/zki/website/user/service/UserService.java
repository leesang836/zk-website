package com.zki.website.user.service;

import com.zki.website.user.entity.UserEntity;
import com.zki.website.user.mapper.read.UserReadMapper;
import com.zki.website.user.mapper.write.UserWriteMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Filename:    com.zki.website.user.service
 * Copyright:   Copyright (c)2017
 * Company:     北京众智科技有限公司
 *
 * @author: crazy
 * @version: 1.0
 * @since: JDK 1.8
 * Create at:  2017-07-09 02:24
 * Description:
 * <p/>
 * Modification History:
 * Date    Author      Version     Description
 * -----------------------------------------------------------------
 * 2017-07-09  LPF      1.0     1.0 Version
 */
@Service
public class UserService {
    @Resource
    private UserReadMapper userReadMapper;
    @Resource
    private UserWriteMapper userWriteMapper;

    public int insert(UserEntity userEntity){
        return userWriteMapper.insert(userEntity);
    }


}
