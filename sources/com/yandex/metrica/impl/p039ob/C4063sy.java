package com.yandex.metrica.impl.p039ob;

import android.net.Uri;
import com.yandex.metrica.impl.p039ob.C4039sn;

/* renamed from: com.yandex.metrica.impl.ob.sy */
public abstract class C4063sy<T extends C4039sn> implements C4061sw<T> {

    /* renamed from: a */
    private C4251xb f4862a;

    /* renamed from: a */
    public void mo41413a(Uri.Builder builder, T t) {
        C4251xb xbVar = this.f4862a;
        if (xbVar != null && xbVar.mo41790a() == C4252xc.AES_RSA) {
            builder.appendQueryParameter("encrypted_request", "1");
        }
    }

    /* renamed from: a */
    public String mo41414a(Boolean bool) {
        if (bool == null) {
            return "";
        }
        return bool.booleanValue() ? "1" : "0";
    }

    /* renamed from: a */
    public void mo41415a(C4251xb xbVar) {
        this.f4862a = xbVar;
    }
}
