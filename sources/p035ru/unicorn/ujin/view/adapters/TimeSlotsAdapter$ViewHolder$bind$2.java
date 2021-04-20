package p035ru.unicorn.ujin.view.adapters;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.lang3.StringUtils;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.TimeSlot;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.adapters.TimeSlotsAdapter;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.adapters.TimeSlotsAdapter$ViewHolder$bind$2 */
/* compiled from: TimeSlotsAdapter.kt */
final class TimeSlotsAdapter$ViewHolder$bind$2 implements View.OnClickListener {
    final /* synthetic */ int $position;
    final /* synthetic */ TimeSlot $timeSlot;
    final /* synthetic */ TimeSlotsAdapter.ViewHolder this$0;

    TimeSlotsAdapter$ViewHolder$bind$2(TimeSlotsAdapter.ViewHolder viewHolder, TimeSlot timeSlot, int i) {
        this.this$0 = viewHolder;
        this.$timeSlot = timeSlot;
        this.$position = i;
    }

    public final void onClick(View view) {
        String str;
        List<String> reservedWindowList;
        if (this.this$0.this$0.getReservedWindowId() != null || ((reservedWindowList = this.this$0.this$0.getReservedWindowList()) != null && (!reservedWindowList.isEmpty()))) {
            str = TimeSlotsAdapter.access$getContext$p(this.this$0.this$0).getResources().getString(R.string.changeDateConfirmation, new Object[]{this.this$0.this$0.getReservedDate(), DateUtils.formatDateFullFromUnix(this.this$0.this$0.getDate().getTime()), this.$timeSlot.getStartTime()});
        } else {
            str = TimeSlotsAdapter.access$getContext$p(this.this$0.this$0).getResources().getString(R.string.acceptanceDateConfirmation, new Object[]{DateUtils.formatDateFullFromUnix(this.this$0.this$0.getDate().getTime()), this.$timeSlot.getStartTime()});
        }
        Intrinsics.checkNotNullExpressionValue(str, "when {\n                 …                        }");
        this.this$0.this$0.mTimeSlot = this.$timeSlot;
        this.this$0.this$0.mMessage = str;
        User user = this.this$0.this$0.profileLocalRepository.getUser();
        this.this$0.this$0.userName = user.getName();
        this.this$0.this$0.userSurname = user.getSurname();
        this.this$0.this$0.userPhone = Intrinsics.areEqual((Object) user.getPhone(), (Object) "0") ? "" : user.getPhone();
        if (!StringUtils.isNotEmpty(this.this$0.this$0.userName) || !StringUtils.isNotEmpty(this.this$0.this$0.userSurname) || !StringUtils.isNotEmpty(this.this$0.this$0.userPhone)) {
            this.this$0.this$0.setSelectedPosition(this.$position);
            this.this$0.this$0.askUserToEnterName();
            return;
        }
        TimeSlotsAdapter timeSlotsAdapter = this.this$0.this$0;
        int i = this.$position;
        String string = TimeSlotsAdapter.access$getContext$p(this.this$0.this$0).getResources().getString(R.string.confirm_acceptance);
        Intrinsics.checkNotNullExpressionValue(string, "context.resources.getStr…tring.confirm_acceptance)");
        timeSlotsAdapter.showConfirmationDialog(i, str, string);
    }
}
