package devs.mulham.horizontalcalendar.adapter;

import android.text.format.DateFormat;
import android.view.View;
import devs.mulham.horizontalcalendar.C4489R;
import devs.mulham.horizontalcalendar.HorizontalCalendar;
import devs.mulham.horizontalcalendar.model.HorizontalCalendarConfig;
import devs.mulham.horizontalcalendar.utils.CalendarEventsPredicate;
import devs.mulham.horizontalcalendar.utils.HorizontalCalendarPredicate;
import devs.mulham.horizontalcalendar.utils.Utils;
import java.util.Calendar;
import java.util.List;

public class MonthsAdapter extends HorizontalCalendarBaseAdapter<DateViewHolder, Calendar> {
    public MonthsAdapter(HorizontalCalendar horizontalCalendar, Calendar calendar, Calendar calendar2, HorizontalCalendarPredicate horizontalCalendarPredicate, CalendarEventsPredicate calendarEventsPredicate) {
        super(C4489R.layout.hc_item_calendar, horizontalCalendar, calendar, calendar2, horizontalCalendarPredicate, calendarEventsPredicate);
    }

    /* access modifiers changed from: protected */
    public DateViewHolder createViewHolder(View view, int i) {
        DateViewHolder dateViewHolder = new DateViewHolder(view);
        dateViewHolder.layoutContent.setMinimumWidth(i);
        return dateViewHolder;
    }

    public void onBindViewHolder(DateViewHolder dateViewHolder, int i) {
        Calendar item = getItem(i);
        HorizontalCalendarConfig config = this.horizontalCalendar.getConfig();
        Integer selectorColor = this.horizontalCalendar.getConfig().getSelectorColor();
        if (selectorColor != null) {
            dateViewHolder.selectionView.setBackgroundColor(selectorColor.intValue());
        }
        dateViewHolder.textMiddle.setText(DateFormat.format(config.getFormatMiddleText(), item));
        dateViewHolder.textMiddle.setTextSize(2, config.getSizeMiddleText());
        if (config.isShowTopText()) {
            dateViewHolder.textTop.setText(DateFormat.format(config.getFormatTopText(), item));
            dateViewHolder.textTop.setTextSize(2, config.getSizeTopText());
        } else {
            dateViewHolder.textTop.setVisibility(8);
        }
        if (config.isShowBottomText()) {
            dateViewHolder.textBottom.setText(DateFormat.format(config.getFormatBottomText(), item));
            dateViewHolder.textBottom.setTextSize(2, config.getSizeBottomText());
        } else {
            dateViewHolder.textBottom.setVisibility(8);
        }
        showEvents(dateViewHolder, item);
        applyStyle(dateViewHolder, item, i);
    }

    public void onBindViewHolder(DateViewHolder dateViewHolder, int i, List<Object> list) {
        if (list == null || list.isEmpty()) {
            onBindViewHolder(dateViewHolder, i);
        } else {
            applyStyle(dateViewHolder, getItem(i), i);
        }
    }

    public Calendar getItem(int i) throws IndexOutOfBoundsException {
        if (i < this.itemsCount) {
            int shiftCells = i - this.horizontalCalendar.getShiftCells();
            Calendar calendar = (Calendar) this.startDate.clone();
            calendar.add(2, shiftCells);
            return calendar;
        }
        throw new IndexOutOfBoundsException();
    }

    /* access modifiers changed from: protected */
    public int calculateItemsCount(Calendar calendar, Calendar calendar2) {
        return Utils.monthsBetween(calendar, calendar2) + 1 + (this.horizontalCalendar.getShiftCells() * 2);
    }
}
