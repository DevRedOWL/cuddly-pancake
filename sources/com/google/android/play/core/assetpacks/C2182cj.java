package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import androidx.core.app.NotificationCompat;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.play.core.common.LocalTestingException;
import com.google.android.play.core.internal.C2241ag;
import com.google.android.play.core.internal.C2258ax;
import com.google.android.play.core.internal.C2289ca;
import com.google.android.play.core.internal.C2299i;
import com.google.android.play.core.tasks.C2415i;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.play.core.assetpacks.cj */
final class C2182cj implements C2220s {

    /* renamed from: a */
    private static final C2241ag f1737a = new C2241ag("FakeAssetPackService");

    /* renamed from: h */
    private static final AtomicInteger f1738h = new AtomicInteger(1);

    /* renamed from: b */
    private final String f1739b;

    /* renamed from: c */
    private final C2135aq f1740c;

    /* renamed from: d */
    private final C2159bn f1741d;

    /* renamed from: e */
    private final Context f1742e;

    /* renamed from: f */
    private final C2194cv f1743f;

    /* renamed from: g */
    private final C2289ca<Executor> f1744g;

    /* renamed from: i */
    private final Handler f1745i = new Handler(Looper.getMainLooper());

    C2182cj(File file, C2135aq aqVar, C2159bn bnVar, Context context, C2194cv cvVar, C2289ca<Executor> caVar) {
        this.f1739b = file.getAbsolutePath();
        this.f1740c = aqVar;
        this.f1741d = bnVar;
        this.f1742e = context;
        this.f1743f = cvVar;
        this.f1744g = caVar;
    }

    /* renamed from: k */
    static long m994k(int i, long j) {
        if (i == 2) {
            return j / 2;
        }
        if (i == 3 || i == 4) {
            return j;
        }
        return 0;
    }

    /* renamed from: p */
    private final AssetPackState m995p(String str, int i) throws LocalTestingException {
        long j = 0;
        for (File length : m996q(str)) {
            j += length.length();
        }
        return AssetPackState.m815b(str, i, 0, m994k(i, j), j, this.f1741d.mo33697b(str), 1);
    }

    /* renamed from: q */
    private final File[] m996q(String str) throws LocalTestingException {
        File file = new File(this.f1739b);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new C2180ch(str));
            if (listFiles != null) {
                if (r1 != 0) {
                    for (File b : listFiles) {
                        if (C2258ax.m1181b(b).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new LocalTestingException(String.format("No master slice available for pack '%s'.", new Object[]{str}));
                }
                throw new LocalTestingException(String.format("No APKs available for pack '%s'.", new Object[]{str}));
            }
            throw new LocalTestingException(String.format("Failed fetching APKs for pack '%s'.", new Object[]{str}));
        }
        throw new LocalTestingException(String.format("Local testing directory '%s' not found.", new Object[]{file}));
    }

    /* renamed from: r */
    private static String m997r(File file) throws LocalTestingException {
        try {
            return C2183ck.m1013a(Arrays.asList(new File[]{file}));
        } catch (NoSuchAlgorithmException e) {
            throw new LocalTestingException("SHA256 algorithm not supported.", e);
        } catch (IOException e2) {
            throw new LocalTestingException(String.format("Could not digest file: %s.", new Object[]{file}), e2);
        }
    }

