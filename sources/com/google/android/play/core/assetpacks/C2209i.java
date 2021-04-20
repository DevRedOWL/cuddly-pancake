package com.google.android.play.core.assetpacks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.core.app.NotificationCompat;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.play.core.common.C2229a;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.internal.C2241ag;
import com.google.android.play.core.internal.C2289ca;
import com.google.android.play.core.internal.C2299i;
import com.google.android.play.core.splitinstall.C2386p;
import com.google.android.play.core.tasks.C2415i;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.assetpacks.i */
final class C2209i implements AssetPackManager {

    /* renamed from: a */
    private static final C2241ag f1833a = new C2241ag("AssetPackManager");

    /* renamed from: b */
    private final C2138at f1834b;

    /* renamed from: c */
    private final C2289ca<C2220s> f1835c;

    /* renamed from: d */
    private final C2135aq f1836d;

    /* renamed from: e */
    private final C2386p f1837e;

    /* renamed from: f */
    private final C2171bz f1838f;

    /* renamed from: g */
    private final C2159bn f1839g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C2149bd f1840h;

    /* renamed from: i */
    private final C2289ca<Executor> f1841i;

    /* renamed from: j */
    private final C2229a f1842j;

    /* renamed from: k */
    private final Handler f1843k = new Handler(Looper.getMainLooper());

    /* renamed from: l */
    private boolean f1844l;

    C2209i(C2138at atVar, C2289ca<C2220s> caVar, C2135aq aqVar, C2386p pVar, C2171bz bzVar, C2159bn bnVar, C2149bd bdVar, C2289ca<Executor> caVar2, C2229a aVar) {
        this.f1834b = atVar;
        this.f1835c = caVar;
        this.f1836d = aqVar;
        this.f1837e = pVar;
        this.f1838f = bzVar;
        this.f1839g = bnVar;
        this.f1840h = bdVar;
        this.f1841i = caVar2;
        this.f1842j = aVar;
    }

    /* renamed from: h */
    private final void m1075h() {
        this.f1841i.mo33869a().execute(new C2205e(this, (byte[]) null));
    }

