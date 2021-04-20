package com.yandex.metrica.impl.p039ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.impl.p039ob.C3125af;
import com.yandex.metrica.impl.p039ob.C3644lq;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ls */
public class C3656ls {

    /* renamed from: com.yandex.metrica.impl.ob.ls$v */
    public static class C3680v extends C3655lr {
        /* renamed from: a */
        public void mo40476a(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("ALTER TABLE " + "sessions" + " ADD COLUMN " + "wifi_network_info" + " TEXT DEFAULT ''");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ls$z */
    public static class C3684z extends C3655lr {
        /* renamed from: a */
        public void mo40476a(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("ALTER TABLE " + "sessions" + " ADD COLUMN " + "report_request_parameters" + " TEXT DEFAULT ''");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ls$o */
    public static class C3673o extends C3655lr {
        /* renamed from: a */
        public void mo40476a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
            Cursor cursor;
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            sQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS " + "sessions_BACKUP" + " (" + "id" + " INTEGER" + "," + "start_time" + " INTEGER" + "," + "connection_type" + " INTEGER" + "," + "network_type" + " TEXT" + "," + "country_code" + " INTEGER" + "," + "operator_id" + " INTEGER" + "," + "lac" + " INTEGER" + "," + "report_request_parameters" + " TEXT" + " );");
            StringBuilder sb = new StringBuilder();
            sb.append("id");
            sb.append(",");
            sb.append("start_time");
            sb.append(",");
            sb.append("connection_type");
            sb.append(",");
            sb.append("network_type");
            sb.append(",");
            sb.append("country_code");
            sb.append(",");
            sb.append("operator_id");
            sb.append(",");
            sb.append("lac");
            sb.append(",");
            sb.append("report_request_parameters");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("INSERT INTO ");
            sb2.append("sessions_BACKUP");
            sb2.append(" SELECT ");
            sb2.append(sb);
            sb2.append(" FROM ");
            sb2.append("sessions");
            sb2.append(";");
            sQLiteDatabase2.execSQL(sb2.toString());
            sQLiteDatabase2.execSQL("DROP TABLE sessions;");
            sQLiteDatabase2.execSQL(C3644lq.C3653g.f3696b);
            try {
                cursor = sQLiteDatabase2.rawQuery("SELECT * FROM sessions_BACKUP", (String[]) null);
                while (cursor.moveToNext()) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
                        ArrayList<String> arrayList = new ArrayList<>();
                        arrayList.add("id");
                        arrayList.add("start_time");
                        arrayList.add("report_request_parameters");
                        ContentValues contentValues2 = new ContentValues(contentValues);
                        for (Map.Entry next : contentValues.valueSet()) {
                            if (!arrayList.contains(next.getKey())) {
                                contentValues2.remove((String) next.getKey());
                            }
                        }
                        for (String remove : arrayList) {
                            contentValues.remove(remove);
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("conn_type", contentValues.getAsInteger("connection_type"));
                        jSONObject.putOpt("net_type", contentValues.get("network_type"));
                        jSONObject.putOpt("operator_id", contentValues.get("operator_id"));
                        jSONObject.putOpt("lac", contentValues.get("lac"));
                        jSONObject.putOpt("country_code", contentValues.get("country_code"));
                        contentValues2.put("network_info", jSONObject.toString());
                        sQLiteDatabase2.insertOrThrow("sessions", (String) null, contentValues2);
                    } catch (Throwable th) {
                        th = th;
                        C3306cx.m2852a(cursor);
                        throw th;
                    }
                }
                C3306cx.m2852a(cursor);
                sQLiteDatabase2.execSQL("DROP TABLE sessions_BACKUP;");
                sQLiteDatabase2.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "wifi_network_info" + " TEXT DEFAULT ''");
                sQLiteDatabase2.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "cell_info" + " TEXT DEFAULT ''");
                sQLiteDatabase2.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "location_info" + " TEXT DEFAULT ''");
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
                C3306cx.m2852a(cursor);
                throw th;
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ls$p */
    public static class C3674p extends C3655lr {
        /* renamed from: a */
        public void mo40476a(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "environment" + " TEXT ");
            sQLiteDatabase.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "user_info" + " TEXT ");
            sQLiteDatabase.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "session_type" + " INTEGER DEFAULT " + C3557jh.FOREGROUND.mo40305a());
            sQLiteDatabase.execSQL("UPDATE " + "reports" + " SET " + "session_type" + " = " + C3557jh.BACKGROUND.mo40305a() + " WHERE " + "session_id" + " = " + -2);
            StringBuilder sb = new StringBuilder();
            sb.append("ALTER TABLE ");
            sb.append("sessions");
            sb.append(" ADD COLUMN ");
            sb.append("server_time_offset");
            sb.append(" INTEGER ");
            sQLiteDatabase.execSQL(sb.toString());
            sQLiteDatabase.execSQL("ALTER TABLE " + "sessions" + " ADD COLUMN " + "type" + " INTEGER DEFAULT " + C3557jh.FOREGROUND.mo40305a());
            sQLiteDatabase.execSQL("UPDATE " + "sessions" + " SET " + "type" + " = " + C3557jh.BACKGROUND.mo40305a() + " WHERE " + "id" + " = " + -2);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ls$g */
    public static class C3665g extends C3655lr {
        /* renamed from: a */
        public void mo40476a(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS api_level_info (API_LEVEL INT )");
            sQLiteDatabase.insert("api_level_info", "API_LEVEL", C3644lq.C3651e.m3883a());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ls$h */
    public static class C3666h extends C3655lr {
        /* renamed from: a */
        public void mo40476a(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS api_level_info");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS device_id_info");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ls$i */
    public static class C3667i extends C3655lr {
        /* renamed from: a */
        public void mo40476a(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS preferences (key TEXT PRIMARY KEY,value TEXT,type INTEGER)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS startup (key TEXT PRIMARY KEY,value TEXT,type INTEGER)");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ls$j */
    public static class C3668j extends C3655lr {
        /* renamed from: a */
        public void mo40476a(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS GeoLocationInfo");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ls$l */
    public static class C3670l extends C3655lr {
        /* renamed from: a */
        public void mo40476a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
            sQLiteDatabase.execSQL(C3644lq.C3645a.C3647b.f3689a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ls$m */
    public static class C3671m extends C3655lr {
        /* renamed from: a */
        public void mo40476a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
            sQLiteDatabase.execSQL(C3644lq.C3645a.C3646a.f3687a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ls$n */
    public static class C3672n extends C3655lr {
        /* renamed from: a */
        public void mo40476a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS binary_data (data_key TEXT PRIMARY KEY,value BLOB)");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ls$k */
    public static class C3669k extends C3655lr {
        /* renamed from: a */
        public void mo40476a(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS permissions (name TEXT PRIMARY KEY,granted INTEGER)");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ls$q */
    public static class C3675q extends C3655lr {

        /* renamed from: a */
        private static final String f3699a = ("CREATE TABLE IF NOT EXISTS reports (id INTEGER PRIMARY KEY,name TEXT,value TEXT,number INTEGER,type INTEGER,time INTEGER,session_id TEXT,wifi_network_info TEXT DEFAULT '',cell_info TEXT DEFAULT '',location_info TEXT DEFAULT '',error_environment TEXT,user_info TEXT,session_type INTEGER DEFAULT " + C3557jh.FOREGROUND.mo40305a() + "," + "app_environment" + " TEXT DEFAULT '" + "{}" + "'," + "app_environment_revision" + " INTEGER DEFAULT " + 0 + " )");

        /* renamed from: a */
        public void mo40476a(SQLiteDatabase sQLiteDatabase) throws SQLException {
            Cursor cursor;
            sQLiteDatabase.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "app_environment" + " TEXT DEFAULT '{}'");
            sQLiteDatabase.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "app_environment_revision" + " INTEGER DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE reports RENAME TO reports_backup");
            sQLiteDatabase.execSQL(f3699a);
            try {
                cursor = sQLiteDatabase.rawQuery("SELECT * FROM reports_backup", (String[]) null);
                while (cursor.moveToNext()) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
                        String asString = contentValues.getAsString("environment");
                        contentValues.remove("environment");
                        contentValues.put("error_environment", asString);
                        sQLiteDatabase.insert("reports", (String) null, contentValues);
                    } catch (Throwable th) {
                        th = th;
                        C3306cx.m2852a(cursor);
                        throw th;
                    }
                }
                C3306cx.m2852a(cursor);
                sQLiteDatabase.execSQL("DROP TABLE reports_backup");
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
                C3306cx.m2852a(cursor);
                throw th;
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ls$r */
    public static class C3676r extends C3655lr {
        /* renamed from: a */
        public void mo40476a(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "truncated" + " INTEGER DEFAULT 0");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ls$s */
    public static class C3677s extends C3655lr {
        /* renamed from: a */
        public void mo40476a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
            sQLiteDatabase.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "connection_type" + " INTEGER DEFAULT 2");
            sQLiteDatabase.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "cellular_connection_type" + " TEXT ");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ls$t */
    public static class C3678t extends C3655lr {
        /* renamed from: a */
        public void mo40476a(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS preferences (key TEXT PRIMARY KEY,value TEXT,type INTEGER)");
            sQLiteDatabase.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "custom_type" + " INTEGER DEFAULT 0");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ls$u */
    public static class C3679u extends C3655lr {
        /* renamed from: a */
        public void mo40476a(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS preferences (key TEXT PRIMARY KEY,value TEXT,type INTEGER)");
            sQLiteDatabase.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "wifi_access_point" + " TEXT ");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ls$w */
    public static class C3681w extends C3655lr {
        /* renamed from: a */
        public void mo40476a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
            sQLiteDatabase.execSQL("ALTER TABLE " + "sessions" + " ADD COLUMN " + "obtained_before_first_sync" + " INTEGER DEFAULT 0");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ls$x */
    public static class C3682x extends C3655lr {
        /* renamed from: a */
        public void mo40476a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
            sQLiteDatabase.execSQL(String.format(Locale.US, "ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT %d", new Object[]{"reports", "encrypting_mode", Integer.valueOf(C4247wz.NONE.mo41795a())}));
            sQLiteDatabase.execSQL(String.format(Locale.US, "UPDATE %s SET %s = %d where %s=%d", new Object[]{"reports", "encrypting_mode", Integer.valueOf(C4247wz.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER.mo41795a()), "type", Integer.valueOf(C3125af.C3126a.EVENT_TYPE_IDENTITY.mo39462a())}));
            sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN profile_id TEXT ");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ls$y */
    public static class C3683y extends C3655lr {
        /* renamed from: a */
        public void mo40476a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
            sQLiteDatabase.execSQL(String.format(Locale.US, "ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT %d", new Object[]{"reports", "first_occurrence_status", Integer.valueOf(C3134aj.UNKNOWN.f2564d)}));
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS binary_data (data_key TEXT PRIMARY KEY,value BLOB)");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ls$aa */
    public static class C3658aa extends C3655lr {
        /* renamed from: a */
        public void mo40476a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
            sQLiteDatabase.delete("reports", "session_id = ?", new String[]{String.valueOf(-2)});
            sQLiteDatabase.delete("sessions", "id = ?", new String[]{String.valueOf(-2)});
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ls$ab */
    public static class C3659ab extends C3655lr {
        /* renamed from: a */
        public void mo40476a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
            sQLiteDatabase.execSQL(String.format(Locale.US, "ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT %d", new Object[]{"reports", "global_number", 0}));
            sQLiteDatabase.execSQL(String.format(Locale.US, "ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT %d", new Object[]{"reports", "number_of_type", 0}));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ls$c */
    public static class C3661c extends C3655lr {
        /* renamed from: a */
        public void mo40476a(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL(C3644lq.C3652f.f3694b);
            sQLiteDatabase.execSQL(C3644lq.C3653g.f3696b);
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS preferences (key TEXT PRIMARY KEY,value TEXT,type INTEGER)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS binary_data (data_key TEXT PRIMARY KEY,value BLOB)");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ls$d */
    public static class C3662d extends C3655lr {
        /* renamed from: a */
        public void mo40476a(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS reports");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS sessions");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS preferences");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ls$e */
    public static class C3663e extends C3655lr {
        /* renamed from: a */
        public void mo40476a(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS preferences (key TEXT PRIMARY KEY,value TEXT,type INTEGER)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS startup (key TEXT PRIMARY KEY,value TEXT,type INTEGER)");
            sQLiteDatabase.execSQL(C3644lq.C3645a.C3647b.f3689a);
            sQLiteDatabase.execSQL(C3644lq.C3645a.C3646a.f3687a);
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS binary_data (data_key TEXT PRIMARY KEY,value BLOB)");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ls$f */
    public static class C3664f extends C3655lr {
        /* renamed from: a */
        public void mo40476a(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS device_id_info");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS api_level_info");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS preferences");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS startup");
            sQLiteDatabase.execSQL(C3644lq.C3645a.C3647b.f3690b);
            sQLiteDatabase.execSQL(C3644lq.C3645a.C3646a.f3688b);
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS permissions");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ls$a */
    public static class C3657a extends C3655lr {
        /* renamed from: a */
        public void mo40476a(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS preferences (key TEXT PRIMARY KEY,value TEXT,type INTEGER)");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ls$b */
    public static class C3660b extends C3655lr {
        /* renamed from: a */
        public void mo40476a(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS preferences");
        }
    }
}
