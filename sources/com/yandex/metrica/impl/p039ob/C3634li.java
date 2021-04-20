package com.yandex.metrica.impl.p039ob;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.li */
public class C3634li {

    /* renamed from: a */
    private final C3640lm f3658a;

    /* renamed from: b */
    private String f3659b;

    public C3634li(C3627lc lcVar, String str) {
        this((C3640lm) new C3643lp(lcVar), str);
    }

    C3634li(C3640lm lmVar, String str) {
        this.f3658a = lmVar;
        this.f3659b = str;
    }

    /* renamed from: a */
    public List<C3835pu> mo40462a() {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f3658a.mo40472a();
            if (sQLiteDatabase != null) {
                try {
                    cursor = sQLiteDatabase.query(this.f3659b, (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null);
                    if (cursor != null) {
                        try {
                            if (cursor.moveToFirst()) {
                                ArrayList arrayList = new ArrayList();
                                do {
                                    arrayList.add(new C3835pu(cursor.getString(cursor.getColumnIndex("name")), cursor.getLong(cursor.getColumnIndex("granted")) == 1));
                                } while (cursor.moveToNext());
                                this.f3658a.mo40473a(sQLiteDatabase);
                                C3306cx.m2852a(cursor);
                                return arrayList;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable unused2) {
                }
                this.f3658a.mo40473a(sQLiteDatabase);
                C3306cx.m2852a(cursor);
                return null;
            }
            cursor = null;
        } catch (Throwable unused3) {
            sQLiteDatabase = null;
            cursor = null;
        }
        this.f3658a.mo40473a(sQLiteDatabase);
        C3306cx.m2852a(cursor);
        return null;
    }

    /* renamed from: b */
    public void mo40463b() {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = this.f3658a.mo40472a();
            if (sQLiteDatabase != null) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS permissions");
            }
        } catch (Throwable unused) {
        }
        this.f3658a.mo40473a(sQLiteDatabase);
    }
}
