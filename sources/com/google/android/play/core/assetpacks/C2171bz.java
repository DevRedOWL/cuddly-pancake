package com.google.android.play.core.assetpacks;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.google.android.play.core.internal.C2241ag;
import com.google.android.play.core.internal.C2289ca;
import com.google.android.play.core.internal.C2299i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.google.android.play.core.assetpacks.bz */
final class C2171bz {

    /* renamed from: a */
    private static final C2241ag f1700a = new C2241ag("ExtractorSessionStoreView");

    /* renamed from: b */
    private final C2138at f1701b;

    /* renamed from: c */
    private final C2289ca<C2220s> f1702c;

    /* renamed from: d */
    private final C2159bn f1703d;

    /* renamed from: e */
    private final C2289ca<Executor> f1704e;

    /* renamed from: f */
    private final Map<Integer, C2168bw> f1705f = new HashMap();

    /* renamed from: g */
    private final ReentrantLock f1706g = new ReentrantLock();

    C2171bz(C2138at atVar, C2289ca<C2220s> caVar, C2159bn bnVar, C2289ca<Executor> caVar2) {
        this.f1701b = atVar;
        this.f1702c = caVar;
        this.f1703d = bnVar;
        this.f1704e = caVar2;
    }

    /* renamed from: q */
    private final Map<String, C2168bw> m967q(List<String> list) {
        return (Map) m968r(new C2164bs(this, list, (byte[]) null));
    }

    /* renamed from: r */
    private final <T> T m968r(C2170by<T> byVar) {
        try {
            mo33701a();
            return byVar.mo33699a();
        } finally {
            mo33702b();
        }
    }

    /* renamed from: s */
    private final C2168bw m969s(int i) {
        Map<Integer, C2168bw> map = this.f1705f;
        Integer valueOf = Integer.valueOf(i);
        C2168bw bwVar = map.get(valueOf);
        if (bwVar != null) {
            return bwVar;
        }
        throw new C2155bj(String.format("Could not find session %d while trying to get it", new Object[]{valueOf}), i);
    }

