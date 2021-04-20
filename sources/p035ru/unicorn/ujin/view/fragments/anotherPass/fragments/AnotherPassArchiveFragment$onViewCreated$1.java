package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.fragments.anotherPass.events.AnotherArchivePassListEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "event", "Lru/unicorn/ujin/view/fragments/anotherPass/events/AnotherArchivePassListEvent;", "kotlin.jvm.PlatformType", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassArchiveFragment$onViewCreated$1 */
/* compiled from: AnotherPassArchiveFragment.kt */
final class AnotherPassArchiveFragment$onViewCreated$1<T> implements Observer<AnotherArchivePassListEvent> {
    final /* synthetic */ AnotherPassArchiveFragment this$0;

    AnotherPassArchiveFragment$onViewCreated$1(AnotherPassArchiveFragment anotherPassArchiveFragment) {
        this.this$0 = anotherPassArchiveFragment;
    }

    public final void onChanged(AnotherArchivePassListEvent anotherArchivePassListEvent) {
        AnotherPassArchiveFragment anotherPassArchiveFragment = this.this$0;
        Intrinsics.checkNotNullExpressionValue(anotherArchivePassListEvent, "event");
        anotherPassArchiveFragment.handleSearchArchivePassListEvent(anotherArchivePassListEvent);
    }
}
