package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import com.yandex.metrica.impl.p039ob.C3213bt;
import java.util.EnumSet;

/* renamed from: com.yandex.metrica.impl.ob.pi */
public class C3821pi {

    /* renamed from: a */
    private static final EnumSet<C3213bt.C3220a> f4068a = EnumSet.of(C3213bt.C3220a.OFFLINE);

    /* renamed from: b */
    private C4201vn f4069b = new C4198vk();

    /* renamed from: c */
    private final Context f4070c;

    public C3821pi(Context context) {
        this.f4070c = context;
    }

    /* renamed from: a */
    public boolean mo40839a() {
        return !f4068a.contains(this.f4069b.mo41694a(this.f4070c));
    }
}
