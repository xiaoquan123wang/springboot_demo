package com.itheima.controller;

import com.itheima.dao.KaoHeDao;
import com.itheima.pojo.KaoHe;
import com.itheima.service.KaoHeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kaohe")
public class KaoHeController {
    @Autowired
    private KaoHeDao kaoHeDao;
    @Autowired
    private KaoHeService kaoHeService;
    @PostMapping("/add")
    public void khadd(@RequestBody KaoHe kaoHe){
        kaoHeDao.khadd(kaoHe);
    }
    @PutMapping("/edit")
    public void updata(@RequestBody KaoHe kaoHe){
        kaoHeService.updata(kaoHe);
    }
    @GetMapping("/{id}")
    public KaoHe fandByid(@PathVariable Integer id){
           KaoHe kaohe =kaoHeService.fandByid(id);
           return kaohe;
    }
}
