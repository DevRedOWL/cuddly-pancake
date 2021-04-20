package com.yandex.metrica.push.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* renamed from: com.yandex.metrica.push.impl.bt */
public class C4370bt {

    /* renamed from: a */
    private final C4381cc f5486a;

    public C4370bt(Context context) {
        this.f5486a = new C4382cd(context).mo42022a();
    }

    /* renamed from: a */
    public Bitmap mo42008a(Context context, String str, float f, float f2) {
        return mo42009a(str, context.getResources().getDisplayMetrics().density, f, f2);
    }

    /* renamed from: a */
    public Bitmap mo42009a(String str, float f, float f2, float f3) {
        float f4 = f2 * f;
        float f5 = f * f3;
        byte[] a = this.f5486a.mo42021a(str);
        if (a == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(a, 0, a.length, options);
        float f6 = 1.0f;
        float f7 = f2 > 0.0f ? ((float) options.outWidth) / f4 : 1.0f;
        if (f3 > 0.0f) {
            f6 = ((float) options.outHeight) / f5;
        }
        float max = Math.max(f7, f6);
        options.inJustDecodeBounds = false;
        options.inSampleSize = Math.round(max);
        return BitmapFactory.decodeByteArray(a, 0, a.length, options);
    }
}
