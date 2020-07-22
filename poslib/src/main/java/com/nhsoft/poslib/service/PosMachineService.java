package com.nhsoft.poslib.service;

import android.text.TextUtils;

import com.nhsoft.poslib.db.DaoManager;
import com.nhsoft.poslib.entity.PosMachine;
import com.nhsoft.poslib.service.greendao.PosMachineDao;
import com.nhsoft.poslib.utils.MatterUtils;

import java.util.List;

/**
 * Created by Iverson on 2018/11/19 5:06 PM
 * 此类用于：
 */
public class PosMachineService{

    private static  PosMachineService instance;
    public static PosMachineService getInstance(){
        if (instance==null){
            instance=new PosMachineService();
        }
        return instance;
    }


    public static boolean savePosMachine(final List<PosMachine> dataLis){
        final PosMachineDao posMachineDao = DaoManager.getInstance().getDaoSession().getPosMachineDao();
        posMachineDao.deleteAll();
        if(dataLis.size() == 0)return true;
        boolean isSuccess = MatterUtils.doMatter(posMachineDao, new Runnable() {
            @Override
            public void run() {
                posMachineDao.insertOrReplaceInTx(dataLis);
            }
        });
        return isSuccess;
    }

    /**
     * 根据终端标识查找对应的POS机
     * @param systemBookCode
     * @param branchNum
     * @param terminalId
     * @return
     */
    public PosMachine getPosMachine(String systemBookCode, int branchNum, String terminalId){
        if (TextUtils.isEmpty(terminalId)){
            return null;
        }
        PosMachineDao posMachineDao = DaoManager.getInstance().getDaoSession().getPosMachineDao();
        PosMachine posMachine = null;
//        return posMachineDao.queryBuilder()
//                .where(
//                 PosMachineDao.Properties.Pos_machine_terminal_id.eq(terminalId),
//                 PosMachineDao.Properties.Branch_num.eq(branchNum)
//                ).unique();
        List<PosMachine> posMachines = posMachineDao.queryBuilder()
                .where(
                 PosMachineDao.Properties.Branch_num.eq(branchNum)
                ).list();
        for (int i = 0; i <posMachines.size() ; i++) {
            if (posMachines.get(i).getPos_machine_terminal_id().toUpperCase().contains(terminalId.toUpperCase())){
                posMachineDao.detachAll();
                return posMachines.get(i);
            }
        }
        posMachineDao.detachAll();
        return posMachine;
    }

}
