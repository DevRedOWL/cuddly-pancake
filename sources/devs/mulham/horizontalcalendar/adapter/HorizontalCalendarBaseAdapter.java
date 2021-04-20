package devs.mulham.horizontalcalendar.adapter;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import devs.mulham.horizontalcalendar.HorizontalCalendar;
import devs.mulham.horizontalcalendar.adapter.DateViewHolder;
import devs.mulham.horizontalcalendar.model.CalendarEvent;
import devs.mulham.horizontalcalendar.model.CalendarItemStyle;
import devs.mulham.horizontalcalendar.utils.CalendarEventsPredicate;
import devs.mulham.horizontalcalendar.utils.HorizontalCalendarListener;
import devs.mulham.horizontalcalendar.utils.HorizontalCalendarPredicate;
import devs.mulham.horizontalcalendar.utils.Utils;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

public abstract class HorizontalCalendarBaseAdapter<VH extends DateViewHolder, T extends Calendar> extends RecyclerView.Adapter<VH> {
    private final int cellWidth;
    private final HorizontalCalendarPredicate disablePredicate;
    private CalendarItemStyle disabledItemStyle;
    private final CalendarEventsPredicate eventsPredicate;
    final HorizontalCalendar horizontalCalendar;
    private final int itemResId;
    protected int itemsCount;
    protected Calendar startDate;

    /* access modifiers changed from: protected */
    public abstract int calculateItemsCount(Calendar calendar, Calendar calendar2);

    /* access modifiers changed from: protected */
    public abstract VH createViewHolder(View view, int i);

    public abstract T getItem(int i);

    protected HorizontalCalendarBaseAdapter(int i, HorizontalCalendar horizontalCalendar2, Calendar calendar, Calendar calendar2, HorizontalCalendarPredicate horizontalCalendarPredicate, CalendarEventsPredicate calendarEventsPredicate) {
        this.itemResId = i;
        this.horizontalCalendar = horizontalCalendar2;
        this.disablePredicate = horizontalCalendarPredicate;
        this.startDate = calendar;
        if (horizontalCalendarPredicate != null) {
            this.disabledItemStyle = horizontalCalendarPredicate.style();
        }
        this.eventsPredicate = calendarEventsPredicate;
        this.cellWidth = Utils.calculateCellWidth(horizontalCalendar2.getContext(), horizontalCalendar2.getNumberOfDatesOnScreen());
        this.itemsCount = calculateItemsCount(calendar, calendar2);
    }

    public VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        VH createViewHolder = createViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(this.itemResId, viewGroup, false), this.cellWidth);
        createViewHolder.itemView.setOnClickListener(new MyOnClickListener(createViewHolder));
        createViewHolder.itemView.setOnLongClickListener(new MyOnLongClickListener(createViewHolder));
        if (this.eventsPredicate != null) {
            initEventsRecyclerView(createViewHolder.eventsRecyclerView);
        } else {
            createViewHolder.eventsRecyclerView.setVisibility(8);
        }
        return createViewHolder;
    }

    private void initEventsRecyclerView(RecyclerView recyclerView) {
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new EventsAdapter(Collections.emptyList()));
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 4));
    }

    public int getItemCount() {
        return this.itemsCount;
    }

    public boolean isDisabled(int i) {
        if (this.disablePredicate == null) {
            return false;
        }
        return this.disablePredicate.test(getItem(i));
    }

    /* access modifiers changed from: protected */
    public void showEvents(VH vh, Calendar calendar) {
        CalendarEventsPredicate calendarEventsPredicate = this.eventsPredicate;
        if (calendarEventsPredicate != null) {
            List<CalendarEvent> events = calendarEventsPredicate.events(calendar);
            if (events == null || events.isEmpty()) {
                vh.eventsRecyclerView.setVisibility(8);
                return;
            }
            vh.eventsRecyclerView.setVisibility(0);
            ((EventsAdapter) vh.eventsRecyclerView.getAdapter()).update(events);
        }
    }

    /* access modifiers changed from: protected */
    public void applyStyle(VH vh, Calendar calendar, int i) {
        CalendarItemStyle calendarItemStyle;
        int selectedDatePosition = this.horizontalCalendar.getSelectedDatePosition();
        HorizontalCalendarPredicate horizontalCalendarPredicate = this.disablePredicate;
        if (horizontalCalendarPredicate != null) {
            boolean test = horizontalCalendarPredicate.test(calendar);
            vh.itemView.setEnabled(!test);
            if (test && (calendarItemStyle = this.disabledItemStyle) != null) {
                applyStyle(vh, calendarItemStyle);
                vh.selectionView.setVisibility(4);
                return;
            }
        }
        if (i == selectedDatePosition) {
            applyStyle(vh, this.horizontalCalendar.getSelectedItemStyle());
            vh.selectionView.setVisibility(0);
            return;
        }
        applyStyle(vh, this.horizontalCalendar.getDefaultStyle());
        vh.selectionView.setVisibility(4);
    }

    /* access modifiers changed from: protected */
    public void applyStyle(VH vh, CalendarItemStyle calendarItemStyle) {
        vh.textTop.setTextColor(calendarItemStyle.getColorTopText());
        vh.textMiddle.setTextColor(calendarItemStyle.getColorMiddleText());
        vh.textBottom.setTextColor(calendarItemStyle.getColorBottomText());
        if (Build.VERSION.SDK_INT >= 16) {
            vh.itemView.setBackground(calendarItemStyle.getBackground());
        } else {
            vh.itemView.setBackgroundDrawable(calendarItemStyle.getBackground());
        }
    }

    public void update(Calendar calendar, Calendar calendar2, boolean z) {
        this.startDate = calendar;
        this.itemsCount = calculateItemsCount(calendar, calendar2);
        if (z) {
            notifyDataSetChanged();
        }
    }

    private class MyOnClickListener implements View.OnClickListener {
        private final RecyclerView.ViewHolder viewHolder;

        MyOnClickListener(RecyclerView.ViewHolder viewHolder2) {
            this.viewHolder = viewHolder2;
        }

        public void onClick(View view) {
            int adapterPosition = this.viewHolder.getAdapterPosition();
            if (adapterPosition != -1) {
                HorizontalCalendarBaseAdapter.this.horizontalCalendar.getCalendarView().setSmoothScrollSpeed(125.0f);
                HorizontalCalendarBaseAdapter.this.horizontalCalendar.centerCalendarToPosition(adapterPosition);
            }
        }
    }

    private class MyOnLongClickListener implements View.OnLongClickListener {
        private final RecyclerView.ViewHolder viewHolder;

        MyOnLongClickListener(RecyclerView.ViewHolder viewHolder2) {
            this.viewHolder = viewHolder2;
        }

        public boolean onLongClick(View view) {
            HorizontalCalendarListener calendarListener = HorizontalCalendarBaseAdapter.this.horizontalCalendar.getCalendarListener();
            if (calendarListener == null) {
                return false;
            }
            int adapterPosition = this.viewHolder.getAdapterPosition();
            return calendarListener.onDateLongClicked(HorizontalCalendarBaseAdapter.this.getItem(adapterPosition), adapterPosition);
        }
    }
}
