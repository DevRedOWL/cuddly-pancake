package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.pz */
public class C3840pz implements C3834pt {

    /* renamed from: a */
    private final Context f4088a;

    /* renamed from: b */
    private final String f4089b;

    /* renamed from: c */
    private final C4281yc f4090c;

    public C3840pz(Context context) {
        this(context, context.getPackageName(), new C4281yc());
    }

    public C3840pz(Context context, String str, C4281yc ycVar) {
        this.f4088a = context;
        this.f4089b = str;
        this.f4090c = ycVar;
    }

    /* renamed from: a */
    public List<C3835pu> mo40863a() {
        ArrayList arrayList = new ArrayList();
        PackageInfo a = this.f4090c.mo41860a(this.f4088a, this.f4089b, 4096);
        if (a != null) {
            for (String puVar : a.requestedPermissions) {
                arrayList.add(new C3835pu(puVar, true));
            }
        }
        return arrayList;
    }
}
