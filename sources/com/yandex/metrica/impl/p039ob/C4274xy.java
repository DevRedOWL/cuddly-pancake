package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;

/* renamed from: com.yandex.metrica.impl.ob.xy */
public class C4274xy extends C4266xq<String> {
    /* renamed from: a */
    public /* bridge */ /* synthetic */ int mo41838a() {
        return super.mo41838a();
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ String mo41839b() {
        return super.mo41839b();
    }

    public C4274xy(int i, String str) {
        this(i, str, C4206vr.m5905a());
    }

    public C4274xy(int i, String str, C4216vz vzVar) {
        super(i, str, vzVar);
    }

    /* renamed from: a */
    public String mo41840a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            if (bytes.length <= mo41838a()) {
                return str;
            }
            String str2 = new String(bytes, 0, mo41838a(), "UTF-8");
            try {
                if (this.f5323a.mo41688c()) {
                    this.f5323a.mo41685b("\"%s\" %s exceeded limit of %d bytes", mo41839b(), str, Integer.valueOf(mo41838a()));
                }
            } catch (UnsupportedEncodingException unused) {
            }
            return str2;
        } catch (UnsupportedEncodingException unused2) {
            return str;
        }
    }
}
