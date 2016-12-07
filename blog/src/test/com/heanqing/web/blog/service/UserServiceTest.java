package com.heanqing.web.blog.service;

import com.heanqing.web.blog.dao.UserDao;
import junit.framework.TestCase;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by heanqing on 2016/12/5.
 */
public class UserServiceTest extends TestCase {
    @Autowired
    private static UserService userService;
    @BeforeClass
    public static void before(){

    }
    @Test
    public void testFindAll() throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-test.xml");
        userService = (UserService)applicationContext.getBean("userService");
        userService.findAll();
    }

}