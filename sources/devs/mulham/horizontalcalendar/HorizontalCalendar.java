package devs.mulham.horizontalcalendar;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import devs.mulham.horizontalcalendar.adapter.DaysAdapter;
import devs.mulham.horizontalcalendar.adapter.HorizontalCalendarBaseAdapter;
import devs.mulham.horizontalcalendar.adapter.MonthsAdapter;
import devs.mulham.horizontalcalendar.model.CalendarItemStyle;
import devs.mulham.horizontalcalendar.model.HorizontalCalendarConfig;
import devs.mulham.horizontalcalendar.utils.CalendarEventsPredicate;
import devs.mulham.horizontalcalendar.utils.HorizontalCalendarListener;
import devs.mulham.horizontalcalendar.utils.HorizontalCalendarPredicate;
import devs.mulham.horizontalcalendar.utils.HorizontalSnapHelper;
import devs.mulham.horizontalcalendar.utils.Utils;
import java.util.Calendar;

public final class HorizontalCalendar {
    private final int calendarId;
    HorizontalCalendarListener calendarListener;
    HorizontalCalendarView calendarView;
    private final HorizontalCalendarConfig config;
    private final HorizontalCalendarPredicate defaultDisablePredicate = new HorizontalCalendarPredicate() {
        public boolean test(Calendar calendar) {
            return Utils.isDateBefore(calendar, HorizontalCalendar.this.startDate) || Utils.isDateAfter(calendar, HorizontalCalendar.this.endDate);
        }

        public CalendarItemStyle style() {
            return new CalendarItemStyle(-7829368, (Drawable) null);
        }
    };
    private final CalendarItemStyle defaultStyle;
    Calendar endDate;
    private HorizontalCalendarBaseAdapter mCalendarAdapter;
    private Mode mode;
    private final int numberOfDatesOnScreen;
    private final CalendarItemStyle selectedItemStyle;
    Calendar startDate;

    public enum Mode {
        DAYS,
        MONTHS
    }

    HorizontalCalendar(Builder builder, HorizontalCalendarConfig horizontalCalendarConfig, CalendarItemStyle calendarItemStyle, CalendarItemStyle calendarItemStyle2) {
        this.numberOfDatesOnScreen = builder.numberOfDatesOnScreen;
        this.calendarId = builder.viewId;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.config = horizontalCalendarConfig;
        this.defaultStyle = calendarItemStyle;
        this.selectedItemStyle = calendarItemStyle2;
        this.mode = builder.mode;
    }

    /* access modifiers changed from: package-private */
    public void init(View view, final Calendar calendar, HorizontalCalendarPredicate horizontalCalendarPredicate, CalendarEventsPredicate calendarEventsPredicate) {
        HorizontalCalendarPredicate horizontalCalendarPredicate2;
        this.calendarView = (HorizontalCalendarView) view.findViewById(this.calendarId);
        this.calendarView.setHasFixedSize(true);
        this.calendarView.setHorizontalScrollBarEnabled(false);
        this.calendarView.applyConfigFromLayout(this);
        new HorizontalSnapHelper().attachToHorizontalCalendar(this);
        if (horizontalCalendarPredicate == null) {
            horizontalCalendarPredicate2 = this.defaultDisablePredicate;
        } else {
            horizontalCalendarPredicate2 = new HorizontalCalendarPredicate.C4493Or(horizontalCalendarPredicate, this.defaultDisablePredicate);
        }
        HorizontalCalendarPredicate horizontalCalendarPredicate3 = horizontalCalendarPredicate2;
        if (this.mode == Mode.MONTHS) {
            this.mCalendarAdapter = new MonthsAdapter(this, this.startDate, this.endDate, horizontalCalendarPredicate3, calendarEventsPredicate);
        } else {
            this.mCalendarAdapter = new DaysAdapter(this, this.startDate, this.endDate, horizontalCalendarPredicate3, calendarEventsPredicate);
        }
        this.calendarView.setAdapter(this.mCalendarAdapter);
        HorizontalCalendarView horizontalCalendarView = this.calendarView;
        horizontalCalendarView.setLayoutManager(new HorizontalLayoutManager(horizontalCalendarView.getContext(), false));
        this.calendarView.addOnScrollListener(new HorizontalCalendarScrollListener());
        post(new Runnable() {
            public void run() {
                HorizontalCalendar horizontalCalendar = HorizontalCalendar.this;
                horizontalCalendar.centerToPositionWithNoAnimation(horizontalCalendar.positionOfDate(calendar));
            }
        });
    }

    public HorizontalCalendarListener getCalendarListener() {
        return this.calendarListener;
    }

