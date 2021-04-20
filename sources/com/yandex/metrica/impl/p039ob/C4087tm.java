package com.yandex.metrica.impl.p039ob;

import android.net.Uri;
import android.util.Base64;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.tm */
class C4087tm extends C4090to {

    /* renamed from: c */
    private C4129ub f4918c;

    /* renamed from: d */
    private C4089tn f4919d;

    C4087tm(Socket socket, Uri uri, C4093tr trVar, C4129ub ubVar, C4089tn tnVar) {
        super(socket, uri, trVar);
        this.f4918c = ubVar;
        this.f4919d = tnVar;
    }

    /* renamed from: a */
    public void mo41449a() {
        if (this.f4918c.f5048b.equals(this.f4924b.getQueryParameter("t"))) {
            try {
                final byte[] b = mo41450b();
                mo41456a("HTTP/1.1 200 OK", (Map<String, String>) new HashMap<String, String>() {
                    {
                        put("Content-Type", "text/plain; charset=utf-8");
                        put("Access-Control-Allow-Origin", "*");
                        put("Access-Control-Allow-Methods", "GET");
                        put("Content-Length", String.valueOf(b.length));
                    }
                }, b);
            } catch (Throwable unused) {
            }
        } else {
            this.f4923a.mo41460a("request_with_wrong_token");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public byte[] mo41450b() throws JSONException {
        return Base64.encode(new C4241wt().mo41788a(this.f4919d.mo41451a().getBytes()), 0);
    }
}
