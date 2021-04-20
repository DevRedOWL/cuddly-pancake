package p008c.p009a.p024e.p030e;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.mobileid.access.key.TimeKey;

/* renamed from: c.a.e.e.b */
public final class C0984b {

    /* renamed from: a */
    public final Context f1119a;

    /* renamed from: b */
    public final TimeKey f1120b;

    public C0984b(Context context, TimeKey timeKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(timeKey, "timeKey");
        this.f1119a = context;
        this.f1120b = timeKey;
    }

    /* renamed from: a */
    public final C0983a mo13040a() {
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = true;
        if (currentTimeMillis > this.f1120b.getDateTill().getTime()) {
            return C0983a.EXPIRED;
        }
        if (!(currentTimeMillis > this.f1120b.getDateFrom().getTime())) {
            return C0983a.NOT_STARTED;
        }
        SharedPreferences sharedPreferences = this.f1119a.getSharedPreferences("TIME_KEY_VALIDATION", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(STO…ME, Context.MODE_PRIVATE)");
        long j = sharedPreferences.getLong("LAST_TIME_USE", -1);
        if (j != -1 && currentTimeMillis < j) {
            z = false;
        }
        if (!z) {
            return C0983a.PHONE_TIME_INVALID;
        }
        SharedPreferences sharedPreferences2 = this.f1119a.getSharedPreferences("TIME_KEY_VALIDATION", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "getSharedPreferences(STO…ME, Context.MODE_PRIVATE)");
        sharedPreferences2.edit().putLong("LAST_TIME_USE", currentTimeMillis).apply();
        return C0983a.VALID;
    }
}
