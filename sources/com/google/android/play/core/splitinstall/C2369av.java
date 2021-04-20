package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collection;
import java.util.Set;

/* renamed from: com.google.android.play.core.splitinstall.av */
final class C2369av {

    /* renamed from: a */
    private final Context f2091a;

    C2369av(Context context) {
        this.f2091a = context;
    }

    /* renamed from: c */
    private final SharedPreferences m1506c() {
        return this.f2091a.getSharedPreferences("playcore_split_install_internal", 0);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        return new java.util.HashSet();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        return r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001b */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.Set<java.lang.String> mo34018a() {
        /*
            r3 = this;
            monitor-enter(r3)
            android.content.SharedPreferences r0 = r3.m1506c()     // Catch:{ Exception -> 0x001b }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ Exception -> 0x001b }
            r1.<init>()     // Catch:{ Exception -> 0x001b }
            java.lang.String r2 = "deferred_uninstall_module_list"
            java.util.Set r0 = r0.getStringSet(r2, r1)     // Catch:{ Exception -> 0x001b }
            if (r0 != 0) goto L_0x0017
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ Exception -> 0x001b }
            r0.<init>()     // Catch:{ Exception -> 0x001b }
        L_0x0017:
            monitor-exit(r3)
            return r0
        L_0x0019:
            r0 = move-exception
            goto L_0x0022
        L_0x001b:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0019 }
            r0.<init>()     // Catch:{ all -> 0x0019 }
            monitor-exit(r3)
            return r0
        L_0x0022:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitinstall.C2369av.mo34018a():java.util.Set");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo34019b(Collection<String> collection) {
        Set<String> a = mo34018a();
        boolean z = false;
        for (String add : collection) {
            z |= a.add(add);
        }
        if (z) {
            try {
                m1506c().edit().putStringSet("deferred_uninstall_module_list", a).apply();
            } catch (Exception unused) {
            }
        }
    }
}
