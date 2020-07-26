package com.mmall.demo2.mapper;

import com.mmall.demo2.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * 通过用户名查询用户
     * @param username
     * @return
     */
    User findByUsername(@Param("username") String username);
}
