package com.zki.website.common.mapper;

import tk.mybatis.mapper.common.Marker;
import tk.mybatis.mapper.common.RowBoundsMapper;
import tk.mybatis.mapper.common.base.BaseSelectMapper;

import java.util.List;

/**
 * Filename:    com.user.website.common.mapper.ReadMapper
 * Copyright:   Copyright (c)2017
 * Company:     北京众智科技有限公司
 *
 * @author: crazy
 * @version: 1.0
 * @since: JDK 1.8
 * Create at:  2017-07-08 10:08
 * Description:
 * <p/>
 * Modification History:
 * Date    Author      Version     Description
 * -----------------------------------------------------------------
 * 2017-07-08  LPF      1.0     1.0 Version
 */
public interface ReadMapper<T> extends BaseSelectMapper<T>,RowBoundsMapper<T>,Marker {
    public T getByUuid(int uuid);
    //分页
    public List<T> getByConditionPage(T t);
    //不分页
    public List<T> getByCondition(T t);
}
