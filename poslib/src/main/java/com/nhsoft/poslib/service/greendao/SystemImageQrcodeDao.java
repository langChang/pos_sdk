package com.nhsoft.poslib.service.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.nhsoft.poslib.entity.SystemImageQrcode;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "SYSTEM_IMAGE_QRCODE".
*/
public class SystemImageQrcodeDao extends AbstractDao<SystemImageQrcode, Long> {

    public static final String TABLENAME = "SYSTEM_IMAGE_QRCODE";

    /**
     * Properties of entity SystemImageQrcode.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property System_book_code = new Property(1, String.class, "system_book_code", false, "SYSTEM_BOOK_CODE");
        public final static Property System_image_create_time = new Property(2, String.class, "system_image_create_time", false, "SYSTEM_IMAGE_CREATE_TIME");
        public final static Property System_image_file_size = new Property(3, int.class, "system_image_file_size", false, "SYSTEM_IMAGE_FILE_SIZE");
        public final static Property System_image_height = new Property(4, int.class, "system_image_height", false, "SYSTEM_IMAGE_HEIGHT");
        public final static Property System_image_id = new Property(5, String.class, "system_image_id", false, "SYSTEM_IMAGE_ID");
        public final static Property System_image_kind = new Property(6, String.class, "system_image_kind", false, "SYSTEM_IMAGE_KIND");
        public final static Property System_image_name = new Property(7, String.class, "system_image_name", false, "SYSTEM_IMAGE_NAME");
        public final static Property System_image_order = new Property(8, int.class, "system_image_order", false, "SYSTEM_IMAGE_ORDER");
        public final static Property System_image_type = new Property(9, String.class, "system_image_type", false, "SYSTEM_IMAGE_TYPE");
        public final static Property System_image_url = new Property(10, String.class, "system_image_url", false, "SYSTEM_IMAGE_URL");
        public final static Property System_image_width = new Property(11, int.class, "system_image_width", false, "SYSTEM_IMAGE_WIDTH");
    }


    public SystemImageQrcodeDao(DaoConfig config) {
        super(config);
    }
    
    public SystemImageQrcodeDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"SYSTEM_IMAGE_QRCODE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"SYSTEM_BOOK_CODE\" TEXT," + // 1: system_book_code
                "\"SYSTEM_IMAGE_CREATE_TIME\" TEXT," + // 2: system_image_create_time
                "\"SYSTEM_IMAGE_FILE_SIZE\" INTEGER NOT NULL ," + // 3: system_image_file_size
                "\"SYSTEM_IMAGE_HEIGHT\" INTEGER NOT NULL ," + // 4: system_image_height
                "\"SYSTEM_IMAGE_ID\" TEXT," + // 5: system_image_id
                "\"SYSTEM_IMAGE_KIND\" TEXT," + // 6: system_image_kind
                "\"SYSTEM_IMAGE_NAME\" TEXT," + // 7: system_image_name
                "\"SYSTEM_IMAGE_ORDER\" INTEGER NOT NULL ," + // 8: system_image_order
                "\"SYSTEM_IMAGE_TYPE\" TEXT," + // 9: system_image_type
                "\"SYSTEM_IMAGE_URL\" TEXT," + // 10: system_image_url
                "\"SYSTEM_IMAGE_WIDTH\" INTEGER NOT NULL );"); // 11: system_image_width
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"SYSTEM_IMAGE_QRCODE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, SystemImageQrcode entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String system_book_code = entity.getSystem_book_code();
        if (system_book_code != null) {
            stmt.bindString(2, system_book_code);
        }
 
        String system_image_create_time = entity.getSystem_image_create_time();
        if (system_image_create_time != null) {
            stmt.bindString(3, system_image_create_time);
        }
        stmt.bindLong(4, entity.getSystem_image_file_size());
        stmt.bindLong(5, entity.getSystem_image_height());
 
        String system_image_id = entity.getSystem_image_id();
        if (system_image_id != null) {
            stmt.bindString(6, system_image_id);
        }
 
        String system_image_kind = entity.getSystem_image_kind();
        if (system_image_kind != null) {
            stmt.bindString(7, system_image_kind);
        }
 
        String system_image_name = entity.getSystem_image_name();
        if (system_image_name != null) {
            stmt.bindString(8, system_image_name);
        }
        stmt.bindLong(9, entity.getSystem_image_order());
 
        String system_image_type = entity.getSystem_image_type();
        if (system_image_type != null) {
            stmt.bindString(10, system_image_type);
        }
 
        String system_image_url = entity.getSystem_image_url();
        if (system_image_url != null) {
            stmt.bindString(11, system_image_url);
        }
        stmt.bindLong(12, entity.getSystem_image_width());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, SystemImageQrcode entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String system_book_code = entity.getSystem_book_code();
        if (system_book_code != null) {
            stmt.bindString(2, system_book_code);
        }
 
        String system_image_create_time = entity.getSystem_image_create_time();
        if (system_image_create_time != null) {
            stmt.bindString(3, system_image_create_time);
        }
        stmt.bindLong(4, entity.getSystem_image_file_size());
        stmt.bindLong(5, entity.getSystem_image_height());
 
        String system_image_id = entity.getSystem_image_id();
        if (system_image_id != null) {
            stmt.bindString(6, system_image_id);
        }
 
        String system_image_kind = entity.getSystem_image_kind();
        if (system_image_kind != null) {
            stmt.bindString(7, system_image_kind);
        }
 
        String system_image_name = entity.getSystem_image_name();
        if (system_image_name != null) {
            stmt.bindString(8, system_image_name);
        }
        stmt.bindLong(9, entity.getSystem_image_order());
 
        String system_image_type = entity.getSystem_image_type();
        if (system_image_type != null) {
            stmt.bindString(10, system_image_type);
        }
 
        String system_image_url = entity.getSystem_image_url();
        if (system_image_url != null) {
            stmt.bindString(11, system_image_url);
        }
        stmt.bindLong(12, entity.getSystem_image_width());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public SystemImageQrcode readEntity(Cursor cursor, int offset) {
        SystemImageQrcode entity = new SystemImageQrcode( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // system_book_code
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // system_image_create_time
            cursor.getInt(offset + 3), // system_image_file_size
            cursor.getInt(offset + 4), // system_image_height
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // system_image_id
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // system_image_kind
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // system_image_name
            cursor.getInt(offset + 8), // system_image_order
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // system_image_type
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // system_image_url
            cursor.getInt(offset + 11) // system_image_width
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, SystemImageQrcode entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setSystem_book_code(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setSystem_image_create_time(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setSystem_image_file_size(cursor.getInt(offset + 3));
        entity.setSystem_image_height(cursor.getInt(offset + 4));
        entity.setSystem_image_id(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setSystem_image_kind(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setSystem_image_name(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setSystem_image_order(cursor.getInt(offset + 8));
        entity.setSystem_image_type(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setSystem_image_url(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setSystem_image_width(cursor.getInt(offset + 11));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(SystemImageQrcode entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(SystemImageQrcode entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(SystemImageQrcode entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
