package p035ru.unicorn.ujin.view.adapters;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import p035ru.unicorn.ujin.viewModel.events.ProfileUpdateEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "event", "Lru/unicorn/ujin/viewModel/events/ProfileUpdateEvent;", "kotlin.jvm.PlatformType", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.adapters.TimeSlotsAdapter$askUserToEnterName$1 */
/* compiled from: TimeSlotsAdapter.kt */
final class TimeSlotsAdapter$askUserToEnterName$1<T> implements Observer<ProfileUpdateEvent> {
    final /* synthetic */ TimeSlotsAdapter this$0;

    TimeSlotsAdapter$askUserToEnterName$1(TimeSlotsAdapter timeSlotsAdapter) {
        this.this$0 = timeSlotsAdapter;
    }

    public final void onChanged(ProfileUpdateEvent profileUpdateEvent) {
        this.this$0.handleEvent(profileUpdateEvent);
    }
}
