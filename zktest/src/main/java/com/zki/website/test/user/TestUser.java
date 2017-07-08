package com.zki.website.test.user;

import com.zki.website.test.TestService;
import com.zki.website.user.entity.UserEntity;
import com.zki.website.user.service.UserService;
import org.testng.annotations.Test;

import javax.annotation.Resource;

/**
 * Filename:    com.zki.website.test.user
 * Copyright:   Copyright (c)2017
 * Company:     北京众智科技有限公司
 *
 * @author: crazy
 * @version: 1.0
 * @since: JDK 1.8
 * Create at:  2017-07-09 02:27
 * Description:
 * <p/>
 * Modification History:
 * Date    Author      Version     Description
 * -----------------------------------------------------------------
 * 2017-07-09  LPF      1.0     1.0 Version
 */
public class TestUser extends TestService{
    @Resource
    UserService userService;

    @Test
    public void test(){

        try{

            UserEntity entity = new UserEntity();

            entity.setAge(20);
            entity.setPassWord("w222222");
            entity.setPhoneNo(12333333);
            entity.setRealname("测试");
            entity.setSalt("aaaa");
            entity.setTelNo(1111111111);
            entity.setUsername("test");
            entity.setSex(1);

            userService.insert(entity);

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
