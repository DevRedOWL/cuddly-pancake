package com.yandex.metrica.impl.p039ob;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.text.Typography;

/* renamed from: com.yandex.metrica.impl.ob.f */
public final class C3412f {
    /* renamed from: a */
    public static <T extends C3365e> String m3232a(T t) {
        if (t == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            m3234a((String) null, t, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            return "Error printing proto: " + e.getMessage();
        } catch (InvocationTargetException e2) {
            return "Error printing proto: " + e2.getMessage();
        }
    }

    /* renamed from: a */
    private static void m3234a(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) throws IllegalAccessException, InvocationTargetException {
        int i;
        if (obj != null) {
            if (obj instanceof C3365e) {
                int length = stringBuffer.length();
                if (str != null) {
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(m3233a(str));
                    stringBuffer2.append(" <\n");
                    stringBuffer.append("  ");
                }
                Class<?> cls = obj.getClass();
                for (Field field : cls.getFields()) {
                    int modifiers = field.getModifiers();
                    String name = field.getName();
                    if ((modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                        Class<?> type = field.getType();
                        Object obj2 = field.get(obj);
                        if (!type.isArray()) {
                            m3234a(name, obj2, stringBuffer, stringBuffer2);
                        } else if (type.getComponentType() == Byte.TYPE) {
                            m3234a(name, obj2, stringBuffer, stringBuffer2);
                        } else {
                            if (obj2 == null) {
                                i = 0;
                            } else {
                                i = Array.getLength(obj2);
                            }
                            for (int i2 = 0; i2 < i; i2++) {
                                m3234a(name, Array.get(obj2, i2), stringBuffer, stringBuffer2);
                            }
                        }
                    }
                }
                for (Method name2 : cls.getMethods()) {
                    String name3 = name2.getName();
                    if (name3.startsWith("set")) {
                        String substring = name3.substring(3);
                        try {
                            if (((Boolean) cls.getMethod("has" + substring, new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                                m3234a(substring, cls.getMethod("get" + substring, new Class[0]).invoke(obj, new Object[0]), stringBuffer, stringBuffer2);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                }
                if (str != null) {
                    stringBuffer.setLength(length);
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(">\n");
                    return;
                }
                return;
            }
            String a = m3233a(str);
            stringBuffer2.append(stringBuffer);
            stringBuffer2.append(a);
            stringBuffer2.append(": ");
            if (obj instanceof String) {
                String b = m3236b((String) obj);
                stringBuffer2.append("\"");
                stringBuffer2.append(b);
                stringBuffer2.append("\"");
            } else if (obj instanceof byte[]) {
                m3235a((byte[]) obj, stringBuffer2);
            } else {
                stringBuffer2.append(obj);
            }
            stringBuffer2.append("\n");
        }
    }

    /* renamed from: a */
    private static String m3233a(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (i == 0) {
                stringBuffer.append(Character.toLowerCase(charAt));
            } else if (Character.isUpperCase(charAt)) {
                stringBuffer.append('_');
                stringBuffer.append(Character.toLowerCase(charAt));
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    private static String m3236b(String str) {
        if (!str.startsWith("http") && str.length() > 200) {
            str = str.substring(0, 200) + "[...]";
        }
        return m3237c(str);
    }

    /* renamed from: c */
    private static String m3237c(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                sb.append(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static void m3235a(byte[] bArr, StringBuffer stringBuffer) {
        if (bArr == null) {
            stringBuffer.append("\"\"");
            return;
        }
        stringBuffer.append(Typography.quote);
        for (byte b : bArr) {
            byte b2 = b & 255;
            if (b2 == 92 || b2 == 34) {
                stringBuffer.append('\\');
                stringBuffer.append((char) b2);
            } else if (b2 < 32 || b2 >= Byte.MAX_VALUE) {
                stringBuffer.append(String.format("\\%03o", new Object[]{Integer.valueOf(b2)}));
            } else {
                stringBuffer.append((char) b2);
            }
        }
        stringBuffer.append(Typography.quote);
    }
}
