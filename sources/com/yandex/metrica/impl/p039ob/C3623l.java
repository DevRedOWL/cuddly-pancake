package com.yandex.metrica.impl.p039ob;

/* renamed from: com.yandex.metrica.impl.ob.l */
public class C3623l {

    /* renamed from: a */
    public final C3624a f3613a;

    /* renamed from: b */
    public final Boolean f3614b;

    /* renamed from: com.yandex.metrica.impl.ob.l$a */
    public enum C3624a {
        ACTIVE,
        WORKING_SET,
        FREQUENT,
        RARE
    }

    public C3623l(C3624a aVar, Boolean bool) {
        this.f3613a = aVar;
        this.f3614b = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3623l lVar = (C3623l) obj;
        if (this.f3613a != lVar.f3613a) {
            return false;
        }
        Boolean bool = this.f3614b;
        if (bool != null) {
            return bool.equals(lVar.f3614b);
        }
        if (lVar.f3614b == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        C3624a aVar = this.f3613a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Boolean bool = this.f3614b;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
