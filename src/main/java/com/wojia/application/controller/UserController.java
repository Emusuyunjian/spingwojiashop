package com.wojia.application.controller;

import com.wojia.application.mapper.ProductMapper;
import com.wojia.application.mapper.UserMapper;
import com.wojia.application.pojo.Product;
import com.wojia.application.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author 慕琪
 * @Date 2021/2/3 15:23
 * @Version 1.0
 **/
@Controller
public class UserController {
    @Autowired
    UserMapper mapper;
    @Autowired
    ProductMapper pmapper;

    @RequestMapping("regist")
    public String regist(User user) {
        user.setState(0);
        int i = mapper.regist(user);
        if (i > 0) {
            System.out.println("注册成功");
        }
        return "shopping_cart";
    }

    @RequestMapping("login")
    public String login(Model model, String email, String password, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();

        map.put("email", email);
        map.put("password", password);
        User user = mapper.getUser(map);
        if (user != null) {
            request.getSession().setAttribute("user", user);
            model.addAttribute("user", user);
            List<Product> hot = pmapper.findHot();
            model.addAttribute("hot", hot);
            List<Product> aNew = pmapper.findNew();
            model.addAttribute("aNew", aNew);
            return "indexuser";
        } else {
            model.addAttribute("msg", "邮箱或密码错误！");
            return "member_login";
        }

    }

    @RequestMapping("isEmail")
    @ResponseBody
    public boolean isEmail(String email) {
        User user = mapper.getUserByEmail(email);
        if (user != null) {
            return true;
        } else {
            return false;
        }
    }
}
