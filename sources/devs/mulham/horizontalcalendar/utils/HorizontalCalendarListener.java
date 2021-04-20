package devs.mulham.horizontalcalendar.utils;

import devs.mulham.horizontalcalendar.HorizontalCalendarView;
import java.util.Calendar;

public abstract class HorizontalCalendarListener {
    public void onCalendarScroll(HorizontalCalendarView horizontalCalendarView, int i, int i2) {
    }

    public boolean onDateLongClicked(Calendar calendar, int i) {
        return false;
    }

    public abstract void onDateSelected(Calendar calendar, int i);
}
