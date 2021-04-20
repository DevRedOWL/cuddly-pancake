package com.yandex.metrica.impl.p039ob;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.common.util.UriUtil;

/* renamed from: com.yandex.metrica.impl.ob.pk */
public class C3824pk extends C3822pj {
    /* renamed from: b */
    public boolean mo40841b() {
        return true;
    }

    public C3824pk(String str) {
        super(m4493a(str));
    }

    /* renamed from: a */
    private static String m4493a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        return "http".equals(parse.getScheme()) ? parse.buildUpon().scheme(UriUtil.HTTPS_SCHEME).build().toString() : str;
    }
}
