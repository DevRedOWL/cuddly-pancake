package p042cz.msebera.android.httpclient.client.cache;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

/* renamed from: cz.msebera.android.httpclient.client.cache.Resource */
public interface Resource extends Serializable {
    void dispose();

    InputStream getInputStream() throws IOException;

    long length();
}
