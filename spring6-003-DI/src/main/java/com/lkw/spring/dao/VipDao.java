package com.lkw.spring.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VipDao {
    private static final Logger logger = LoggerFactory.getLogger(VipDao.class);
    public void insert(){
        logger.info("数据库正在保存VIP用户信息");
    }
}
