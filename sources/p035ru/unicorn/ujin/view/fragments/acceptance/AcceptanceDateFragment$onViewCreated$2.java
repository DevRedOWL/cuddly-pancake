package p035ru.unicorn.ujin.view.fragments.acceptance;

import devs.mulham.horizontalcalendar.utils.HorizontalCalendarListener;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.adapters.TimeSlotsAdapter;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.DatePickerField;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/acceptance/AcceptanceDateFragment$onViewCreated$2", "Ldevs/mulham/horizontalcalendar/utils/HorizontalCalendarListener;", "onDateSelected", "", "calendar", "Ljava/util/Calendar;", "position", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.acceptance.AcceptanceDateFragment$onViewCreated$2 */
/* compiled from: AcceptanceDateFragment.kt */
public final class AcceptanceDateFragment$onViewCreated$2 extends HorizontalCalendarListener {
    final /* synthetic */ AcceptanceDateFragment this$0;

    AcceptanceDateFragment$onViewCreated$2(AcceptanceDateFragment acceptanceDateFragment) {
        this.this$0 = acceptanceDateFragment;
    }

    public void onDateSelected(Calendar calendar, int i) {
        Intrinsics.checkNotNullParameter(calendar, DatePickerField.JsonFields.fieldName);
        this.this$0.currentCalendar = calendar;
        TimeSlotsAdapter access$getTimeSlotsAdapter$p = AcceptanceDateFragment.access$getTimeSlotsAdapter$p(this.this$0);
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "calendar.time");
        access$getTimeSlotsAdapter$p.setDate(time);
        AcceptanceDateFragment acceptanceDateFragment = this.this$0;
        Date time2 = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time2, "calendar.time");
        acceptanceDateFragment.getTimeSlots(time2);
    }
}
