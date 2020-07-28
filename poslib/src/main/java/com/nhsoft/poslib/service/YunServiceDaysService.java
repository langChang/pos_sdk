package com.nhsoft.poslib.service;

import com.nhsoft.poslib.db.DaoManager;
import com.nhsoft.poslib.model.YunServiceDays;
import com.nhsoft.poslib.service.greendao.YunServiceDaysDao;
import com.nhsoft.poslib.utils.MatterUtils;


public class YunServiceDaysService {

    private static YunServiceDaysService instance;
    private static final String MY_ID="MY_ID";

    public static YunServiceDaysService getInstance(){
        if (instance==null){
            instance=new YunServiceDaysService();
        }
        return instance;
    }

    public boolean insertBean(final YunServiceDays yunServiceDays){
        yunServiceDays.setId(MY_ID);
        final YunServiceDaysDao yunServiceDaysDao= DaoManager.getInstance().getDaoSession().getYunServiceDaysDao();
        return MatterUtils.doMatter(yunServiceDaysDao, new Runnable() {
            @Override
            public void run() {
                yunServiceDaysDao.insertOrReplaceInTx(yunServiceDays);
            }
        });
    }

    public YunServiceDays getBean(){
        YunServiceDaysDao yunServiceDaysDao= DaoManager.getInstance().getDaoSession().getYunServiceDaysDao();
        return  yunServiceDaysDao.queryBuilder().where(YunServiceDaysDao.Properties.Id.eq(MY_ID)).unique();

    }
}
