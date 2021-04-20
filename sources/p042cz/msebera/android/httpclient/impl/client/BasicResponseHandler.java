package p042cz.msebera.android.httpclient.impl.client;

import java.io.IOException;
import p042cz.msebera.android.httpclient.HttpEntity;
import p042cz.msebera.android.httpclient.HttpResponse;
import p042cz.msebera.android.httpclient.StatusLine;
import p042cz.msebera.android.httpclient.client.HttpResponseException;
import p042cz.msebera.android.httpclient.client.ResponseHandler;
import p042cz.msebera.android.httpclient.util.EntityUtils;

/* renamed from: cz.msebera.android.httpclient.impl.client.BasicResponseHandler */
public class BasicResponseHandler implements ResponseHandler<String> {
    public String handleResponse(HttpResponse httpResponse) throws HttpResponseException, IOException {
        StatusLine statusLine = httpResponse.getStatusLine();
        HttpEntity entity = httpResponse.getEntity();
        if (statusLine.getStatusCode() >= 300) {
            EntityUtils.consume(entity);
            throw new HttpResponseException(statusLine.getStatusCode(), statusLine.getReasonPhrase());
        } else if (entity == null) {
            return null;
        } else {
            return EntityUtils.toString(entity);
        }
    }
}
