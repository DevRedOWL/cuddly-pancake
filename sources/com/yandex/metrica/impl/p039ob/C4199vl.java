package com.yandex.metrica.impl.p039ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;

/* renamed from: com.yandex.metrica.impl.ob.vl */
public class C4199vl {
    /* renamed from: a */
    public static void m5870a(Cursor cursor, ContentValues contentValues) {
        if (Build.VERSION.SDK_INT >= 11) {
            m5871b(cursor, contentValues);
        } else {
            DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
        }
    }

    /* renamed from: b */
    public static void m5871b(Cursor cursor, ContentValues contentValues) {
        String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            int type = cursor.getType(i);
            if (type == 0) {
                contentValues.put(columnNames[i], cursor.getString(i));
            } else if (type == 1) {
                contentValues.put(columnNames[i], Long.valueOf(cursor.getLong(i)));
            } else if (type == 2) {
                contentValues.put(columnNames[i], Double.valueOf(cursor.getDouble(i)));
            } else if (type == 3) {
                contentValues.put(columnNames[i], cursor.getString(i));
            } else if (type != 4) {
                contentValues.put(columnNames[i], cursor.getString(i));
            } else {
                contentValues.put(columnNames[i], cursor.getBlob(i));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.String[], android.database.Cursor] */
    /* renamed from: a */
    public static long m5869a(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursor = 0;
        try {
            cursor = sQLiteDatabase.rawQuery("SELECT count() FROM " + str, cursor);
            return cursor.moveToFirst() ? cursor.getLong(0) : 0;
        } finally {
            C3306cx.m2852a((Cursor) cursor);
        }
    }
}
