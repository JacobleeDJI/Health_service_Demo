package com.service.impl;

import com.dao.UserDao;
import com.model.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * @author Jacob
 * @Description:
 * @Version 1.0
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;


    public List<User> getAllUser() {
        return userDao.selectAllUser();
    }

    public User getUserByPhone(String userPhone) {
        return userDao.selectUserByPhone(userPhone);
    }

    public User getUserById(Long userId) {
        return userDao.selectUserById(userId);
    }

    public User getUserByname(String userName) {return userDao.selectUserByname(userName); }

    public Long getinsertUser(User user) {return userDao.insertUser(user); }

}
