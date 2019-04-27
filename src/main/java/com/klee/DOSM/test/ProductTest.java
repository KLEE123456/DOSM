package com.klee.DOSM.test;

import com.klee.DOSM.dao.ProductDao;
import com.klee.DOSM.mapper.ProductMapper;
import com.klee.DOSM.pojo.Product;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ProductTest {
    @Test
    public  void   findAllProductsTest(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
       /* ProductDao productDao = (ProductDao)context.getBean("productDao");*/
        ProductMapper productMapper = context.getBean(ProductMapper.class);
        List<Product> productList = productMapper.findAllProducts();
        productList.forEach(product -> {
            System.out.println(product);
        });
    }
}
