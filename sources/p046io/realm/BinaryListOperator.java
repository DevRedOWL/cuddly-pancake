package p046io.realm;

import java.util.Locale;
import javax.annotation.Nullable;
import p046io.realm.internal.OsList;

/* renamed from: io.realm.BinaryListOperator */
/* compiled from: RealmList */
final class BinaryListOperator extends ManagedListOperator<byte[]> {
    public boolean forRealmModel() {
        return false;
    }

    BinaryListOperator(BaseRealm baseRealm, OsList osList, Class<byte[]> cls) {
        super(baseRealm, osList, cls);
    }

    @Nullable
    public byte[] get(int i) {
        return (byte[]) this.osList.getValue((long) i);
    }

    /* access modifiers changed from: protected */
    public void checkValidValue(@Nullable Object obj) {
        if (obj != null && !(obj instanceof byte[])) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", new Object[]{"byte[]", obj.getClass().getName()}));
        }
    }

    public void appendValue(Object obj) {
        this.osList.addBinary((byte[]) obj);
    }

    public void insertValue(int i, Object obj) {
        this.osList.insertBinary((long) i, (byte[]) obj);
    }

    /* access modifiers changed from: protected */
    public void setValue(int i, Object obj) {
        this.osList.setBinary((long) i, (byte[]) obj);
    }
}
