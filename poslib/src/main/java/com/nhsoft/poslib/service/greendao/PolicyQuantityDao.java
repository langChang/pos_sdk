package com.nhsoft.poslib.service.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.nhsoft.poslib.entity.PolicyQuantity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "POLICY_QUANTITY".
*/
public class PolicyQuantityDao extends AbstractDao<PolicyQuantity, String> {

    public static final String TABLENAME = "POLICY_QUANTITY";

    /**
     * Properties of entity PolicyQuantity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Promotion_quantity_no = new Property(0, String.class, "promotion_quantity_no", true, "PROMOTION_QUANTITY_NO");
        public final static Property Branch_num = new Property(1, int.class, "branch_num", false, "BRANCH_NUM");
        public final static Property Promotion_quantity_date_from = new Property(2, String.class, "promotion_quantity_date_from", false, "PROMOTION_QUANTITY_DATE_FROM");
        public final static Property Promotion_quantity_date_to = new Property(3, String.class, "promotion_quantity_date_to", false, "PROMOTION_QUANTITY_DATE_TO");
        public final static Property Promotion_quantity_time_from = new Property(4, String.class, "promotion_quantity_time_from", false, "PROMOTION_QUANTITY_TIME_FROM");
        public final static Property Promotion_quantity_time_to = new Property(5, String.class, "promotion_quantity_time_to", false, "PROMOTION_QUANTITY_TIME_TO");
        public final static Property Promotion_quantity_applied_branch = new Property(6, String.class, "promotion_quantity_applied_branch", false, "PROMOTION_QUANTITY_APPLIED_BRANCH");
        public final static Property Promotion_quantity_mon_actived = new Property(7, boolean.class, "promotion_quantity_mon_actived", false, "PROMOTION_QUANTITY_MON_ACTIVED");
        public final static Property Promotion_quantity_tues_actived = new Property(8, boolean.class, "promotion_quantity_tues_actived", false, "PROMOTION_QUANTITY_TUES_ACTIVED");
        public final static Property Promotion_quantity_wed_actived = new Property(9, boolean.class, "promotion_quantity_wed_actived", false, "PROMOTION_QUANTITY_WED_ACTIVED");
        public final static Property Promotion_quantity_thurs_actived = new Property(10, boolean.class, "promotion_quantity_thurs_actived", false, "PROMOTION_QUANTITY_THURS_ACTIVED");
        public final static Property Promotion_quantity_friday_actived = new Property(11, boolean.class, "promotion_quantity_friday_actived", false, "PROMOTION_QUANTITY_FRIDAY_ACTIVED");
        public final static Property Promotion_quantity_sat_actived = new Property(12, boolean.class, "promotion_quantity_sat_actived", false, "PROMOTION_QUANTITY_SAT_ACTIVED");
        public final static Property Promotion_quantity_sun_actived = new Property(13, boolean.class, "promotion_quantity_sun_actived", false, "PROMOTION_QUANTITY_SUN_ACTIVED");
        public final static Property Promotion_quantity_create_time = new Property(14, String.class, "promotion_quantity_create_time", false, "PROMOTION_QUANTITY_CREATE_TIME");
        public final static Property Promotion_quantity_creator = new Property(15, String.class, "promotion_quantity_creator", false, "PROMOTION_QUANTITY_CREATOR");
        public final static Property Promotion_quantity_audit_time = new Property(16, String.class, "promotion_quantity_audit_time", false, "PROMOTION_QUANTITY_AUDIT_TIME");
        public final static Property Promotion_quantity_auditor = new Property(17, String.class, "promotion_quantity_auditor", false, "PROMOTION_QUANTITY_AUDITOR");
        public final static Property Promotion_quantity_card_only = new Property(18, boolean.class, "promotion_quantity_card_only", false, "PROMOTION_QUANTITY_CARD_ONLY");
        public final static Property Promotion_quantity_card_type = new Property(19, String.class, "promotion_quantity_card_type", false, "PROMOTION_QUANTITY_CARD_TYPE");
        public final static Property Promotion_quantity_last_edit_time = new Property(20, String.class, "promotion_quantity_last_edit_time", false, "PROMOTION_QUANTITY_LAST_EDIT_TIME");
        public final static Property Promotion_quantity_last_editor = new Property(21, String.class, "promotion_quantity_last_editor", false, "PROMOTION_QUANTITY_LAST_EDITOR");
        public final static Property Promotion_quantity_type = new Property(22, String.class, "promotion_quantity_type", false, "PROMOTION_QUANTITY_TYPE");
        public final static Property Promotion_quantity_min_amount = new Property(23, Float.class, "promotion_quantity_min_amount", false, "PROMOTION_QUANTITY_MIN_AMOUNT");
        public final static Property Promotion_quantity_append = new Property(24, Boolean.class, "promotion_quantity_append", false, "PROMOTION_QUANTITY_APPEND");
        public final static Property Promotion_quantity_level_ids = new Property(25, String.class, "promotion_quantity_level_ids", false, "PROMOTION_QUANTITY_LEVEL_IDS");
        public final static Property Promotion_quantity_discount = new Property(26, Float.class, "promotion_quantity_discount", false, "PROMOTION_QUANTITY_DISCOUNT");
    }

    private DaoSession daoSession;


    public PolicyQuantityDao(DaoConfig config) {
        super(config);
    }
    
    public PolicyQuantityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"POLICY_QUANTITY\" (" + //
                "\"PROMOTION_QUANTITY_NO\" TEXT PRIMARY KEY NOT NULL ," + // 0: promotion_quantity_no
                "\"BRANCH_NUM\" INTEGER NOT NULL ," + // 1: branch_num
                "\"PROMOTION_QUANTITY_DATE_FROM\" TEXT," + // 2: promotion_quantity_date_from
                "\"PROMOTION_QUANTITY_DATE_TO\" TEXT," + // 3: promotion_quantity_date_to
                "\"PROMOTION_QUANTITY_TIME_FROM\" TEXT," + // 4: promotion_quantity_time_from
                "\"PROMOTION_QUANTITY_TIME_TO\" TEXT," + // 5: promotion_quantity_time_to
                "\"PROMOTION_QUANTITY_APPLIED_BRANCH\" TEXT," + // 6: promotion_quantity_applied_branch
                "\"PROMOTION_QUANTITY_MON_ACTIVED\" INTEGER NOT NULL ," + // 7: promotion_quantity_mon_actived
                "\"PROMOTION_QUANTITY_TUES_ACTIVED\" INTEGER NOT NULL ," + // 8: promotion_quantity_tues_actived
                "\"PROMOTION_QUANTITY_WED_ACTIVED\" INTEGER NOT NULL ," + // 9: promotion_quantity_wed_actived
                "\"PROMOTION_QUANTITY_THURS_ACTIVED\" INTEGER NOT NULL ," + // 10: promotion_quantity_thurs_actived
                "\"PROMOTION_QUANTITY_FRIDAY_ACTIVED\" INTEGER NOT NULL ," + // 11: promotion_quantity_friday_actived
                "\"PROMOTION_QUANTITY_SAT_ACTIVED\" INTEGER NOT NULL ," + // 12: promotion_quantity_sat_actived
                "\"PROMOTION_QUANTITY_SUN_ACTIVED\" INTEGER NOT NULL ," + // 13: promotion_quantity_sun_actived
                "\"PROMOTION_QUANTITY_CREATE_TIME\" TEXT," + // 14: promotion_quantity_create_time
                "\"PROMOTION_QUANTITY_CREATOR\" TEXT," + // 15: promotion_quantity_creator
                "\"PROMOTION_QUANTITY_AUDIT_TIME\" TEXT," + // 16: promotion_quantity_audit_time
                "\"PROMOTION_QUANTITY_AUDITOR\" TEXT," + // 17: promotion_quantity_auditor
                "\"PROMOTION_QUANTITY_CARD_ONLY\" INTEGER NOT NULL ," + // 18: promotion_quantity_card_only
                "\"PROMOTION_QUANTITY_CARD_TYPE\" TEXT," + // 19: promotion_quantity_card_type
                "\"PROMOTION_QUANTITY_LAST_EDIT_TIME\" TEXT," + // 20: promotion_quantity_last_edit_time
                "\"PROMOTION_QUANTITY_LAST_EDITOR\" TEXT," + // 21: promotion_quantity_last_editor
                "\"PROMOTION_QUANTITY_TYPE\" TEXT," + // 22: promotion_quantity_type
                "\"PROMOTION_QUANTITY_MIN_AMOUNT\" REAL," + // 23: promotion_quantity_min_amount
                "\"PROMOTION_QUANTITY_APPEND\" INTEGER," + // 24: promotion_quantity_append
                "\"PROMOTION_QUANTITY_LEVEL_IDS\" TEXT," + // 25: promotion_quantity_level_ids
                "\"PROMOTION_QUANTITY_DISCOUNT\" REAL);"); // 26: promotion_quantity_discount
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"POLICY_QUANTITY\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, PolicyQuantity entity) {
        stmt.clearBindings();
 
        String promotion_quantity_no = entity.getPromotion_quantity_no();
        if (promotion_quantity_no != null) {
            stmt.bindString(1, promotion_quantity_no);
        }
        stmt.bindLong(2, entity.getBranch_num());
 
        String promotion_quantity_date_from = entity.getPromotion_quantity_date_from();
        if (promotion_quantity_date_from != null) {
            stmt.bindString(3, promotion_quantity_date_from);
        }
 
        String promotion_quantity_date_to = entity.getPromotion_quantity_date_to();
        if (promotion_quantity_date_to != null) {
            stmt.bindString(4, promotion_quantity_date_to);
        }
 
        String promotion_quantity_time_from = entity.getPromotion_quantity_time_from();
        if (promotion_quantity_time_from != null) {
            stmt.bindString(5, promotion_quantity_time_from);
        }
 
        String promotion_quantity_time_to = entity.getPromotion_quantity_time_to();
        if (promotion_quantity_time_to != null) {
            stmt.bindString(6, promotion_quantity_time_to);
        }
 
        String promotion_quantity_applied_branch = entity.getPromotion_quantity_applied_branch();
        if (promotion_quantity_applied_branch != null) {
            stmt.bindString(7, promotion_quantity_applied_branch);
        }
        stmt.bindLong(8, entity.getPromotion_quantity_mon_actived() ? 1L: 0L);
        stmt.bindLong(9, entity.getPromotion_quantity_tues_actived() ? 1L: 0L);
        stmt.bindLong(10, entity.getPromotion_quantity_wed_actived() ? 1L: 0L);
        stmt.bindLong(11, entity.getPromotion_quantity_thurs_actived() ? 1L: 0L);
        stmt.bindLong(12, entity.getPromotion_quantity_friday_actived() ? 1L: 0L);
        stmt.bindLong(13, entity.getPromotion_quantity_sat_actived() ? 1L: 0L);
        stmt.bindLong(14, entity.getPromotion_quantity_sun_actived() ? 1L: 0L);
 
        String promotion_quantity_create_time = entity.getPromotion_quantity_create_time();
        if (promotion_quantity_create_time != null) {
            stmt.bindString(15, promotion_quantity_create_time);
        }
 
        String promotion_quantity_creator = entity.getPromotion_quantity_creator();
        if (promotion_quantity_creator != null) {
            stmt.bindString(16, promotion_quantity_creator);
        }
 
        String promotion_quantity_audit_time = entity.getPromotion_quantity_audit_time();
        if (promotion_quantity_audit_time != null) {
            stmt.bindString(17, promotion_quantity_audit_time);
        }
 
        String promotion_quantity_auditor = entity.getPromotion_quantity_auditor();
        if (promotion_quantity_auditor != null) {
            stmt.bindString(18, promotion_quantity_auditor);
        }
        stmt.bindLong(19, entity.getPromotion_quantity_card_only() ? 1L: 0L);
 
        String promotion_quantity_card_type = entity.getPromotion_quantity_card_type();
        if (promotion_quantity_card_type != null) {
            stmt.bindString(20, promotion_quantity_card_type);
        }
 
        String promotion_quantity_last_edit_time = entity.getPromotion_quantity_last_edit_time();
        if (promotion_quantity_last_edit_time != null) {
            stmt.bindString(21, promotion_quantity_last_edit_time);
        }
 
        String promotion_quantity_last_editor = entity.getPromotion_quantity_last_editor();
        if (promotion_quantity_last_editor != null) {
            stmt.bindString(22, promotion_quantity_last_editor);
        }
 
        String promotion_quantity_type = entity.getPromotion_quantity_type();
        if (promotion_quantity_type != null) {
            stmt.bindString(23, promotion_quantity_type);
        }
 
        Float promotion_quantity_min_amount = entity.getPromotion_quantity_min_amount();
        if (promotion_quantity_min_amount != null) {
            stmt.bindDouble(24, promotion_quantity_min_amount);
        }
 
        Boolean promotion_quantity_append = entity.getPromotion_quantity_append();
        if (promotion_quantity_append != null) {
            stmt.bindLong(25, promotion_quantity_append ? 1L: 0L);
        }
 
        String promotion_quantity_level_ids = entity.getPromotion_quantity_level_ids();
        if (promotion_quantity_level_ids != null) {
            stmt.bindString(26, promotion_quantity_level_ids);
        }
 
        Float promotion_quantity_discount = entity.getPromotion_quantity_discount();
        if (promotion_quantity_discount != null) {
            stmt.bindDouble(27, promotion_quantity_discount);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, PolicyQuantity entity) {
        stmt.clearBindings();
 
        String promotion_quantity_no = entity.getPromotion_quantity_no();
        if (promotion_quantity_no != null) {
            stmt.bindString(1, promotion_quantity_no);
        }
        stmt.bindLong(2, entity.getBranch_num());
 
        String promotion_quantity_date_from = entity.getPromotion_quantity_date_from();
        if (promotion_quantity_date_from != null) {
            stmt.bindString(3, promotion_quantity_date_from);
        }
 
        String promotion_quantity_date_to = entity.getPromotion_quantity_date_to();
        if (promotion_quantity_date_to != null) {
            stmt.bindString(4, promotion_quantity_date_to);
        }
 
        String promotion_quantity_time_from = entity.getPromotion_quantity_time_from();
        if (promotion_quantity_time_from != null) {
            stmt.bindString(5, promotion_quantity_time_from);
        }
 
        String promotion_quantity_time_to = entity.getPromotion_quantity_time_to();
        if (promotion_quantity_time_to != null) {
            stmt.bindString(6, promotion_quantity_time_to);
        }
 
        String promotion_quantity_applied_branch = entity.getPromotion_quantity_applied_branch();
        if (promotion_quantity_applied_branch != null) {
            stmt.bindString(7, promotion_quantity_applied_branch);
        }
        stmt.bindLong(8, entity.getPromotion_quantity_mon_actived() ? 1L: 0L);
        stmt.bindLong(9, entity.getPromotion_quantity_tues_actived() ? 1L: 0L);
        stmt.bindLong(10, entity.getPromotion_quantity_wed_actived() ? 1L: 0L);
        stmt.bindLong(11, entity.getPromotion_quantity_thurs_actived() ? 1L: 0L);
        stmt.bindLong(12, entity.getPromotion_quantity_friday_actived() ? 1L: 0L);
        stmt.bindLong(13, entity.getPromotion_quantity_sat_actived() ? 1L: 0L);
        stmt.bindLong(14, entity.getPromotion_quantity_sun_actived() ? 1L: 0L);
 
        String promotion_quantity_create_time = entity.getPromotion_quantity_create_time();
        if (promotion_quantity_create_time != null) {
            stmt.bindString(15, promotion_quantity_create_time);
        }
 
        String promotion_quantity_creator = entity.getPromotion_quantity_creator();
        if (promotion_quantity_creator != null) {
            stmt.bindString(16, promotion_quantity_creator);
        }
 
        String promotion_quantity_audit_time = entity.getPromotion_quantity_audit_time();
        if (promotion_quantity_audit_time != null) {
            stmt.bindString(17, promotion_quantity_audit_time);
        }
 
        String promotion_quantity_auditor = entity.getPromotion_quantity_auditor();
        if (promotion_quantity_auditor != null) {
            stmt.bindString(18, promotion_quantity_auditor);
        }
        stmt.bindLong(19, entity.getPromotion_quantity_card_only() ? 1L: 0L);
 
        String promotion_quantity_card_type = entity.getPromotion_quantity_card_type();
        if (promotion_quantity_card_type != null) {
            stmt.bindString(20, promotion_quantity_card_type);
        }
 
        String promotion_quantity_last_edit_time = entity.getPromotion_quantity_last_edit_time();
        if (promotion_quantity_last_edit_time != null) {
            stmt.bindString(21, promotion_quantity_last_edit_time);
        }
 
        String promotion_quantity_last_editor = entity.getPromotion_quantity_last_editor();
        if (promotion_quantity_last_editor != null) {
            stmt.bindString(22, promotion_quantity_last_editor);
        }
 
        String promotion_quantity_type = entity.getPromotion_quantity_type();
        if (promotion_quantity_type != null) {
            stmt.bindString(23, promotion_quantity_type);
        }
 
        Float promotion_quantity_min_amount = entity.getPromotion_quantity_min_amount();
        if (promotion_quantity_min_amount != null) {
            stmt.bindDouble(24, promotion_quantity_min_amount);
        }
 
        Boolean promotion_quantity_append = entity.getPromotion_quantity_append();
        if (promotion_quantity_append != null) {
            stmt.bindLong(25, promotion_quantity_append ? 1L: 0L);
        }
 
        String promotion_quantity_level_ids = entity.getPromotion_quantity_level_ids();
        if (promotion_quantity_level_ids != null) {
            stmt.bindString(26, promotion_quantity_level_ids);
        }
 
        Float promotion_quantity_discount = entity.getPromotion_quantity_discount();
        if (promotion_quantity_discount != null) {
            stmt.bindDouble(27, promotion_quantity_discount);
        }
    }

    @Override
    protected final void attachEntity(PolicyQuantity entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public PolicyQuantity readEntity(Cursor cursor, int offset) {
        PolicyQuantity entity = new PolicyQuantity( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // promotion_quantity_no
            cursor.getInt(offset + 1), // branch_num
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // promotion_quantity_date_from
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // promotion_quantity_date_to
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // promotion_quantity_time_from
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // promotion_quantity_time_to
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // promotion_quantity_applied_branch
            cursor.getShort(offset + 7) != 0, // promotion_quantity_mon_actived
            cursor.getShort(offset + 8) != 0, // promotion_quantity_tues_actived
            cursor.getShort(offset + 9) != 0, // promotion_quantity_wed_actived
            cursor.getShort(offset + 10) != 0, // promotion_quantity_thurs_actived
            cursor.getShort(offset + 11) != 0, // promotion_quantity_friday_actived
            cursor.getShort(offset + 12) != 0, // promotion_quantity_sat_actived
            cursor.getShort(offset + 13) != 0, // promotion_quantity_sun_actived
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // promotion_quantity_create_time
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // promotion_quantity_creator
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // promotion_quantity_audit_time
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // promotion_quantity_auditor
            cursor.getShort(offset + 18) != 0, // promotion_quantity_card_only
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // promotion_quantity_card_type
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // promotion_quantity_last_edit_time
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // promotion_quantity_last_editor
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22), // promotion_quantity_type
            cursor.isNull(offset + 23) ? null : cursor.getFloat(offset + 23), // promotion_quantity_min_amount
            cursor.isNull(offset + 24) ? null : cursor.getShort(offset + 24) != 0, // promotion_quantity_append
            cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25), // promotion_quantity_level_ids
            cursor.isNull(offset + 26) ? null : cursor.getFloat(offset + 26) // promotion_quantity_discount
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, PolicyQuantity entity, int offset) {
        entity.setPromotion_quantity_no(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setBranch_num(cursor.getInt(offset + 1));
        entity.setPromotion_quantity_date_from(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setPromotion_quantity_date_to(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setPromotion_quantity_time_from(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setPromotion_quantity_time_to(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setPromotion_quantity_applied_branch(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setPromotion_quantity_mon_actived(cursor.getShort(offset + 7) != 0);
        entity.setPromotion_quantity_tues_actived(cursor.getShort(offset + 8) != 0);
        entity.setPromotion_quantity_wed_actived(cursor.getShort(offset + 9) != 0);
        entity.setPromotion_quantity_thurs_actived(cursor.getShort(offset + 10) != 0);
        entity.setPromotion_quantity_friday_actived(cursor.getShort(offset + 11) != 0);
        entity.setPromotion_quantity_sat_actived(cursor.getShort(offset + 12) != 0);
        entity.setPromotion_quantity_sun_actived(cursor.getShort(offset + 13) != 0);
        entity.setPromotion_quantity_create_time(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setPromotion_quantity_creator(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setPromotion_quantity_audit_time(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setPromotion_quantity_auditor(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setPromotion_quantity_card_only(cursor.getShort(offset + 18) != 0);
        entity.setPromotion_quantity_card_type(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setPromotion_quantity_last_edit_time(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setPromotion_quantity_last_editor(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setPromotion_quantity_type(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
        entity.setPromotion_quantity_min_amount(cursor.isNull(offset + 23) ? null : cursor.getFloat(offset + 23));
        entity.setPromotion_quantity_append(cursor.isNull(offset + 24) ? null : cursor.getShort(offset + 24) != 0);
        entity.setPromotion_quantity_level_ids(cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25));
        entity.setPromotion_quantity_discount(cursor.isNull(offset + 26) ? null : cursor.getFloat(offset + 26));
     }
    
    @Override
    protected final String updateKeyAfterInsert(PolicyQuantity entity, long rowId) {
        return entity.getPromotion_quantity_no();
    }
    
    @Override
    public String getKey(PolicyQuantity entity) {
        if(entity != null) {
            return entity.getPromotion_quantity_no();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(PolicyQuantity entity) {
        return entity.getPromotion_quantity_no() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
