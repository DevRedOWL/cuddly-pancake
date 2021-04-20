package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.play.core.internal.C2241ag;
import com.google.android.play.core.internal.C2251aq;
import com.google.android.play.core.internal.C2277bp;
import com.google.android.play.core.internal.C2310t;
import com.google.android.play.core.splitcompat.C2345p;
import com.google.android.play.core.tasks.C2415i;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.play.core.assetpacks.am */
final class C2131am implements C2220s {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C2241ag f1535a = new C2241ag("AssetPackServiceImpl");

    /* renamed from: b */
    private static final Intent f1536b = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f1537c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C2159bn f1538d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C2251aq<C2310t> f1539e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C2251aq<C2310t> f1540f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final AtomicBoolean f1541g = new AtomicBoolean();

    C2131am(Context context, C2159bn bnVar) {
        this.f1537c = context.getPackageName();
        this.f1538d = bnVar;
        if (C2277bp.m1260a(context)) {
            this.f1539e = new C2251aq(C2345p.m1447c(context), f1535a, "AssetPackService", f1536b, C2221t.f1869b);
            this.f1540f = new C2251aq(C2345p.m1447c(context), f1535a, "AssetPackService-keepAlive", f1536b, C2221t.f1868a);
        }
        f1535a.mo33808a("AssetPackService initiated.", new Object[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public static Bundle m853A(int i, String str) {
        Bundle B = m854B(i);
        B.putString("module_name", str);
        return B;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public static Bundle m854B(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i);
        return bundle;
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public static Bundle m855C() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 10901);
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        bundle.putIntegerArrayList("supported_patch_formats", new ArrayList());
        return bundle;
    }

    /* renamed from: k */
    static /* synthetic */ ArrayList m856k(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: m */
    static /* synthetic */ Bundle m858m(Map map) {
        Bundle C = m855C();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        C.putParcelableArrayList("installed_asset_module", arrayList);
        return C;
    }

    /* renamed from: r */
    static /* synthetic */ Bundle m863r(int i, String str, String str2, int i2) {
        Bundle A = m853A(i, str);
        A.putString("slice_id", str2);
        A.putInt("chunk_number", i2);
        return A;
    }

    /* renamed from: v */
    static /* synthetic */ List m867v(C2131am amVar, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AssetPackState next = AssetPackStates.m819b((Bundle) it.next(), amVar.f1538d).packStates().values().iterator().next();
            if (next == null) {
                f1535a.mo33809b("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (C2183ck.m1018f(next.status())) {
                arrayList.add(next.name());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final void m870y(int i, String str, int i2) {
        if (this.f1539e != null) {
            f1535a.mo33811d("notifyModuleCompleted", new Object[0]);
            C2415i iVar = new C2415i();
            this.f1539e.mo33819a(new C2120ab(this, iVar, i, str, iVar, i2));
            return;
        }
        throw new C2155bj("The Play Store app is not installed or is an unofficial version.", i);
    }

    /* renamed from: z */
    private static <T> Task<T> m871z() {
        f1535a.mo33809b("onError(%d)", -11);
        return Tasks.m1600b(new AssetPackException(-11));
    }

    /* renamed from: a */
    public final Task<AssetPackStates> mo33613a(List<String> list, List<String> list2, Map<String, Long> map) {
        if (this.f1539e == null) {
            return m871z();
        }
        f1535a.mo33811d("startDownload(%s)", list2);
        C2415i iVar = new C2415i();
        this.f1539e.mo33819a(new C2224w(this, iVar, list2, map, iVar, list));
        iVar.mo34074c().addOnSuccessListener(new C2222u(this));
        return iVar.mo34074c();
    }

    /* renamed from: b */
    public final void mo33614b(List<String> list) {
        if (this.f1539e != null) {
            f1535a.mo33811d("cancelDownloads(%s)", list);
            C2415i iVar = new C2415i();
            this.f1539e.mo33819a(new C2225x(this, iVar, list, iVar));
        }
    }

    /* renamed from: c */
    public final Task<List<String>> mo33615c(Map<String, Long> map) {
        if (this.f1539e == null) {
            return m871z();
        }
        f1535a.mo33811d("syncPacks", new Object[0]);
        C2415i iVar = new C2415i();
        this.f1539e.mo33819a(new C2226y(this, iVar, map, iVar));
        return iVar.mo34074c();
    }

    /* renamed from: d */
    public final Task<AssetPackStates> mo33616d(List<String> list, C2136ar arVar, Map<String, Long> map) {
        if (this.f1539e == null) {
            return m871z();
        }
        f1535a.mo33811d("getPackStates(%s)", list);
        C2415i iVar = new C2415i();
        this.f1539e.mo33819a(new C2227z(this, iVar, list, map, iVar, arVar));
        return iVar.mo34074c();
    }

    /* renamed from: e */
    public final void mo33617e(int i, String str, String str2, int i2) {
        if (this.f1539e != null) {
            f1535a.mo33811d("notifyChunkTransferred", new Object[0]);
            C2415i iVar = new C2415i();
            this.f1539e.mo33819a(new C2119aa(this, iVar, i, str, str2, i2, iVar));
            return;
        }
        throw new C2155bj("The Play Store app is not installed or is an unofficial version.", i);
    }

    /* renamed from: f */
    public final void mo33618f(int i, String str) {
        m870y(i, str, 10);
    }

    /* renamed from: g */
    public final void mo33619g(int i) {
        if (this.f1539e != null) {
            f1535a.mo33811d("notifySessionFailed", new Object[0]);
            C2415i iVar = new C2415i();
            this.f1539e.mo33819a(new C2121ac(this, iVar, i, iVar));
            return;
        }
        throw new C2155bj("The Play Store app is not installed or is an unofficial version.", i);
    }

    /* renamed from: h */
    public final Task<ParcelFileDescriptor> mo33620h(int i, String str, String str2, int i2) {
        if (this.f1539e == null) {
            return m871z();
        }
        f1535a.mo33811d("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i2), Integer.valueOf(i));
        C2415i iVar = new C2415i();
        this.f1539e.mo33819a(new C2122ad(this, iVar, i, str, str2, i2, iVar));
        return iVar.mo34074c();
    }

    /* renamed from: i */
    public final void mo33621i(String str) {
        if (this.f1539e != null) {
            f1535a.mo33811d("removePack(%s)", str);
            C2415i iVar = new C2415i();
            this.f1539e.mo33819a(new C2223v(this, iVar, str, iVar));
        }
    }

    /* renamed from: j */
    public final synchronized void mo33622j() {
        if (this.f1540f == null) {
            f1535a.mo33812e("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        f1535a.mo33811d("keepAlive", new Object[0]);
        if (!this.f1541g.compareAndSet(false, true)) {
            f1535a.mo33811d("Service is already kept alive.", new Object[0]);
            return;
        }
        C2415i iVar = new C2415i();
        this.f1540f.mo33819a(new C2123ae(this, iVar, iVar));
    }
}
