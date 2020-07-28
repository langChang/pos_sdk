package com.nhsoft.poslib.service;

import com.nhsoft.poslib.db.DaoManager;
import com.nhsoft.poslib.entity.SystemPrint;
import com.nhsoft.poslib.service.greendao.SystemPrintDao;
import com.nhsoft.poslib.utils.MatterUtils;

public class SystemPrintService {

    private static SystemPrintService instance;
    public static SystemPrintService getInstance(){
        if (instance==null){
            instance=new SystemPrintService();
        }
        return instance;
    }

    public boolean insertBean(final SystemPrint systemPrint){
        final SystemPrintDao systemPrintDao= DaoManager.getInstance().getDaoSession().getSystemPrintDao();
        return MatterUtils.doMatter(systemPrintDao, new Runnable() {
            @Override
            public void run() {
//                systemPrintDao.insertOrReplaceInTx(systemPrint);
//                if (isEx()){
                    systemPrintDao.insertOrReplaceInTx(systemPrint);
//                }else {
//                    systemPrintDao.insertInTx(systemPrint);
//                }
            }
        });
    }

    public SystemPrint getBeanInfo(){
        SystemPrintDao systemPrintDao= DaoManager.getInstance().getDaoSession().getSystemPrintDao();
        return systemPrintDao.queryBuilder().unique();
    }

    private boolean isEx(){
        SystemPrintDao systemPrintDao= DaoManager.getInstance().getDaoSession().getSystemPrintDao();
        if (systemPrintDao.queryBuilder().list().size()>0){
            if (systemPrintDao.queryBuilder().list().size()>0){
                systemPrintDao.deleteAll();
                return false;
            }
            return true;
        }else {
            return false;
        }
    }

}
