package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.yandex.metrica.impl.ob.lx */
public abstract class C3689lx {

    /* renamed from: q */
    public static final String f3740q = C3689lx.class.getSimpleName();

    /* renamed from: a */
    private final C3630lf f3741a;

    /* renamed from: b */
    private final String f3742b;

    public C3689lx(C3630lf lfVar) {
        this(lfVar, (String) null);
    }

    public C3689lx(C3630lf lfVar, String str) {
        this.f3741a = lfVar;
        this.f3742b = str;
    }

    /* renamed from: p */
    public String mo40565p() {
        return this.f3742b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public C3853qk mo40566q(String str) {
        return new C3853qk(str, mo40565p());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public <T extends C3689lx> T mo40560b(String str, String str2) {
        synchronized (this) {
            this.f3741a.mo40457b(str, str2);
        }
        return this;
    }

    /* renamed from: a */
    public <T extends C3689lx> T mo40554a(String str, long j) {
        synchronized (this) {
            this.f3741a.mo40456b(str, j);
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T extends C3689lx> T mo40553a(String str, int i) {
        synchronized (this) {
            this.f3741a.mo40455b(str, i);
        }
        return this;
    }

    /* renamed from: a */
    public <T extends C3689lx> T mo40556a(String str, boolean z) {
        synchronized (this) {
            this.f3741a.mo40458b(str, z);
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T extends C3689lx> T mo40557a(String str, String[] strArr) {
        String str2;
        try {
            JSONArray jSONArray = new JSONArray();
            for (String put : strArr) {
                jSONArray.put(put);
            }
            str2 = jSONArray.toString();
        } catch (Throwable unused) {
            str2 = null;
        }
        this.f3741a.mo40457b(str, str2);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T extends C3689lx> T mo40555a(String str, List<String> list) {
        return mo40557a(str, (String[]) list.toArray(new String[list.size()]));
    }

    /* renamed from: r */
    public <T extends C3689lx> T mo40568r(String str) {
        synchronized (this) {
            this.f3741a.mo40450a(str);
        }
        return this;
    }

    /* renamed from: q */
    public void mo40567q() {
        synchronized (this) {
            this.f3741a.mo40459b();
        }
    }

    /* renamed from: b */
    public long mo40559b(String str, long j) {
        return this.f3741a.mo40449a(str, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo40558b(String str, int i) {
        return this.f3741a.mo40448a(str, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public String mo40569s(String str) {
        return this.f3741a.mo40452a(str, (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo40564c(String str, String str2) {
        return this.f3741a.mo40452a(str, str2);
    }

    /* renamed from: b */
    public boolean mo40562b(String str, boolean z) {
        return this.f3741a.mo40454a(str, z);
    }

    /* renamed from: t */
    public boolean mo40570t(String str) {
        return this.f3741a.mo40460b(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String[] mo40563b(String str, String[] strArr) {
        String a = this.f3741a.mo40452a(str, (String) null);
        if (!TextUtils.isEmpty(a)) {
            try {
                JSONArray jSONArray = new JSONArray(a);
                strArr = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr[i] = jSONArray.optString(i);
                }
            } catch (Throwable unused) {
            }
        }
        return strArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public List<String> mo40561b(String str, List<String> list) {
        String[] b = mo40563b(str, list == null ? null : (String[]) list.toArray(new String[list.size()]));
        if (b == null) {
            return null;
        }
        return Arrays.asList(b);
    }
}
