package com.yandex.metrica.impl.p039ob;

import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Field;
import p042cz.msebera.android.httpclient.cookie.ClientCookie;

/* renamed from: com.yandex.metrica.impl.ob.ob */
public final class C3768ob {

    /* renamed from: a */
    private final String f3898a;

    /* renamed from: b */
    private final int f3899b;

    /* renamed from: c */
    private final boolean f3900c;

    public C3768ob(JSONObject jSONObject) throws JSONException {
        this.f3898a = jSONObject.getString("name");
        this.f3900c = jSONObject.getBoolean(Field.JsonFields.required);
        this.f3899b = jSONObject.optInt(ClientCookie.VERSION_ATTR, -1);
    }

    public C3768ob(String str, int i, boolean z) {
        this.f3898a = str;
        this.f3899b = i;
        this.f3900c = z;
    }

    public C3768ob(String str, boolean z) {
        this(str, -1, z);
    }

    /* renamed from: a */
    public JSONObject mo40736a() throws JSONException {
        JSONObject put = new JSONObject().put("name", this.f3898a).put(Field.JsonFields.required, this.f3900c);
        int i = this.f3899b;
        if (i != -1) {
            put.put(ClientCookie.VERSION_ATTR, i);
        }
        return put;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3768ob obVar = (C3768ob) obj;
        if (this.f3899b != obVar.f3899b || this.f3900c != obVar.f3900c) {
            return false;
        }
        String str = this.f3898a;
        String str2 = obVar.f3898a;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f3898a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f3899b) * 31) + (this.f3900c ? 1 : 0);
    }
}
