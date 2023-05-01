package cn.abel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.abel.bean.User;
import cn.abel.service.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    // 写一个根据用户id获取用户信息的方法，url是/user/getById
    @RequestMapping("/user/getById")
    @ResponseBody
    public String getById(Long id) {
        return userService.getById(id).toString();
    }

    // 注册用户
    @RequestMapping("/user/create")
    @ResponseBody
    public String create(String name, String mobile, Integer role) {
        User newUser = new User();
        newUser.setName(name);
        newUser.setMobile(mobile);
        newUser.setRole(role);
        return userService.create(newUser).toString();
    }

    // 按角色统计用户总数量
    @RequestMapping("/user/countByRole")
    @ResponseBody
    public String countByRole(Integer role) {
        return userService.countByRole(role).toString();
    }

    // 更新用户名称
    @RequestMapping("/user/update")
    @ResponseBody
    public String update(Long id, String name, Integer role) {
        User newUser = new User();
        newUser.setName(name);
        newUser.setId(id);
        newUser.setRole(role);
        return userService.update(newUser).toString();
    }


    // 注销用户
    @RequestMapping("/user/delete")
    @ResponseBody
    public String delete(Long id) {
        return String.valueOf(userService.delete(id));
    }

  

}
