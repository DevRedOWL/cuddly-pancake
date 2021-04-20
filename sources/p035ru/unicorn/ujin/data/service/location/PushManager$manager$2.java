package p035ru.unicorn.ujin.data.service.location;

import android.app.NotificationManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "Landroid/app/NotificationManager;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.service.location.PushManager$manager$2 */
/* compiled from: PushManager.kt */
final class PushManager$manager$2 extends Lambda implements Function0<NotificationManager> {
    final /* synthetic */ PushManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PushManager$manager$2(PushManager pushManager) {
        super(0);
        this.this$0 = pushManager;
    }

    public final NotificationManager invoke() {
        Object systemService = this.this$0.getContext().getSystemService("notification");
        if (systemService != null) {
            return (NotificationManager) systemService;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
    }
}
