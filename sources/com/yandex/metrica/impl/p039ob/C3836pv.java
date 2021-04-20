package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.os.Build;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.pv */
public class C3836pv {
    /* renamed from: a */
    public List<C3835pu> mo40868a(Context context, List<C3835pu> list) {
        List<C3835pu> a = mo40867a(context).mo40863a();
        if (C4197vj.m5866a(a, list)) {
            return null;
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C3834pt mo40867a(Context context) {
        if (Build.VERSION.SDK_INT >= 16) {
            return new C3837pw(context);
        }
        return new C3840pz(context);
    }
}
