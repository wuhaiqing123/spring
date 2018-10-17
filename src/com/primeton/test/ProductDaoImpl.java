package com.primeton.test;

public class ProductDaoImpl implements ProductDao {
    @Override
    public void save() {
        System.out.println("save....");
    }

    @Override
    public void update() {
        System.out.println("update....");
    }

    @Override
    public void delete() {
        System.out.println("delete....");
    }

    @Override
    public void insert() {
        System.out.println("insert......");
    }
}
