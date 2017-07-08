package com.zki.website.user.mapper.write;

import com.zki.website.common.mapper.WriteMapper;
import com.zki.website.user.entity.UserEntity;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Filename:    com.zki.website.user.mapper.write
 * Copyright:   Copyright (c)2017
 * Company:     北京众智科技有限公司
 *
 * @author: crazy
 * @version: 1.0
 * @since: JDK 1.8
 * Create at:  2017-07-09 01:45
 * Description:
 * <p/>
 * Modification History:
 * Date    Author      Version     Description
 * -----------------------------------------------------------------
 * 2017-07-09  LPF      1.0     1.0 Version
 */
@Repository
public interface UserWriteMapper extends WriteMapper<UserEntity>{
}
