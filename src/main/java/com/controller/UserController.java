package com.controller;

import com.model.User;
import com.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    private Logger log = Logger.getLogger(UserController.class);

    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request, Model model) {
        log.info("查询所有用户信息");
        List<User> list = userService.getAllUser();
        model.addAttribute("list", list);
        return "showUser";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String showId(HttpServletRequest request, Model model, @PathVariable Long id) {
        log.info("通过ID查询");
        User users = userService.getUserById(id);
        model.addAttribute("users", users);
        return "showUser";
    }

    @RequestMapping(value = "/name/{user_name}", method = RequestMethod.GET)
    public String showName(HttpServletRequest request, Model model, @PathVariable String user_name) {
        log.info("通过姓名查询");
        User userN = userService.getUserByname(user_name);
        model.addAttribute("userN", userN);
        return "showUser";
    }

    @RequestMapping(value = "/phone/{userPhone}", method = RequestMethod.GET)
    public String showPhone(HttpServletRequest request, Model modelm, @PathVariable String userPhone) {
        log.info("通过电话号码查询");
        User userP = userService.getUserByPhone(userPhone);
        modelm.addAttribute("userP", userP);
        return "showUser";
    }


    @RequestMapping(value = "/Login", method = RequestMethod.GET)
    public String insertUser(@ModelAttribute User user) {
        log.info("注册");
        Map<String, String> result = new HashMap<String, String>();
        Long loginUser = userService.getinsertUser(user);
        System.out.println("注册后的id为：" + user.getId());
        return "showUser";
    }

}
