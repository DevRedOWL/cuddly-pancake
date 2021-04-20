package p046io.realm;

import java.util.Collection;
import java.util.Date;
import javax.annotation.Nullable;
import p046io.realm.internal.ManagableObject;

/* renamed from: io.realm.RealmCollection */
public interface RealmCollection<E> extends Collection<E>, ManagableObject {
    double average(String str);

    boolean contains(@Nullable Object obj);

    boolean deleteAllFromRealm();

    boolean isLoaded();

    boolean isManaged();

    boolean isValid();

    boolean load();

    @Nullable
    Number max(String str);

    @Nullable
    Date maxDate(String str);

    @Nullable
    Number min(String str);

    @Nullable
    Date minDate(String str);

    Number sum(String str);

    RealmQuery<E> where();
}
