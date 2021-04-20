package com.google.android.play.core.splitcompat;

import android.util.Log;
import com.google.android.play.core.internal.C2287bz;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.google.android.play.core.splitcompat.g */
final class C2336g implements C2338i {

    /* renamed from: a */
    final /* synthetic */ Set f2026a;

    /* renamed from: b */
    final /* synthetic */ C2346q f2027b;

    /* renamed from: c */
    final /* synthetic */ ZipFile f2028c;

    C2336g(Set set, C2346q qVar, ZipFile zipFile) {
        this.f2026a = set;
        this.f2027b = qVar;
        this.f2028c = zipFile;
    }

    /* renamed from: a */
    public final void mo33960a(C2339j jVar, File file, boolean z) throws IOException {
        FileOutputStream fileOutputStream;
        this.f2026a.add(file);
        if (!z) {
            Log.i("SplitCompat", String.format("NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'", new Object[]{this.f2027b.mo33969b(), jVar.f2029a, this.f2027b.mo33968a().getAbsolutePath(), jVar.f2030b.getName(), file.getAbsolutePath()}));
            ZipFile zipFile = this.f2028c;
            ZipEntry zipEntry = jVar.f2030b;
            int i = C2340k.f2031a;
            byte[] bArr = new byte[4096];
            InputStream inputStream = zipFile.getInputStream(zipEntry);
            try {
                fileOutputStream = new FileOutputStream(file);
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                fileOutputStream.close();
                if (inputStream != null) {
                    inputStream.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        C2287bz.m1273a(th, th2);
                    }
                }
                throw th;
            }
        } else {
            return;
        }
        throw th;
    }
}
