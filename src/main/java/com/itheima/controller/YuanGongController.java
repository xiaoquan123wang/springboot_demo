package com.itheima.controller;

import com.itheima.dao.UserDao;
import com.itheima.dao.YuanGongDao;
import com.itheima.pojo.KhYuanGong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/yuan")
public class YuanGongController {
    @Autowired
    private YuanGongDao yuanGongDao;

    @PostMapping("/add")
    public void ygadd(@RequestBody KhYuanGong khYuanGong){
        yuanGongDao.ygadd(khYuanGong);
    }
}
