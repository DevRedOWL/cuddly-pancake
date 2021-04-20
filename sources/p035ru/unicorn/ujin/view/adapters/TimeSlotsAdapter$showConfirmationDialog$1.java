package p035ru.unicorn.ujin.view.adapters;

import android.content.DialogInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.TimeSlot;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.adapters.TimeSlotsAdapter$showConfirmationDialog$1 */
/* compiled from: TimeSlotsAdapter.kt */
final class TimeSlotsAdapter$showConfirmationDialog$1 implements DialogInterface.OnClickListener {
    final /* synthetic */ int $position;
    final /* synthetic */ TimeSlot $timeSlot;
    final /* synthetic */ TimeSlotsAdapter this$0;

    TimeSlotsAdapter$showConfirmationDialog$1(TimeSlotsAdapter timeSlotsAdapter, int i, TimeSlot timeSlot) {
        this.this$0 = timeSlotsAdapter;
        this.$position = i;
        this.$timeSlot = timeSlot;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        List<String> reservedWindowList;
        TimeSlotsAdapter timeSlotsAdapter = this.this$0;
        timeSlotsAdapter.listener.onStateChanged(this.$position);
        String state = this.$timeSlot.getState();
        if (state != null) {
            int hashCode = state.hashCode();
            if (hashCode != -733902135) {
                if (hashCode != 1097075900) {
                    if (hashCode == 1671308008 && state.equals(TimeSlotsAdapter.DISABLED)) {
                        timeSlotsAdapter.getViewModel().removeTime(timeSlotsAdapter.getToken(), timeSlotsAdapter.getDate());
                    }
                } else if (state.equals(TimeSlotsAdapter.RESERVED)) {
                    timeSlotsAdapter.getViewModel().removeTime(timeSlotsAdapter.getToken(), timeSlotsAdapter.getDate());
                }
            } else if (!state.equals("available")) {
            } else {
                if (timeSlotsAdapter.getReservedWindowId() == null && ((reservedWindowList = timeSlotsAdapter.getReservedWindowList()) == null || !(!reservedWindowList.isEmpty()))) {
                    timeSlotsAdapter.getViewModel().reserveTime(timeSlotsAdapter.getToken(), this.$timeSlot.getId(), timeSlotsAdapter.getDate());
                } else if (Intrinsics.areEqual((Object) this.$timeSlot.getId(), (Object) timeSlotsAdapter.getReservedWindowId())) {
                    timeSlotsAdapter.getViewModel().removeTime(timeSlotsAdapter.getToken(), timeSlotsAdapter.getDate());
                } else {
                    List<String> reservedWindowList2 = timeSlotsAdapter.getReservedWindowList();
                    if (reservedWindowList2 == null || !CollectionsKt.contains(reservedWindowList2, this.$timeSlot.getId())) {
                        timeSlotsAdapter.getViewModel().updateTime(timeSlotsAdapter.getToken(), this.$timeSlot.getId(), timeSlotsAdapter.getDate());
                    } else {
                        timeSlotsAdapter.getViewModel().removeTime(timeSlotsAdapter.getToken(), timeSlotsAdapter.getDate());
                    }
                }
            }
        }
    }
}
