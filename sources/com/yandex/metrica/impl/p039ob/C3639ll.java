package com.yandex.metrica.impl.p039ob;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ll */
public class C3639ll implements C3638lk {

    /* renamed from: a */
    private final String f3665a;

    /* renamed from: b */
    private final HashMap<String, List<String>> f3666b;

    public C3639ll(String str, HashMap<String, List<String>> hashMap) {
        this.f3665a = str;
        this.f3666b = hashMap;
    }

    /* renamed from: a */
    public boolean mo40470a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        boolean z = true;
        try {
            for (Map.Entry next : this.f3666b.entrySet()) {
                cursor = null;
                cursor = sQLiteDatabase.query((String) next.getKey(), (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null);
                if (cursor == null) {
                    C3306cx.m2852a(cursor);
                    return false;
                }
                z &= mo40471a(cursor, (String) next.getKey(), (List) next.getValue());
                C3306cx.m2852a(cursor);
            }
            return z;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo40471a(Cursor cursor, String str, List<String> list) {
        List asList = Arrays.asList(cursor.getColumnNames());
        Collections.sort(asList);
        return list.equals(asList);
    }
}
