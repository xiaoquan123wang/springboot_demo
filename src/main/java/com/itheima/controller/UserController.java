package com.itheima.controller;


import com.itheima.dao.UserDao;
import com.itheima.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @PostMapping("/add")
    public void addUser(@RequestBody User user) {
        userDao.insert(user);
    }

    @GetMapping("/{id}")
    public String findUserById(@PathVariable("id") Integer id, Model model) {
        User user = userDao.findUserById(id);
        model.addAttribute("user", user);
        return "index";
    }
}