    /* renamed from: t */
    private static String m970t(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            return stringArrayList.get(0);
        }
        throw new C2155bj("Session without pack received.");
    }

    /* renamed from: u */
    private static <T> List<T> m971u(List<T> list) {
        return list == null ? Collections.emptyList() : list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33701a() {
        this.f1706g.lock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo33702b() {
        this.f1706g.unlock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Map<Integer, C2168bw> mo33703c() {
        return this.f1705f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo33704d(Bundle bundle) {
        return ((Boolean) m968r(new C2161bp(this, bundle, (byte[]) null))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo33705e(Bundle bundle) {
        return ((Boolean) m968r(new C2161bp(this, bundle))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo33706f(String str, int i, long j) {
        m968r(new C2162bq(this, str, i, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo33707g(int i) {
        m968r(new C2163br(this, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final Map<String, Integer> mo33708h(List<String> list) {
        return (Map) m968r(new C2164bs(this, list));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ Map mo33709i(List list) {
        int i;
        Map<String, C2168bw> q = m967q(list);
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C2168bw bwVar = q.get(str);
            if (bwVar == null) {
                i = 8;
            } else {
                if (C2183ck.m1018f(bwVar.f1693c.f1688c)) {
                    try {
                        bwVar.f1693c.f1688c = 6;
                        this.f1704e.mo33869a().execute(new C2165bt(this, bwVar));
                        this.f1703d.mo33696a(str);
                    } catch (C2155bj unused) {
                        f1700a.mo33811d("Session %d with pack %s does not exist, no need to cancel.", Integer.valueOf(bwVar.f1691a), str);
                    }
                }
                i = bwVar.f1693c.f1688c;
            }
            hashMap.put(str, Integer.valueOf(i));
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ Map mo33710j(List list) {
        HashMap hashMap = new HashMap();
        for (C2168bw next : this.f1705f.values()) {
            String str = next.f1693c.f1686a;
            if (list.contains(str)) {
                C2168bw bwVar = (C2168bw) hashMap.get(str);
                if ((bwVar == null ? -1 : bwVar.f1691a) < next.f1691a) {
                    hashMap.put(str, next);
                }
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ Boolean mo33711k(Bundle bundle) {
        boolean z;
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return true;
        }
        Map<Integer, C2168bw> map = this.f1705f;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return true;
        }
        C2168bw bwVar = this.f1705f.get(valueOf);
        if (bwVar.f1693c.f1688c == 6) {
            z = false;
        } else {
            z = !C2183ck.m1021i(bwVar.f1693c.f1688c, bundle.getInt(C2299i.m1294e(NotificationCompat.CATEGORY_STATUS, m970t(bundle))));
        }
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ Boolean mo33712l(Bundle bundle) {
        C2169bx bxVar;
        Bundle bundle2 = bundle;
        int i = bundle2.getInt("session_id");
        if (i == 0) {
            return false;
        }
        Map<Integer, C2168bw> map = this.f1705f;
        Integer valueOf = Integer.valueOf(i);
        boolean z = true;
        if (map.containsKey(valueOf)) {
            C2168bw s = m969s(i);
            int i2 = bundle2.getInt(C2299i.m1294e(NotificationCompat.CATEGORY_STATUS, s.f1693c.f1686a));
            if (C2183ck.m1021i(s.f1693c.f1688c, i2)) {
                f1700a.mo33808a("Found stale update for session %s with status %d.", valueOf, Integer.valueOf(s.f1693c.f1688c));
                C2167bv bvVar = s.f1693c;
                String str = bvVar.f1686a;
                int i3 = bvVar.f1688c;
                if (i3 == 4) {
                    this.f1702c.mo33869a().mo33618f(i, str);
                } else if (i3 == 5) {
                    this.f1702c.mo33869a().mo33619g(i);
                } else if (i3 == 6) {
                    this.f1702c.mo33869a().mo33614b(Arrays.asList(new String[]{str}));
                }
            } else {
                s.f1693c.f1688c = i2;
                if (C2183ck.m1019g(i2)) {
                    mo33707g(i);
                    this.f1703d.mo33696a(s.f1693c.f1686a);
                } else {
                    for (C2169bx next : s.f1693c.f1690e) {
                        ArrayList parcelableArrayList = bundle2.getParcelableArrayList(C2299i.m1295f("chunk_intents", s.f1693c.f1686a, next.f1694a));
                        if (parcelableArrayList != null) {
                            for (int i4 = 0; i4 < parcelableArrayList.size(); i4++) {
                                if (!(parcelableArrayList.get(i4) == null || ((Intent) parcelableArrayList.get(i4)).getData() == null)) {
                                    next.f1697d.get(i4).f1685a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String t = m970t(bundle);
            long j = bundle2.getLong(C2299i.m1294e("pack_version", t));
            int i5 = bundle2.getInt(C2299i.m1294e(NotificationCompat.CATEGORY_STATUS, t));
            long j2 = bundle2.getLong(C2299i.m1294e("total_bytes_to_download", t));
            ArrayList<String> stringArrayList = bundle2.getStringArrayList(C2299i.m1294e("slice_ids", t));
            ArrayList arrayList = new ArrayList();
            for (T t2 : m971u(stringArrayList)) {
                ArrayList parcelableArrayList2 = bundle2.getParcelableArrayList(C2299i.m1295f("chunk_intents", t, t2));
                ArrayList arrayList2 = new ArrayList();
                for (Intent intent : m971u(parcelableArrayList2)) {
                    if (intent == null) {
                        z = false;
                    }
                    arrayList2.add(new C2166bu(z));
                    z = true;
                }
                String string = bundle2.getString(C2299i.m1295f("uncompressed_hash_sha256", t, t2));
                long j3 = bundle2.getLong(C2299i.m1295f("uncompressed_size", t, t2));
                int i6 = bundle2.getInt(C2299i.m1295f("patch_format", t, t2), 0);
                if (i6 != 0) {
                    bxVar = new C2169bx(t2, string, j3, arrayList2, 0, i6);
                } else {
                    bxVar = new C2169bx(t2, string, j3, arrayList2, bundle2.getInt(C2299i.m1295f("compression_format", t, t2), 0), 0);
                }
                arrayList.add(bxVar);
                z = true;
            }
            this.f1705f.put(Integer.valueOf(i), new C2168bw(i, bundle2.getInt("app_version_code"), new C2167bv(t, j, i5, j2, arrayList)));
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo33713m(String str, int i, long j) {
        C2168bw bwVar = m967q(Arrays.asList(new String[]{str})).get(str);
        if (bwVar == null || C2183ck.m1019g(bwVar.f1693c.f1688c)) {
            f1700a.mo33809b(String.format("Could not find pack %s while trying to complete it", new Object[]{str}), new Object[0]);
        }
        this.f1701b.mo33631B(str, i, j);
        bwVar.f1693c.f1688c = 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ void mo33714n(int i) {
        m969s(i).f1693c.f1688c = 5;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo33715o(int i) {
        C2168bw s = m969s(i);
        if (C2183ck.m1019g(s.f1693c.f1688c)) {
            C2138at atVar = this.f1701b;
            C2167bv bvVar = s.f1693c;
            atVar.mo33631B(bvVar.f1686a, s.f1692b, bvVar.f1687b);
            C2167bv bvVar2 = s.f1693c;
            int i2 = bvVar2.f1688c;
            if (i2 == 5 || i2 == 6) {
                this.f1701b.mo33632C(bvVar2.f1686a, s.f1692b, bvVar2.f1687b);
                return;
            }
            return;
        }
        throw new C2155bj(String.format("Could not safely delete session %d because it is not in a terminal state.", new Object[]{Integer.valueOf(i)}), i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo33716p(int i) {
        m968r(new C2163br(this, i, (byte[]) null));
    }
}
