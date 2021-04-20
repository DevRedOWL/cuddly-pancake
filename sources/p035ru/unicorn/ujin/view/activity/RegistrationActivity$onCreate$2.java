package p035ru.unicorn.ujin.view.activity;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "updateEvent", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.RegistrationActivity$onCreate$2 */
/* compiled from: RegistrationActivity.kt */
final class RegistrationActivity$onCreate$2<T> implements Observer<UpdateEvent> {
    final /* synthetic */ RegistrationActivity this$0;

    RegistrationActivity$onCreate$2(RegistrationActivity registrationActivity) {
        this.this$0 = registrationActivity;
    }

    public final void onChanged(UpdateEvent updateEvent) {
        Intrinsics.checkNotNullParameter(updateEvent, "updateEvent");
        this.this$0.handleLogin(updateEvent);
    }
}
