package com.primeton.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ProductTest {
    @Autowired
    private ProductDao productDao;
    @Test
    public void springTest(){
        productDao.delete();
        productDao.insert();
        productDao.save();
        productDao.update();
    }
}
