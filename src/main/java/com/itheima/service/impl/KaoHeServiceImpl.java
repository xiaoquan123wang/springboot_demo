package com.itheima.service.impl;

import com.itheima.dao.KaoHeDao;
import com.itheima.pojo.KaoHe;
import com.itheima.service.KaoHeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class KaoHeServiceImpl implements KaoHeService {
    @Autowired
    private KaoHeDao kaoHeDao;


    public void updata(KaoHe kaoHe) {
        kaoHeDao.updata(kaoHe);
    }

    @Override
    public KaoHe fandByid(Integer id) {
        return kaoHeDao.fandByid(id);
    }

}
