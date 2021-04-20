package p046io.realm.internal;

import javax.annotation.Nullable;

/* renamed from: io.realm.internal.Capabilities */
public interface Capabilities {
    boolean canDeliverNotification();

    void checkCanDeliverNotification(@Nullable String str);

    boolean isMainThread();
}
