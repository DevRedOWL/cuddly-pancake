package p042cz.msebera.android.httpclient.impl.client.cache;

/* renamed from: cz.msebera.android.httpclient.impl.client.cache.RequestProtocolError */
enum RequestProtocolError {
    UNKNOWN,
    BODY_BUT_NO_LENGTH_ERROR,
    WEAK_ETAG_ON_PUTDELETE_METHOD_ERROR,
    WEAK_ETAG_AND_RANGE_ERROR,
    NO_CACHE_DIRECTIVE_WITH_FIELD_NAME
}
