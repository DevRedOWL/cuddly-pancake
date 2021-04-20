package p035ru.unicorn.ujin.view.fragments.pass;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.profile.event.RentAuthorizeEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "event", "Lru/unicorn/ujin/data/profile/event/RentAuthorizeEvent;", "kotlin.jvm.PlatformType", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.pass.RegistrationFragment$onViewCreated$7 */
/* compiled from: RegistrationFragment.kt */
final class RegistrationFragment$onViewCreated$7<T> implements Observer<RentAuthorizeEvent> {
    final /* synthetic */ RegistrationFragment this$0;

    RegistrationFragment$onViewCreated$7(RegistrationFragment registrationFragment) {
        this.this$0 = registrationFragment;
    }

    public final void onChanged(RentAuthorizeEvent rentAuthorizeEvent) {
        RegistrationFragment registrationFragment = this.this$0;
        Intrinsics.checkNotNullExpressionValue(rentAuthorizeEvent, "event");
        registrationFragment.handleEvent(rentAuthorizeEvent);
    }
}
