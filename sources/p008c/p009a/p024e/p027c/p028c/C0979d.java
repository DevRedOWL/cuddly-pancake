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
import org.mobileid.time_key.push.worker.RemoveKeyWorker;

/* renamed from: c.a.e.c.c.d */
public final class C0979d implements C0977b {

    /* renamed from: a */
    public final Context f1112a;

    public C0979d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f1112a = context;
    }

    /* renamed from: a */
    public void mo13037a(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "data");
        String str = map.get("time_key_id");
        if (str != null) {
            Data build = new Data.Builder().putString("TIME_KEY_ID", str).build();
            Intrinsics.checkNotNullExpressionValue(build, "Data.Builder()\n         …\n                .build()");
            Constraints build2 = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
            Intrinsics.checkNotNullExpressionValue(build2, "Constraints.Builder()\n  …\n                .build()");
            WorkRequest build3 = ((OneTimeWorkRequest.Builder) ((OneTimeWorkRequest.Builder) new OneTimeWorkRequest.Builder(RemoveKeyWorker.class).setInputData(build)).setConstraints(build2)).build();
            Intrinsics.checkNotNullExpressionValue(build3, "OneTimeWorkRequest.Build…\n                .build()");
            WorkManager.getInstance(this.f1112a).enqueue((WorkRequest) (OneTimeWorkRequest) build3);
        }
    }
}
