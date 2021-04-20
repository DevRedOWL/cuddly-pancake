package p046io.realm.internal.android;

import android.os.Handler;
import android.os.Looper;
import javax.annotation.Nullable;
import p046io.realm.internal.Capabilities;
import p046io.realm.internal.OsSharedRealm;
import p046io.realm.internal.RealmNotifier;

/* renamed from: io.realm.internal.android.AndroidRealmNotifier */
public class AndroidRealmNotifier extends RealmNotifier {
    private Handler handler;

    public AndroidRealmNotifier(@Nullable OsSharedRealm osSharedRealm, Capabilities capabilities) {
        super(osSharedRealm);
        if (capabilities.canDeliverNotification()) {
            this.handler = new Handler(Looper.myLooper());
        } else {
            this.handler = null;
        }
    }

    public boolean post(Runnable runnable) {
        Handler handler2 = this.handler;
        return handler2 != null && handler2.post(runnable);
    }
}
