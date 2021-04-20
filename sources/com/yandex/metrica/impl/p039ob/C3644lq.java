package com.yandex.metrica.impl.p039ob;

import android.content.ContentValues;
import android.util.SparseArray;
import com.yandex.metrica.YandexMetrica;
import java.util.List;
import java.util.Locale;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardFragment;

/* renamed from: com.yandex.metrica.impl.ob.lq */
public final class C3644lq {

    /* renamed from: a */
    public static final Boolean f3679a = false;

    /* renamed from: b */
    public static final int f3680b = YandexMetrica.getLibraryApiLevel();

    /* renamed from: c */
    public static final SparseArray<C3655lr> f3681c = f3683e.mo40422a();

    /* renamed from: d */
    public static final SparseArray<C3655lr> f3682d = f3683e.mo40423b();

    /* renamed from: e */
    private static final C3626lb f3683e = new C3626lb();

    /* renamed from: f */
    private static final C3629le f3684f = new C3629le();

    /* renamed from: g */
    private static final C3625la f3685g = new C3625la(f3683e, f3684f);

    /* renamed from: com.yandex.metrica.impl.ob.lq$a */
    public interface C3645a {

        /* renamed from: a */
        public static final List<String> f3686a = C3306cx.m2850a("incremental_id", "timestamp", "data");

        /* renamed from: com.yandex.metrica.impl.ob.lq$a$a */
        public interface C3646a {

            /* renamed from: a */
            public static final String f3687a = String.format(Locale.US, "CREATE TABLE IF NOT EXISTS %s (incremental_id INTEGER NOT NULL,timestamp INTEGER, data TEXT)", new Object[]{"lbs_dat"});

            /* renamed from: b */
            public static final String f3688b = String.format(Locale.US, "DROP TABLE IF EXISTS %s", new Object[]{"lbs_dat"});
        }

        /* renamed from: com.yandex.metrica.impl.ob.lq$a$b */
        public interface C3647b {

            /* renamed from: a */
            public static final String f3689a = String.format(Locale.US, "CREATE TABLE IF NOT EXISTS %s (incremental_id INTEGER NOT NULL,timestamp INTEGER, data TEXT)", new Object[]{"l_dat"});

            /* renamed from: b */
            public static final String f3690b = String.format(Locale.US, "DROP TABLE IF EXISTS %s", new Object[]{"l_dat"});
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.lq$b */
    public static final class C3648b {

        /* renamed from: a */
        public static final List<String> f3691a = C3306cx.m2850a("data_key", "value");
    }

    /* renamed from: com.yandex.metrica.impl.ob.lq$c */
    public interface C3649c {

        /* renamed from: a */
        public static final List<String> f3692a = C3306cx.m2850a("key", "value", "type");
    }

    /* renamed from: com.yandex.metrica.impl.ob.lq$d */
    public static final class C3650d implements C3649c {
    }

    /* renamed from: com.yandex.metrica.impl.ob.lq$f */
    public static final class C3652f {

        /* renamed from: a */
        public static final List<String> f3693a = C3306cx.m2850a("id", CardFragment.ARG_NUMBER, "global_number", "number_of_type", "name", "value", "type", "time", "session_id", "wifi_network_info", "cell_info", "location_info", "error_environment", "user_info", "session_type", "app_environment", "app_environment_revision", "truncated", "connection_type", "cellular_connection_type", "custom_type", "wifi_access_point", "encrypting_mode", "profile_id", "first_occurrence_status");

        /* renamed from: b */
        public static final String f3694b = ("CREATE TABLE IF NOT EXISTS reports (id INTEGER PRIMARY KEY,name TEXT,value TEXT,number INTEGER,global_number INTEGER,number_of_type INTEGER,type INTEGER,time INTEGER,session_id TEXT,wifi_network_info TEXT DEFAULT '',cell_info TEXT DEFAULT '',location_info TEXT DEFAULT '',error_environment TEXT,user_info TEXT,session_type INTEGER DEFAULT " + C3557jh.FOREGROUND.mo40305a() + "," + "app_environment" + " TEXT DEFAULT '" + "{}" + "'," + "app_environment_revision" + " INTEGER DEFAULT " + 0 + "," + "truncated" + " INTEGER DEFAULT 0," + "connection_type" + " INTEGER DEFAULT " + 2 + "," + "cellular_connection_type" + " TEXT," + "custom_type" + " INTEGER DEFAULT 0, " + "wifi_access_point" + " TEXT, " + "encrypting_mode" + " INTEGER DEFAULT " + C4247wz.NONE.mo41795a() + ", " + "profile_id" + " TEXT, " + "first_occurrence_status" + " INTEGER DEFAULT " + C3134aj.UNKNOWN.f2564d + " )");
    }

    /* renamed from: com.yandex.metrica.impl.ob.lq$g */
    public static final class C3653g {

        /* renamed from: a */
        public static final List<String> f3695a = C3306cx.m2850a("id", "start_time", "network_info", "report_request_parameters", "server_time_offset", "type", "obtained_before_first_sync");

        /* renamed from: b */
        public static final String f3696b = ("CREATE TABLE IF NOT EXISTS sessions (id INTEGER,start_time INTEGER,network_info TEXT,report_request_parameters TEXT,server_time_offset INTEGER,type INTEGER DEFAULT " + C3557jh.FOREGROUND.mo40305a() + "," + "obtained_before_first_sync" + " INTEGER DEFAULT 0 )");

        /* renamed from: c */
        public static final String f3697c = String.format(Locale.US, "SELECT DISTINCT %s  FROM %s WHERE %s >=0 AND (SELECT count() FROM %5$s WHERE %5$s.%6$s = %2$s.%3$s AND %5$s.%7$s = %2$s.%4$s) > 0 ORDER BY %3$s LIMIT 1", new Object[]{"report_request_parameters", "sessions", "id", "type", "reports", "session_id", "session_type"});

        /* renamed from: d */
        public static final String f3698d = String.format(Locale.US, "(select count(%s.%s) from %s where %s.%s = %s.%s) = 0 and cast(%s as integer) < ?", new Object[]{"reports", "id", "reports", "reports", "session_id", "sessions", "id", "id"});
    }

    /* renamed from: com.yandex.metrica.impl.ob.lq$h */
    public static final class C3654h implements C3649c {
    }

    /* renamed from: com.yandex.metrica.impl.ob.lq$e */
    public static final class C3651e {
        /* renamed from: a */
        public static ContentValues m3883a() {
            ContentValues contentValues = new ContentValues();
            contentValues.put("API_LEVEL", Integer.valueOf(YandexMetrica.getLibraryApiLevel()));
            return contentValues;
        }
    }

    /* renamed from: a */
    public static C3625la m3882a() {
        return f3685g;
    }
}
