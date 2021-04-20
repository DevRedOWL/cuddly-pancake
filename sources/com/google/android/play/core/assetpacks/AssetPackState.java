package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.google.android.play.core.internal.C2299i;

public abstract class AssetPackState {
    /* renamed from: b */
    public static AssetPackState m815b(String str, int i, int i2, long j, long j2, double d, int i3) {
        return new C2143ay(str, i, i2, j, j2, (int) Math.rint(100.0d * d), i3);
    }

    /* renamed from: c */
    static AssetPackState m816c(Bundle bundle, String str, C2159bn bnVar, C2136ar arVar) {
        Bundle bundle2 = bundle;
        String str2 = str;
        int a = arVar.mo33629a(bundle2.getInt(C2299i.m1294e(NotificationCompat.CATEGORY_STATUS, str2)), str2);
        int i = bundle2.getInt(C2299i.m1294e("error_code", str2));
        long j = bundle2.getLong(C2299i.m1294e("bytes_downloaded", str2));
        long j2 = bundle2.getLong(C2299i.m1294e("total_bytes_to_download", str2));
        double b = bnVar.mo33697b(str2);
        long j3 = bundle2.getLong(C2299i.m1294e("pack_version", str2));
        long j4 = bundle2.getLong(C2299i.m1294e("pack_base_version", str2));
        return m815b(str, a, i, j, j2, b, (a != 4 || j4 == 0 || j4 == j3) ? 1 : 2);
    }

    /* renamed from: a */
    public abstract int mo33583a();

    public abstract long bytesDownloaded();

    public abstract int errorCode();

    public abstract String name();

    public abstract int status();

    public abstract long totalBytesToDownload();

    public abstract int transferProgressPercentage();
}
