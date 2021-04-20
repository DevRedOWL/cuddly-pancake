package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import android.content.Intent;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.a */
final class C2347a extends SplitInstallSessionState {

    /* renamed from: a */
    private final int f2048a;

    /* renamed from: b */
    private final int f2049b;

    /* renamed from: c */
    private final int f2050c;

    /* renamed from: d */
    private final long f2051d;

    /* renamed from: e */
    private final long f2052e;

    /* renamed from: f */
    private final List<String> f2053f;

    /* renamed from: g */
    private final List<String> f2054g;

    /* renamed from: h */
    private final PendingIntent f2055h;

    /* renamed from: i */
    private final List<Intent> f2056i;

    C2347a(int i, int i2, int i3, long j, long j2, List<String> list, List<String> list2, PendingIntent pendingIntent, List<Intent> list3) {
        this.f2048a = i;
        this.f2049b = i2;
        this.f2050c = i3;
        this.f2051d = j;
        this.f2052e = j2;
        this.f2053f = list;
        this.f2054g = list2;
        this.f2055h = pendingIntent;
        this.f2056i = list3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List<String> mo33995a() {
        return this.f2053f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final List<String> mo33996b() {
        return this.f2054g;
    }

    public final long bytesDownloaded() {
        return this.f2051d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final List<Intent> mo33998c() {
        return this.f2056i;
    }

    public final boolean equals(Object obj) {
        List<String> list;
        List<String> list2;
        PendingIntent pendingIntent;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SplitInstallSessionState) {
            SplitInstallSessionState splitInstallSessionState = (SplitInstallSessionState) obj;
            if (this.f2048a == splitInstallSessionState.sessionId() && this.f2049b == splitInstallSessionState.status() && this.f2050c == splitInstallSessionState.errorCode() && this.f2051d == splitInstallSessionState.bytesDownloaded() && this.f2052e == splitInstallSessionState.totalBytesToDownload() && ((list = this.f2053f) != null ? list.equals(splitInstallSessionState.mo33995a()) : splitInstallSessionState.mo33995a() == null) && ((list2 = this.f2054g) != null ? list2.equals(splitInstallSessionState.mo33996b()) : splitInstallSessionState.mo33996b() == null) && ((pendingIntent = this.f2055h) != null ? pendingIntent.equals(splitInstallSessionState.resolutionIntent()) : splitInstallSessionState.resolutionIntent() == null)) {
                List<Intent> list3 = this.f2056i;
                List<Intent> c = splitInstallSessionState.mo33998c();
                if (list3 != null ? list3.equals(c) : c == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int errorCode() {
        return this.f2050c;
    }

    public final int hashCode() {
        int i = this.f2048a;
        int i2 = this.f2049b;
        int i3 = this.f2050c;
        long j = this.f2051d;
        long j2 = this.f2052e;
        int i4 = (((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        List<String> list = this.f2053f;
        int i5 = 0;
        int hashCode = (i4 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<String> list2 = this.f2054g;
        int hashCode2 = (hashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.f2055h;
        int hashCode3 = (hashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List<Intent> list3 = this.f2056i;
        if (list3 != null) {
            i5 = list3.hashCode();
        }
        return hashCode3 ^ i5;
    }

    @Deprecated
    public final PendingIntent resolutionIntent() {
        return this.f2055h;
    }

    public final int sessionId() {
        return this.f2048a;
    }

    public final int status() {
        return this.f2049b;
    }

    public final String toString() {
        int i = this.f2048a;
        int i2 = this.f2049b;
        int i3 = this.f2050c;
        long j = this.f2051d;
        long j2 = this.f2052e;
        String valueOf = String.valueOf(this.f2053f);
        String valueOf2 = String.valueOf(this.f2054g);
        String valueOf3 = String.valueOf(this.f2055h);
        String valueOf4 = String.valueOf(this.f2056i);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 251 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("SplitInstallSessionState{sessionId=");
        sb.append(i);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", errorCode=");
        sb.append(i3);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", moduleNamesNullable=");
        sb.append(valueOf);
        sb.append(", languagesNullable=");
        sb.append(valueOf2);
        sb.append(", resolutionIntent=");
        sb.append(valueOf3);
        sb.append(", splitFileIntents=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }

    public final long totalBytesToDownload() {
        return this.f2052e;
    }
}
