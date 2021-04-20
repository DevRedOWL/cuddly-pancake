package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.pw */
class C3837pw implements C3834pt {

    /* renamed from: a */
    private final Context f4084a;

    /* renamed from: b */
    private final C4281yc f4085b;

    public C3837pw(Context context) {
        this(context, new C4281yc());
    }

    public C3837pw(Context context, C4281yc ycVar) {
        this.f4084a = context;
        this.f4085b = ycVar;
    }

    /* renamed from: a */
    public List<C3835pu> mo40863a() {
        ArrayList arrayList = new ArrayList();
        C4281yc ycVar = this.f4085b;
        Context context = this.f4084a;
        PackageInfo a = ycVar.mo41860a(context, context.getPackageName(), 4096);
        if (a != null) {
            for (int i = 0; i < a.requestedPermissions.length; i++) {
                String str = a.requestedPermissions[i];
                if ((a.requestedPermissionsFlags[i] & 2) != 0) {
                    arrayList.add(new C3835pu(str, true));
                } else {
                    arrayList.add(new C3835pu(str, false));
                }
            }
        }
        return arrayList;
    }
}
