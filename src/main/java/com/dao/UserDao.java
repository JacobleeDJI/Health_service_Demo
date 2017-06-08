package com.dao;

import com.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Jacob
 * @Description:
 * @Version 1.0
 */
@Repository
public interface UserDao {
    User selectUserById(Long userId);//通过ID查询用户信息-已实现
    User selectUserByname(String userName);//通过姓名查询用户信息-已实现
    User selectUserByPhone(String userPhone);//通过电话查询用户信息
    List<User> selectAllUser();//查询所有的用户信息-已实现

    Long insertUser(User user);
}
