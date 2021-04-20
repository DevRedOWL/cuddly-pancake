package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "event", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "kotlin.jvm.PlatformType", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassDetailFragment$onViewCreated$4 */
/* compiled from: AnotherPassDetailFragment.kt */
final class AnotherPassDetailFragment$onViewCreated$4<T> implements Observer<UpdateEvent> {
    final /* synthetic */ AnotherPassDetailFragment this$0;

    AnotherPassDetailFragment$onViewCreated$4(AnotherPassDetailFragment anotherPassDetailFragment) {
        this.this$0 = anotherPassDetailFragment;
    }

    public final void onChanged(UpdateEvent updateEvent) {
        AnotherPassDetailFragment anotherPassDetailFragment = this.this$0;
        Intrinsics.checkNotNullExpressionValue(updateEvent, "event");
        anotherPassDetailFragment.handleInviteText(updateEvent);
    }
}
