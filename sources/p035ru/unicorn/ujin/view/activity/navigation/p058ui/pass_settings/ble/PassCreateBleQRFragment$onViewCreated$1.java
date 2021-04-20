package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.ble;

import android.util.Log;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "it", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/ble/RequestAccessState;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.ble.PassCreateBleQRFragment$onViewCreated$1 */
/* compiled from: PassCreateBleQRFragment.kt */
final class PassCreateBleQRFragment$onViewCreated$1 extends Lambda implements Function1<RequestAccessState, Unit> {
    public static final PassCreateBleQRFragment$onViewCreated$1 INSTANCE = new PassCreateBleQRFragment$onViewCreated$1();

    PassCreateBleQRFragment$onViewCreated$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((RequestAccessState) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(RequestAccessState requestAccessState) {
        Intrinsics.checkNotNullParameter(requestAccessState, "it");
        if ((requestAccessState instanceof Accepted) || (requestAccessState instanceof Granted)) {
            return;
        }
        if (requestAccessState instanceof Started) {
            Log.d("TAG", "XXX KEY 1  Started");
        } else if (requestAccessState instanceof Empty) {
            Log.d("TAG", "XXX KEY 1  Empty");
        } else if (requestAccessState instanceof Unknown) {
            Log.d("TAG", "XXX KEY 1  Unknown");
        } else if (requestAccessState instanceof Unidentified) {
            Log.d("TAG", "XXX KEY 1  Unidentified");
        } else if (requestAccessState instanceof Denied) {
            Log.d("TAG", "XXX KEY 1  Denied");
        }
    }
}
