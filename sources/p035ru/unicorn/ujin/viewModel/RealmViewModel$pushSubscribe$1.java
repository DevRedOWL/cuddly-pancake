package p035ru.unicorn.ujin.viewModel;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import com.google.firebase.iid.InstanceIdResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.BuildConfig;
import p035ru.unicorn.ujin.view.activity.navigation.repository.RemoteRepository;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "task", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/firebase/iid/InstanceIdResult;", "kotlin.jvm.PlatformType", "onComplete"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.viewModel.RealmViewModel$pushSubscribe$1 */
/* compiled from: RealmViewModel.kt */
final class RealmViewModel$pushSubscribe$1<TResult> implements OnCompleteListener<InstanceIdResult> {
    public static final RealmViewModel$pushSubscribe$1 INSTANCE = new RealmViewModel$pushSubscribe$1();

    RealmViewModel$pushSubscribe$1() {
    }

    public final void onComplete(Task<InstanceIdResult> task) {
        Intrinsics.checkNotNullParameter(task, "task");
        InstanceIdResult result = task.getResult();
        Intrinsics.checkNotNull(result);
        String token = result.getToken();
        Intrinsics.checkNotNullExpressionValue(token, "task.result!!.token");
        new RemoteRepository().sendToken("", token, AbstractSpiCall.ANDROID_CLIENT_TYPE, BuildConfig.VERSION_NAME).subscribe();
    }
}
