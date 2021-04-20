package com.google.android.play.core.assetpacks;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.play.core.internal.C2241ag;
import com.google.android.play.core.internal.C2287bz;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;

/* renamed from: com.google.android.play.core.assetpacks.cz */
final class C2198cz {

    /* renamed from: a */
    private static final C2241ag f1802a = new C2241ag("SliceMetadataManager");

    /* renamed from: b */
    private final byte[] f1803b = new byte[8192];

    /* renamed from: c */
    private final C2138at f1804c;

    /* renamed from: d */
    private final String f1805d;

    /* renamed from: e */
    private final int f1806e;

    /* renamed from: f */
    private final long f1807f;

    /* renamed from: g */
    private final String f1808g;

    /* renamed from: h */
    private int f1809h;

    C2198cz(C2138at atVar, String str, int i, long j, String str2) {
        this.f1804c = atVar;
        this.f1805d = str;
        this.f1806e = i;
        this.f1807f = j;
        this.f1808g = str2;
        this.f1809h = -1;
    }

    /* renamed from: n */
    private final File m1044n() {
        File o = this.f1804c.mo33647o(this.f1805d, this.f1806e, this.f1807f, this.f1808g);
        if (!o.exists()) {
            o.mkdirs();
        }
        return o;
    }

    /* renamed from: o */
    private final File m1045o() throws IOException {
        File m = this.f1804c.mo33645m(this.f1805d, this.f1806e, this.f1807f, this.f1808g);
        m.getParentFile().mkdirs();
        m.createNewFile();
        return m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33750a(String str, long j, long j2, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j));
        properties.put("remainingBytes", String.valueOf(j2));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f1809h));
        FileOutputStream fileOutputStream = new FileOutputStream(m1045o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            C2287bz.m1273a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo33751b(byte[] bArr, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f1809h));
        FileOutputStream fileOutputStream = new FileOutputStream(m1045o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            File n = this.f1804c.mo33646n(this.f1805d, this.f1806e, this.f1807f, this.f1808g);
            if (n.exists()) {
                n.delete();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(n);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
                return;
            } catch (Throwable th) {
                C2287bz.m1273a(th, th);
            }
            throw th;
            throw th;
        } catch (Throwable th2) {
            C2287bz.m1273a(th, th2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo33752c(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", ExifInterface.GPS_MEASUREMENT_3D);
        properties.put("fileOffset", String.valueOf(mo33759j().length()));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f1809h));
        FileOutputStream fileOutputStream = new FileOutputStream(m1045o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            C2287bz.m1273a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo33753d(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f1809h));
        FileOutputStream fileOutputStream = new FileOutputStream(m1045o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            C2287bz.m1273a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C2197cy mo33754e() throws IOException {
        File m = this.f1804c.mo33645m(this.f1805d, this.f1806e, this.f1807f, this.f1808g);
        if (m.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(m);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                    throw new C2155bj("Slice checkpoint file corrupt.");
                }
                try {
                    int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                    String property = properties.getProperty("fileName");
                    long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                    long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                    int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                    this.f1809h = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                    return new C2197cy(parseInt, property, parseLong, parseLong2, parseInt2);
                } catch (NumberFormatException e) {
                    throw new C2155bj("Slice checkpoint file corrupt.", (Exception) e);
                }
            } catch (Throwable th) {
                C2287bz.m1273a(th, th);
            }
        } else {
            throw new C2155bj("Slice checkpoint file does not exist.");
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo33755f(InputStream inputStream, long j) throws IOException {
        int read;
        RandomAccessFile randomAccessFile = new RandomAccessFile(mo33759j(), "rw");
        try {
            randomAccessFile.seek(j);
            do {
                read = inputStream.read(this.f1803b);
                if (read > 0) {
                    randomAccessFile.write(this.f1803b, 0, read);
                }
            } while (read == 8192);
            randomAccessFile.close();
            return;
        } catch (Throwable th) {
            C2287bz.m1273a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo33756g(byte[] bArr) throws IOException {
        FileOutputStream fileOutputStream;
        this.f1809h++;
        try {
            fileOutputStream = new FileOutputStream(new File(m1044n(), String.format("%s-LFH.dat", new Object[]{Integer.valueOf(this.f1809h)})));
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            return;
        } catch (IOException e) {
            throw new C2155bj("Could not write metadata file.", (Exception) e);
        } catch (Throwable th) {
            C2287bz.m1273a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo33757h(byte[] bArr, InputStream inputStream) throws IOException {
        this.f1809h++;
        FileOutputStream fileOutputStream = new FileOutputStream(mo33759j());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.f1803b);
            while (read > 0) {
                fileOutputStream.write(this.f1803b, 0, read);
                read = inputStream.read(this.f1803b);
            }
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            C2287bz.m1273a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo33758i(long j, byte[] bArr, int i, int i2) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(mo33759j(), "rw");
        try {
            randomAccessFile.seek(j);
            randomAccessFile.write(bArr, i, i2);
            randomAccessFile.close();
            return;
        } catch (Throwable th) {
            C2287bz.m1273a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final File mo33759j() {
        return new File(m1044n(), String.format("%s-NAM.dat", new Object[]{Integer.valueOf(this.f1809h)}));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final int mo33760k() throws IOException {
        File m = this.f1804c.mo33645m(this.f1805d, this.f1806e, this.f1807f, this.f1808g);
        if (!m.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(m);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new C2155bj("Slice checkpoint file corrupt.");
        } catch (Throwable th) {
            C2287bz.m1273a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo33761l() {
        FileInputStream fileInputStream;
        File m = this.f1804c.mo33645m(this.f1805d, this.f1806e, this.f1807f, this.f1808g);
        if (!m.exists()) {
            return false;
        }
        try {
            fileInputStream = new FileInputStream(m);
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("fileStatus") != null) {
                return Integer.parseInt(properties.getProperty("fileStatus")) == 4;
            }
            f1802a.mo33809b("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
            return false;
        } catch (IOException e) {
            f1802a.mo33809b("Could not read checkpoint while checking if extraction finished. %s", e);
            return false;
        } catch (Throwable th) {
            C2287bz.m1273a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo33762m(byte[] bArr, int i) throws IOException {
        this.f1809h++;
        FileOutputStream fileOutputStream = new FileOutputStream(mo33759j());
        try {
            fileOutputStream.write(bArr, 0, i);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            C2287bz.m1273a(th, th);
        }
        throw th;
    }
}