    public void setCalendarListener(HorizontalCalendarListener horizontalCalendarListener) {
        this.calendarListener = horizontalCalendarListener;
    }

    public void goToday(boolean z) {
        selectDate(Calendar.getInstance(), z);
    }

    public void selectDate(Calendar calendar, boolean z) {
        int positionOfDate = positionOfDate(calendar);
        if (z) {
            centerToPositionWithNoAnimation(positionOfDate);
            HorizontalCalendarListener horizontalCalendarListener = this.calendarListener;
            if (horizontalCalendarListener != null) {
                horizontalCalendarListener.onDateSelected(calendar, positionOfDate);
                return;
            }
            return;
        }
        this.calendarView.setSmoothScrollSpeed(90.0f);
        centerCalendarToPosition(positionOfDate);
    }

    public void centerCalendarToPosition(int i) {
        int calculateRelativeCenterPosition;
        if (i != -1 && (calculateRelativeCenterPosition = Utils.calculateRelativeCenterPosition(i, this.calendarView.getPositionOfCenterItem(), this.numberOfDatesOnScreen / 2)) != i) {
            this.calendarView.smoothScrollToPosition(calculateRelativeCenterPosition);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r0 = r2.calendarView.getPositionOfCenterItem();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void centerToPositionWithNoAnimation(int r3) {
        /*
            r2 = this;
            r0 = -1
            if (r3 == r0) goto L_0x0023
            devs.mulham.horizontalcalendar.HorizontalCalendarView r0 = r2.calendarView
            int r0 = r0.getPositionOfCenterItem()
            int r1 = r2.numberOfDatesOnScreen
            int r1 = r1 / 2
            int r1 = devs.mulham.horizontalcalendar.utils.Utils.calculateRelativeCenterPosition(r3, r0, r1)
            if (r1 != r3) goto L_0x0014
            return
        L_0x0014:
            devs.mulham.horizontalcalendar.HorizontalCalendarView r3 = r2.calendarView
            r3.scrollToPosition(r1)
            devs.mulham.horizontalcalendar.HorizontalCalendarView r3 = r2.calendarView
            devs.mulham.horizontalcalendar.HorizontalCalendar$2 r1 = new devs.mulham.horizontalcalendar.HorizontalCalendar$2
            r1.<init>(r0)
            r3.post(r1)
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: devs.mulham.horizontalcalendar.HorizontalCalendar.centerToPositionWithNoAnimation(int):void");
    }

    /* access modifiers changed from: package-private */
    public void refreshItemsSelector(int i, int... iArr) {
        this.mCalendarAdapter.notifyItemChanged(i, "UPDATE_SELECTOR");
        if (iArr != null && iArr.length > 0) {
            for (int notifyItemChanged : iArr) {
                this.mCalendarAdapter.notifyItemChanged(notifyItemChanged, "UPDATE_SELECTOR");
            }
        }
    }

    public boolean isItemDisabled(int i) {
        return this.mCalendarAdapter.isDisabled(i);
    }

    public void refresh() {
        this.mCalendarAdapter.notifyDataSetChanged();
    }

    public void show() {
        this.calendarView.setVisibility(0);
    }

    public void hide() {
        this.calendarView.setVisibility(4);
    }

    public void post(Runnable runnable) {
        this.calendarView.post(runnable);
    }

    public void setElevation(float f) {
        this.calendarView.setElevation(f);
    }

    public Calendar getSelectedDate() {
        return this.mCalendarAdapter.getItem(this.calendarView.getPositionOfCenterItem());
    }

    public int getSelectedDatePosition() {
        return this.calendarView.getPositionOfCenterItem();
    }

    public Calendar getDateAt(int i) throws IndexOutOfBoundsException {
        return this.mCalendarAdapter.getItem(i);
    }

    public boolean contains(Calendar calendar) {
        return positionOfDate(calendar) != -1;
    }

    public HorizontalCalendarView getCalendarView() {
        return this.calendarView;
    }

    public Context getContext() {
        return this.calendarView.getContext();
    }

    public void setRange(Calendar calendar, Calendar calendar2) {
        this.startDate = calendar;
        this.endDate = calendar2;
        this.mCalendarAdapter.update(calendar, calendar2, false);
    }

    public CalendarItemStyle getDefaultStyle() {
        return this.defaultStyle;
    }

    public CalendarItemStyle getSelectedItemStyle() {
        return this.selectedItemStyle;
    }

    public HorizontalCalendarConfig getConfig() {
        return this.config;
    }

    public int getNumberOfDatesOnScreen() {
        return this.numberOfDatesOnScreen;
    }

    public int getShiftCells() {
        return this.numberOfDatesOnScreen / 2;
    }

    public int positionOfDate(Calendar calendar) {
        if (Utils.isDateBefore(calendar, this.startDate) || Utils.isDateAfter(calendar, this.endDate)) {
            return -1;
        }
        int i = 0;
        if (this.mode == Mode.DAYS) {
            if (!Utils.isSameDate(calendar, this.startDate)) {
                i = Utils.daysBetween(this.startDate, calendar);
            }
        } else if (!Utils.isSameMonth(calendar, this.startDate)) {
            i = Utils.monthsBetween(this.startDate, calendar);
        }
        return i + (this.numberOfDatesOnScreen / 2);
    }

    public static class Builder {
        private ConfigBuilder configBuilder;
        Calendar defaultSelectedDate;
        private HorizontalCalendarPredicate disablePredicate;
        Calendar endDate;
        private CalendarEventsPredicate eventsPredicate;
        Mode mode;
        int numberOfDatesOnScreen;
        final View rootView;
        Calendar startDate;
        final int viewId;

        public Builder(View view, int i) {
            this.rootView = view;
            this.viewId = i;
        }

        public Builder(Activity activity, int i) {
            this.rootView = activity.getWindow().getDecorView();
            this.viewId = i;
        }

        public Builder range(Calendar calendar, Calendar calendar2) {
            this.startDate = calendar;
            this.endDate = calendar2;
            return this;
        }

        public Builder mode(Mode mode2) {
            this.mode = mode2;
            return this;
        }

        public Builder datesNumberOnScreen(int i) {
            this.numberOfDatesOnScreen = i;
            return this;
        }

        public Builder defaultSelectedDate(Calendar calendar) {
            this.defaultSelectedDate = calendar;
            return this;
        }

        public Builder disableDates(HorizontalCalendarPredicate horizontalCalendarPredicate) {
            this.disablePredicate = horizontalCalendarPredicate;
            return this;
        }

        public Builder addEvents(CalendarEventsPredicate calendarEventsPredicate) {
            this.eventsPredicate = calendarEventsPredicate;
            return this;
        }

        public ConfigBuilder configure() {
            if (this.configBuilder == null) {
                this.configBuilder = new ConfigBuilder(this);
            }
            return this.configBuilder;
        }

        private void initDefaultValues() throws IllegalStateException {
            if (this.startDate == null || this.endDate == null) {
                throw new IllegalStateException("HorizontalCalendar range was not specified, either startDate or endDate is null!");
            }
            if (this.mode == null) {
                this.mode = Mode.DAYS;
            }
            if (this.numberOfDatesOnScreen <= 0) {
                this.numberOfDatesOnScreen = 5;
            }
            if (this.defaultSelectedDate == null) {
                this.defaultSelectedDate = Calendar.getInstance();
            }
        }

        public HorizontalCalendar build() throws IllegalStateException {
            initDefaultValues();
            if (this.configBuilder == null) {
                this.configBuilder = new ConfigBuilder(this);
                this.configBuilder.end();
            }
            HorizontalCalendar horizontalCalendar = new HorizontalCalendar(this, this.configBuilder.createConfig(), this.configBuilder.createDefaultStyle(), this.configBuilder.createSelectedItemStyle());
            horizontalCalendar.init(this.rootView, this.defaultSelectedDate, this.disablePredicate, this.eventsPredicate);
            return horizontalCalendar;
        }
    }

    private class HorizontalCalendarScrollListener extends RecyclerView.OnScrollListener {
        int lastSelectedItem = -1;
        final Runnable selectedItemRefresher = new SelectedItemRefresher();

        HorizontalCalendarScrollListener() {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            HorizontalCalendar.this.post(this.selectedItemRefresher);
            if (HorizontalCalendar.this.calendarListener != null) {
                HorizontalCalendar.this.calendarListener.onCalendarScroll(HorizontalCalendar.this.calendarView, i, i2);
            }
        }

        private class SelectedItemRefresher implements Runnable {
            SelectedItemRefresher() {
            }

            public void run() {
                int positionOfCenterItem = HorizontalCalendar.this.calendarView.getPositionOfCenterItem();
                if (HorizontalCalendarScrollListener.this.lastSelectedItem == -1 || HorizontalCalendarScrollListener.this.lastSelectedItem != positionOfCenterItem) {
                    HorizontalCalendar.this.refreshItemsSelector(positionOfCenterItem, new int[0]);
                    if (HorizontalCalendarScrollListener.this.lastSelectedItem != -1) {
                        HorizontalCalendar.this.refreshItemsSelector(HorizontalCalendarScrollListener.this.lastSelectedItem, new int[0]);
                    }
                    HorizontalCalendarScrollListener.this.lastSelectedItem = positionOfCenterItem;
                }
            }
        }
    }
}
