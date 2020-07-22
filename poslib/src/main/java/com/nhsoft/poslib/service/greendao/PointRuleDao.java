package com.nhsoft.poslib.service.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.nhsoft.poslib.entity.PointRule;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "POINT_RULE".
*/
public class PointRuleDao extends AbstractDao<PointRule, Long> {

    public static final String TABLENAME = "POINT_RULE";

    /**
     * Properties of entity PointRule.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Birthday_point_value = new Property(1, float.class, "birthday_point_value", false, "BIRTHDAY_POINT_VALUE");
        public final static Property Discount_item_no_point = new Property(2, boolean.class, "discount_item_no_point", false, "DISCOUNT_ITEM_NO_POINT");
        public final static Property Enable_birthday_point = new Property(3, boolean.class, "enable_birthday_point", false, "ENABLE_BIRTHDAY_POINT");
        public final static Property Rule_create_time = new Property(4, String.class, "rule_create_time", false, "RULE_CREATE_TIME");
        public final static Property Rule_creator = new Property(5, String.class, "rule_creator", false, "RULE_CREATOR");
        public final static Property Rule_id = new Property(6, Long.class, "rule_id", false, "RULE_ID");
        public final static Property Rule_money = new Property(7, float.class, "rule_money", false, "RULE_MONEY");
        public final static Property Rule_name = new Property(8, String.class, "rule_name", false, "RULE_NAME");
        public final static Property Rule_type = new Property(9, String.class, "rule_type", false, "RULE_TYPE");
        public final static Property Rule_value = new Property(10, float.class, "rule_value", false, "RULE_VALUE");
    }


    public PointRuleDao(DaoConfig config) {
        super(config);
    }
    
    public PointRuleDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"POINT_RULE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"BIRTHDAY_POINT_VALUE\" REAL NOT NULL ," + // 1: birthday_point_value
                "\"DISCOUNT_ITEM_NO_POINT\" INTEGER NOT NULL ," + // 2: discount_item_no_point
                "\"ENABLE_BIRTHDAY_POINT\" INTEGER NOT NULL ," + // 3: enable_birthday_point
                "\"RULE_CREATE_TIME\" TEXT," + // 4: rule_create_time
                "\"RULE_CREATOR\" TEXT," + // 5: rule_creator
                "\"RULE_ID\" INTEGER," + // 6: rule_id
                "\"RULE_MONEY\" REAL NOT NULL ," + // 7: rule_money
                "\"RULE_NAME\" TEXT," + // 8: rule_name
                "\"RULE_TYPE\" TEXT," + // 9: rule_type
                "\"RULE_VALUE\" REAL NOT NULL );"); // 10: rule_value
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"POINT_RULE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, PointRule entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindDouble(2, entity.getBirthday_point_value());
        stmt.bindLong(3, entity.getDiscount_item_no_point() ? 1L: 0L);
        stmt.bindLong(4, entity.getEnable_birthday_point() ? 1L: 0L);
 
        String rule_create_time = entity.getRule_create_time();
        if (rule_create_time != null) {
            stmt.bindString(5, rule_create_time);
        }
 
        String rule_creator = entity.getRule_creator();
        if (rule_creator != null) {
            stmt.bindString(6, rule_creator);
        }
 
        Long rule_id = entity.getRule_id();
        if (rule_id != null) {
            stmt.bindLong(7, rule_id);
        }
        stmt.bindDouble(8, entity.getRule_money());
 
        String rule_name = entity.getRule_name();
        if (rule_name != null) {
            stmt.bindString(9, rule_name);
        }
 
        String rule_type = entity.getRule_type();
        if (rule_type != null) {
            stmt.bindString(10, rule_type);
        }
        stmt.bindDouble(11, entity.getRule_value());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, PointRule entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindDouble(2, entity.getBirthday_point_value());
        stmt.bindLong(3, entity.getDiscount_item_no_point() ? 1L: 0L);
        stmt.bindLong(4, entity.getEnable_birthday_point() ? 1L: 0L);
 
        String rule_create_time = entity.getRule_create_time();
        if (rule_create_time != null) {
            stmt.bindString(5, rule_create_time);
        }
 
        String rule_creator = entity.getRule_creator();
        if (rule_creator != null) {
            stmt.bindString(6, rule_creator);
        }
 
        Long rule_id = entity.getRule_id();
        if (rule_id != null) {
            stmt.bindLong(7, rule_id);
        }
        stmt.bindDouble(8, entity.getRule_money());
 
        String rule_name = entity.getRule_name();
        if (rule_name != null) {
            stmt.bindString(9, rule_name);
        }
 
        String rule_type = entity.getRule_type();
        if (rule_type != null) {
            stmt.bindString(10, rule_type);
        }
        stmt.bindDouble(11, entity.getRule_value());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public PointRule readEntity(Cursor cursor, int offset) {
        PointRule entity = new PointRule( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getFloat(offset + 1), // birthday_point_value
            cursor.getShort(offset + 2) != 0, // discount_item_no_point
            cursor.getShort(offset + 3) != 0, // enable_birthday_point
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // rule_create_time
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // rule_creator
            cursor.isNull(offset + 6) ? null : cursor.getLong(offset + 6), // rule_id
            cursor.getFloat(offset + 7), // rule_money
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // rule_name
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // rule_type
            cursor.getFloat(offset + 10) // rule_value
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, PointRule entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setBirthday_point_value(cursor.getFloat(offset + 1));
        entity.setDiscount_item_no_point(cursor.getShort(offset + 2) != 0);
        entity.setEnable_birthday_point(cursor.getShort(offset + 3) != 0);
        entity.setRule_create_time(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setRule_creator(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setRule_id(cursor.isNull(offset + 6) ? null : cursor.getLong(offset + 6));
        entity.setRule_money(cursor.getFloat(offset + 7));
        entity.setRule_name(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setRule_type(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setRule_value(cursor.getFloat(offset + 10));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(PointRule entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(PointRule entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(PointRule entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
