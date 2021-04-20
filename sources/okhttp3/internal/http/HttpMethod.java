package okhttp3.internal.http;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p042cz.msebera.android.httpclient.client.methods.HttpPatch;
import p042cz.msebera.android.httpclient.client.methods.HttpPost;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, mo51343d2 = {"Lokhttp3/internal/http/HttpMethod;", "", "()V", "invalidatesCache", "", "method", "", "permitsRequestBody", "redirectsToGet", "redirectsWithBody", "requiresRequestBody", "okhttp"}, mo51344k = 1, mo51345mv = {1, 1, 15})
/* compiled from: HttpMethod.kt */
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public final boolean invalidatesCache(String str) {
        Intrinsics.checkParameterIsNotNull(str, FirebaseAnalytics.Param.METHOD);
        return Intrinsics.areEqual((Object) str, (Object) HttpPost.METHOD_NAME) || Intrinsics.areEqual((Object) str, (Object) HttpPatch.METHOD_NAME) || Intrinsics.areEqual((Object) str, (Object) "PUT") || Intrinsics.areEqual((Object) str, (Object) "DELETE") || Intrinsics.areEqual((Object) str, (Object) "MOVE");
    }

    @JvmStatic
    public static final boolean requiresRequestBody(String str) {
        Intrinsics.checkParameterIsNotNull(str, FirebaseAnalytics.Param.METHOD);
        return Intrinsics.areEqual((Object) str, (Object) HttpPost.METHOD_NAME) || Intrinsics.areEqual((Object) str, (Object) "PUT") || Intrinsics.areEqual((Object) str, (Object) HttpPatch.METHOD_NAME) || Intrinsics.areEqual((Object) str, (Object) "PROPPATCH") || Intrinsics.areEqual((Object) str, (Object) "REPORT");
    }

    @JvmStatic
    public static final boolean permitsRequestBody(String str) {
        Intrinsics.checkParameterIsNotNull(str, FirebaseAnalytics.Param.METHOD);
        return !Intrinsics.areEqual((Object) str, (Object) "GET") && !Intrinsics.areEqual((Object) str, (Object) "HEAD");
    }

    public final boolean redirectsWithBody(String str) {
        Intrinsics.checkParameterIsNotNull(str, FirebaseAnalytics.Param.METHOD);
        return Intrinsics.areEqual((Object) str, (Object) "PROPFIND");
    }

    public final boolean redirectsToGet(String str) {
        Intrinsics.checkParameterIsNotNull(str, FirebaseAnalytics.Param.METHOD);
        return !Intrinsics.areEqual((Object) str, (Object) "PROPFIND");
    }
}
