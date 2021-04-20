package p046io.realm;

import javax.annotation.Nullable;
import p046io.realm.RealmModel;

/* renamed from: io.realm.RealmObjectChangeListener */
public interface RealmObjectChangeListener<T extends RealmModel> {
    void onChange(T t, @Nullable ObjectChangeSet objectChangeSet);
}
