package com.service;

import com.model.User;

import java.util.List;

/**
 * @author Jacob
 * @Description:
 * @Version 1.0
 */
public interface UserService {
    List<User> getAllUser();
    User getUserByPhone(String userPhone);
    User getUserById(Long userId);
    User getUserByname(String UserName);


    Long getinsertUser(User user);

}
