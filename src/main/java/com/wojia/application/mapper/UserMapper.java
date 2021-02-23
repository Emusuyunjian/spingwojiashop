package com.wojia.application.mapper;

import com.wojia.application.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @Author 慕琪
 * @Date 2021/2/3 15:24
 * @Version 1.0
 **/
@Repository
public interface UserMapper {
    /**
     * 插入用户
     */
    int regist(User user);

    /**
     * 得到登录的用户
     */
    User getUser(Map<String, Object> map);

    /**
     * ajax登录验证email
     */
    User getUserByEmail(String email);
}
