package com.yandex.metrica.impl.p039ob;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.pj */
public abstract class C3822pj {

    /* renamed from: a */
    private final String f4071a;

    /* renamed from: com.yandex.metrica.impl.ob.pj$a */
    public static final class C3823a {

        /* renamed from: a */
        public static final int f4072a = ((int) TimeUnit.SECONDS.toMillis(30));
    }

    /* renamed from: b */
    public abstract boolean mo40841b();

    public C3822pj(String str) {
        this.f4071a = str;
    }

    /* renamed from: a */
    public HttpURLConnection mo40840a() throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f4071a).openConnection();
        httpURLConnection.setConnectTimeout(C3823a.f4072a);
        httpURLConnection.setReadTimeout(C3823a.f4072a);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("User-Agent", C3266ci.m2611a("com.yandex.mobile.metrica.sdk"));
        return httpURLConnection;
    }
}
