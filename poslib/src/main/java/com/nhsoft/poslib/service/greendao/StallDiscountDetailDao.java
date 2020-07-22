package com.nhsoft.poslib.service.greendao;

import java.util.List;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.query.Query;
import org.greenrobot.greendao.query.QueryBuilder;

import com.nhsoft.poslib.entity.nongmao.StallDiscountDetail;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "STALL_DISCOUNT_DETAIL".
*/
public class StallDiscountDetailDao extends AbstractDao<StallDiscountDetail, Long> {

    public static final String TABLENAME = "STALL_DISCOUNT_DETAIL";

    /**
     * Properties of entity StallDiscountDetail.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "ID");
        public final static Property Branch_num = new Property(1, int.class, "branch_num", false, "BRANCH_NUM");
        public final static Property Item_num = new Property(2, int.class, "item_num", false, "ITEM_NUM");
        public final static Property Policy_discount_detail_memo = new Property(3, String.class, "policy_discount_detail_memo", false, "POLICY_DISCOUNT_DETAIL_MEMO");
        public final static Property Policy_discount_detail_num = new Property(4, int.class, "policy_discount_detail_num", false, "POLICY_DISCOUNT_DETAIL_NUM");
        public final static Property Policy_discount_no = new Property(5, String.class, "policy_discount_no", false, "POLICY_DISCOUNT_NO");
        public final static Property System_book_code = new Property(6, String.class, "system_book_code", false, "SYSTEM_BOOK_CODE");
    }

    private Query<StallDiscountDetail> stallDiscount_Stall_discount_detailsQuery;

    public StallDiscountDetailDao(DaoConfig config) {
        super(config);
    }
    
    public StallDiscountDetailDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"STALL_DISCOUNT_DETAIL\" (" + //
                "\"ID\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"BRANCH_NUM\" INTEGER NOT NULL ," + // 1: branch_num
                "\"ITEM_NUM\" INTEGER NOT NULL ," + // 2: item_num
                "\"POLICY_DISCOUNT_DETAIL_MEMO\" TEXT," + // 3: policy_discount_detail_memo
                "\"POLICY_DISCOUNT_DETAIL_NUM\" INTEGER NOT NULL ," + // 4: policy_discount_detail_num
                "\"POLICY_DISCOUNT_NO\" TEXT," + // 5: policy_discount_no
                "\"SYSTEM_BOOK_CODE\" TEXT);"); // 6: system_book_code
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"STALL_DISCOUNT_DETAIL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, StallDiscountDetail entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getBranch_num());
        stmt.bindLong(3, entity.getItem_num());
 
        String policy_discount_detail_memo = entity.getPolicy_discount_detail_memo();
        if (policy_discount_detail_memo != null) {
            stmt.bindString(4, policy_discount_detail_memo);
        }
        stmt.bindLong(5, entity.getPolicy_discount_detail_num());
 
        String policy_discount_no = entity.getPolicy_discount_no();
        if (policy_discount_no != null) {
            stmt.bindString(6, policy_discount_no);
        }
 
        String system_book_code = entity.getSystem_book_code();
        if (system_book_code != null) {
            stmt.bindString(7, system_book_code);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, StallDiscountDetail entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getBranch_num());
        stmt.bindLong(3, entity.getItem_num());
 
        String policy_discount_detail_memo = entity.getPolicy_discount_detail_memo();
        if (policy_discount_detail_memo != null) {
            stmt.bindString(4, policy_discount_detail_memo);
        }
        stmt.bindLong(5, entity.getPolicy_discount_detail_num());
 
        String policy_discount_no = entity.getPolicy_discount_no();
        if (policy_discount_no != null) {
            stmt.bindString(6, policy_discount_no);
        }
 
        String system_book_code = entity.getSystem_book_code();
        if (system_book_code != null) {
            stmt.bindString(7, system_book_code);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public StallDiscountDetail readEntity(Cursor cursor, int offset) {
        StallDiscountDetail entity = new StallDiscountDetail( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getInt(offset + 1), // branch_num
            cursor.getInt(offset + 2), // item_num
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // policy_discount_detail_memo
            cursor.getInt(offset + 4), // policy_discount_detail_num
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // policy_discount_no
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6) // system_book_code
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, StallDiscountDetail entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setBranch_num(cursor.getInt(offset + 1));
        entity.setItem_num(cursor.getInt(offset + 2));
        entity.setPolicy_discount_detail_memo(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setPolicy_discount_detail_num(cursor.getInt(offset + 4));
        entity.setPolicy_discount_no(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setSystem_book_code(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(StallDiscountDetail entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(StallDiscountDetail entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(StallDiscountDetail entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
    /** Internal query to resolve the "stall_discount_details" to-many relationship of StallDiscount. */
    public List<StallDiscountDetail> _queryStallDiscount_Stall_discount_details(String policy_discount_no) {
        synchronized (this) {
            if (stallDiscount_Stall_discount_detailsQuery == null) {
                QueryBuilder<StallDiscountDetail> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.Policy_discount_no.eq(null));
                stallDiscount_Stall_discount_detailsQuery = queryBuilder.build();
            }
        }
        Query<StallDiscountDetail> query = stallDiscount_Stall_discount_detailsQuery.forCurrentThread();
        query.setParameter(0, policy_discount_no);
        return query.list();
    }

}
