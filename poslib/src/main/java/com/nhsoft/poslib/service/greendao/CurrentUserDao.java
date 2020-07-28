package com.nhsoft.poslib.service.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.nhsoft.poslib.entity.CurrentUser;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CURRENT_USER".
*/
public class CurrentUserDao extends AbstractDao<CurrentUser, Long> {

    public static final String TABLENAME = "CURRENT_USER";

    /**
     * Properties of entity CurrentUser.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property SystemBookCode = new Property(1, String.class, "systemBookCode", false, "SYSTEM_BOOK_CODE");
        public final static Property ShiftTableBizday = new Property(2, String.class, "shiftTableBizday", false, "SHIFT_TABLE_BIZDAY");
        public final static Property ShiftTableNum = new Property(3, Integer.class, "shiftTableNum", false, "SHIFT_TABLE_NUM");
        public final static Property BranchNum = new Property(4, Integer.class, "branchNum", false, "BRANCH_NUM");
        public final static Property AppUserName = new Property(5, String.class, "appUserName", false, "APP_USER_NAME");
        public final static Property AppUserCode = new Property(6, String.class, "appUserCode", false, "APP_USER_CODE");
        public final static Property CreateTime = new Property(7, String.class, "createTime", false, "CREATE_TIME");
        public final static Property Mac = new Property(8, String.class, "mac", false, "MAC");
    }


    public CurrentUserDao(DaoConfig config) {
        super(config);
    }
    
    public CurrentUserDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CURRENT_USER\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"SYSTEM_BOOK_CODE\" TEXT," + // 1: systemBookCode
                "\"SHIFT_TABLE_BIZDAY\" TEXT," + // 2: shiftTableBizday
                "\"SHIFT_TABLE_NUM\" INTEGER," + // 3: shiftTableNum
                "\"BRANCH_NUM\" INTEGER," + // 4: branchNum
                "\"APP_USER_NAME\" TEXT," + // 5: appUserName
                "\"APP_USER_CODE\" TEXT," + // 6: appUserCode
                "\"CREATE_TIME\" TEXT," + // 7: createTime
                "\"MAC\" TEXT);"); // 8: mac
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CURRENT_USER\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, CurrentUser entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String systemBookCode = entity.getSystemBookCode();
        if (systemBookCode != null) {
            stmt.bindString(2, systemBookCode);
        }
 
        String shiftTableBizday = entity.getShiftTableBizday();
        if (shiftTableBizday != null) {
            stmt.bindString(3, shiftTableBizday);
        }
 
        Integer shiftTableNum = entity.getShiftTableNum();
        if (shiftTableNum != null) {
            stmt.bindLong(4, shiftTableNum);
        }
 
        Integer branchNum = entity.getBranchNum();
        if (branchNum != null) {
            stmt.bindLong(5, branchNum);
        }
 
        String appUserName = entity.getAppUserName();
        if (appUserName != null) {
            stmt.bindString(6, appUserName);
        }
 
        String appUserCode = entity.getAppUserCode();
        if (appUserCode != null) {
            stmt.bindString(7, appUserCode);
        }
 
        String createTime = entity.getCreateTime();
        if (createTime != null) {
            stmt.bindString(8, createTime);
        }
 
        String mac = entity.getMac();
        if (mac != null) {
            stmt.bindString(9, mac);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, CurrentUser entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String systemBookCode = entity.getSystemBookCode();
        if (systemBookCode != null) {
            stmt.bindString(2, systemBookCode);
        }
 
        String shiftTableBizday = entity.getShiftTableBizday();
        if (shiftTableBizday != null) {
            stmt.bindString(3, shiftTableBizday);
        }
 
        Integer shiftTableNum = entity.getShiftTableNum();
        if (shiftTableNum != null) {
            stmt.bindLong(4, shiftTableNum);
        }
 
        Integer branchNum = entity.getBranchNum();
        if (branchNum != null) {
            stmt.bindLong(5, branchNum);
        }
 
        String appUserName = entity.getAppUserName();
        if (appUserName != null) {
            stmt.bindString(6, appUserName);
        }
 
        String appUserCode = entity.getAppUserCode();
        if (appUserCode != null) {
            stmt.bindString(7, appUserCode);
        }
 
        String createTime = entity.getCreateTime();
        if (createTime != null) {
            stmt.bindString(8, createTime);
        }
 
        String mac = entity.getMac();
        if (mac != null) {
            stmt.bindString(9, mac);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public CurrentUser readEntity(Cursor cursor, int offset) {
        CurrentUser entity = new CurrentUser( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // systemBookCode
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // shiftTableBizday
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // shiftTableNum
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // branchNum
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // appUserName
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // appUserCode
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // createTime
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8) // mac
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, CurrentUser entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setSystemBookCode(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setShiftTableBizday(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setShiftTableNum(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setBranchNum(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setAppUserName(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setAppUserCode(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setCreateTime(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setMac(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(CurrentUser entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(CurrentUser entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(CurrentUser entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
