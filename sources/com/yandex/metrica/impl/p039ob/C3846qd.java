package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.qd */
public abstract class C3846qd {

    /* renamed from: d */
    private static final C3853qk f4102d = new C3853qk("UNDEFINED_");

    /* renamed from: a */
    protected C3853qk f4103a;

    /* renamed from: b */
    protected final String f4104b;

    /* renamed from: c */
    protected final SharedPreferences f4105c;

    /* renamed from: e */
    private final Map<String, Object> f4106e = new HashMap();

    /* renamed from: f */
    private boolean f4107f = false;

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract String mo40896f();

    public C3846qd(Context context, String str) {
        this.f4104b = str;
        this.f4105c = m4568a(context);
        this.f4103a = new C3853qk(f4102d.mo40945a(), this.f4104b);
    }

    /* renamed from: a */
    private SharedPreferences m4568a(Context context) {
        return C3854ql.m4639a(context, mo40896f());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T extends C3846qd> T mo40898a(String str, Object obj) {
        synchronized (this) {
            if (obj != null) {
                this.f4106e.put(str, obj);
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public <T extends C3846qd> T mo40900h(String str) {
        synchronized (this) {
            this.f4106e.put(str, this);
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public <T extends C3846qd> T mo40899h() {
        synchronized (this) {
            this.f4107f = true;
            this.f4106e.clear();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo40901i() {
        return this.f4104b;
    }

    /* renamed from: j */
    public void mo40902j() {
        synchronized (this) {
            mo40887a();
            this.f4106e.clear();
            this.f4107f = false;
        }
    }

    /* renamed from: a */
    private void mo40887a() {
        SharedPreferences.Editor edit = this.f4105c.edit();
        if (this.f4107f) {
            edit.clear();
            m4570a(edit);
            return;
        }
        for (Map.Entry next : this.f4106e.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value == this) {
                edit.remove(str);
            } else if (value instanceof String) {
                edit.putString(str, (String) value);
            } else if (value instanceof Long) {
                edit.putLong(str, ((Long) value).longValue());
            } else if (value instanceof Integer) {
                edit.putInt(str, ((Integer) value).intValue());
            } else if (value instanceof Boolean) {
                edit.putBoolean(str, ((Boolean) value).booleanValue());
            } else if (value != null) {
                throw new UnsupportedOperationException();
            }
        }
        m4570a(edit);
    }

    /* renamed from: a */
    private void m4570a(SharedPreferences.Editor editor) {
        editor.apply();
    }
}
