package com.yandex.metrica.impl.p039ob;

import java.util.HashMap;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.vx */
public class C4214vx extends HashMap<String, String> {

    /* renamed from: a */
    private int f5252a = 0;

    public C4214vx() {
    }

    public C4214vx(String str) throws JSONException {
        super(C4204vq.m5895b(str));
        for (String str2 : keySet()) {
            String str3 = (String) get(str2);
            this.f5252a += str2.length() + (str3 == null ? 0 : str3.length());
        }
    }

    /* renamed from: a */
    public String put(String str, String str2) {
        if (containsKey(str)) {
            if (str2 == null) {
                return remove(str);
            }
            String str3 = (String) get(str);
            this.f5252a += str2.length() - (str3 == null ? 0 : str3.length());
            return (String) super.put(str, str2);
        } else if (str2 == null) {
            return null;
        } else {
            this.f5252a += str.length() + str2.length();
            return (String) super.put(str, str2);
        }
    }

    /* renamed from: a */
    public String remove(Object obj) {
        int i;
        if (containsKey(obj)) {
            String str = (String) get(obj);
            int i2 = this.f5252a;
            int length = ((String) obj).length();
            if (str == null) {
                i = 0;
            } else {
                i = str.length();
            }
            this.f5252a = i2 - (length + i);
        }
        return (String) super.remove(obj);
    }

    /* renamed from: a */
    public int mo41714a() {
        return this.f5252a;
    }
}
