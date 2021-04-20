package com.yandex.metrica.impl.p039ob;

import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.support.p001v4.media.session.PlaybackStateCompat;
import java.util.UUID;

/* renamed from: com.yandex.metrica.impl.ob.ad */
public class C3121ad {

    /* renamed from: a */
    private final Context f2489a;

    /* renamed from: b */
    private final C3123b f2490b;

    /* renamed from: com.yandex.metrica.impl.ob.ad$b */
    static class C3123b {
        C3123b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public StatFs mo39459a() {
            return new StatFs(Environment.getDataDirectory().getAbsolutePath());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ad$a */
    public static class C3122a {

        /* renamed from: a */
        public final long f2491a;

        /* renamed from: b */
        public final long f2492b;

        public C3122a(long j, long j2) {
            this.f2491a = j;
            this.f2492b = j2;
        }
    }

    public C3121ad(Context context) {
        this(context, new C3123b());
    }

    C3121ad(Context context, C3123b bVar) {
        this.f2489a = context;
        this.f2490b = bVar;
    }

    /* renamed from: a */
    public C3122a mo39458a() {
        if (C3306cx.m2857a(26)) {
            return m1930b();
        }
        if (C3306cx.m2857a(18)) {
            return m1931c();
        }
        return m1932d();
    }

    /* renamed from: b */
    private C3122a m1930b() {
        long j;
        StorageStatsManager storageStatsManager = (StorageStatsManager) this.f2489a.getSystemService("storagestats");
        StorageManager storageManager = (StorageManager) this.f2489a.getSystemService("storage");
        long j2 = 0;
        if (storageManager == null || storageStatsManager == null) {
            j = 0;
        } else {
            long j3 = 0;
            for (StorageVolume uuid : storageManager.getStorageVolumes()) {
                try {
                    String uuid2 = uuid.getUuid();
                    UUID fromString = uuid2 == null ? StorageManager.UUID_DEFAULT : UUID.fromString(uuid2);
                    j3 += storageStatsManager.getTotalBytes(fromString);
                    j2 += storageStatsManager.getFreeBytes(fromString);
                } catch (Throwable unused) {
                }
            }
            j = j2;
            j2 = j3;
        }
        return new C3122a(j2 / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID, j / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
    }

    /* renamed from: c */
    private C3122a m1931c() {
        try {
            StatFs a = this.f2490b.mo39459a();
            long blockSizeLong = a.getBlockSizeLong();
            return new C3122a((a.getBlockCountLong() * blockSizeLong) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID, (a.getAvailableBlocksLong() * blockSizeLong) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
        } catch (Throwable unused) {
            return new C3122a(0, 0);
        }
    }

    /* renamed from: d */
    private C3122a m1932d() {
        try {
            StatFs a = this.f2490b.mo39459a();
            long blockSize = (long) a.getBlockSize();
            return new C3122a((((long) a.getBlockCount()) * blockSize) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID, (((long) a.getAvailableBlocks()) * blockSize) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
        } catch (Throwable unused) {
            return new C3122a(0, 0);
        }
    }
}
