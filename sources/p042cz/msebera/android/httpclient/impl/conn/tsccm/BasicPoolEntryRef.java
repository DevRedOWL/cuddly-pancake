package p042cz.msebera.android.httpclient.impl.conn.tsccm;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import p042cz.msebera.android.httpclient.conn.routing.HttpRoute;
import p042cz.msebera.android.httpclient.util.Args;

@Deprecated
/* renamed from: cz.msebera.android.httpclient.impl.conn.tsccm.BasicPoolEntryRef */
public class BasicPoolEntryRef extends WeakReference<BasicPoolEntry> {
    private final HttpRoute route;

    public BasicPoolEntryRef(BasicPoolEntry basicPoolEntry, ReferenceQueue<Object> referenceQueue) {
        super(basicPoolEntry, referenceQueue);
        Args.notNull(basicPoolEntry, "Pool entry");
        this.route = basicPoolEntry.getPlannedRoute();
    }

    public final HttpRoute getRoute() {
        return this.route;
    }
}
