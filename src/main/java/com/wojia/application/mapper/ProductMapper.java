package com.wojia.application.mapper;

import com.wojia.application.pojo.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author 慕琪
 * @Date 2021/2/22 10:30
 * @Version 1.0
 **/
@Repository
public interface ProductMapper {
    /**
     * 热门商品
     */
    List<Product> findHot();
    /**
     * 最新商品
     */
    List<Product> findNew();
    /**
     * 根据id查询商品
     */
    Product getProduct(int pid);
}
