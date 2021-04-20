package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* renamed from: com.yandex.metrica.impl.ob.ln */
public class C3641ln {

    /* renamed from: a */
    private final Context f3667a;

    /* renamed from: b */
    private final String f3668b;

    /* renamed from: c */
    private File f3669c;

    /* renamed from: d */
    private FileLock f3670d;

    /* renamed from: e */
    private RandomAccessFile f3671e;

    /* renamed from: f */
    private FileChannel f3672f;

    public C3641ln(Context context, String str) {
        this.f3667a = context;
        this.f3668b = str;
    }

    /* renamed from: a */
    public synchronized void mo40474a() throws IOException {
        File filesDir = this.f3667a.getFilesDir();
        this.f3669c = new File(filesDir, new File(this.f3668b).getName() + ".lock");
        this.f3671e = new RandomAccessFile(this.f3669c, "rw");
        this.f3672f = this.f3671e.getChannel();
        this.f3670d = this.f3672f.lock();
    }

    /* renamed from: b */
    public synchronized void mo40475b() {
        String str = "";
        if (this.f3669c != null) {
            str = this.f3669c.getAbsolutePath();
        }
        C3137am.m2015a(str, this.f3670d);
        C3306cx.m2855a((Closeable) this.f3671e);
        C3306cx.m2855a((Closeable) this.f3672f);
        this.f3671e = null;
        this.f3670d = null;
        this.f3672f = null;
    }
}
