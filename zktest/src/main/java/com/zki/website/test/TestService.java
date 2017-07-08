package com.zki.website.test;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

/**
 * Created by Administrator on 2017/3/28.
 */
@ContextConfiguration(locations = {"classpath:common/spring-*.xml"})
public abstract class TestService extends AbstractTestNGSpringContextTests {
}
