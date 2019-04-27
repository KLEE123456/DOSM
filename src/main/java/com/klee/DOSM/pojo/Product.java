package com.klee.DOSM.pojo;

public class Product {
    private  int  id;

    private  String name;

    private  float price;

    private  int cid;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
