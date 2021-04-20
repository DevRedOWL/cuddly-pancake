package com.google.android.play.core.internal;

import android.content.ComponentName;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.drew.metadata.exif.ExifDirectoryBase;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/* renamed from: com.google.android.play.core.internal.bh */
public final class C2269bh {
    /* renamed from: a */
    public static <R, P0> R m1211a(Object obj, String str, Class<R> cls, Class<P0> cls2, P0 p0) {
        try {
            return cls.cast(m1223m(obj, str, cls2).invoke(obj, new Object[]{p0}));
        } catch (Exception e) {
            throw new C2270bi(String.format("Failed to invoke method %s on an object of type %s", new Object[]{str, obj.getClass()}), e);
        }
    }

    /* renamed from: b */
    public static <R, P0, P1, P2> R m1212b(Object obj, String str, Class<R> cls, Class<P0> cls2, P0 p0, Class<P1> cls3, P1 p1, Class<P2> cls4, P2 p2) {
        try {
            return cls.cast(m1223m(obj, str, cls2, cls3, cls4).invoke(obj, new Object[]{p0, p1, p2}));
        } catch (Exception e) {
            throw new C2270bi(String.format("Failed to invoke method %s on an object of type %s", new Object[]{str, obj.getClass()}), e);
        }
    }

    /* renamed from: c */
    public static <R> R m1213c(Class<R> cls) {
        try {
            Constructor<R> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor.newInstance(new Object[0]);
        } catch (Exception e) {
            throw new C2270bi(String.format("Failed to invoke default constructor on class %s", new Object[]{cls.getName()}), e);
        }
    }

    /* renamed from: d */
    public static <T> C2268bg<T> m1214d(Object obj, String str, Class<T> cls) {
        return new C2268bg<>(obj, m1225o(obj, str), cls);
    }

    /* renamed from: e */
    public static <T> C2268bg m1215e(Object obj, String str, Class<T> cls) {
        return new C2268bg(obj, m1225o(obj, str), cls, (byte[]) null);
    }

    /* renamed from: f */
    public static <R, P0> R m1216f(Class cls, Class<R> cls2, Class<P0> cls3, P0 p0) {
        try {
            return cls2.cast(m1224n(cls, "isDexOptNeeded", cls3).invoke((Object) null, new Object[]{p0}));
        } catch (Exception e) {
            throw new C2270bi(String.format("Failed to invoke static method %s on type %s", new Object[]{"isDexOptNeeded", cls}), e);
        }
    }

    /* renamed from: g */
    public static <R, P0, P1> R m1217g(Class cls, Class<R> cls2, Class<P0> cls3, P0 p0, Class<P1> cls4, P1 p1) {
        try {
            return cls2.cast(m1224n(cls, "optimizedPathFor", cls3, cls4).invoke((Object) null, new Object[]{p0, p1}));
        } catch (Exception e) {
            throw new C2270bi(String.format("Failed to invoke static method %s on type %s", new Object[]{"optimizedPathFor", cls}), e);
        }
    }

