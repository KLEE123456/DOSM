package com.klee.DOSM.dao.impl;

import com.klee.DOSM.dao.ProductDao;
import com.klee.DOSM.mapper.ProductMapper;
import com.klee.DOSM.pojo.Product;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class ProductDaoImpl extends SqlSessionDaoSupport implements ProductDao {
    @Override
    public List<Product> findAllProducts() {
        SqlSession sqlSession = this.getSqlSession();
        /*基于dao的整合*/
        /*List<Product> productList=sqlSession.selectList("com.klee.DOSM.mapper.ProductMapper.findAllProducts");*/
        ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
        List<Product> productList = productMapper.findAllProducts();
        return productList;
    }
}
