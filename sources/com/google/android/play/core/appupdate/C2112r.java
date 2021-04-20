package com.google.android.play.core.appupdate;

import android.app.PendingIntent;

/* renamed from: com.google.android.play.core.appupdate.r */
final class C2112r extends AppUpdateInfo {

    /* renamed from: a */
    private final String f1454a;

    /* renamed from: b */
    private final int f1455b;

    /* renamed from: c */
    private final int f1456c;

    /* renamed from: d */
    private final int f1457d;

    /* renamed from: e */
    private final Integer f1458e;

    /* renamed from: f */
    private final int f1459f;

    /* renamed from: g */
    private final long f1460g;

    /* renamed from: h */
    private final long f1461h;

    /* renamed from: i */
    private final long f1462i;

    /* renamed from: j */
    private final long f1463j;

    /* renamed from: k */
    private final PendingIntent f1464k;

    /* renamed from: l */
    private final PendingIntent f1465l;

    /* renamed from: m */
    private final PendingIntent f1466m;

    /* renamed from: n */
    private final PendingIntent f1467n;

    C2112r(String str, int i, int i2, int i3, Integer num, int i4, long j, long j2, long j3, long j4, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        String str2 = str;
        if (str2 != null) {
            this.f1454a = str2;
            this.f1455b = i;
            this.f1456c = i2;
            this.f1457d = i3;
            this.f1458e = num;
            this.f1459f = i4;
            this.f1460g = j;
            this.f1461h = j2;
            this.f1462i = j3;
            this.f1463j = j4;
            this.f1464k = pendingIntent;
            this.f1465l = pendingIntent2;
            this.f1466m = pendingIntent3;
            this.f1467n = pendingIntent4;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    public final int availableVersionCode() {
        return this.f1455b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final long mo33492b() {
        return this.f1462i;
    }

    public final long bytesDownloaded() {
        return this.f1460g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final long mo33494c() {
        return this.f1463j;
    }

    public final Integer clientVersionStalenessDays() {
        return this.f1458e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final PendingIntent mo33496d() {
        return this.f1464k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final PendingIntent mo33497e() {
        return this.f1465l;
    }

    public final boolean equals(Object obj) {
        Integer num;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        PendingIntent pendingIntent3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AppUpdateInfo) {
            AppUpdateInfo appUpdateInfo = (AppUpdateInfo) obj;
            if (this.f1454a.equals(appUpdateInfo.packageName()) && this.f1455b == appUpdateInfo.availableVersionCode() && this.f1456c == appUpdateInfo.updateAvailability() && this.f1457d == appUpdateInfo.installStatus() && ((num = this.f1458e) != null ? num.equals(appUpdateInfo.clientVersionStalenessDays()) : appUpdateInfo.clientVersionStalenessDays() == null) && this.f1459f == appUpdateInfo.updatePriority() && this.f1460g == appUpdateInfo.bytesDownloaded() && this.f1461h == appUpdateInfo.totalBytesToDownload() && this.f1462i == appUpdateInfo.mo33492b() && this.f1463j == appUpdateInfo.mo33494c() && ((pendingIntent = this.f1464k) != null ? pendingIntent.equals(appUpdateInfo.mo33496d()) : appUpdateInfo.mo33496d() == null) && ((pendingIntent2 = this.f1465l) != null ? pendingIntent2.equals(appUpdateInfo.mo33497e()) : appUpdateInfo.mo33497e() == null) && ((pendingIntent3 = this.f1466m) != null ? pendingIntent3.equals(appUpdateInfo.mo33498f()) : appUpdateInfo.mo33498f() == null)) {
                PendingIntent pendingIntent4 = this.f1467n;
                PendingIntent g = appUpdateInfo.mo33499g();
                if (pendingIntent4 != null ? pendingIntent4.equals(g) : g == null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final PendingIntent mo33498f() {
        return this.f1466m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final PendingIntent mo33499g() {
        return this.f1467n;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f1454a.hashCode() ^ 1000003) * 1000003) ^ this.f1455b) * 1000003) ^ this.f1456c) * 1000003) ^ this.f1457d) * 1000003;
        Integer num = this.f1458e;
        int i = 0;
        int hashCode2 = num == null ? 0 : num.hashCode();
        int i2 = this.f1459f;
        long j = this.f1460g;
        long j2 = this.f1461h;
        long j3 = this.f1462i;
        long j4 = this.f1463j;
        int i3 = (((((((((((hashCode ^ hashCode2) * 1000003) ^ i2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        PendingIntent pendingIntent = this.f1464k;
        int hashCode3 = (i3 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        PendingIntent pendingIntent2 = this.f1465l;
        int hashCode4 = (hashCode3 ^ (pendingIntent2 == null ? 0 : pendingIntent2.hashCode())) * 1000003;
        PendingIntent pendingIntent3 = this.f1466m;
        int hashCode5 = (hashCode4 ^ (pendingIntent3 == null ? 0 : pendingIntent3.hashCode())) * 1000003;
        PendingIntent pendingIntent4 = this.f1467n;
        if (pendingIntent4 != null) {
            i = pendingIntent4.hashCode();
        }
        return hashCode5 ^ i;
    }

    public final int installStatus() {
        return this.f1457d;
    }

    public final String packageName() {
        return this.f1454a;
    }

    public final String toString() {
        String str = this.f1454a;
        int i = this.f1455b;
        int i2 = this.f1456c;
        int i3 = this.f1457d;
        String valueOf = String.valueOf(this.f1458e);
        int i4 = this.f1459f;
        long j = this.f1460g;
        long j2 = this.f1461h;
        long j3 = this.f1462i;
        long j4 = this.f1463j;
        String valueOf2 = String.valueOf(this.f1464k);
        long j5 = j4;
        String valueOf3 = String.valueOf(this.f1465l);
        String valueOf4 = String.valueOf(this.f1466m);
        long j6 = j3;
        String valueOf5 = String.valueOf(this.f1467n);
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 463 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("AppUpdateInfo{packageName=");
        sb.append(str);
        sb.append(", availableVersionCode=");
        sb.append(i);
        sb.append(", updateAvailability=");
        sb.append(i2);
        sb.append(", installStatus=");
        sb.append(i3);
        sb.append(", clientVersionStalenessDays=");
        sb.append(valueOf);
        sb.append(", updatePriority=");
        sb.append(i4);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", additionalSpaceRequired=");
        sb.append(j6);
        sb.append(", assetPackStorageSize=");
        sb.append(j5);
        sb.append(", immediateUpdateIntent=");
        sb.append(valueOf2);
        sb.append(", flexibleUpdateIntent=");
        sb.append(valueOf3);
        sb.append(", immediateDestructiveUpdateIntent=");
        sb.append(valueOf4);
        sb.append(", flexibleDestructiveUpdateIntent=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }

    public final long totalBytesToDownload() {
        return this.f1461h;
    }

    public final int updateAvailability() {
        return this.f1456c;
    }

    public final int updatePriority() {
        return this.f1459f;
    }
}
