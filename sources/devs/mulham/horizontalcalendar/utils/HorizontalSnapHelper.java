package devs.mulham.horizontalcalendar.utils;

import android.view.View;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import devs.mulham.horizontalcalendar.HorizontalCalendar;
import devs.mulham.horizontalcalendar.HorizontalCalendarView;

public class HorizontalSnapHelper extends LinearSnapHelper {
    private HorizontalCalendarView calendarView;
    private HorizontalCalendar horizontalCalendar;

    public void attachToRecyclerView(RecyclerView recyclerView) throws IllegalStateException {
    }

    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        int i;
        View findSnapView = super.findSnapView(layoutManager);
        if (this.calendarView.getScrollState() != 1) {
            if (findSnapView == null) {
                i = this.horizontalCalendar.getSelectedDatePosition();
            } else {
                int[] calculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, findSnapView);
                if (calculateDistanceToFinalSnap[0] == 0 && calculateDistanceToFinalSnap[1] == 0) {
                    i = layoutManager.getPosition(findSnapView);
                }
            }
            notifyCalendarListener(i);
        }
        return findSnapView;
    }

    private void notifyCalendarListener(int i) {
        if (!this.horizontalCalendar.isItemDisabled(i)) {
            this.horizontalCalendar.getCalendarListener().onDateSelected(this.horizontalCalendar.getDateAt(i), i);
        }
    }

    public void attachToHorizontalCalendar(HorizontalCalendar horizontalCalendar2) throws IllegalStateException {
        this.horizontalCalendar = horizontalCalendar2;
        this.calendarView = horizontalCalendar2.getCalendarView();
        super.attachToRecyclerView(this.calendarView);
    }
}
