package com.yandex.metrica.impl.p039ob;

import android.util.SparseArray;
import com.facebook.common.util.UriUtil;
import com.yandex.metrica.impl.p039ob.C3125af;

/* renamed from: com.yandex.metrica.impl.ob.kd */
public class C3596kd {

    /* renamed from: c */
    private static SparseArray<C3596kd> f3533c = new SparseArray<>();

    /* renamed from: a */
    public final String f3534a;

    /* renamed from: b */
    public final String f3535b;

    static {
        f3533c.put(C3125af.C3126a.EVENT_TYPE_EXCEPTION_UNHANDLED.mo39462a(), new C3596kd("jvm", "binder"));
        f3533c.put(C3125af.C3126a.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.mo39462a(), new C3596kd("jvm", "binder"));
        f3533c.put(C3125af.C3126a.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT.mo39462a(), new C3596kd("jvm", "intent"));
        f3533c.put(C3125af.C3126a.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE.mo39462a(), new C3596kd("jvm", UriUtil.LOCAL_FILE_SCHEME));
        f3533c.put(C3125af.C3126a.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH.mo39462a(), new C3596kd("jni_native", UriUtil.LOCAL_FILE_SCHEME));
        f3533c.put(C3125af.C3126a.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH.mo39462a(), new C3596kd("jni_native", UriUtil.LOCAL_FILE_SCHEME));
    }

    private C3596kd(String str, String str2) {
        this.f3534a = str;
        this.f3535b = str2;
    }

    /* renamed from: a */
    public static C3596kd m3690a(int i) {
        return f3533c.get(i);
    }
}
