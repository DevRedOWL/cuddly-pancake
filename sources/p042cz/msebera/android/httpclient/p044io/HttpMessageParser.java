package p042cz.msebera.android.httpclient.p044io;

import java.io.IOException;
import p042cz.msebera.android.httpclient.HttpException;
import p042cz.msebera.android.httpclient.HttpMessage;

/* renamed from: cz.msebera.android.httpclient.io.HttpMessageParser */
public interface HttpMessageParser<T extends HttpMessage> {
    T parse() throws IOException, HttpException;
}
