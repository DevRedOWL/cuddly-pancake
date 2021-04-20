package com.yandex.metrica.impl.p039ob;

import android.net.Uri;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.to */
public abstract class C4090to {

    /* renamed from: a */
    C4093tr f4923a;

    /* renamed from: b */
    Uri f4924b;

    /* renamed from: c */
    private Socket f4925c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo41449a();

    C4090to(Socket socket, Uri uri, C4093tr trVar) {
        this.f4925c = socket;
        this.f4924b = uri;
        this.f4923a = trVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41456a(String str, Map<String, String> map, byte[] bArr) {
        BufferedOutputStream bufferedOutputStream = null;
        try {
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(this.f4925c.getOutputStream());
            try {
                bufferedOutputStream2.write(str.getBytes());
                m5470a(bufferedOutputStream2);
                for (Map.Entry next : map.entrySet()) {
                    m5471a((OutputStream) bufferedOutputStream2, (String) next.getKey(), (String) next.getValue());
                }
                m5470a(bufferedOutputStream2);
                bufferedOutputStream2.write(bArr);
                bufferedOutputStream2.flush();
                this.f4923a.mo41459a(this.f4925c.getLocalPort());
                C3306cx.m2855a((Closeable) bufferedOutputStream2);
            } catch (IOException e) {
                e = e;
                bufferedOutputStream = bufferedOutputStream2;
                try {
                    this.f4923a.mo41462a("io_exception_during_sync", (Throwable) e);
                    C3306cx.m2855a((Closeable) bufferedOutputStream);
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream2 = bufferedOutputStream;
                    C3306cx.m2855a((Closeable) bufferedOutputStream2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                C3306cx.m2855a((Closeable) bufferedOutputStream2);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            this.f4923a.mo41462a("io_exception_during_sync", (Throwable) e);
            C3306cx.m2855a((Closeable) bufferedOutputStream);
        }
    }

    /* renamed from: a */
    private void m5471a(OutputStream outputStream, String str, String str2) throws IOException {
        outputStream.write((str + ": " + str2).getBytes());
        m5470a(outputStream);
    }

    /* renamed from: a */
    private void m5470a(OutputStream outputStream) throws IOException {
        outputStream.write("\r\n".getBytes());
    }
}
