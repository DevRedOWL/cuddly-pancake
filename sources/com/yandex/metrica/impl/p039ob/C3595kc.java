package com.yandex.metrica.impl.p039ob;

import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.kc */
public class C3595kc {
    /* renamed from: a */
    public boolean mo40344a(File file) {
        if (!file.exists()) {
            return mo40345b(file);
        }
        if (file.isDirectory()) {
            return true;
        }
        if (file.delete()) {
            return mo40345b(file);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo40345b(File file) {
        return file.mkdir();
    }
}
