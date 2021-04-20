package p042cz.msebera.android.httpclient.impl.client.cache;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import p042cz.msebera.android.httpclient.client.cache.HttpCacheEntry;
import p042cz.msebera.android.httpclient.client.cache.Resource;
import p042cz.msebera.android.httpclient.util.Args;

/* renamed from: cz.msebera.android.httpclient.impl.client.cache.ResourceReference */
class ResourceReference extends PhantomReference<HttpCacheEntry> {
    private final Resource resource;

    public ResourceReference(HttpCacheEntry httpCacheEntry, ReferenceQueue<HttpCacheEntry> referenceQueue) {
        super(httpCacheEntry, referenceQueue);
        Args.notNull(httpCacheEntry.getResource(), "Resource");
        this.resource = httpCacheEntry.getResource();
    }

    public Resource getResource() {
        return this.resource;
    }

    public int hashCode() {
        return this.resource.hashCode();
    }

    public boolean equals(Object obj) {
        return this.resource.equals(obj);
    }
}
