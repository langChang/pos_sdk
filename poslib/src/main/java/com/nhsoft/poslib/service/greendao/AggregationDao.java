package com.nhsoft.poslib.service.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.nhsoft.poslib.entity.Aggregation;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "AGGREGATION".
*/
public class AggregationDao extends AbstractDao<Aggregation, Long> {

    public static final String TABLENAME = "AGGREGATION";

    /**
     * Properties of entity Aggregation.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "ID");
        public final static Property App_id = new Property(1, String.class, "app_id", false, "APP_ID");
        public final static Property Secret = new Property(2, String.class, "secret", false, "SECRET");
    }


    public AggregationDao(DaoConfig config) {
        super(config);
    }
    
    public AggregationDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"AGGREGATION\" (" + //
                "\"ID\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"APP_ID\" TEXT," + // 1: app_id
                "\"SECRET\" TEXT);"); // 2: secret
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"AGGREGATION\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Aggregation entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String app_id = entity.getApp_id();
        if (app_id != null) {
            stmt.bindString(2, app_id);
        }
 
        String secret = entity.getSecret();
        if (secret != null) {
            stmt.bindString(3, secret);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Aggregation entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String app_id = entity.getApp_id();
        if (app_id != null) {
            stmt.bindString(2, app_id);
        }
 
        String secret = entity.getSecret();
        if (secret != null) {
            stmt.bindString(3, secret);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Aggregation readEntity(Cursor cursor, int offset) {
        Aggregation entity = new Aggregation( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // app_id
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) // secret
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Aggregation entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setApp_id(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setSecret(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Aggregation entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Aggregation entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Aggregation entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