    /* renamed from: h */
    public static void m1218h(PackageManager packageManager, ComponentName componentName, int i) {
        ComponentInfo componentInfo;
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        if (componentEnabledSetting != 1) {
            if (componentEnabledSetting != 2) {
                String packageName = componentName.getPackageName();
                String className = componentName.getClassName();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, i | 512);
                    ComponentInfo[][] componentInfoArr = {packageInfo.activities, packageInfo.services, packageInfo.providers};
                    int i2 = 0;
                    loop0:
                    while (true) {
                        if (i2 >= 3) {
                            componentInfo = null;
                            break;
                        }
                        ComponentInfo[] componentInfoArr2 = componentInfoArr[i2];
                        if (componentInfoArr2 != null) {
                            int length = componentInfoArr2.length;
                            for (int i3 = 0; i3 < length; i3++) {
                                componentInfo = componentInfoArr2[i3];
                                if (componentInfo.name.equals(className)) {
                                    break loop0;
                                }
                            }
                            continue;
                        }
                        i2++;
                    }
                    if (componentInfo != null) {
                        if (componentInfo.isEnabled()) {
                            return;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        }
    }

    /* renamed from: i */
    public static <T> void m1219i(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    /* renamed from: j */
    public static <T> void m1220j(T t) {
        if (t == null) {
            throw null;
        }
    }

    /* renamed from: k */
    public static <T> void m1221k(T t) {
        if (t == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    /* renamed from: l */
    public static void m1222l(C2279br brVar, InputStream inputStream, OutputStream outputStream, long j) throws IOException {
        byte[] bArr = new byte[16384];
        InputStream inputStream2 = inputStream;
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, 4096));
        int readInt = dataInputStream.readInt();
        if (readInt != -771763713) {
            String valueOf = String.valueOf(String.format("%x", new Object[]{Integer.valueOf(readInt)}));
            throw new C2278bq(valueOf.length() != 0 ? "Unexpected magic=".concat(valueOf) : new String("Unexpected magic="));
        }
        int read = dataInputStream.read();
        if (read == 4) {
            long j2 = 0;
            while (true) {
                long j3 = j - j2;
                try {
                    int read2 = dataInputStream.read();
                    if (read2 == -1) {
                        throw new IOException("Patch file overrun");
                    } else if (read2 != 0) {
                        switch (read2) {
                            case 247:
                                read2 = dataInputStream.readUnsignedShort();
                                m1226p(bArr, dataInputStream, outputStream, read2, j3);
                                break;
                            case 248:
                                read2 = dataInputStream.readInt();
                                m1226p(bArr, dataInputStream, outputStream, read2, j3);
                                break;
                            case 249:
                                long readUnsignedShort = (long) dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.read();
                                if (read2 != -1) {
                                    m1227q(bArr, brVar, outputStream, readUnsignedShort, read2, j3);
                                    break;
                                } else {
                                    throw new IOException("Unexpected end of patch");
                                }
                            case 250:
                                long readUnsignedShort2 = (long) dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.readUnsignedShort();
                                m1227q(bArr, brVar, outputStream, readUnsignedShort2, read2, j3);
                                break;
                            case 251:
                                long readUnsignedShort3 = (long) dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.readInt();
                                m1227q(bArr, brVar, outputStream, readUnsignedShort3, read2, j3);
                                break;
                            case 252:
                                long readInt2 = (long) dataInputStream.readInt();
                                read2 = dataInputStream.read();
                                if (read2 != -1) {
                                    m1227q(bArr, brVar, outputStream, readInt2, read2, j3);
                                    break;
                                } else {
                                    throw new IOException("Unexpected end of patch");
                                }
                            case 253:
                                long readInt3 = (long) dataInputStream.readInt();
                                read2 = dataInputStream.readUnsignedShort();
                                m1227q(bArr, brVar, outputStream, readInt3, read2, j3);
                                break;
                            case ExifDirectoryBase.TAG_NEW_SUBFILE_TYPE:
                                long readInt4 = (long) dataInputStream.readInt();
                                read2 = dataInputStream.readInt();
                                m1227q(bArr, brVar, outputStream, readInt4, read2, j3);
                                break;
                            case 255:
                                long readLong = dataInputStream.readLong();
                                read2 = dataInputStream.readInt();
                                m1227q(bArr, brVar, outputStream, readLong, read2, j3);
                                break;
                            default:
                                m1226p(bArr, dataInputStream, outputStream, read2, j3);
                                break;
                        }
                        j2 += (long) read2;
                    } else {
                        return;
                    }
                } finally {
                    outputStream.flush();
                }
            }
        } else {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Unexpected version=");
            sb.append(read);
            throw new C2278bq(sb.toString());
        }
    }

    /* renamed from: m */
    private static Method m1223m(Object obj, String str, Class<?>... clsArr) {
        return m1224n(obj.getClass(), str, clsArr);
    }

    /* renamed from: n */
    private static Method m1224n(Class<?> cls, String str, Class<?>... clsArr) {
        Class<?> cls2 = cls;
        while (cls2 != null) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls2 = cls2.getSuperclass();
            }
        }
        throw new C2270bi(String.format("Could not find a method named %s with parameters %s in type %s", new Object[]{str, Arrays.asList(clsArr), cls}));
    }

    /* renamed from: o */
    private static Field m1225o(Object obj, String str) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new C2270bi(String.format("Failed to find a field named %s on an object of instance %s", new Object[]{str, obj.getClass().getName()}));
    }

    /* renamed from: p */
    private static void m1226p(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i, long j) throws IOException {
        if (i < 0) {
            throw new IOException("copyLength negative");
        } else if (((long) i) <= j) {
            while (i > 0) {
                try {
                    int min = Math.min(i, 16384);
                    dataInputStream.readFully(bArr, 0, min);
                    outputStream.write(bArr, 0, min);
                    i -= min;
                } catch (EOFException unused) {
                    throw new IOException("patch underrun");
                }
            }
        } else {
            throw new IOException("Output length overrun");
        }
    }

    /* renamed from: q */
    private static void m1227q(byte[] bArr, C2279br brVar, OutputStream outputStream, long j, int i, long j2) throws IOException {
        InputStream c;
        Throwable th;
        byte[] bArr2 = bArr;
        int i2 = i;
        if (i2 < 0) {
            throw new IOException("copyLength negative");
        } else if (j >= 0) {
            long j3 = (long) i2;
            if (j3 <= j2) {
                try {
                    c = new C2280bs(brVar, j, j3).mo33863c();
                    while (i2 > 0) {
                        int min = Math.min(i2, 16384);
                        int i3 = 0;
                        while (i3 < min) {
                            int read = c.read(bArr, i3, min - i3);
                            if (read != -1) {
                                i3 += read;
                            } else {
                                throw new IOException("truncated input stream");
                            }
                        }
                        OutputStream outputStream2 = outputStream;
                        outputStream.write(bArr, 0, min);
                        i2 -= min;
                    }
                    c.close();
                    return;
                } catch (EOFException e) {
                    throw new IOException("patch underrun", e);
                } catch (Throwable th2) {
                    C2287bz.m1273a(th, th2);
                }
            } else {
                throw new IOException("Output length overrun");
            }
        } else {
            throw new IOException("inputOffset negative");
        }
        throw th;
    }
}
