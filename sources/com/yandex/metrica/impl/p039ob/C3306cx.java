package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.common.IdManager;
import java.io.Closeable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: com.yandex.metrica.impl.ob.cx */
public final class C3306cx {

    /* renamed from: a */
    private static final C4281yc f2983a = new C4281yc();

    /* renamed from: a */
    public static boolean m2858a(Object obj) {
        return obj != null;
    }

    /* renamed from: a */
    public static String m2844a(Context context, String str) {
        return String.valueOf(m2872c(context, str));
    }

    /* renamed from: b */
    public static String m2865b(Context context, String str) {
        PackageInfo a = f2983a.mo41859a(context, str);
        if (a == null) {
            return IdManager.DEFAULT_VERSION_NAME;
        }
        return a.versionName;
    }

    /* renamed from: c */
    public static int m2872c(Context context, String str) {
        PackageInfo a = f2983a.mo41859a(context, str);
        if (a == null) {
            return 0;
        }
        return a.versionCode;
    }

    /* renamed from: a */
    public static String m2846a(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        String obj = stringWriter.toString();
        printWriter.close();
        return obj;
    }

    /* renamed from: b */
    public static StackTraceElement[] m2871b(Throwable th) {
        if (th != null) {
            try {
                return th.getStackTrace();
            } catch (Throwable unused) {
            }
        }
        return new StackTraceElement[0];
    }

    /* renamed from: a */
    public static boolean m2857a(int i) {
        return Build.VERSION.SDK_INT >= i;
    }

    /* renamed from: b */
    public static boolean m2869b(int i) {
        return Build.VERSION.SDK_INT > i;
    }

    /* renamed from: a */
    public static void m2855a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m2856a(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m2852a(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    /* renamed from: a */
    public static boolean m2859a(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public static List<ResolveInfo> m2848a(Context context, String str, String str2) {
        try {
            Intent intent = new Intent(str, (Uri) null);
            intent.addCategory(str2);
            return f2983a.mo41862a(context, intent, 0);
        } catch (Throwable unused) {
            return new ArrayList();
        }
    }

    /* renamed from: a */
    public static List<PackageInfo> m2847a(Context context) {
        return f2983a.mo41861a(context, 0);
    }

    /* renamed from: a */
    public static void m2853a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.endTransaction();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m2868b(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m2862a(Map map) {
        return map == null || map.size() == 0;
    }

    /* renamed from: a */
    public static boolean m2861a(Collection collection) {
        return collection == null || collection.size() == 0;
    }

    /* renamed from: a */
    public static <T> boolean m2864a(T[] tArr) {
        return tArr == null || tArr.length == 0;
    }

    /* renamed from: a */
    public static boolean m2863a(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    /* renamed from: b */
    public static boolean m2870b(Cursor cursor) {
        return cursor == null || cursor.getCount() == 0;
    }

    /* renamed from: a */
    public static boolean m2860a(String str) {
        return !TextUtils.isEmpty(str) && !"-1".equals(str);
    }

    /* renamed from: b */
    public static String m2866b(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 36) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.replace(8, str.length() - 4, "-xxxx-xxxx-xxxx-xxxxxxxx");
        return sb.toString();
    }

    /* renamed from: a */
    public static <K, V> V m2843a(Map<K, V> map, K k, V v) {
        V v2 = map.get(k);
        return v2 == null ? v : v2;
    }

    /* renamed from: a */
    public static Set<Integer> m2851a(int[] iArr) {
        HashSet hashSet = new HashSet();
        for (int valueOf : iArr) {
            hashSet.add(Integer.valueOf(valueOf));
        }
        return hashSet;
    }

    /* renamed from: a */
    public static <T> List<T> m2849a(List<T> list, int i) {
        if (list.size() <= i) {
            return list;
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(list.get(i2));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m2845a(String str, int i) {
        return str.length() > i ? str.substring(0, 100) : str;
    }

    /* renamed from: b */
    public static <K, V> Map<K, V> m2867b(Map<K, V> map) {
        if (m2862a((Map) map)) {
            return null;
        }
        return new HashMap(map);
    }

    /* renamed from: a */
    public static List<String> m2850a(String... strArr) {
        TreeSet treeSet = new TreeSet();
        Collections.addAll(treeSet, strArr);
        return Collections.unmodifiableList(new ArrayList(treeSet));
    }

    /* renamed from: a */
    public static <T> void m2854a(C4235wn<T> wnVar, T t, String str, String str2) {
        if (t != null) {
            try {
                wnVar.mo39902a(t);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static <T, S> S m2841a(C4236wo<T, S> woVar, T t, String str, String str2) {
        if (t == null) {
            return null;
        }
        try {
            return woVar.mo39698a(t);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static <T, S> S m2842a(C4236wo<T, S> woVar, T t, String str, String str2, S s) {
        S a = m2841a(woVar, t, str, str2);
        return a == null ? s : a;
    }
}
