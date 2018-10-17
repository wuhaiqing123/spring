package com.spring.test.impl;

import com.spring.test.UserDao;
import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("I AM USERDAOIMPL");
    }
}
