package com.nhsoft.poslib.call.impl;

import com.nhsoft.poslib.db.DaoManager;
import com.nhsoft.poslib.entity.IcCardMessage;
import com.nhsoft.poslib.service.greendao.IcCardMessageDao;
import com.nhsoft.poslib.utils.MatterUtils;

import java.util.List;

public class IcCardMessageImpl {

    private static IcCardMessageImpl instance;

    public static IcCardMessageImpl getInstance(){


        if (instance==null){
            instance=new IcCardMessageImpl();
        }
        return instance;

    }



    public boolean insertBean(final IcCardMessage icCardMessage0){

        final IcCardMessageDao icCardMessageDao= DaoManager.getInstance().getDaoSession().getIcCardMessageDao();
        icCardMessageDao.deleteAll();
        return MatterUtils.doMatter(icCardMessageDao, new Runnable() {
            @Override
            public void run() {
                icCardMessageDao.insertOrReplaceInTx(icCardMessage0);
            }
        });
    }

    public IcCardMessage getBean(){
        final IcCardMessageDao icCardMessageDao= DaoManager.getInstance().getDaoSession().getIcCardMessageDao();
        List<IcCardMessage> icCardMessages = icCardMessageDao.loadAll();
        if (icCardMessages!=null&&icCardMessages.size()>0){
            return icCardMessages.get(0);
        }else {
            return null;
        }
    }
}
