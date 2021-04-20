package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.ble.BleWorkerImpl;
import p035ru.unicorn.ujin.view.activity.BaseActivity;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/ble/BleWorkerImpl;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.PassDetailFragment2$bleWorker$2 */
/* compiled from: PassDetailFragment2.kt */
final class PassDetailFragment2$bleWorker$2 extends Lambda implements Function0<BleWorkerImpl> {
    final /* synthetic */ PassDetailFragment2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PassDetailFragment2$bleWorker$2(PassDetailFragment2 passDetailFragment2) {
        super(0);
        this.this$0 = passDetailFragment2;
    }

    public final BleWorkerImpl invoke() {
        Application application;
        BaseActivity access$getBaseActivity = this.this$0.getBaseActivity();
        if (access$getBaseActivity == null || (application = access$getBaseActivity.getApplication()) == null) {
            return null;
        }
        return new BleWorkerImpl(application, this.this$0, (StringBuilder) null, 4, (DefaultConstructorMarker) null);
    }
}
