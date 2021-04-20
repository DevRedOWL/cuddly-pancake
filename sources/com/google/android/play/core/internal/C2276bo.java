package com.google.android.play.core.internal;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.play.core.internal.bo */
public final class C2276bo {

    /* renamed from: a */
    private final Context f1953a;

    public C2276bo(Context context) {
        this.f1953a = context;
    }

    /* renamed from: b */
    private static String m1258b(Locale locale) {
        String str;
        String valueOf = String.valueOf(locale.getLanguage());
        if (locale.getCountry().isEmpty()) {
            str = "";
        } else {
            String valueOf2 = String.valueOf(locale.getCountry());
            str = valueOf2.length() != 0 ? "_".concat(valueOf2) : new String("_");
        }
        String valueOf3 = String.valueOf(str);
        return valueOf3.length() != 0 ? valueOf.concat(valueOf3) : new String(valueOf);
    }

    /* renamed from: a */
    public final List<String> mo33862a() {
        Configuration configuration = this.f1953a.getResources().getConfiguration();
        if (Build.VERSION.SDK_INT < 24) {
            return Collections.singletonList(m1258b(configuration.locale));
        }
        LocaleList locales = configuration.getLocales();
        ArrayList arrayList = new ArrayList(locales.size());
        for (int i = 0; i < locales.size(); i++) {
            arrayList.add(m1258b(locales.get(i)));
        }
        return arrayList;
    }
}
