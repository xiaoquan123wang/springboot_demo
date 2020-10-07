package com.itheima.dao;

import com.itheima.pojo.KaoHe;

public interface KaoHeDao {
    void khadd(KaoHe kaoHe);
    void updata(KaoHe kaoHe);
    KaoHe fandByid(Integer id);
}
