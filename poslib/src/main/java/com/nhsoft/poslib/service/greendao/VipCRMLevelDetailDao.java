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

import com.nhsoft.poslib.entity.VipCRMLevelDetail;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "VIP_CRMLEVEL_DETAIL".
*/
public class VipCRMLevelDetailDao extends AbstractDao<VipCRMLevelDetail, Long> {

    public static final String TABLENAME = "VIP_CRMLEVEL_DETAIL";

    /**
     * Properties of entity VipCRMLevelDetail.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Days = new Property(0, int.class, "days", false, "DAYS");
        public final static Property Id = new Property(1, Long.class, "id", true, "_id");
        public final static Property Kind = new Property(2, String.class, "kind", false, "KIND");
        public final static Property Real_price = new Property(3, float.class, "real_price", false, "REAL_PRICE");
        public final static Property VipCRMLevelId = new Property(4, Long.class, "vipCRMLevelId", false, "VIP_CRMLEVEL_ID");
    }

    private Query<VipCRMLevelDetail> vipCRMLevel_CategoriesQuery;

    public VipCRMLevelDetailDao(DaoConfig config) {
        super(config);
    }
    
    public VipCRMLevelDetailDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"VIP_CRMLEVEL_DETAIL\" (" + //
                "\"DAYS\" INTEGER NOT NULL ," + // 0: days
                "\"_id\" INTEGER PRIMARY KEY ," + // 1: id
                "\"KIND\" TEXT," + // 2: kind
                "\"REAL_PRICE\" REAL NOT NULL ," + // 3: real_price
                "\"VIP_CRMLEVEL_ID\" INTEGER);"); // 4: vipCRMLevelId
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"VIP_CRMLEVEL_DETAIL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, VipCRMLevelDetail entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getDays());
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(2, id);
        }
 
        String kind = entity.getKind();
        if (kind != null) {
            stmt.bindString(3, kind);
        }
        stmt.bindDouble(4, entity.getReal_price());
 
        Long vipCRMLevelId = entity.getVipCRMLevelId();
        if (vipCRMLevelId != null) {
            stmt.bindLong(5, vipCRMLevelId);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, VipCRMLevelDetail entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getDays());
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(2, id);
        }
 
        String kind = entity.getKind();
        if (kind != null) {
            stmt.bindString(3, kind);
        }
        stmt.bindDouble(4, entity.getReal_price());
 
        Long vipCRMLevelId = entity.getVipCRMLevelId();
        if (vipCRMLevelId != null) {
            stmt.bindLong(5, vipCRMLevelId);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1);
    }    

    @Override
    public VipCRMLevelDetail readEntity(Cursor cursor, int offset) {
        VipCRMLevelDetail entity = new VipCRMLevelDetail( //
            cursor.getInt(offset + 0), // days
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // id
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // kind
            cursor.getFloat(offset + 3), // real_price
            cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4) // vipCRMLevelId
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, VipCRMLevelDetail entity, int offset) {
        entity.setDays(cursor.getInt(offset + 0));
        entity.setId(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setKind(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setReal_price(cursor.getFloat(offset + 3));
        entity.setVipCRMLevelId(cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(VipCRMLevelDetail entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(VipCRMLevelDetail entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(VipCRMLevelDetail entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
    /** Internal query to resolve the "categories" to-many relationship of VipCRMLevel. */
    public List<VipCRMLevelDetail> _queryVipCRMLevel_Categories(Long vipCRMLevelId) {
        synchronized (this) {
            if (vipCRMLevel_CategoriesQuery == null) {
                QueryBuilder<VipCRMLevelDetail> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.VipCRMLevelId.eq(null));
                vipCRMLevel_CategoriesQuery = queryBuilder.build();
            }
        }
        Query<VipCRMLevelDetail> query = vipCRMLevel_CategoriesQuery.forCurrentThread();
        query.setParameter(0, vipCRMLevelId);
        return query.list();
    }

}
