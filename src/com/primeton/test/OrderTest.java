package com.primeton.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class OrderTest {
    @Autowired
    private OrderDao orderDao;

    @Test
    public void testOrder(){
        orderDao.delete();
        orderDao.insert();
        orderDao.save();
        orderDao.update();
    }
}
