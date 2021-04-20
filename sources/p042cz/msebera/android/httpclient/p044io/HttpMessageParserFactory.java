package p042cz.msebera.android.httpclient.p044io;

import p042cz.msebera.android.httpclient.HttpMessage;
import p042cz.msebera.android.httpclient.config.MessageConstraints;

/* renamed from: cz.msebera.android.httpclient.io.HttpMessageParserFactory */
public interface HttpMessageParserFactory<T extends HttpMessage> {
    HttpMessageParser<T> create(SessionInputBuffer sessionInputBuffer, MessageConstraints messageConstraints);
}
