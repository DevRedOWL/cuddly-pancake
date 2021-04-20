package com.yandex.metrica.impl.p039ob;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.CounterConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ky */
public class C3618ky {

    /* renamed from: a */
    private final Context f3590a;

    /* renamed from: b */
    private final CounterConfiguration.C3075a f3591b;

    /* renamed from: c */
    private final C3270ck f3592c;

    /* renamed from: com.yandex.metrica.impl.ob.ky$b */
    public enum C3620b {
        BAD_REQUEST("bad_request"),
        DB_OVERFLOW("db_overflow");
        
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final String f3598c;

        private C3620b(String str) {
            this.f3598c = str;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ky$a */
    static class C3619a {

        /* renamed from: a */
        public final List<ContentValues> f3593a;

        /* renamed from: b */
        public final int f3594b;

        C3619a(List<ContentValues> list, int i) {
            this.f3593a = list;
            this.f3594b = i;
        }
    }

    public C3618ky(Context context, CounterConfiguration.C3075a aVar) {
        this(context, aVar, C3136al.m1993a().mo39497l());
    }

    C3618ky(Context context, CounterConfiguration.C3075a aVar, C3270ck ckVar) {
        this.f3590a = context;
        this.f3591b = aVar;
        this.f3592c = ckVar;
    }

    /* renamed from: a */
    private List<ContentValues> m3760a(Cursor cursor) {
        if (cursor == null || cursor.getCount() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(cursor.getCount());
        while (cursor.moveToNext()) {
            ContentValues contentValues = new ContentValues();
            DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
            arrayList.add(contentValues);
        }
        return arrayList;
    }

    /* renamed from: a */
    public C3619a mo40396a(SQLiteDatabase sQLiteDatabase, String str, String str2, C3620b bVar, String str3, boolean z) {
        List<ContentValues> a = m3761a(sQLiteDatabase, str, str2);
        int i = 0;
        if (!C3306cx.m2861a((Collection) a)) {
            try {
                i = sQLiteDatabase.delete(str, str2, (String[]) null);
            } catch (Throwable unused) {
            }
            if (z) {
                m3762b(a, bVar, str3, i);
            }
            int size = a.size();
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("table_name", str);
            hashMap.put("api_key", String.valueOf(str3));
            C4085tl.m5459a(this.f3590a).reportEvent("select_rows_to_delete_failed", (Map<String, Object>) hashMap);
        }
        return new C3619a(a, i);
    }

    /* renamed from: a */
    private List<ContentValues> m3761a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        Cursor cursor;
        List<ContentValues> list = null;
        try {
            cursor = sQLiteDatabase.rawQuery(String.format("SELECT %s, %s, %s FROM %s WHERE %s", new Object[]{"global_number", "type", "number_of_type", "reports", str2}), (String[]) null);
            try {
                list = m3760a(cursor);
            } catch (Throwable th) {
                th = th;
                try {
                    C4085tl.m5459a(this.f3590a).reportError("select_rows_to_delete_exception", th);
                    C3306cx.m2852a(cursor);
                    return list;
                } catch (Throwable th2) {
                    C3306cx.m2852a(cursor);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            C4085tl.m5459a(this.f3590a).reportError("select_rows_to_delete_exception", th);
            C3306cx.m2852a(cursor);
            return list;
        }
        C3306cx.m2852a(cursor);
        return list;
    }

    /* renamed from: a */
    private C4217w m3759a(List<ContentValues> list, C3620b bVar, String str, int i) {
        C4216vz vzVar;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            for (ContentValues next : list) {
                Integer asInteger = next.getAsInteger("global_number");
                Integer asInteger2 = next.getAsInteger("type");
                Integer asInteger3 = next.getAsInteger("number_of_type");
                if (!(asInteger == null || asInteger2 == null || asInteger3 == null)) {
                    jSONArray.put(asInteger);
                    jSONArray2.put(asInteger2);
                    jSONArray3.put(asInteger3);
                }
            }
            jSONObject.put("global_number", jSONArray).put("event_type", jSONArray2).put("number_of_type", jSONArray3);
            JSONObject put = new JSONObject().put("details", new JSONObject().put("reason", bVar.f3598c).put("cleared", jSONObject).put("actual_deleted_number", i));
            if (str == null) {
                vzVar = C4206vr.m5905a();
            } else {
                vzVar = C4206vr.m5906a(str);
            }
            return C3125af.m1966i(put.toString(), vzVar);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private void m3762b(List<ContentValues> list, C3620b bVar, String str, int i) {
        C3270ck ckVar;
        C3268cj a;
        C4217w a2;
        if (str != null && (ckVar = this.f3592c) != null && (a = ckVar.mo39812a(str, this.f3591b)) != null && (a2 = m3759a(list, bVar, str, i)) != null) {
            a.mo39811a(a2);
        }
    }
}
