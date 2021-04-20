package com.yandex.metrica.push.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.Closeable;

/* renamed from: com.yandex.metrica.push.impl.cb */
public class C4380cb {
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        if (m6466a(r3, r1) == null) goto L_0x002f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Integer m6468a(android.content.Context r3, java.lang.String r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L_0x002f
            int r1 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x0012 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0012 }
            android.graphics.drawable.Drawable r3 = m6466a((android.content.Context) r3, (java.lang.Integer) r1)     // Catch:{ NumberFormatException -> 0x0012 }
            if (r3 != 0) goto L_0x0030
            goto L_0x002f
        L_0x0012:
            java.lang.String r1 = "drawable"
            int r1 = m6463a(r3, r4, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r1.intValue()
            if (r2 != 0) goto L_0x0030
            java.lang.String r1 = "mipmap"
            int r3 = m6463a(r3, r4, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1 = r3
            goto L_0x0030
        L_0x002f:
            r1 = r0
        L_0x0030:
            if (r1 == 0) goto L_0x003a
            int r3 = r1.intValue()
            if (r3 != 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            return r1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.push.impl.C4380cb.m6468a(android.content.Context, java.lang.String):java.lang.Integer");
    }

    /* renamed from: a */
    private static Drawable m6466a(Context context, Integer num) {
        try {
            if (m6470a(21)) {
                return context.getResources().getDrawable(num.intValue(), (Resources.Theme) null);
            }
            return context.getResources().getDrawable(num.intValue());
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    static int m6463a(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, context.getPackageName());
    }

    /* renamed from: a */
    public static boolean m6470a(int i) {
        return Build.VERSION.SDK_INT >= i;
    }

    /* renamed from: b */
    public static String m6472b(Context context, String str) {
        String str2;
        Bundle a = m6467a(context);
        if (a == null) {
            str2 = null;
        } else {
            str2 = a.getString(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        return null;
    }

    /* renamed from: a */
    public static Bundle m6467a(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static String m6474c(Context context, String str) {
        try {
            return context.getString(m6463a(context, str, "string"));
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m6471a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m6469a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m6473b(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: a */
    public static Bitmap m6465a(Drawable drawable, float f, float f2, float f3) {
        if (drawable == null) {
            return null;
        }
        Rect bounds = drawable.getBounds();
        float f4 = f * f3;
        float f5 = f2 * f3;
        int i = (f5 > 0.0f ? 1 : (f5 == 0.0f ? 0 : -1));
        if (i <= 0 || f4 <= 0.0f) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth <= 0) {
                intrinsicWidth = bounds.width();
            }
            if (intrinsicHeight <= 0) {
                intrinsicHeight = bounds.height();
            }
            if (i <= 0 && f4 <= 0.0f) {
                f4 = (float) intrinsicWidth;
                f5 = (float) intrinsicHeight;
            } else if (i <= 0 && f4 > 0.0f && intrinsicWidth > 0) {
                f5 = (((float) intrinsicHeight) * f4) / ((float) intrinsicWidth);
            } else if (f5 > 0.0f && f4 <= 0.0f && intrinsicHeight > 0) {
                f4 = (((float) intrinsicWidth) * f5) / ((float) intrinsicHeight);
            }
        }
        if (f4 <= 0.0f || f5 <= 0.0f) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap((int) f4, (int) f5, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        drawable.setBounds(bounds);
        return createBitmap;
    }

    /* renamed from: a */
    public static Bitmap m6464a(Context context, int i, float f, float f2) {
        return m6465a(m6466a(context, Integer.valueOf(i)), f, f2, context.getResources().getDisplayMetrics().density);
    }
}
