package com.yandex.metrica.impl.p039ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.yandex.metrica.impl.ob.kx */
public class C3617kx {

    /* renamed from: a */
    private final C3640lm f3588a;

    /* renamed from: b */
    private final String f3589b;

    public C3617kx(C3640lm lmVar, String str) {
        this.f3588a = lmVar;
        this.f3589b = str;
    }

    /* renamed from: a */
    public void mo40394a(String str, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f3588a.mo40472a();
            if (sQLiteDatabase != null) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("data_key", str);
                    contentValues.put("value", bArr);
                    sQLiteDatabase.insertWithOnConflict(this.f3589b, (String) null, contentValues, 5);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabase = null;
        }
        this.f3588a.mo40473a(sQLiteDatabase);
    }

    /* renamed from: a */
    public byte[] mo40395a(String str) {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f3588a.mo40472a();
            if (sQLiteDatabase != null) {
                try {
                    cursor = sQLiteDatabase.query(this.f3589b, (String[]) null, "data_key = ?", new String[]{str}, (String) null, (String) null, (String) null);
                    if (cursor != null) {
                        try {
                            if (cursor.getCount() == 1 && cursor.moveToFirst()) {
                                byte[] blob = cursor.getBlob(cursor.getColumnIndex("value"));
                                C3306cx.m2852a(cursor);
                                this.f3588a.mo40473a(sQLiteDatabase);
                                return blob;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    C3306cx.m2870b(cursor);
                } catch (Throwable unused2) {
                }
                C3306cx.m2852a(cursor);
                this.f3588a.mo40473a(sQLiteDatabase);
                return null;
            }
            cursor = null;
        } catch (Throwable unused3) {
            cursor = null;
            sQLiteDatabase = null;
        }
        C3306cx.m2852a(cursor);
        this.f3588a.mo40473a(sQLiteDatabase);
        return null;
    }
}
