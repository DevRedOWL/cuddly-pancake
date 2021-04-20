package com.yandex.metrica.impl.p039ob;

import android.util.SparseArray;
import com.yandex.metrica.impl.p039ob.C3908rl;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.re */
public class C3875re {

    /* renamed from: a */
    private static final int[] f4216a = {0, 1, 2, 3};

    /* renamed from: b */
    private final SparseArray<HashMap<String, C3908rl.C3909a.C3910a>> f4217b;

    /* renamed from: c */
    private int f4218c;

    public C3875re() {
        this(f4216a);
    }

    C3875re(int[] iArr) {
        this.f4217b = new SparseArray<>();
        this.f4218c = 0;
        for (int put : iArr) {
            this.f4217b.put(put, new HashMap());
        }
    }

    /* renamed from: a */
    public C3908rl.C3909a.C3910a mo40973a(int i, String str) {
        return (C3908rl.C3909a.C3910a) this.f4217b.get(i).get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo40974a(C3908rl.C3909a.C3910a aVar) {
        this.f4217b.get(aVar.f4386c).put(new String(aVar.f4385b), aVar);
    }

    /* renamed from: a */
    public int mo40972a() {
        return this.f4218c;
    }

    /* renamed from: b */
    public void mo40975b() {
        this.f4218c++;
    }

    /* renamed from: c */
    public C3908rl.C3909a mo40976c() {
        C3908rl.C3909a aVar = new C3908rl.C3909a();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f4217b.size(); i++) {
            SparseArray<HashMap<String, C3908rl.C3909a.C3910a>> sparseArray = this.f4217b;
            for (C3908rl.C3909a.C3910a add : sparseArray.get(sparseArray.keyAt(i)).values()) {
                arrayList.add(add);
            }
        }
        aVar.f4383b = (C3908rl.C3909a.C3910a[]) arrayList.toArray(new C3908rl.C3909a.C3910a[arrayList.size()]);
        return aVar;
    }
}
