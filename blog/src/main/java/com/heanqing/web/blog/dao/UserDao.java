package com.heanqing.web.blog.dao;

import com.heanqing.web.blog.model.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by heanqing on 2016/12/2.
 */
@Component
public interface UserDao {
    public static final String FIELD = "id,username,password,age,money,valid,description,create_time";
    public static final String TABLE_NAME = "user";
    @Select("select " + FIELD + " from " + TABLE_NAME)
    public List<User> findAll();
}
