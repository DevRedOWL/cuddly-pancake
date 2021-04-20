package p008c.p009a.p024e.p027c.p028c;

import android.content.Context;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.mobileid.time_key.push.worker.AddKeyWorker;

/* renamed from: c.a.e.c.c.a */
public final class C0976a implements C0977b {

    /* renamed from: a */
    public final Context f1110a;

    public C0976a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f1110a = context;
    }

    /* renamed from: a */
    public void mo13037a(Map<String, String> map) {
        String str;
        String str2;
        Long longOrNull;
        Long longOrNull2;
        Intrinsics.checkNotNullParameter(map, "data");
        String str3 = map.get("encrypted_mobile_id");
        if (str3 != null && (str = map.get("time_key_id")) != null && (str2 = map.get("date_from")) != null && (longOrNull = StringsKt.toLongOrNull(str2)) != null) {
            long longValue = longOrNull.longValue();
            String str4 = map.get("date_till");
            if (str4 != null && (longOrNull2 = StringsKt.toLongOrNull(str4)) != null) {
                Data build = new Data.Builder().putString("MOBILE_ID", str3).putString("TIME_KEY_ID", str).putLong("DATE_FROM", longValue).putLong("DATE_TILL", longOrNull2.longValue()).build();
                Intrinsics.checkNotNullExpressionValue(build, "Data.Builder()\n         …\n                .build()");
                Constraints build2 = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
                Intrinsics.checkNotNullExpressionValue(build2, "Constraints.Builder()\n  …\n                .build()");
                WorkRequest build3 = ((OneTimeWorkRequest.Builder) ((OneTimeWorkRequest.Builder) new OneTimeWorkRequest.Builder(AddKeyWorker.class).setInputData(build)).setConstraints(build2)).build();
                Intrinsics.checkNotNullExpressionValue(build3, "OneTimeWorkRequest.Build…\n                .build()");
                WorkManager.getInstance(this.f1110a).enqueue((WorkRequest) (OneTimeWorkRequest) build3);
            }
        }
    }
}
