package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.util.SparseArray;
import com.yandex.metrica.YandexMetrica;

/* renamed from: com.yandex.metrica.impl.ob.bi */
public abstract class C3196bi {

    /* renamed from: com.yandex.metrica.impl.ob.bi$a */
    interface C3197a {
        /* renamed from: a */
        void mo39632a(Context context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo39627a(C3849qg qgVar);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract SparseArray<C3197a> mo39628a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo39630a(C3849qg qgVar, int i);

    /* renamed from: a */
    public void mo39629a(Context context) {
        C3849qg qgVar = new C3849qg(context);
        int a = mo39627a(qgVar);
        int b = mo39631b();
        if (a < b) {
            if (a > 0) {
                m2308a(context, a, b);
            }
            mo39630a(qgVar, b);
            qgVar.mo40902j();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo39631b() {
        return YandexMetrica.getLibraryApiLevel();
    }

    /* renamed from: a */
    private void m2308a(Context context, int i, int i2) {
        SparseArray<C3197a> a = mo39628a();
        while (true) {
            i++;
            if (i <= i2) {
                C3197a aVar = a.get(i);
                if (aVar != null) {
                    aVar.mo39632a(context);
                }
            } else {
                return;
            }
        }
    }
}
