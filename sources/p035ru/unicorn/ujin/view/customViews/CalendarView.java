package p035ru.unicorn.ujin.view.customViews;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.jaredrummler.materialspinner.MaterialSpinner;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.ujin.view.customViews.CalendarView */
public class CalendarView extends ConstraintLayout {
    private Calendar calendarPrimary;
    private int currentDay;
    private int currentMonth;
    private MaterialSpinner days;
    private IDateChanger iDateChanger;
    private boolean isMinimumDateToday;
    private int maxYear;
    private long minDate;
    private int minYear;
    private MaterialSpinner months;
    private long startDate;
    private TextView title;
    private MaterialSpinner yeahrs;

    /* renamed from: ru.unicorn.ujin.view.customViews.CalendarView$IDateChanger */
    public interface IDateChanger {
        void onDateChanged(long j);
    }

    public void setiDateChanger(IDateChanger iDateChanger2) {
        this.iDateChanger = iDateChanger2;
    }

    public CalendarView(Context context) {
        super(context);
        init(context);
    }

    public CalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public CalendarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    private void init(Context context) {
        initCalendar();
        View inflate = LayoutInflater.from(context).inflate(R.layout.calendar_view_layout, this, true);
        this.days = (MaterialSpinner) inflate.findViewById(R.id.days);
        this.months = (MaterialSpinner) inflate.findViewById(R.id.months);
        this.yeahrs = (MaterialSpinner) inflate.findViewById(R.id.yeahrs);
        this.title = (TextView) inflate.findViewById(R.id.label);
        setConfig(this.days);
        setConfig(this.months);
        setConfig(this.yeahrs);
        initSpinnerData();
        notifyListeners();
    }

    private void initSpinnerData() {
        setPickerDate(this.days, 5);
        setPickerDate(this.months, 2);
        setPickerDate(this.yeahrs, 1);
        this.days.setSelectedIndex(this.calendarPrimary.get(5) - 1);
        this.months.setSelectedIndex(this.calendarPrimary.get(2));
        this.currentMonth = this.calendarPrimary.get(2);
        this.currentDay = this.calendarPrimary.get(5);
        this.days.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener() {
            public final void onItemSelected(MaterialSpinner materialSpinner, int i, long j, Object obj) {
                CalendarView.this.lambda$initSpinnerData$0$CalendarView(materialSpinner, i, j, obj);
            }
        });
        this.months.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener() {
            public final void onItemSelected(MaterialSpinner materialSpinner, int i, long j, Object obj) {
                CalendarView.this.lambda$initSpinnerData$1$CalendarView(materialSpinner, i, j, obj);
            }
        });
        this.yeahrs.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener() {
            public final void onItemSelected(MaterialSpinner materialSpinner, int i, long j, Object obj) {
                CalendarView.this.lambda$initSpinnerData$2$CalendarView(materialSpinner, i, j, obj);
            }
        });
    }

    public /* synthetic */ void lambda$initSpinnerData$0$CalendarView(MaterialSpinner materialSpinner, int i, long j, Object obj) {
        this.calendarPrimary.set(5, i + 1);
        this.currentDay = i;
        this.days.setSelectedIndex(this.currentDay);
        notifyListeners();
    }

    public /* synthetic */ void lambda$initSpinnerData$1$CalendarView(MaterialSpinner materialSpinner, int i, long j, Object obj) {
        int i2 = this.currentMonth;
        if (i2 > i) {
            this.calendarPrimary.add(2, i - i2);
        } else {
            this.calendarPrimary.add(2, i - i2);
        }
        this.currentMonth = i;
        setPickerDate(this.days, 5);
        this.days.setSelectedIndex(this.calendarPrimary.get(5) - 1);
        notifyListeners();
    }

    public /* synthetic */ void lambda$initSpinnerData$2$CalendarView(MaterialSpinner materialSpinner, int i, long j, Object obj) {
        Calendar.getInstance().get(1);
        this.calendarPrimary.set(1, Integer.valueOf((String) obj).intValue());
        notifyListeners();
    }

    private void initCalendar() {
        this.calendarPrimary = Calendar.getInstance(Locale.getDefault());
        long j = this.startDate;
        if (j != 0) {
            this.calendarPrimary.setTimeInMillis(j);
        }
        if (this.maxYear == 0) {
            this.maxYear = this.calendarPrimary.get(1) + 2;
        }
        if (this.minYear == 0) {
            this.minYear = this.calendarPrimary.get(1);
        }
    }

    private void notifyListeners() {
        checkIfBigeerThanMinimum();
        IDateChanger iDateChanger2 = this.iDateChanger;
        if (iDateChanger2 != null) {
            iDateChanger2.onDateChanged(this.calendarPrimary.getTimeInMillis() / 1000);
        }
    }

    private void checkIfBigeerThanMinimum() {
        if (getMinDate() != 0 && this.calendarPrimary.getTimeInMillis() < getMinDate()) {
            this.calendarPrimary.setTimeInMillis(getMinDate());
            initSpinnerData();
        }
    }

    private void setPickerDate(MaterialSpinner materialSpinner, int i) {
        ArrayList arrayList = new ArrayList();
        if (i == 1) {
            for (int i2 = this.minYear; i2 <= this.maxYear; i2++) {
                arrayList.add(String.valueOf(i2));
            }
        } else if (i == 2) {
            Calendar instance = Calendar.getInstance();
            instance.set(2, 0);
            for (int i3 = 1; i3 <= 12; i3++) {
                arrayList.add(instance.getDisplayName(2, 2, Locale.getDefault()));
                instance.add(2, 1);
            }
        } else if (i == 5) {
            for (int i4 = 1; i4 <= this.calendarPrimary.getActualMaximum(5); i4++) {
                arrayList.add(String.valueOf(i4));
            }
        }
        materialSpinner.setItems(arrayList);
    }

    private void setConfig(MaterialSpinner materialSpinner) {
        materialSpinner.setDropdownHeight(dpToPx(300));
        materialSpinner.setLines(1);
        materialSpinner.setBackgroundResource(R.drawable.edit_text_bottom_border);
        materialSpinner.setTextSize(14.0f);
        materialSpinner.setTextAlignment(5);
        materialSpinner.setPadding(dpToPx(5), dpToPx(2), dpToPx(2), dpToPx(2));
        materialSpinner.setGravity(17);
    }

    private int dpToPx(int i) {
        return (int) TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
    }

    public void setTitle(String str) {
        this.title.setText(str);
    }

    public void setCalendarPrimary(Calendar calendar) {
        this.calendarPrimary = calendar;
    }

    public void setStartDate(long j) {
        this.startDate = j;
        initCalendar();
        initSpinnerData();
        notifyListeners();
    }

    public void setMaxYear(int i) {
        this.maxYear = i;
        initSpinnerData();
        notifyListeners();
    }

    public long getMinDate() {
        return this.minDate;
    }

    public void setMinDate(long j) {
        this.minDate = j;
    }

    public Calendar getCalendarPrimary() {
        return this.calendarPrimary;
    }
}
