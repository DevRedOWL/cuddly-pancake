package p042cz.msebera.android.httpclient.impl.client.cache;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import p042cz.msebera.android.httpclient.Header;
import p042cz.msebera.android.httpclient.HttpResponse;
import p042cz.msebera.android.httpclient.client.cache.HttpCacheEntry;
import p042cz.msebera.android.httpclient.client.cache.ResourceFactory;
import p042cz.msebera.android.httpclient.client.utils.DateUtils;
import p042cz.msebera.android.httpclient.util.Args;

/* renamed from: cz.msebera.android.httpclient.impl.client.cache.CacheEntryUpdater */
class CacheEntryUpdater {
    private final ResourceFactory resourceFactory;

    CacheEntryUpdater() {
        this(new HeapResourceFactory());
    }

    CacheEntryUpdater(ResourceFactory resourceFactory2) {
        this.resourceFactory = resourceFactory2;
    }

    public HttpCacheEntry updateCacheEntry(String str, HttpCacheEntry httpCacheEntry, Date date, Date date2, HttpResponse httpResponse) throws IOException {
        Args.check(httpResponse.getStatusLine().getStatusCode() == 304, "Response must have 304 status code");
        return new HttpCacheEntry(date, date2, httpCacheEntry.getStatusLine(), mergeHeaders(httpCacheEntry, httpResponse), httpCacheEntry.getResource() != null ? this.resourceFactory.copy(str, httpCacheEntry.getResource()) : null);
    }

    /* access modifiers changed from: protected */
    public Header[] mergeHeaders(HttpCacheEntry httpCacheEntry, HttpResponse httpResponse) {
        if (entryAndResponseHaveDateHeader(httpCacheEntry, httpResponse) && entryDateHeaderNewerThenResponse(httpCacheEntry, httpResponse)) {
            return httpCacheEntry.getAllHeaders();
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(httpCacheEntry.getAllHeaders()));
        removeCacheHeadersThatMatchResponse(arrayList, httpResponse);
        removeCacheEntry1xxWarnings(arrayList, httpCacheEntry);
        arrayList.addAll(Arrays.asList(httpResponse.getAllHeaders()));
        return (Header[]) arrayList.toArray(new Header[arrayList.size()]);
    }

    private void removeCacheHeadersThatMatchResponse(List<Header> list, HttpResponse httpResponse) {
        for (Header header : httpResponse.getAllHeaders()) {
            ListIterator<Header> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                if (listIterator.next().getName().equals(header.getName())) {
                    listIterator.remove();
                }
            }
        }
    }

    private void removeCacheEntry1xxWarnings(List<Header> list, HttpCacheEntry httpCacheEntry) {
        ListIterator<Header> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if ("Warning".equals(listIterator.next().getName())) {
                for (Header value : httpCacheEntry.getHeaders("Warning")) {
                    if (value.getValue().startsWith("1")) {
                        listIterator.remove();
                    }
                }
            }
        }
    }

    private boolean entryDateHeaderNewerThenResponse(HttpCacheEntry httpCacheEntry, HttpResponse httpResponse) {
        Date parseDate = DateUtils.parseDate(httpCacheEntry.getFirstHeader("Date").getValue());
        Date parseDate2 = DateUtils.parseDate(httpResponse.getFirstHeader("Date").getValue());
        if (parseDate == null || parseDate2 == null || !parseDate.after(parseDate2)) {
            return false;
        }
        return true;
    }

    private boolean entryAndResponseHaveDateHeader(HttpCacheEntry httpCacheEntry, HttpResponse httpResponse) {
        return (httpCacheEntry.getFirstHeader("Date") == null || httpResponse.getFirstHeader("Date") == null) ? false : true;
    }
}
