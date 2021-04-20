package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.support.p001v4.media.session.PlaybackStateCompat;
import android.util.Base64;
import com.google.android.play.core.internal.C2258ax;
import com.google.android.play.core.internal.C2287bz;
import com.google.android.play.core.splitcompat.C2345p;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipException;

/* renamed from: com.google.android.play.core.assetpacks.ck */
public final class C2183ck {

    /* renamed from: a */
    private static C2118a f1746a;

    /* renamed from: a */
    static String m1013a(List<File> list) throws NoSuchAlgorithmException, IOException {
        int read;
        MessageDigest instance = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[8192];
        for (File fileInputStream : list) {
            FileInputStream fileInputStream2 = new FileInputStream(fileInputStream);
            do {
                try {
                    read = fileInputStream2.read(bArr);
                    if (read > 0) {
                        instance.update(bArr, 0, read);
                    }
                } catch (Throwable th) {
                    C2287bz.m1273a(th, th);
                }
            } while (read != -1);
            fileInputStream2.close();
        }
        return Base64.encodeToString(instance.digest(), 11);
        throw th;
    }

    /* renamed from: b */
    static AssetLocation m1014b(String str, String str2) throws IOException {
        Long l;
        String str3 = str;
        String str4 = str2;
        C2258ax.m1182c(str3 != null, "Attempted to get file location from a null apk path.");
        C2258ax.m1182c(str4 != null, String.format("Attempted to get file location in apk %s with a null file path.", new Object[]{str3}));
        RandomAccessFile randomAccessFile = new RandomAccessFile(str3, "r");
        byte[] bArr = new byte[22];
        randomAccessFile.seek(randomAccessFile.length() - 22);
        randomAccessFile.readFully(bArr);
        C2146ba k = m1015c(bArr, 0) == 1347093766 ? m1023k(bArr) : null;
        byte b = 5;
        if (k == null) {
            long length = randomAccessFile.length() - 22;
            long j = -65536 + length;
            if (j < 0) {
                j = 0;
            }
            int min = (int) Math.min(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID, randomAccessFile.length());
            byte[] bArr2 = new byte[min];
            byte[] bArr3 = new byte[22];
            loop0:
            while (true) {
                long max = Math.max(3 + (length - ((long) min)), j);
                randomAccessFile.seek(max);
                randomAccessFile.readFully(bArr2);
                for (int i = min - 4; i >= 0; i -= 4) {
                    byte b2 = bArr2[i];
                    int i2 = b2 != b ? b2 != 6 ? b2 != 75 ? b2 != 80 ? -1 : 0 : 1 : 3 : 2;
                    if (i2 >= 0 && i >= i2 && m1015c(bArr2, i - i2) == 1347093766) {
                        randomAccessFile.seek((max + ((long) i)) - ((long) i2));
                        randomAccessFile.readFully(bArr3);
                        k = m1023k(bArr3);
                        break loop0;
                    }
                    b = 5;
                }
                if (max != j) {
                    length = max;
                } else {
                    throw new ZipException(String.format("End Of Central Directory signature not found in APK %s", new Object[]{str3}));
                }
            }
        }
        long j2 = k.f1588a;
        byte[] bytes = str4.getBytes("UTF-8");
        byte[] bArr4 = new byte[46];
        byte[] bArr5 = new byte[str2.length()];
        long j3 = j2;
        int i3 = 0;
        while (true) {
            if (i3 >= k.f1589b) {
                l = null;
                break;
            }
            randomAccessFile.seek(j3);
            randomAccessFile.readFully(bArr4);
            int c = m1015c(bArr4, 0);
            if (c == 1347092738) {
                randomAccessFile.seek(j3 + 28);
                int e = m1017e(bArr4, 28);
                if (e == str2.length()) {
                    randomAccessFile.seek(46 + j3);
                    randomAccessFile.read(bArr5);
                    if (Arrays.equals(bArr5, bytes)) {
                        l = Long.valueOf(m1016d(bArr4, 42));
                        break;
                    }
                }
                j3 += (long) (e + 46 + m1017e(bArr4, 30) + m1017e(bArr4, 32));
                i3++;
            } else {
                throw new ZipException(String.format("Missing central directory file header signature when looking for file %s in APK %s. Read %d entries out of %d. Found %d instead of the header signature %d.", new Object[]{str4, str3, Integer.valueOf(i3), Integer.valueOf(k.f1589b), Integer.valueOf(c), 1347092738}));
            }
        }
        if (l == null) {
            return null;
        }
        long longValue = l.longValue();
        byte[] bArr6 = new byte[8];
        randomAccessFile.seek(22 + longValue);
        randomAccessFile.readFully(bArr6);
        return AssetLocation.m812a(str3, longValue + 30 + ((long) m1017e(bArr6, 4)) + ((long) m1017e(bArr6, 6)), m1016d(bArr6, 0));
    }

    /* renamed from: c */
    static int m1015c(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: d */
    static long m1016d(byte[] bArr, int i) {
        return ((long) ((m1017e(bArr, i + 2) << 16) | m1017e(bArr, i))) & 4294967295L;
    }

    /* renamed from: e */
    static int m1017e(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: f */
    public static boolean m1018f(int i) {
        return i == 1 || i == 7 || i == 2 || i == 3;
    }

    /* renamed from: g */
    public static boolean m1019g(int i) {
        return i == 5 || i == 6 || i == 4;
    }

    /* renamed from: h */
    public static boolean m1020h(int i) {
        return i == 2 || i == 7 || i == 3;
    }

    /* renamed from: i */
    static boolean m1021i(int i, int i2) {
        if (i == 5) {
            if (i2 != 5) {
                return true;
            }
            i = 5;
        }
        if (i == 6 && i2 != 6 && i2 != 5) {
            return true;
        }
        if (i == 4 && i2 != 4) {
            return true;
        }
        if (i == 3 && (i2 == 2 || i2 == 7 || i2 == 1 || i2 == 8)) {
            return true;
        }
        if (i == 2) {
            return i2 == 1 || i2 == 8;
        }
        return false;
    }

    /* renamed from: j */
    static synchronized C2118a m1022j(Context context) {
        C2118a aVar;
        synchronized (C2183ck.class) {
            if (f1746a == null) {
                C2151bf bfVar = new C2151bf((byte[]) null);
                bfVar.mo33689b(new C2212l(C2345p.m1447c(context)));
                f1746a = bfVar.mo33688a();
            }
            aVar = f1746a;
        }
        return aVar;
    }

    /* renamed from: k */
    private static C2146ba m1023k(byte[] bArr) {
        int e = m1017e(bArr, 10);
        m1016d(bArr, 12);
        return new C2146ba(m1016d(bArr, 16), e);
    }
}
