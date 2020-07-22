package com.nhsoft.poslib.service.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.nhsoft.poslib.entity.PayStyleToCashBank;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "PAY_STYLE_TO_CASH_BANK".
*/
public class PayStyleToCashBankDao extends AbstractDao<PayStyleToCashBank, String> {

    public static final String TABLENAME = "PAY_STYLE_TO_CASH_BANK";

    /**
     * Properties of entity PayStyleToCashBank.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property PayStyleCode = new Property(0, String.class, "payStyleCode", true, "PAYSTYLECODE");
        public final static Property PayStyleName = new Property(1, String.class, "payStyleName", false, "PAY_STYLE_NAME");
        public final static Property AccountBankCode = new Property(2, String.class, "accountBankCode", false, "ACCOUNT_BANK_CODE");
        public final static Property AccountBankName = new Property(3, String.class, "accountBankName", false, "ACCOUNT_BANK_NAME");
    }


    public PayStyleToCashBankDao(DaoConfig config) {
        super(config);
    }
    
    public PayStyleToCashBankDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"PAY_STYLE_TO_CASH_BANK\" (" + //
                "\"PAYSTYLECODE\" TEXT PRIMARY KEY NOT NULL ," + // 0: payStyleCode
                "\"PAY_STYLE_NAME\" TEXT," + // 1: payStyleName
                "\"ACCOUNT_BANK_CODE\" TEXT," + // 2: accountBankCode
                "\"ACCOUNT_BANK_NAME\" TEXT);"); // 3: accountBankName
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"PAY_STYLE_TO_CASH_BANK\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, PayStyleToCashBank entity) {
        stmt.clearBindings();
 
        String payStyleCode = entity.getPayStyleCode();
        if (payStyleCode != null) {
            stmt.bindString(1, payStyleCode);
        }
 
        String payStyleName = entity.getPayStyleName();
        if (payStyleName != null) {
            stmt.bindString(2, payStyleName);
        }
 
        String accountBankCode = entity.getAccountBankCode();
        if (accountBankCode != null) {
            stmt.bindString(3, accountBankCode);
        }
 
        String accountBankName = entity.getAccountBankName();
        if (accountBankName != null) {
            stmt.bindString(4, accountBankName);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, PayStyleToCashBank entity) {
        stmt.clearBindings();
 
        String payStyleCode = entity.getPayStyleCode();
        if (payStyleCode != null) {
            stmt.bindString(1, payStyleCode);
        }
 
        String payStyleName = entity.getPayStyleName();
        if (payStyleName != null) {
            stmt.bindString(2, payStyleName);
        }
 
        String accountBankCode = entity.getAccountBankCode();
        if (accountBankCode != null) {
            stmt.bindString(3, accountBankCode);
        }
 
        String accountBankName = entity.getAccountBankName();
        if (accountBankName != null) {
            stmt.bindString(4, accountBankName);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public PayStyleToCashBank readEntity(Cursor cursor, int offset) {
        PayStyleToCashBank entity = new PayStyleToCashBank( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // payStyleCode
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // payStyleName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // accountBankCode
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // accountBankName
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, PayStyleToCashBank entity, int offset) {
        entity.setPayStyleCode(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setPayStyleName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setAccountBankCode(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setAccountBankName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    @Override
    protected final String updateKeyAfterInsert(PayStyleToCashBank entity, long rowId) {
        return entity.getPayStyleCode();
    }
    
    @Override
    public String getKey(PayStyleToCashBank entity) {
        if(entity != null) {
            return entity.getPayStyleCode();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(PayStyleToCashBank entity) {
        return entity.getPayStyleCode() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
