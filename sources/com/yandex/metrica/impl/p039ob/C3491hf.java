package com.yandex.metrica.impl.p039ob;

import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.yandex.metrica.impl.p039ob.C3764oa;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.hf */
public class C3491hf extends C3489hd {

    /* renamed from: a */
    private final C4281yc f3347a;

    public C3491hf(C3391en enVar) {
        this(enVar, new C4281yc());
    }

    public C3491hf(C3391en enVar, C4281yc ycVar) {
        super(enVar);
        this.f3347a = ycVar;
    }

    /* renamed from: a */
    public boolean mo40170a(C4217w wVar) {
        C3391en a = mo40176a();
        if (!a.mo40037u().mo40487d() || !a.mo40036t()) {
            return false;
        }
        C3688lw y = a.mo40041y();
        HashSet<C3768ob> b = mo40177b();
        try {
            ArrayList<C3768ob> c = mo40178c();
            if (C4197vj.m5866a(b, c)) {
                a.mo40029m();
                return false;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator<C3768ob> it = c.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().mo40736a());
            }
            a.mo40021e().mo40091d(C4217w.m5946a(wVar, new JSONObject().put("features", jSONArray).toString()));
            y.mo40530b(jSONArray.toString());
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public HashSet<C3768ob> mo40177b() {
        String e = mo40176a().mo40041y().mo40541e();
        if (TextUtils.isEmpty(e)) {
            return null;
        }
        try {
            HashSet<C3768ob> hashSet = new HashSet<>();
            JSONArray jSONArray = new JSONArray(e);
            for (int i = 0; i < jSONArray.length(); i++) {
                hashSet.add(new C3768ob(jSONArray.getJSONObject(i)));
            }
            return hashSet;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ArrayList<C3768ob> mo40178c() {
        try {
            C3391en a = mo40176a();
            PackageInfo a2 = this.f3347a.mo41860a(a.mo40027k(), a.mo40027k().getPackageName(), 16384);
            ArrayList<C3768ob> arrayList = new ArrayList<>();
            C3764oa a3 = C3764oa.C3765a.m4315a();
            if (!(a2 == null || a2.reqFeatures == null)) {
                for (FeatureInfo b : a2.reqFeatures) {
                    arrayList.add(a3.mo40734b(b));
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }
}
