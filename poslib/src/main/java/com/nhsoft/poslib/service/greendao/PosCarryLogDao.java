package com.nhsoft.poslib.service.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.nhsoft.poslib.entity.PosCarryLog;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "POS_CARRY_LOG".
*/
public class PosCarryLogDao extends AbstractDao<PosCarryLog, Long> {

    public static final String TABLENAME = "POS_CARRY_LOG";

    /**
     * Properties of entity PosCarryLog.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Branch_num = new Property(1, int.class, "branch_num", false, "BRANCH_NUM");
        public final static Property Merchant_num = new Property(2, int.class, "merchant_num", false, "MERCHANT_NUM");
        public final static Property Retail_pos_log_amount = new Property(3, float.class, "retail_pos_log_amount", false, "RETAIL_POS_LOG_AMOUNT");
        public final static Property Retail_pos_log_authorize = new Property(4, String.class, "retail_pos_log_authorize", false, "RETAIL_POS_LOG_AUTHORIZE");
        public final static Property Retail_pos_log_bizday = new Property(5, String.class, "retail_pos_log_bizday", false, "RETAIL_POS_LOG_BIZDAY");
        public final static Property Retail_pos_log_item_name = new Property(6, String.class, "retail_pos_log_item_name", false, "RETAIL_POS_LOG_ITEM_NAME");
        public final static Property Retail_pos_log_item_num = new Property(7, long.class, "retail_pos_log_item_num", false, "RETAIL_POS_LOG_ITEM_NUM");
        public final static Property Retail_pos_log_machine = new Property(8, String.class, "retail_pos_log_machine", false, "RETAIL_POS_LOG_MACHINE");
        public final static Property Retail_pos_log_memo = new Property(9, String.class, "retail_pos_log_memo", false, "RETAIL_POS_LOG_MEMO");
        public final static Property Retail_pos_log_money = new Property(10, float.class, "retail_pos_log_money", false, "RETAIL_POS_LOG_MONEY");
        public final static Property Retail_pos_log_operator = new Property(11, String.class, "retail_pos_log_operator", false, "RETAIL_POS_LOG_OPERATOR");
        public final static Property Retail_pos_log_order_no = new Property(12, String.class, "retail_pos_log_order_no", false, "RETAIL_POS_LOG_ORDER_NO");
        public final static Property Retail_pos_log_price = new Property(13, float.class, "retail_pos_log_price", false, "RETAIL_POS_LOG_PRICE");
        public final static Property Retail_pos_log_shift_num = new Property(14, int.class, "retail_pos_log_shift_num", false, "RETAIL_POS_LOG_SHIFT_NUM");
        public final static Property Retail_pos_log_std_price = new Property(15, float.class, "retail_pos_log_std_price", false, "RETAIL_POS_LOG_STD_PRICE");
        public final static Property Retail_pos_log_time = new Property(16, String.class, "retail_pos_log_time", false, "RETAIL_POS_LOG_TIME");
        public final static Property Retail_pos_log_type = new Property(17, String.class, "retail_pos_log_type", false, "RETAIL_POS_LOG_TYPE");
        public final static Property Stall_num = new Property(18, long.class, "stall_num", false, "STALL_NUM");
        public final static Property System_book_code = new Property(19, String.class, "system_book_code", false, "SYSTEM_BOOK_CODE");
        public final static Property IsUpload = new Property(20, boolean.class, "isUpload", false, "IS_UPLOAD");
    }


    public PosCarryLogDao(DaoConfig config) {
        super(config);
    }
    
    public PosCarryLogDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"POS_CARRY_LOG\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"BRANCH_NUM\" INTEGER NOT NULL ," + // 1: branch_num
                "\"MERCHANT_NUM\" INTEGER NOT NULL ," + // 2: merchant_num
                "\"RETAIL_POS_LOG_AMOUNT\" REAL NOT NULL ," + // 3: retail_pos_log_amount
                "\"RETAIL_POS_LOG_AUTHORIZE\" TEXT," + // 4: retail_pos_log_authorize
                "\"RETAIL_POS_LOG_BIZDAY\" TEXT," + // 5: retail_pos_log_bizday
                "\"RETAIL_POS_LOG_ITEM_NAME\" TEXT," + // 6: retail_pos_log_item_name
                "\"RETAIL_POS_LOG_ITEM_NUM\" INTEGER NOT NULL ," + // 7: retail_pos_log_item_num
                "\"RETAIL_POS_LOG_MACHINE\" TEXT," + // 8: retail_pos_log_machine
                "\"RETAIL_POS_LOG_MEMO\" TEXT," + // 9: retail_pos_log_memo
                "\"RETAIL_POS_LOG_MONEY\" REAL NOT NULL ," + // 10: retail_pos_log_money
                "\"RETAIL_POS_LOG_OPERATOR\" TEXT," + // 11: retail_pos_log_operator
                "\"RETAIL_POS_LOG_ORDER_NO\" TEXT," + // 12: retail_pos_log_order_no
                "\"RETAIL_POS_LOG_PRICE\" REAL NOT NULL ," + // 13: retail_pos_log_price
                "\"RETAIL_POS_LOG_SHIFT_NUM\" INTEGER NOT NULL ," + // 14: retail_pos_log_shift_num
                "\"RETAIL_POS_LOG_STD_PRICE\" REAL NOT NULL ," + // 15: retail_pos_log_std_price
                "\"RETAIL_POS_LOG_TIME\" TEXT," + // 16: retail_pos_log_time
                "\"RETAIL_POS_LOG_TYPE\" TEXT," + // 17: retail_pos_log_type
                "\"STALL_NUM\" INTEGER NOT NULL ," + // 18: stall_num
                "\"SYSTEM_BOOK_CODE\" TEXT," + // 19: system_book_code
                "\"IS_UPLOAD\" INTEGER NOT NULL );"); // 20: isUpload
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"POS_CARRY_LOG\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, PosCarryLog entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getBranch_num());
        stmt.bindLong(3, entity.getMerchant_num());
        stmt.bindDouble(4, entity.getRetail_pos_log_amount());
 
        String retail_pos_log_authorize = entity.getRetail_pos_log_authorize();
        if (retail_pos_log_authorize != null) {
            stmt.bindString(5, retail_pos_log_authorize);
        }
 
        String retail_pos_log_bizday = entity.getRetail_pos_log_bizday();
        if (retail_pos_log_bizday != null) {
            stmt.bindString(6, retail_pos_log_bizday);
        }
 
        String retail_pos_log_item_name = entity.getRetail_pos_log_item_name();
        if (retail_pos_log_item_name != null) {
            stmt.bindString(7, retail_pos_log_item_name);
        }
        stmt.bindLong(8, entity.getRetail_pos_log_item_num());
 
        String retail_pos_log_machine = entity.getRetail_pos_log_machine();
        if (retail_pos_log_machine != null) {
            stmt.bindString(9, retail_pos_log_machine);
        }
 
        String retail_pos_log_memo = entity.getRetail_pos_log_memo();
        if (retail_pos_log_memo != null) {
            stmt.bindString(10, retail_pos_log_memo);
        }
        stmt.bindDouble(11, entity.getRetail_pos_log_money());
 
        String retail_pos_log_operator = entity.getRetail_pos_log_operator();
        if (retail_pos_log_operator != null) {
            stmt.bindString(12, retail_pos_log_operator);
        }
 
        String retail_pos_log_order_no = entity.getRetail_pos_log_order_no();
        if (retail_pos_log_order_no != null) {
            stmt.bindString(13, retail_pos_log_order_no);
        }
        stmt.bindDouble(14, entity.getRetail_pos_log_price());
        stmt.bindLong(15, entity.getRetail_pos_log_shift_num());
        stmt.bindDouble(16, entity.getRetail_pos_log_std_price());
 
        String retail_pos_log_time = entity.getRetail_pos_log_time();
        if (retail_pos_log_time != null) {
            stmt.bindString(17, retail_pos_log_time);
        }
 
        String retail_pos_log_type = entity.getRetail_pos_log_type();
        if (retail_pos_log_type != null) {
            stmt.bindString(18, retail_pos_log_type);
        }
        stmt.bindLong(19, entity.getStall_num());
 
        String system_book_code = entity.getSystem_book_code();
        if (system_book_code != null) {
            stmt.bindString(20, system_book_code);
        }
        stmt.bindLong(21, entity.getIsUpload() ? 1L: 0L);
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, PosCarryLog entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getBranch_num());
        stmt.bindLong(3, entity.getMerchant_num());
        stmt.bindDouble(4, entity.getRetail_pos_log_amount());
 
        String retail_pos_log_authorize = entity.getRetail_pos_log_authorize();
        if (retail_pos_log_authorize != null) {
            stmt.bindString(5, retail_pos_log_authorize);
        }
 
        String retail_pos_log_bizday = entity.getRetail_pos_log_bizday();
        if (retail_pos_log_bizday != null) {
            stmt.bindString(6, retail_pos_log_bizday);
        }
 
        String retail_pos_log_item_name = entity.getRetail_pos_log_item_name();
        if (retail_pos_log_item_name != null) {
            stmt.bindString(7, retail_pos_log_item_name);
        }
        stmt.bindLong(8, entity.getRetail_pos_log_item_num());
 
        String retail_pos_log_machine = entity.getRetail_pos_log_machine();
        if (retail_pos_log_machine != null) {
            stmt.bindString(9, retail_pos_log_machine);
        }
 
        String retail_pos_log_memo = entity.getRetail_pos_log_memo();
        if (retail_pos_log_memo != null) {
            stmt.bindString(10, retail_pos_log_memo);
        }
        stmt.bindDouble(11, entity.getRetail_pos_log_money());
 
        String retail_pos_log_operator = entity.getRetail_pos_log_operator();
        if (retail_pos_log_operator != null) {
            stmt.bindString(12, retail_pos_log_operator);
        }
 
        String retail_pos_log_order_no = entity.getRetail_pos_log_order_no();
        if (retail_pos_log_order_no != null) {
            stmt.bindString(13, retail_pos_log_order_no);
        }
        stmt.bindDouble(14, entity.getRetail_pos_log_price());
        stmt.bindLong(15, entity.getRetail_pos_log_shift_num());
        stmt.bindDouble(16, entity.getRetail_pos_log_std_price());
 
        String retail_pos_log_time = entity.getRetail_pos_log_time();
        if (retail_pos_log_time != null) {
            stmt.bindString(17, retail_pos_log_time);
        }
 
        String retail_pos_log_type = entity.getRetail_pos_log_type();
        if (retail_pos_log_type != null) {
            stmt.bindString(18, retail_pos_log_type);
        }
        stmt.bindLong(19, entity.getStall_num());
 
        String system_book_code = entity.getSystem_book_code();
        if (system_book_code != null) {
            stmt.bindString(20, system_book_code);
        }
        stmt.bindLong(21, entity.getIsUpload() ? 1L: 0L);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public PosCarryLog readEntity(Cursor cursor, int offset) {
        PosCarryLog entity = new PosCarryLog( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getInt(offset + 1), // branch_num
            cursor.getInt(offset + 2), // merchant_num
            cursor.getFloat(offset + 3), // retail_pos_log_amount
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // retail_pos_log_authorize
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // retail_pos_log_bizday
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // retail_pos_log_item_name
            cursor.getLong(offset + 7), // retail_pos_log_item_num
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // retail_pos_log_machine
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // retail_pos_log_memo
            cursor.getFloat(offset + 10), // retail_pos_log_money
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // retail_pos_log_operator
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // retail_pos_log_order_no
            cursor.getFloat(offset + 13), // retail_pos_log_price
            cursor.getInt(offset + 14), // retail_pos_log_shift_num
            cursor.getFloat(offset + 15), // retail_pos_log_std_price
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // retail_pos_log_time
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // retail_pos_log_type
            cursor.getLong(offset + 18), // stall_num
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // system_book_code
            cursor.getShort(offset + 20) != 0 // isUpload
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, PosCarryLog entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setBranch_num(cursor.getInt(offset + 1));
        entity.setMerchant_num(cursor.getInt(offset + 2));
        entity.setRetail_pos_log_amount(cursor.getFloat(offset + 3));
        entity.setRetail_pos_log_authorize(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setRetail_pos_log_bizday(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setRetail_pos_log_item_name(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setRetail_pos_log_item_num(cursor.getLong(offset + 7));
        entity.setRetail_pos_log_machine(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setRetail_pos_log_memo(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setRetail_pos_log_money(cursor.getFloat(offset + 10));
        entity.setRetail_pos_log_operator(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setRetail_pos_log_order_no(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setRetail_pos_log_price(cursor.getFloat(offset + 13));
        entity.setRetail_pos_log_shift_num(cursor.getInt(offset + 14));
        entity.setRetail_pos_log_std_price(cursor.getFloat(offset + 15));
        entity.setRetail_pos_log_time(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setRetail_pos_log_type(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setStall_num(cursor.getLong(offset + 18));
        entity.setSystem_book_code(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setIsUpload(cursor.getShort(offset + 20) != 0);
     }
    
    @Override
    protected final Long updateKeyAfterInsert(PosCarryLog entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(PosCarryLog entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(PosCarryLog entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
