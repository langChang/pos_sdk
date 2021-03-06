package com.nhsoft.poslib.service.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.nhsoft.poslib.entity.VipCrmAmaLevel;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "VIP_CRM_AMA_LEVEL".
*/
public class VipCrmAmaLevelDao extends AbstractDao<VipCrmAmaLevel, Long> {

    public static final String TABLENAME = "VIP_CRM_AMA_LEVEL";

    /**
     * Properties of entity VipCrmAmaLevel.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, long.class, "id", true, "_id");
        public final static Property Discount_type = new Property(1, String.class, "discount_type", false, "DISCOUNT_TYPE");
        public final static Property Discount_without_coupon = new Property(2, boolean.class, "discount_without_coupon", false, "DISCOUNT_WITHOUT_COUPON");
        public final static Property Price_level = new Property(3, int.class, "price_level", false, "PRICE_LEVEL");
        public final static Property Price_discount = new Property(4, float.class, "price_discount", false, "PRICE_DISCOUNT");
        public final static Property Birth_discount = new Property(5, float.class, "birth_discount", false, "BIRTH_DISCOUNT");
        public final static Property Rank = new Property(6, int.class, "rank", false, "RANK");
        public final static Property Level_name = new Property(7, String.class, "level_name", false, "LEVEL_NAME");
        public final static Property Need_pay = new Property(8, boolean.class, "need_pay", false, "NEED_PAY");
        public final static Property Upgrade_by_growth = new Property(9, boolean.class, "upgrade_by_growth", false, "UPGRADE_BY_GROWTH");
        public final static Property Growth_value = new Property(10, int.class, "growth_value", false, "GROWTH_VALUE");
        public final static Property Payment_types = new Property(11, String.class, "payment_types", false, "PAYMENT_TYPES");
    }


    public VipCrmAmaLevelDao(DaoConfig config) {
        super(config);
    }
    
    public VipCrmAmaLevelDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"VIP_CRM_AMA_LEVEL\" (" + //
                "\"_id\" INTEGER PRIMARY KEY NOT NULL ," + // 0: id
                "\"DISCOUNT_TYPE\" TEXT," + // 1: discount_type
                "\"DISCOUNT_WITHOUT_COUPON\" INTEGER NOT NULL ," + // 2: discount_without_coupon
                "\"PRICE_LEVEL\" INTEGER NOT NULL ," + // 3: price_level
                "\"PRICE_DISCOUNT\" REAL NOT NULL ," + // 4: price_discount
                "\"BIRTH_DISCOUNT\" REAL NOT NULL ," + // 5: birth_discount
                "\"RANK\" INTEGER NOT NULL ," + // 6: rank
                "\"LEVEL_NAME\" TEXT," + // 7: level_name
                "\"NEED_PAY\" INTEGER NOT NULL ," + // 8: need_pay
                "\"UPGRADE_BY_GROWTH\" INTEGER NOT NULL ," + // 9: upgrade_by_growth
                "\"GROWTH_VALUE\" INTEGER NOT NULL ," + // 10: growth_value
                "\"PAYMENT_TYPES\" TEXT);"); // 11: payment_types
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"VIP_CRM_AMA_LEVEL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, VipCrmAmaLevel entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String discount_type = entity.getDiscount_type();
        if (discount_type != null) {
            stmt.bindString(2, discount_type);
        }
        stmt.bindLong(3, entity.getDiscount_without_coupon() ? 1L: 0L);
        stmt.bindLong(4, entity.getPrice_level());
        stmt.bindDouble(5, entity.getPrice_discount());
        stmt.bindDouble(6, entity.getBirth_discount());
        stmt.bindLong(7, entity.getRank());
 
        String level_name = entity.getLevel_name();
        if (level_name != null) {
            stmt.bindString(8, level_name);
        }
        stmt.bindLong(9, entity.getNeed_pay() ? 1L: 0L);
        stmt.bindLong(10, entity.getUpgrade_by_growth() ? 1L: 0L);
        stmt.bindLong(11, entity.getGrowth_value());
 
        String payment_types = entity.getPayment_types();
        if (payment_types != null) {
            stmt.bindString(12, payment_types);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, VipCrmAmaLevel entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String discount_type = entity.getDiscount_type();
        if (discount_type != null) {
            stmt.bindString(2, discount_type);
        }
        stmt.bindLong(3, entity.getDiscount_without_coupon() ? 1L: 0L);
        stmt.bindLong(4, entity.getPrice_level());
        stmt.bindDouble(5, entity.getPrice_discount());
        stmt.bindDouble(6, entity.getBirth_discount());
        stmt.bindLong(7, entity.getRank());
 
        String level_name = entity.getLevel_name();
        if (level_name != null) {
            stmt.bindString(8, level_name);
        }
        stmt.bindLong(9, entity.getNeed_pay() ? 1L: 0L);
        stmt.bindLong(10, entity.getUpgrade_by_growth() ? 1L: 0L);
        stmt.bindLong(11, entity.getGrowth_value());
 
        String payment_types = entity.getPayment_types();
        if (payment_types != null) {
            stmt.bindString(12, payment_types);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    @Override
    public VipCrmAmaLevel readEntity(Cursor cursor, int offset) {
        VipCrmAmaLevel entity = new VipCrmAmaLevel( //
            cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // discount_type
            cursor.getShort(offset + 2) != 0, // discount_without_coupon
            cursor.getInt(offset + 3), // price_level
            cursor.getFloat(offset + 4), // price_discount
            cursor.getFloat(offset + 5), // birth_discount
            cursor.getInt(offset + 6), // rank
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // level_name
            cursor.getShort(offset + 8) != 0, // need_pay
            cursor.getShort(offset + 9) != 0, // upgrade_by_growth
            cursor.getInt(offset + 10), // growth_value
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11) // payment_types
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, VipCrmAmaLevel entity, int offset) {
        entity.setId(cursor.getLong(offset + 0));
        entity.setDiscount_type(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setDiscount_without_coupon(cursor.getShort(offset + 2) != 0);
        entity.setPrice_level(cursor.getInt(offset + 3));
        entity.setPrice_discount(cursor.getFloat(offset + 4));
        entity.setBirth_discount(cursor.getFloat(offset + 5));
        entity.setRank(cursor.getInt(offset + 6));
        entity.setLevel_name(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setNeed_pay(cursor.getShort(offset + 8) != 0);
        entity.setUpgrade_by_growth(cursor.getShort(offset + 9) != 0);
        entity.setGrowth_value(cursor.getInt(offset + 10));
        entity.setPayment_types(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(VipCrmAmaLevel entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(VipCrmAmaLevel entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(VipCrmAmaLevel entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
