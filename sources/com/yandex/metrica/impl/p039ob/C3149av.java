package com.yandex.metrica.impl.p039ob;

import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.impl.ob.av */
public class C3149av {

    /* renamed from: a */
    private static final Pattern f2599a = Pattern.compile("com\\.yandex\\.metrica\\.(?!push)");

    /* renamed from: b */
    private static final Pattern f2600b = Pattern.compile("com\\.yandex\\.metrica\\.push\\..*");

    /* renamed from: a */
    public boolean mo39528a(List<StackTraceElement> list) {
        return m2069a(list, f2599a);
    }

    /* renamed from: b */
    public boolean mo39529b(List<StackTraceElement> list) {
        return m2069a(list, f2600b);
    }

    /* renamed from: a */
    private boolean m2069a(List<StackTraceElement> list, Pattern pattern) {
        for (StackTraceElement className : list) {
            if (pattern.matcher(className.getClassName()).find()) {
                return true;
            }
        }
        return false;
    }
}
