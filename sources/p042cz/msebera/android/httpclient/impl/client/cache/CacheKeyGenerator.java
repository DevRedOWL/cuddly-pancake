package p042cz.msebera.android.httpclient.impl.client.cache;

import com.facebook.common.util.UriUtil;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import p042cz.msebera.android.httpclient.Consts;
import p042cz.msebera.android.httpclient.Header;
import p042cz.msebera.android.httpclient.HeaderElement;
import p042cz.msebera.android.httpclient.HttpHost;
import p042cz.msebera.android.httpclient.HttpRequest;
import p042cz.msebera.android.httpclient.client.cache.HttpCacheEntry;
import p042cz.msebera.android.httpclient.client.utils.URIUtils;

/* renamed from: cz.msebera.android.httpclient.impl.client.cache.CacheKeyGenerator */
class CacheKeyGenerator {
    private static final URI BASE_URI = URI.create("http://example.com/");

    CacheKeyGenerator() {
    }

    public String getURI(HttpHost httpHost, HttpRequest httpRequest) {
        if (!isRelativeRequest(httpRequest)) {
            return canonicalizeUri(httpRequest.getRequestLine().getUri());
        }
        return canonicalizeUri(String.format("%s%s", new Object[]{httpHost.toString(), httpRequest.getRequestLine().getUri()}));
    }

    public String canonicalizeUri(String str) {
        try {
            URL url = new URL(URIUtils.resolve(BASE_URI, str).toASCIIString());
            String protocol = url.getProtocol();
            String host = url.getHost();
            int canonicalizePort = canonicalizePort(url.getPort(), protocol);
            String path = url.getPath();
            String query = url.getQuery();
            if (query != null) {
                path = path + "?" + query;
            }
            return new URL(protocol, host, canonicalizePort, path).toString();
        } catch (IllegalArgumentException | MalformedURLException unused) {
            return str;
        }
    }

    private int canonicalizePort(int i, String str) {
        if (i == -1 && "http".equalsIgnoreCase(str)) {
            return 80;
        }
        if (i != -1 || !UriUtil.HTTPS_SCHEME.equalsIgnoreCase(str)) {
            return i;
        }
        return 443;
    }

    private boolean isRelativeRequest(HttpRequest httpRequest) {
        String uri = httpRequest.getRequestLine().getUri();
        return "*".equals(uri) || uri.startsWith("/");
    }

    /* access modifiers changed from: protected */
    public String getFullHeaderValue(Header[] headerArr) {
        if (headerArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        int length = headerArr.length;
        int i = 0;
        boolean z = true;
        while (i < length) {
            Header header = headerArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append(header.getValue().trim());
            i++;
            z = false;
        }
        return sb.toString();
    }

    public String getVariantURI(HttpHost httpHost, HttpRequest httpRequest, HttpCacheEntry httpCacheEntry) {
        if (!httpCacheEntry.hasVariants()) {
            return getURI(httpHost, httpRequest);
        }
        return getVariantKey(httpRequest, httpCacheEntry) + getURI(httpHost, httpRequest);
    }

    public String getVariantKey(HttpRequest httpRequest, HttpCacheEntry httpCacheEntry) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (Header elements : httpCacheEntry.getHeaders("Vary")) {
            for (HeaderElement name : elements.getElements()) {
                arrayList.add(name.getName());
            }
        }
        Collections.sort(arrayList);
        try {
            StringBuilder sb = new StringBuilder("{");
            boolean z = true;
            for (String str : arrayList) {
                if (!z) {
                    sb.append("&");
                }
                sb.append(URLEncoder.encode(str, Consts.UTF_8.name()));
                sb.append("=");
                sb.append(URLEncoder.encode(getFullHeaderValue(httpRequest.getHeaders(str)), Consts.UTF_8.name()));
                z = false;
            }
            sb.append("}");
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("couldn't encode to UTF-8", e);
        }
    }
}
