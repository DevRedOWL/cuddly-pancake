package p042cz.msebera.android.httpclient.message;

import p042cz.msebera.android.httpclient.HeaderElement;
import p042cz.msebera.android.httpclient.NameValuePair;
import p042cz.msebera.android.httpclient.ParseException;
import p042cz.msebera.android.httpclient.util.CharArrayBuffer;

/* renamed from: cz.msebera.android.httpclient.message.HeaderValueParser */
public interface HeaderValueParser {
    HeaderElement[] parseElements(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) throws ParseException;

    HeaderElement parseHeaderElement(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) throws ParseException;

    NameValuePair parseNameValuePair(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) throws ParseException;

    NameValuePair[] parseParameters(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) throws ParseException;
}
