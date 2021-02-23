package com.wojia.application.controller;

import com.wojia.application.mapper.ProductMapper;
import com.wojia.application.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author 慕琪
 * @Date 2021/2/22 10:45
 * @Version 1.0
 **/
@Controller
public class ProductController {
    @Autowired
    ProductMapper pmapper;

    @RequestMapping("index")
    public String index(Model model) {
        List<Product> hot = pmapper.findHot();
        model.addAttribute("hot", hot);
        List<Product> aNew = pmapper.findNew();
        model.addAttribute("aNew", aNew);
        return "index";
    }
    @RequestMapping("topage_surface")
    public String topage_surface(Model model,int pid) {
        Product product = pmapper.getProduct(pid);
        model.addAttribute("product",product);
        return "page_surface";
    }
}
