package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.Closeable;

/* renamed from: com.yandex.metrica.impl.ob.lc */
public class C3627lc extends SQLiteOpenHelper implements Closeable {

    /* renamed from: a */
    protected final C3635lj f3631a;

    /* renamed from: b */
    private final String f3632b;

    /* renamed from: c */
    private final C4216vz f3633c;

    /* renamed from: d */
    private final Context f3634d;

    public C3627lc(Context context, String str, C3635lj ljVar) {
        this(context, str, ljVar, C4206vr.m5905a());
    }

    C3627lc(Context context, String str, C3635lj ljVar, C4216vz vzVar) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, C3644lq.f3680b);
        this.f3634d = context;
        this.f3631a = ljVar;
        this.f3632b = str;
        this.f3633c = vzVar;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.f3631a.mo40467b(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f3631a.mo40465a(sQLiteDatabase, i, i2);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        this.f3631a.mo40464a(sQLiteDatabase);
    }

    public SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable th) {
            this.f3633c.mo41682a(th, "", new Object[0]);
            this.f3633c.mo41687c("Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f3632b);
            C4085tl.m5459a(this.f3634d).reportError("db_read_error", th);
            return null;
        }
    }

    public SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable th) {
            this.f3633c.mo41682a(th, "", new Object[0]);
            this.f3633c.mo41687c("Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f3632b);
            C4085tl.m5459a(this.f3634d).reportError("db_write_error", th);
            return null;
        }
    }
}
