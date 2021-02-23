package com.wojia.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制网页的跳转
 *
 * @Author 慕琪
 * @Date 2021/2/3 15:46
 * @Version 1.0
 **/
@Controller
public class SkipController {

    @RequestMapping("toRegist")
    public String toRegist() {
        return "member_regist";
    }

    @RequestMapping("toLogin")
    public String toLogin() {
        return "member_login";
    }

    @RequestMapping("toOrder")
    public String toOrder() {
        return "order";
    }

    @RequestMapping("toshopping_cart")
    public String toshopping_cart() {
        return "shopping_cart";
    }

    @RequestMapping("tovegetables_classify")
    public String tovegetables_classify() {
        return "vegetables_classify";
    }
}
