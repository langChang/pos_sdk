package com.nhsoft.poslib.service;

import com.nhsoft.poslib.db.DaoManager;
import com.nhsoft.poslib.entity.VipIcInit;
import com.nhsoft.poslib.service.greendao.VipIcInitDao;
import com.nhsoft.poslib.utils.MatterUtils;

import java.util.List;

public class VipIcInitService {
    private static VipIcInitService instance;

    public static VipIcInitService getInstance(){
        if (instance==null){
            instance=new VipIcInitService();
        }
        return instance;
    }

    public boolean insertBean(final VipIcInit vipIcInit){
        final VipIcInitDao vipIcInitDao= DaoManager.getInstance().getDaoSession().getVipIcInitDao();
        return MatterUtils.doMatter(vipIcInitDao, new Runnable() {
            @Override
            public void run() {
                vipIcInitDao.insertOrReplaceInTx(vipIcInit);
            }
        });
    }

    /**
     * 删除过期 (date) 的历史数据
     * @param date
     */
    public void deleteOverDateBean(String date){
        VipIcInitDao vipIcInitDao= DaoManager.getInstance().getDaoSession().getVipIcInitDao();
        List<VipIcInit> list = vipIcInitDao.queryBuilder().where(VipIcInitDao.Properties.ShiftTableBizDay.le(date)).build().list();
        for (VipIcInit vipIcInit : list){
            vipIcInitDao.delete(vipIcInit);
        }
    }

}
