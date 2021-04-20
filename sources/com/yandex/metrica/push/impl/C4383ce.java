package com.yandex.metrica.push.impl;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.yandex.metrica.push.impl.ce */
public class C4383ce implements C4381cc {

    /* renamed from: a */
    private final OkHttpClient f5501a;

    C4383ce(Context context) {
        this.f5501a = new OkHttpClient.Builder().cache(new Cache(context.getCacheDir(), 10485760)).build();
    }

    /* renamed from: a */
    public byte[] mo42021a(String str) {
        Response response;
        byte[] bArr = null;
        try {
            response = this.f5501a.newCall(new Request.Builder().url(str).build()).execute();
            try {
                response.cacheResponse();
                if (response.body() != null) {
                    bArr = response.body().bytes();
                }
            } catch (IOException e) {
                e = e;
                try {
                    C4376by.m6445a(e, e.getMessage(), new Object[0]);
                    C4380cb.m6469a((Closeable) response);
                    return bArr;
                } catch (Throwable th) {
                    th = th;
                    C4380cb.m6469a((Closeable) response);
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            response = null;
            C4376by.m6445a(e, e.getMessage(), new Object[0]);
            C4380cb.m6469a((Closeable) response);
            return bArr;
        } catch (Throwable th2) {
            th = th2;
            response = null;
            C4380cb.m6469a((Closeable) response);
            throw th;
        }
        C4380cb.m6469a((Closeable) response);
        return bArr;
    }
}
