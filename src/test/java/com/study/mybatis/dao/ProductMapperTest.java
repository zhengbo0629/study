package com.study.mybatis.dao;

import com.study.mybatis.entity.Product;
import com.study.mybatis.entity.ProductExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductMapperTest {
        @Autowired
        private   ProductMapper  productMapper;
    @Test
    public  void  t1(){
        Product product = new Product(1,"acer");
        productMapper.insert(product);
        System.out.println("succ");

    }
    @Test
    public  void  t2(){
        Product product = new Product(1,"acer");
      //  productMapper.insert(product);
        ProductExample productExample = new ProductExample();
        ProductExample.Criteria criteria = productExample.createCriteria();
        criteria.andProductnameLike("%e%");
        List<Product> products = productMapper.selectByExample(productExample);
        for (Product  p:products){
            System.out.println(p.getProductname());
        }
        System.out.println("succ");

    }

}