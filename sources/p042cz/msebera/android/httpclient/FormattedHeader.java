package p042cz.msebera.android.httpclient;

import p042cz.msebera.android.httpclient.util.CharArrayBuffer;

/* renamed from: cz.msebera.android.httpclient.FormattedHeader */
public interface FormattedHeader extends Header {
    CharArrayBuffer getBuffer();

    int getValuePos();
}
