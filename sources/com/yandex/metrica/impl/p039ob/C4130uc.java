package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import com.yandex.metrica.impl.p039ob.C4056su;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.uc */
public class C4130uc {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4237wp<String, C4140uh> f5052a = new C4237wp<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final HashMap<String, C4146ul> f5053b = new HashMap<>();

    /* renamed from: c */
    private final C4142uj f5054c = new C4142uj() {
        /* renamed from: a */
        public void mo41536a(String str, C4143uk ukVar) {
            for (C4140uh a : mo41534a(str)) {
                a.mo39983a(ukVar);
            }
        }

        /* renamed from: a */
        public void mo41535a(String str, C4134ue ueVar, C4143uk ukVar) {
            for (C4140uh a : mo41534a(str)) {
                a.mo39982a(ueVar, ukVar);
            }
        }

        /* renamed from: a */
        public List<C4140uh> mo41534a(String str) {
            synchronized (C4130uc.this.f5053b) {
                Collection a = C4130uc.this.f5052a.mo41774a(str);
                if (a == null) {
                    ArrayList arrayList = new ArrayList();
                    return arrayList;
                }
                ArrayList arrayList2 = new ArrayList(a);
                return arrayList2;
            }
        }
    };

    /* renamed from: com.yandex.metrica.impl.ob.uc$a */
    private static final class C4132a {

        /* renamed from: a */
        static final C4130uc f5056a = new C4130uc();
    }

    /* renamed from: a */
    public static final C4130uc m5560a() {
        return C4132a.f5056a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C4146ul mo41531a(Context context, C3379ek ekVar, C4056su.C4058a aVar) {
        C4146ul ulVar = this.f5053b.get(ekVar.mo39994b());
        boolean z = true;
        if (ulVar == null) {
            synchronized (this.f5053b) {
                ulVar = this.f5053b.get(ekVar.mo39994b());
                if (ulVar == null) {
                    C4146ul b = mo41533b(context, ekVar, aVar);
                    this.f5053b.put(ekVar.mo39994b(), b);
                    ulVar = b;
                    z = false;
                }
            }
        }
        if (z) {
            ulVar.mo41600a(aVar);
        }
        return ulVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C4146ul mo41533b(Context context, C3379ek ekVar, C4056su.C4058a aVar) {
        return new C4146ul(context, ekVar.mo39994b(), aVar, this.f5054c);
    }

    /* renamed from: a */
    public C4146ul mo41532a(Context context, C3379ek ekVar, C4140uh uhVar, C4056su.C4058a aVar) {
        C4146ul a;
        synchronized (this.f5053b) {
            this.f5052a.mo41775a(ekVar.mo39994b(), uhVar);
            a = mo41531a(context, ekVar, aVar);
        }
        return a;
    }
}
