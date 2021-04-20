package p035ru.unicorn.ujin.view.activity.sapfir;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "event", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "kotlin.jvm.PlatformType", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.sapfir.SapfirRegistrationActivity$registerStep2$1$onSuccess$1 */
/* compiled from: SapfirRegistrationActivity.kt */
final class SapfirRegistrationActivity$registerStep2$1$onSuccess$1<T> implements Observer<UpdateEvent> {
    final /* synthetic */ SapfirRegistrationActivity$registerStep2$1 this$0;

    SapfirRegistrationActivity$registerStep2$1$onSuccess$1(SapfirRegistrationActivity$registerStep2$1 sapfirRegistrationActivity$registerStep2$1) {
        this.this$0 = sapfirRegistrationActivity$registerStep2$1;
    }

    public final void onChanged(UpdateEvent updateEvent) {
        SapfirRegistrationActivity sapfirRegistrationActivity = this.this$0.this$0;
        Intrinsics.checkNotNullExpressionValue(updateEvent, "event");
        sapfirRegistrationActivity.handleGetUser(updateEvent);
    }
}
