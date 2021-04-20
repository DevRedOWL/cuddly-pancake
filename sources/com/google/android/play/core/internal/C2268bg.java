package com.google.android.play.core.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;

/* renamed from: com.google.android.play.core.internal.bg */
public final class C2268bg<T> {

    /* renamed from: a */
    private final Object f1950a;

    /* renamed from: b */
    private final Field f1951b;

    /* renamed from: c */
    private final Class<T> f1952c;

    C2268bg(Object obj, Field field, Class<T> cls) {
        this.f1950a = obj;
        this.f1951b = field;
        this.f1952c = cls;
    }

    C2268bg(Object obj, Field field, Class cls, byte[] bArr) {
        this(obj, field, Array.newInstance(cls, 0).getClass());
    }

    /* renamed from: f */
    private Class m1205f() {
        return mo33839c().getType().getComponentType();
    }

    /* renamed from: a */
    public final T mo33837a() {
        try {
            return this.f1952c.cast(this.f1951b.get(this.f1950a));
        } catch (Exception e) {
            throw new C2270bi(String.format("Failed to get value of field %s of type %s on object of type %s", new Object[]{this.f1951b.getName(), this.f1950a.getClass().getName(), this.f1952c.getName()}), e);
        }
    }

    /* renamed from: b */
    public final void mo33838b(T t) {
        try {
            this.f1951b.set(this.f1950a, t);
        } catch (Exception e) {
            throw new C2270bi(String.format("Failed to set value of field %s of type %s on object of type %s", new Object[]{this.f1951b.getName(), this.f1950a.getClass().getName(), this.f1952c.getName()}), e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Field mo33839c() {
        return this.f1951b;
    }

    /* renamed from: d */
    public void mo33840d(Collection collection) {
        Object[] objArr = (Object[]) mo33837a();
        int length = objArr == null ? 0 : objArr.length;
        Object[] objArr2 = (Object[]) Array.newInstance(m1205f(), collection.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        for (Object obj : collection) {
            objArr2[length] = obj;
            length++;
        }
        mo33838b(objArr2);
    }

    /* renamed from: e */
    public void mo33841e(Collection collection) {
        Object[] objArr = (Object[]) mo33837a();
        int i = 0;
        Object[] objArr2 = (Object[]) Array.newInstance(m1205f(), (objArr == null ? 0 : objArr.length) + collection.size());
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        for (Object obj : collection) {
            objArr2[i] = obj;
            i++;
        }
        mo33838b(objArr2);
    }
}
