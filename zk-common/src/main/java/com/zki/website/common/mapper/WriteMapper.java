package com.zki.website.common.mapper;

import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Filename:    com.user.website.common.mapper.WriteMapper
 * Copyright:   Copyright (c)2017
 * Company:     北京众智科技有限公司
 *
 * @author: crazy
 * @version: 1.0
 * @since: JDK 1.8
 * Create at:  2017-07-08 10:06
 * Description: 读写分离用来写数据库 当然也可以读
 * <p/>
 * Modification History:
 * Date    Author      Version     Description
 * -----------------------------------------------------------------
 * 2017-07-08  LPF      1.0     1.0 Version
 */
public interface WriteMapper<T> extends BaseMapper<T>,MySqlMapper<T> {
    public void create(T t);
    public void update(T t);
    public void delete(int uuid);
}