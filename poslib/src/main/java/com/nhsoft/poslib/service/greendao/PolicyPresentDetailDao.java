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

import com.nhsoft.poslib.entity.PolicyPresentDetail;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "POLICY_PRESENT_DETAIL".
*/
public class PolicyPresentDetailDao extends AbstractDao<PolicyPresentDetail, Long> {

    public static final String TABLENAME = "POLICY_PRESENT_DETAIL";

    /**
     * Properties of entity PolicyPresentDetail.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Policy_present_no = new Property(1, String.class, "policy_present_no", false, "POLICY_PRESENT_NO");
        public final static Property Policy_present_detail_num = new Property(2, int.class, "policy_present_detail_num", false, "POLICY_PRESENT_DETAIL_NUM");
        public final static Property Item_num = new Property(3, int.class, "item_num", false, "ITEM_NUM");
        public final static Property Policy_present_detail_present_amount = new Property(4, float.class, "policy_present_detail_present_amount", false, "POLICY_PRESENT_DETAIL_PRESENT_AMOUNT");
        public final static Property Policy_present_detail_price = new Property(5, float.class, "policy_present_detail_price", false, "POLICY_PRESENT_DETAIL_PRICE");
        public final static Property System_book_code = new Property(6, String.class, "system_book_code", false, "SYSTEM_BOOK_CODE");
        public final static Property Branch_num = new Property(7, int.class, "branch_num", false, "BRANCH_NUM");
        public final static Property Policy_present_detail_present_limit = new Property(8, float.class, "policy_present_detail_present_limit", false, "POLICY_PRESENT_DETAIL_PRESENT_LIMIT");
    }

    private Query<PolicyPresentDetail> policyPresent_Policy_present_detailsQuery;

    public PolicyPresentDetailDao(DaoConfig config) {
        super(config);
    }
    
    public PolicyPresentDetailDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"POLICY_PRESENT_DETAIL\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"POLICY_PRESENT_NO\" TEXT," + // 1: policy_present_no
                "\"POLICY_PRESENT_DETAIL_NUM\" INTEGER NOT NULL ," + // 2: policy_present_detail_num
                "\"ITEM_NUM\" INTEGER NOT NULL ," + // 3: item_num
                "\"POLICY_PRESENT_DETAIL_PRESENT_AMOUNT\" REAL NOT NULL ," + // 4: policy_present_detail_present_amount
                "\"POLICY_PRESENT_DETAIL_PRICE\" REAL NOT NULL ," + // 5: policy_present_detail_price
                "\"SYSTEM_BOOK_CODE\" TEXT," + // 6: system_book_code
                "\"BRANCH_NUM\" INTEGER NOT NULL ," + // 7: branch_num
                "\"POLICY_PRESENT_DETAIL_PRESENT_LIMIT\" REAL NOT NULL );"); // 8: policy_present_detail_present_limit
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"POLICY_PRESENT_DETAIL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, PolicyPresentDetail entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String policy_present_no = entity.getPolicy_present_no();
        if (policy_present_no != null) {
            stmt.bindString(2, policy_present_no);
        }
        stmt.bindLong(3, entity.getPolicy_present_detail_num());
        stmt.bindLong(4, entity.getItem_num());
        stmt.bindDouble(5, entity.getPolicy_present_detail_present_amount());
        stmt.bindDouble(6, entity.getPolicy_present_detail_price());
 
        String system_book_code = entity.getSystem_book_code();
        if (system_book_code != null) {
            stmt.bindString(7, system_book_code);
        }
        stmt.bindLong(8, entity.getBranch_num());
        stmt.bindDouble(9, entity.getPolicy_present_detail_present_limit());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, PolicyPresentDetail entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String policy_present_no = entity.getPolicy_present_no();
        if (policy_present_no != null) {
            stmt.bindString(2, policy_present_no);
        }
        stmt.bindLong(3, entity.getPolicy_present_detail_num());
        stmt.bindLong(4, entity.getItem_num());
        stmt.bindDouble(5, entity.getPolicy_present_detail_present_amount());
        stmt.bindDouble(6, entity.getPolicy_present_detail_price());
 
        String system_book_code = entity.getSystem_book_code();
        if (system_book_code != null) {
            stmt.bindString(7, system_book_code);
        }
        stmt.bindLong(8, entity.getBranch_num());
        stmt.bindDouble(9, entity.getPolicy_present_detail_present_limit());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public PolicyPresentDetail readEntity(Cursor cursor, int offset) {
        PolicyPresentDetail entity = new PolicyPresentDetail( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // policy_present_no
            cursor.getInt(offset + 2), // policy_present_detail_num
            cursor.getInt(offset + 3), // item_num
            cursor.getFloat(offset + 4), // policy_present_detail_present_amount
            cursor.getFloat(offset + 5), // policy_present_detail_price
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // system_book_code
            cursor.getInt(offset + 7), // branch_num
            cursor.getFloat(offset + 8) // policy_present_detail_present_limit
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, PolicyPresentDetail entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setPolicy_present_no(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setPolicy_present_detail_num(cursor.getInt(offset + 2));
        entity.setItem_num(cursor.getInt(offset + 3));
        entity.setPolicy_present_detail_present_amount(cursor.getFloat(offset + 4));
        entity.setPolicy_present_detail_price(cursor.getFloat(offset + 5));
        entity.setSystem_book_code(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setBranch_num(cursor.getInt(offset + 7));
        entity.setPolicy_present_detail_present_limit(cursor.getFloat(offset + 8));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(PolicyPresentDetail entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(PolicyPresentDetail entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(PolicyPresentDetail entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
    /** Internal query to resolve the "policy_present_details" to-many relationship of PolicyPresent. */
    public List<PolicyPresentDetail> _queryPolicyPresent_Policy_present_details(String policy_present_no) {
        synchronized (this) {
            if (policyPresent_Policy_present_detailsQuery == null) {
                QueryBuilder<PolicyPresentDetail> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.Policy_present_no.eq(null));
                policyPresent_Policy_present_detailsQuery = queryBuilder.build();
            }
        }
        Query<PolicyPresentDetail> query = policyPresent_Policy_present_detailsQuery.forCurrentThread();
        query.setParameter(0, policy_present_no);
        return query.list();
    }

}
