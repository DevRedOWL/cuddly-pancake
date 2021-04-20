package com.loopj.android.http;

import java.io.UnsupportedEncodingException;
import p042cz.msebera.android.httpclient.Header;

public abstract class TextHttpResponseHandler extends AsyncHttpResponseHandler {
    private static final String LOG_TAG = "TextHttpRH";

    public abstract void onFailure(int i, Header[] headerArr, String str, Throwable th);

    public abstract void onSuccess(int i, Header[] headerArr, String str);

    public TextHttpResponseHandler() {
        this("UTF-8");
    }

    public TextHttpResponseHandler(String str) {
        setCharset(str);
    }

    public static String getResponseString(byte[] bArr, String str) {
        String str2;
        if (bArr == null) {
            str2 = null;
        } else {
            try {
                str2 = new String(bArr, str);
            } catch (UnsupportedEncodingException e) {
                AsyncHttpClient.log.mo37607e(LOG_TAG, "Encoding response into string failed", e);
                return null;
            }
        }
        return (str2 == null || !str2.startsWith(AsyncHttpResponseHandler.UTF8_BOM)) ? str2 : str2.substring(1);
    }

    public void onSuccess(int i, Header[] headerArr, byte[] bArr) {
        onSuccess(i, headerArr, getResponseString(bArr, getCharset()));
    }

    public void onFailure(int i, Header[] headerArr, byte[] bArr, Throwable th) {
        onFailure(i, headerArr, getResponseString(bArr, getCharset()), th);
    }
}
