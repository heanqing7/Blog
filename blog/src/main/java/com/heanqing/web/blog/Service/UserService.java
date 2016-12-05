package com.heanqing.web.blog.Service;

import com.heanqing.web.blog.dao.UserDao;
import com.heanqing.web.blog.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by heanqing on 2016/12/2.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> findAll(){
        return userDao.findAll();
    }
}