    /* renamed from: s */
    private final void m998s(int i, String str, int i2) throws LocalTestingException {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f1743f.mo33740a());
        bundle.putInt("session_id", i);
        File[] q = m996q(str);
        ArrayList arrayList = new ArrayList();
        long j = 0;
        for (File file : q) {
            j += file.length();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(i2 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String b = C2258ax.m1181b(file);
            bundle.putParcelableArrayList(C2299i.m1295f("chunk_intents", str, b), arrayList2);
            bundle.putString(C2299i.m1295f("uncompressed_hash_sha256", str, b), m997r(file));
            bundle.putLong(C2299i.m1295f("uncompressed_size", str, b), file.length());
            arrayList.add(b);
        }
        bundle.putStringArrayList(C2299i.m1294e("slice_ids", str), arrayList);
        bundle.putLong(C2299i.m1294e("pack_version", str), (long) this.f1743f.mo33740a());
        bundle.putInt(C2299i.m1294e(NotificationCompat.CATEGORY_STATUS, str), i2);
        bundle.putInt(C2299i.m1294e("error_code", str), 0);
        bundle.putLong(C2299i.m1294e("bytes_downloaded", str), m994k(i2, j));
        bundle.putLong(C2299i.m1294e("total_bytes_to_download", str), j);
        bundle.putStringArrayList("pack_names", new ArrayList(Arrays.asList(new String[]{str})));
        bundle.putLong("bytes_downloaded", m994k(i2, j));
        bundle.putLong("total_bytes_to_download", j);
        this.f1745i.post(new C2181ci(this, new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle)));
    }

    /* renamed from: a */
    public final Task<AssetPackStates> mo33613a(List<String> list, List<String> list2, Map<String, Long> map) {
        f1737a.mo33811d("startDownload(%s)", list2);
        C2415i iVar = new C2415i();
        this.f1744g.mo33869a().execute(new C2177ce(this, list2, iVar, list));
        return iVar.mo34074c();
    }

    /* renamed from: b */
    public final void mo33614b(List<String> list) {
        f1737a.mo33811d("cancelDownload(%s)", list);
    }

    /* renamed from: c */
    public final Task<List<String>> mo33615c(Map<String, Long> map) {
        f1737a.mo33811d("syncPacks()", new Object[0]);
        return Tasks.m1599a(new ArrayList());
    }

    /* renamed from: d */
    public final Task<AssetPackStates> mo33616d(List<String> list, C2136ar arVar, Map<String, Long> map) {
        f1737a.mo33811d("getPackStates(%s)", list);
        C2415i iVar = new C2415i();
        this.f1744g.mo33869a().execute(new C2178cf(this, list, arVar, iVar));
        return iVar.mo34074c();
    }

    /* renamed from: e */
    public final void mo33617e(int i, String str, String str2, int i2) {
        f1737a.mo33811d("notifyChunkTransferred", new Object[0]);
    }

    /* renamed from: f */
    public final void mo33618f(int i, String str) {
        f1737a.mo33811d("notifyModuleCompleted", new Object[0]);
        this.f1744g.mo33869a().execute(new C2179cg(this, i, str));
    }

    /* renamed from: g */
    public final void mo33619g(int i) {
        f1737a.mo33811d("notifySessionFailed", new Object[0]);
    }

    /* renamed from: h */
    public final Task<ParcelFileDescriptor> mo33620h(int i, String str, String str2, int i2) {
        f1737a.mo33811d("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i), str, str2, Integer.valueOf(i2));
        C2415i iVar = new C2415i();
        try {
            for (File file : m996q(str)) {
                if (C2258ax.m1181b(file).equals(str2)) {
                    iVar.mo34072a(ParcelFileDescriptor.open(file, 268435456));
                    return iVar.mo34074c();
                }
            }
            throw new LocalTestingException(String.format("Local testing slice for '%s' not found.", new Object[]{str2}));
        } catch (FileNotFoundException e) {
            f1737a.mo33812e("getChunkFileDescriptor failed", e);
            iVar.mo34073b(new LocalTestingException("Asset Slice file not found.", e));
        } catch (LocalTestingException e2) {
            f1737a.mo33812e("getChunkFileDescriptor failed", e2);
            iVar.mo34073b(e2);
        }
    }

    /* renamed from: i */
    public final void mo33621i(String str) {
        f1737a.mo33811d("removePack(%s)", str);
    }

    /* renamed from: j */
    public final void mo33622j() {
        f1737a.mo33811d("keepAlive", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo33723l(Intent intent) {
        this.f1740c.mo33522a(this.f1742e, intent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo33724m(int i, String str) {
        try {
            m998s(i, str, 4);
        } catch (LocalTestingException e) {
            f1737a.mo33812e("notifyModuleCompleted failed", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ void mo33725n(List list, C2136ar arVar, C2415i iVar) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                AssetPackState p = m995p(str, arVar.mo33629a(8, str));
                j += p.totalBytesToDownload();
                hashMap.put(str, p);
            } catch (LocalTestingException e) {
                iVar.mo34073b(e);
                return;
            }
        }
        iVar.mo34072a(AssetPackStates.m818a(j, hashMap));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo33726o(List list, C2415i iVar, List list2) {
        C2415i iVar2 = iVar;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                AssetPackState p = m995p(str, 1);
                j += p.totalBytesToDownload();
                hashMap.put(str, p);
            } catch (LocalTestingException e) {
                iVar2.mo34073b(e);
                return;
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            try {
                int andIncrement = f1738h.getAndIncrement();
                m998s(andIncrement, str2, 1);
                m998s(andIncrement, str2, 2);
                m998s(andIncrement, str2, 3);
            } catch (LocalTestingException e2) {
                iVar2.mo34073b(e2);
                return;
            }
        }
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            String str3 = (String) it3.next();
            hashMap.put(str3, AssetPackState.m815b(str3, 4, 0, 0, 0, Utils.DOUBLE_EPSILON, 1));
        }
        iVar2.mo34072a(AssetPackStates.m818a(j, hashMap));
    }
}
