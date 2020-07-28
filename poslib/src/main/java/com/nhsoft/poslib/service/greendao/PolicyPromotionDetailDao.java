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

import com.nhsoft.poslib.entity.PolicyPromotionDetail;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "POLICY_PROMOTION_DETAIL".
*/
public class PolicyPromotionDetailDao extends AbstractDao<PolicyPromotionDetail, Long> {

    public static final String TABLENAME = "POLICY_PROMOTION_DETAIL";

    /**
     * Properties of entity PolicyPromotionDetail.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Policy_promotion_no = new Property(1, String.class, "policy_promotion_no", false, "POLICY_PROMOTION_NO");
        public final static Property Policy_promotion_detail_num = new Property(2, int.class, "policy_promotion_detail_num", false, "POLICY_PROMOTION_DETAIL_NUM");
        public final static Property Item_num = new Property(3, int.class, "item_num", false, "ITEM_NUM");
        public final static Property Item_grade_num = new Property(4, int.class, "item_grade_num", false, "ITEM_GRADE_NUM");
        public final static Property Policy_promotion_detail_std_price = new Property(5, double.class, "policy_promotion_detail_std_price", false, "POLICY_PROMOTION_DETAIL_STD_PRICE");
        public final static Property Policy_promotion_detail_special_price = new Property(6, double.class, "policy_promotion_detail_special_price", false, "POLICY_PROMOTION_DETAIL_SPECIAL_PRICE");
        public final static Property Policy_promotion_detail_bill_limit = new Property(7, double.class, "policy_promotion_detail_bill_limit", false, "POLICY_PROMOTION_DETAIL_BILL_LIMIT");
        public final static Property Policy_promotion_detail_policy_limit = new Property(8, double.class, "policy_promotion_detail_policy_limit", false, "POLICY_PROMOTION_DETAIL_POLICY_LIMIT");
        public final static Property Policy_promotion_detail_cost = new Property(9, double.class, "policy_promotion_detail_cost", false, "POLICY_PROMOTION_DETAIL_COST");
        public final static Property Policy_promotion_detail_lot_num = new Property(10, String.class, "policy_promotion_detail_lot_num", false, "POLICY_PROMOTION_DETAIL_LOT_NUM");
        public final static Property System_book_code = new Property(11, String.class, "system_book_code", false, "SYSTEM_BOOK_CODE");
        public final static Property Branch_num = new Property(12, int.class, "branch_num", false, "BRANCH_NUM");
        public final static Property Policy_promotion_detail_gross = new Property(13, double.class, "policy_promotion_detail_gross", false, "POLICY_PROMOTION_DETAIL_GROSS");
        public final static Property Policy_promotion_detail_policy_cost = new Property(14, double.class, "policy_promotion_detail_policy_cost", false, "POLICY_PROMOTION_DETAIL_POLICY_COST");
    }

    private Query<PolicyPromotionDetail> policyPromotion_Policy_promotion_detailsQuery;

    public PolicyPromotionDetailDao(DaoConfig config) {
        super(config);
    }
    
    public PolicyPromotionDetailDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"POLICY_PROMOTION_DETAIL\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"POLICY_PROMOTION_NO\" TEXT," + // 1: policy_promotion_no
                "\"POLICY_PROMOTION_DETAIL_NUM\" INTEGER NOT NULL ," + // 2: policy_promotion_detail_num
                "\"ITEM_NUM\" INTEGER NOT NULL ," + // 3: item_num
                "\"ITEM_GRADE_NUM\" INTEGER NOT NULL ," + // 4: item_grade_num
                "\"POLICY_PROMOTION_DETAIL_STD_PRICE\" REAL NOT NULL ," + // 5: policy_promotion_detail_std_price
                "\"POLICY_PROMOTION_DETAIL_SPECIAL_PRICE\" REAL NOT NULL ," + // 6: policy_promotion_detail_special_price
                "\"POLICY_PROMOTION_DETAIL_BILL_LIMIT\" REAL NOT NULL ," + // 7: policy_promotion_detail_bill_limit
                "\"POLICY_PROMOTION_DETAIL_POLICY_LIMIT\" REAL NOT NULL ," + // 8: policy_promotion_detail_policy_limit
                "\"POLICY_PROMOTION_DETAIL_COST\" REAL NOT NULL ," + // 9: policy_promotion_detail_cost
                "\"POLICY_PROMOTION_DETAIL_LOT_NUM\" TEXT," + // 10: policy_promotion_detail_lot_num
                "\"SYSTEM_BOOK_CODE\" TEXT," + // 11: system_book_code
                "\"BRANCH_NUM\" INTEGER NOT NULL ," + // 12: branch_num
                "\"POLICY_PROMOTION_DETAIL_GROSS\" REAL NOT NULL ," + // 13: policy_promotion_detail_gross
                "\"POLICY_PROMOTION_DETAIL_POLICY_COST\" REAL NOT NULL );"); // 14: policy_promotion_detail_policy_cost
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"POLICY_PROMOTION_DETAIL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, PolicyPromotionDetail entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String policy_promotion_no = entity.getPolicy_promotion_no();
        if (policy_promotion_no != null) {
            stmt.bindString(2, policy_promotion_no);
        }
        stmt.bindLong(3, entity.getPolicy_promotion_detail_num());
        stmt.bindLong(4, entity.getItem_num());
        stmt.bindLong(5, entity.getItem_grade_num());
        stmt.bindDouble(6, entity.getPolicy_promotion_detail_std_price());
        stmt.bindDouble(7, entity.getPolicy_promotion_detail_special_price());
        stmt.bindDouble(8, entity.getPolicy_promotion_detail_bill_limit());
        stmt.bindDouble(9, entity.getPolicy_promotion_detail_policy_limit());
        stmt.bindDouble(10, entity.getPolicy_promotion_detail_cost());
 
        String policy_promotion_detail_lot_num = entity.getPolicy_promotion_detail_lot_num();
        if (policy_promotion_detail_lot_num != null) {
            stmt.bindString(11, policy_promotion_detail_lot_num);
        }
 
        String system_book_code = entity.getSystem_book_code();
        if (system_book_code != null) {
            stmt.bindString(12, system_book_code);
        }
        stmt.bindLong(13, entity.getBranch_num());
        stmt.bindDouble(14, entity.getPolicy_promotion_detail_gross());
        stmt.bindDouble(15, entity.getPolicy_promotion_detail_policy_cost());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, PolicyPromotionDetail entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String policy_promotion_no = entity.getPolicy_promotion_no();
        if (policy_promotion_no != null) {
            stmt.bindString(2, policy_promotion_no);
        }
        stmt.bindLong(3, entity.getPolicy_promotion_detail_num());
        stmt.bindLong(4, entity.getItem_num());
        stmt.bindLong(5, entity.getItem_grade_num());
        stmt.bindDouble(6, entity.getPolicy_promotion_detail_std_price());
        stmt.bindDouble(7, entity.getPolicy_promotion_detail_special_price());
        stmt.bindDouble(8, entity.getPolicy_promotion_detail_bill_limit());
        stmt.bindDouble(9, entity.getPolicy_promotion_detail_policy_limit());
        stmt.bindDouble(10, entity.getPolicy_promotion_detail_cost());
 
        String policy_promotion_detail_lot_num = entity.getPolicy_promotion_detail_lot_num();
        if (policy_promotion_detail_lot_num != null) {
            stmt.bindString(11, policy_promotion_detail_lot_num);
        }
 
        String system_book_code = entity.getSystem_book_code();
        if (system_book_code != null) {
            stmt.bindString(12, system_book_code);
        }
        stmt.bindLong(13, entity.getBranch_num());
        stmt.bindDouble(14, entity.getPolicy_promotion_detail_gross());
        stmt.bindDouble(15, entity.getPolicy_promotion_detail_policy_cost());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public PolicyPromotionDetail readEntity(Cursor cursor, int offset) {
        PolicyPromotionDetail entity = new PolicyPromotionDetail( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // policy_promotion_no
            cursor.getInt(offset + 2), // policy_promotion_detail_num
            cursor.getInt(offset + 3), // item_num
            cursor.getInt(offset + 4), // item_grade_num
            cursor.getDouble(offset + 5), // policy_promotion_detail_std_price
            cursor.getDouble(offset + 6), // policy_promotion_detail_special_price
            cursor.getDouble(offset + 7), // policy_promotion_detail_bill_limit
            cursor.getDouble(offset + 8), // policy_promotion_detail_policy_limit
            cursor.getDouble(offset + 9), // policy_promotion_detail_cost
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // policy_promotion_detail_lot_num
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // system_book_code
            cursor.getInt(offset + 12), // branch_num
            cursor.getDouble(offset + 13), // policy_promotion_detail_gross
            cursor.getDouble(offset + 14) // policy_promotion_detail_policy_cost
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, PolicyPromotionDetail entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setPolicy_promotion_no(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setPolicy_promotion_detail_num(cursor.getInt(offset + 2));
        entity.setItem_num(cursor.getInt(offset + 3));
        entity.setItem_grade_num(cursor.getInt(offset + 4));
        entity.setPolicy_promotion_detail_std_price(cursor.getDouble(offset + 5));
        entity.setPolicy_promotion_detail_special_price(cursor.getDouble(offset + 6));
        entity.setPolicy_promotion_detail_bill_limit(cursor.getDouble(offset + 7));
        entity.setPolicy_promotion_detail_policy_limit(cursor.getDouble(offset + 8));
        entity.setPolicy_promotion_detail_cost(cursor.getDouble(offset + 9));
        entity.setPolicy_promotion_detail_lot_num(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setSystem_book_code(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setBranch_num(cursor.getInt(offset + 12));
        entity.setPolicy_promotion_detail_gross(cursor.getDouble(offset + 13));
        entity.setPolicy_promotion_detail_policy_cost(cursor.getDouble(offset + 14));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(PolicyPromotionDetail entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(PolicyPromotionDetail entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(PolicyPromotionDetail entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
    /** Internal query to resolve the "policy_promotion_details" to-many relationship of PolicyPromotion. */
    public List<PolicyPromotionDetail> _queryPolicyPromotion_Policy_promotion_details(String policy_promotion_no) {
        synchronized (this) {
            if (policyPromotion_Policy_promotion_detailsQuery == null) {
                QueryBuilder<PolicyPromotionDetail> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.Policy_promotion_no.eq(null));
                policyPromotion_Policy_promotion_detailsQuery = queryBuilder.build();
            }
        }
        Query<PolicyPromotionDetail> query = policyPromotion_Policy_promotion_detailsQuery.forCurrentThread();
        query.setParameter(0, policy_promotion_no);
        return query.list();
    }

}
