package p042cz.msebera.android.httpclient.message;

import p042cz.msebera.android.httpclient.Header;
import p042cz.msebera.android.httpclient.ProtocolVersion;
import p042cz.msebera.android.httpclient.RequestLine;
import p042cz.msebera.android.httpclient.StatusLine;
import p042cz.msebera.android.httpclient.util.CharArrayBuffer;

/* renamed from: cz.msebera.android.httpclient.message.LineFormatter */
public interface LineFormatter {
    CharArrayBuffer appendProtocolVersion(CharArrayBuffer charArrayBuffer, ProtocolVersion protocolVersion);

    CharArrayBuffer formatHeader(CharArrayBuffer charArrayBuffer, Header header);

    CharArrayBuffer formatRequestLine(CharArrayBuffer charArrayBuffer, RequestLine requestLine);

    CharArrayBuffer formatStatusLine(CharArrayBuffer charArrayBuffer, StatusLine statusLine);
}
