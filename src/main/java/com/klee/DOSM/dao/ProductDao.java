package com.klee.DOSM.dao;

import com.klee.DOSM.pojo.Product;

import java.util.List;

public interface ProductDao {
    /*查询所有地产品信息*/
    List<Product> findAllProducts();
}
