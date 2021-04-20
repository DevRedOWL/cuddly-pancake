package devs.mulham.horizontalcalendar.utils;

import devs.mulham.horizontalcalendar.model.CalendarItemStyle;
import java.util.Calendar;

public interface HorizontalCalendarPredicate {
    CalendarItemStyle style();

    boolean test(Calendar calendar);

    /* renamed from: devs.mulham.horizontalcalendar.utils.HorizontalCalendarPredicate$Or */
    public static class C4493Or implements HorizontalCalendarPredicate {
        private final HorizontalCalendarPredicate firstPredicate;
        private final HorizontalCalendarPredicate secondPredicate;

        public C4493Or(HorizontalCalendarPredicate horizontalCalendarPredicate, HorizontalCalendarPredicate horizontalCalendarPredicate2) {
            this.firstPredicate = horizontalCalendarPredicate;
            this.secondPredicate = horizontalCalendarPredicate2;
        }

        public boolean test(Calendar calendar) {
            return this.firstPredicate.test(calendar) || this.secondPredicate.test(calendar);
        }

        public CalendarItemStyle style() {
            return this.firstPredicate.style();
        }
    }
}
