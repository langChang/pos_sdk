package com.nhsoft.poslib.service.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.nhsoft.poslib.entity.BranchRegion;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BRANCH_REGION".
*/
public class BranchRegionDao extends AbstractDao<BranchRegion, Long> {

    public static final String TABLENAME = "BRANCH_REGION";

    /**
     * Properties of entity BranchRegion.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Branch_region_num = new Property(0, Long.class, "branch_region_num", true, "BRANCH_REGION_NUM");
        public final static Property Branch_region_code = new Property(1, String.class, "branch_region_code", false, "BRANCH_REGION_CODE");
        public final static Property Branch_region_name = new Property(2, String.class, "branch_region_name", false, "BRANCH_REGION_NAME");
        public final static Property Branch_num = new Property(3, int.class, "branch_num", false, "BRANCH_NUM");
    }


    public BranchRegionDao(DaoConfig config) {
        super(config);
    }
    
    public BranchRegionDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BRANCH_REGION\" (" + //
                "\"BRANCH_REGION_NUM\" INTEGER PRIMARY KEY ," + // 0: branch_region_num
                "\"BRANCH_REGION_CODE\" TEXT," + // 1: branch_region_code
                "\"BRANCH_REGION_NAME\" TEXT," + // 2: branch_region_name
                "\"BRANCH_NUM\" INTEGER NOT NULL );"); // 3: branch_num
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BRANCH_REGION\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, BranchRegion entity) {
        stmt.clearBindings();
 
        Long branch_region_num = entity.getBranch_region_num();
        if (branch_region_num != null) {
            stmt.bindLong(1, branch_region_num);
        }
 
        String branch_region_code = entity.getBranch_region_code();
        if (branch_region_code != null) {
            stmt.bindString(2, branch_region_code);
        }
 
        String branch_region_name = entity.getBranch_region_name();
        if (branch_region_name != null) {
            stmt.bindString(3, branch_region_name);
        }
        stmt.bindLong(4, entity.getBranch_num());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, BranchRegion entity) {
        stmt.clearBindings();
 
        Long branch_region_num = entity.getBranch_region_num();
        if (branch_region_num != null) {
            stmt.bindLong(1, branch_region_num);
        }
 
        String branch_region_code = entity.getBranch_region_code();
        if (branch_region_code != null) {
            stmt.bindString(2, branch_region_code);
        }
 
        String branch_region_name = entity.getBranch_region_name();
        if (branch_region_name != null) {
            stmt.bindString(3, branch_region_name);
        }
        stmt.bindLong(4, entity.getBranch_num());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public BranchRegion readEntity(Cursor cursor, int offset) {
        BranchRegion entity = new BranchRegion( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // branch_region_num
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // branch_region_code
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // branch_region_name
            cursor.getInt(offset + 3) // branch_num
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, BranchRegion entity, int offset) {
        entity.setBranch_region_num(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setBranch_region_code(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setBranch_region_name(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setBranch_num(cursor.getInt(offset + 3));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(BranchRegion entity, long rowId) {
        entity.setBranch_region_num(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(BranchRegion entity) {
        if(entity != null) {
            return entity.getBranch_region_num();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(BranchRegion entity) {
        return entity.getBranch_region_num() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
