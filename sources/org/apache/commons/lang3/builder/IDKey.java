package org.apache.commons.lang3.builder;

final class IDKey {

    /* renamed from: id */
    private final int f6287id;
    private final Object value;

    IDKey(Object obj) {
        this.f6287id = System.identityHashCode(obj);
        this.value = obj;
    }

    public int hashCode() {
        return this.f6287id;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IDKey)) {
            return false;
        }
        IDKey iDKey = (IDKey) obj;
        if (this.f6287id == iDKey.f6287id && this.value == iDKey.value) {
            return true;
        }
        return false;
    }
}
