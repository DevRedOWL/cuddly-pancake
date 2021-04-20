package p008c.p009a.p017d.p021d.p022e;

import android.content.Context;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.mobileid.Api;
import org.mobileid.access.key.CompanyKey;
import org.mobileid.access.key.NetworkKey;
import org.mobileid.access.key.TimeKey;
import p008c.p009a.p010a.C0837c;

/* renamed from: c.a.d.d.e.b */
public final class C0951b implements C0950a {

    /* renamed from: a */
    public final Context f1016a;

    public C0951b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f1016a = context;
    }

    /* renamed from: a */
    public Api.MobileQRCheckResult mo13015a(String str) {
        Intrinsics.checkNotNullParameter(str, "mobileQr");
        String b = mo13016b(str);
        if (NetworkKey.Companion.isNetworkKeyPrefix(b) || CompanyKey.Companion.isCompanyKeyPrefix(b)) {
            if (C0837c.f761k.mo12917b(this.f1016a, b)) {
                return Api.MobileQRCheckResult.ALREADY_EXISTS;
            }
        } else if (!TimeKey.Companion.isTimeKeyPrefix(b)) {
            return Api.MobileQRCheckResult.UNKNOWN;
        }
        return Api.MobileQRCheckResult.VALID;
    }

    /* renamed from: b */
    public final String mo13016b(String str) {
        String substringBefore = StringsKt.substringBefore(str, "-", "");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.getDefault()");
        if (substringBefore != null) {
            String upperCase = substringBefore.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            return upperCase;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }
}
