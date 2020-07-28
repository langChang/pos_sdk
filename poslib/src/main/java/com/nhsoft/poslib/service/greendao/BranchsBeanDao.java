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

import com.nhsoft.poslib.entity.BranchsBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BRANCHS_BEAN".
*/
public class BranchsBeanDao extends AbstractDao<BranchsBean, Long> {

    public static final String TABLENAME = "BRANCHS_BEAN";

    /**
     * Properties of entity BranchsBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Branch_num = new Property(1, int.class, "branch_num", false, "BRANCH_NUM");
        public final static Property Branch_name = new Property(2, String.class, "branch_name", false, "BRANCH_NAME");
        public final static Property Branch_matrix_price_actived = new Property(3, boolean.class, "branch_matrix_price_actived", false, "BRANCH_MATRIX_PRICE_ACTIVED");
        public final static Property BranchMessageId = new Property(4, Long.class, "branchMessageId", false, "BRANCH_MESSAGE_ID");
    }

    private Query<BranchsBean> branchMessage_BranchsQuery;

    public BranchsBeanDao(DaoConfig config) {
        super(config);
    }
    
    public BranchsBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BRANCHS_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"BRANCH_NUM\" INTEGER NOT NULL ," + // 1: branch_num
                "\"BRANCH_NAME\" TEXT," + // 2: branch_name
                "\"BRANCH_MATRIX_PRICE_ACTIVED\" INTEGER NOT NULL ," + // 3: branch_matrix_price_actived
                "\"BRANCH_MESSAGE_ID\" INTEGER);"); // 4: branchMessageId
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BRANCHS_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, BranchsBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getBranch_num());
 
        String branch_name = entity.getBranch_name();
        if (branch_name != null) {
            stmt.bindString(3, branch_name);
        }
        stmt.bindLong(4, entity.getBranch_matrix_price_actived() ? 1L: 0L);
 
        Long branchMessageId = entity.getBranchMessageId();
        if (branchMessageId != null) {
            stmt.bindLong(5, branchMessageId);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, BranchsBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getBranch_num());
 
        String branch_name = entity.getBranch_name();
        if (branch_name != null) {
            stmt.bindString(3, branch_name);
        }
        stmt.bindLong(4, entity.getBranch_matrix_price_actived() ? 1L: 0L);
 
        Long branchMessageId = entity.getBranchMessageId();
        if (branchMessageId != null) {
            stmt.bindLong(5, branchMessageId);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public BranchsBean readEntity(Cursor cursor, int offset) {
        BranchsBean entity = new BranchsBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getInt(offset + 1), // branch_num
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // branch_name
            cursor.getShort(offset + 3) != 0, // branch_matrix_price_actived
            cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4) // branchMessageId
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, BranchsBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setBranch_num(cursor.getInt(offset + 1));
        entity.setBranch_name(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setBranch_matrix_price_actived(cursor.getShort(offset + 3) != 0);
        entity.setBranchMessageId(cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(BranchsBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(BranchsBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(BranchsBean entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
    /** Internal query to resolve the "branchs" to-many relationship of BranchMessage. */
    public List<BranchsBean> _queryBranchMessage_Branchs(Long branchMessageId) {
        synchronized (this) {
            if (branchMessage_BranchsQuery == null) {
                QueryBuilder<BranchsBean> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.BranchMessageId.eq(null));
                branchMessage_BranchsQuery = queryBuilder.build();
            }
        }
        Query<BranchsBean> query = branchMessage_BranchsQuery.forCurrentThread();
        query.setParameter(0, branchMessageId);
        return query.list();
    }

}