    /* renamed from: i */
    private final void m1076i() {
        this.f1841i.mo33869a().execute(new C2205e(this));
        this.f1844l = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33781a(boolean z) {
        boolean j = this.f1836d.mo33922j();
        this.f1836d.mo33917e(z);
        if (z && !j) {
            m1075h();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo33782b(int i, String str) {
        if (!this.f1834b.mo33633a(str) && i == 4) {
            return 8;
        }
        if (!this.f1834b.mo33633a(str) || i == 4) {
            return i;
        }
        return 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo33783c() {
        this.f1834b.mo33654v();
        this.f1834b.mo33651s();
        this.f1834b.mo33655w();
    }

    public final AssetPackStates cancel(List<String> list) {
        Map<String, Integer> h = this.f1838f.mo33708h(list);
        HashMap hashMap = new HashMap();
        for (String next : list) {
            Integer num = h.get(next);
            hashMap.put(next, AssetPackState.m815b(next, num == null ? 0 : num.intValue(), 0, 0, 0, Utils.DOUBLE_EPSILON, 0));
        }
        this.f1835c.mo33869a().mo33614b(list);
        return AssetPackStates.m818a(0, hashMap);
    }

    public final void clearListeners() {
        this.f1836d.mo33920h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo33784d() {
        Task<List<String>> c = this.f1835c.mo33869a().mo33615c(this.f1834b.mo33635c());
        C2138at atVar = this.f1834b;
        atVar.getClass();
        c.addOnSuccessListener(this.f1841i.mo33869a(), C2206f.m1072a(atVar));
        c.addOnFailureListener(this.f1841i.mo33869a(), C2207g.f1830a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo33785f(String str, C2415i iVar) {
        if (this.f1834b.mo33649q(str)) {
            iVar.mo34072a(null);
            this.f1835c.mo33869a().mo33621i(str);
            return;
        }
        iVar.mo34073b(new IOException(String.format("Failed to remove pack %s.", new Object[]{str})));
    }

    public final Task<AssetPackStates> fetch(List<String> list) {
        Map<String, Long> c = this.f1834b.mo33635c();
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList();
        if (!this.f1842j.mo33792a()) {
            arrayList.removeAll(c.keySet());
            arrayList2.addAll(list);
            arrayList2.removeAll(arrayList);
        }
        if (!arrayList.isEmpty()) {
            return this.f1835c.mo33869a().mo33613a(arrayList2, arrayList, c);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt("error_code", 0);
        for (String next : list) {
            bundle.putInt(C2299i.m1294e(NotificationCompat.CATEGORY_STATUS, next), 4);
            bundle.putInt(C2299i.m1294e("error_code", next), 0);
            bundle.putLong(C2299i.m1294e("total_bytes_to_download", next), 0);
            bundle.putLong(C2299i.m1294e("bytes_downloaded", next), 0);
        }
        bundle.putStringArrayList("pack_names", new ArrayList(list));
        bundle.putLong("total_bytes_to_download", 0);
        bundle.putLong("bytes_downloaded", 0);
        return Tasks.m1599a(AssetPackStates.m819b(bundle, this.f1839g));
    }

    public final AssetLocation getAssetLocation(String str, String str2) {
        AssetPackLocation assetPackLocation;
        if (!this.f1844l) {
            this.f1841i.mo33869a().execute(new C2205e(this));
            this.f1844l = true;
        }
        if (this.f1834b.mo33633a(str)) {
            try {
                assetPackLocation = this.f1834b.mo33636d(str);
            } catch (IOException unused) {
            }
        } else {
            if (this.f1837e.mo34032a().contains(str)) {
                assetPackLocation = AssetPackLocation.m813a();
            }
            assetPackLocation = null;
        }
        if (assetPackLocation == null) {
            return null;
        }
        if (assetPackLocation.packStorageMethod() == 1) {
            return this.f1834b.mo33657y(str, str2);
        }
        if (assetPackLocation.packStorageMethod() == 0) {
            return this.f1834b.mo33658z(str, str2, assetPackLocation);
        }
        f1833a.mo33808a("The asset %s is not present in Asset Pack %s", str2, str);
        return null;
    }

    public final AssetPackLocation getPackLocation(String str) {
        if (!this.f1844l) {
            m1076i();
        }
        if (this.f1834b.mo33633a(str)) {
            try {
                return this.f1834b.mo33636d(str);
            } catch (IOException unused) {
                return null;
            }
        } else if (this.f1837e.mo34032a().contains(str)) {
            return AssetPackLocation.m813a();
        } else {
            return null;
        }
    }

    public final Map<String, AssetPackLocation> getPackLocations() {
        Map<String, AssetPackLocation> b = this.f1834b.mo33634b();
        HashMap hashMap = new HashMap();
        for (String put : this.f1837e.mo34032a()) {
            hashMap.put(put, AssetPackLocation.m813a());
        }
        b.putAll(hashMap);
        return b;
    }

    public final Task<AssetPackStates> getPackStates(List<String> list) {
        return this.f1835c.mo33869a().mo33616d(list, new C2172c(this), this.f1834b.mo33635c());
    }

    public final synchronized void registerListener(AssetPackStateUpdateListener assetPackStateUpdateListener) {
        boolean j = this.f1836d.mo33922j();
        this.f1836d.mo33918f(assetPackStateUpdateListener);
        if (!j) {
            m1075h();
        }
    }

    public final Task<Void> removePack(String str) {
        C2415i iVar = new C2415i();
        this.f1841i.mo33869a().execute(new C2199d(this, str, iVar));
        return iVar.mo34074c();
    }

    public final Task<Integer> showCellularDataConfirmation(Activity activity) {
        if (activity == null) {
            return Tasks.m1600b(new AssetPackException(-3));
        }
        if (this.f1840h.mo33687b() == null) {
            return Tasks.m1600b(new AssetPackException(-12));
        }
        Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", this.f1840h.mo33687b());
        C2415i iVar = new C2415i();
        intent.putExtra("result_receiver", new C2208h(this, this.f1843k, iVar));
        activity.startActivity(intent);
        return iVar.mo34074c();
    }

    public final void unregisterListener(AssetPackStateUpdateListener assetPackStateUpdateListener) {
        this.f1836d.mo33919g(assetPackStateUpdateListener);
    }
}
