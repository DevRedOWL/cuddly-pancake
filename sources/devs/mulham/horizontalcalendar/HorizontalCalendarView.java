package devs.mulham.horizontalcalendar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import devs.mulham.horizontalcalendar.adapter.HorizontalCalendarBaseAdapter;
import devs.mulham.horizontalcalendar.model.CalendarItemStyle;
import devs.mulham.horizontalcalendar.model.HorizontalCalendarConfig;

public class HorizontalCalendarView extends RecyclerView {
    private final float FLING_SCALE_DOWN_FACTOR = 0.5f;
    private HorizontalCalendarConfig config;
    private CalendarItemStyle defaultStyle;
    private CalendarItemStyle selectedItemStyle;
    private int shiftCells;

    public HorizontalCalendarView(Context context) {
        super(context);
    }

    public HorizontalCalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C4489R.styleable.HorizontalCalendarView, 0, 0);
        try {
            int color = obtainStyledAttributes.getColor(C4489R.styleable.HorizontalCalendarView_textColorNormal, -3355444);
            int color2 = obtainStyledAttributes.getColor(C4489R.styleable.HorizontalCalendarView_colorTopText, color);
            int color3 = obtainStyledAttributes.getColor(C4489R.styleable.HorizontalCalendarView_colorMiddleText, color);
            int color4 = obtainStyledAttributes.getColor(C4489R.styleable.HorizontalCalendarView_colorBottomText, color);
            int color5 = obtainStyledAttributes.getColor(C4489R.styleable.HorizontalCalendarView_textColorSelected, ViewCompat.MEASURED_STATE_MASK);
            int color6 = obtainStyledAttributes.getColor(C4489R.styleable.HorizontalCalendarView_colorTopTextSelected, color5);
            int color7 = obtainStyledAttributes.getColor(C4489R.styleable.HorizontalCalendarView_colorMiddleTextSelected, color5);
            int color8 = obtainStyledAttributes.getColor(C4489R.styleable.HorizontalCalendarView_colorBottomTextSelected, color5);
            Drawable drawable = obtainStyledAttributes.getDrawable(C4489R.styleable.HorizontalCalendarView_selectedDateBackground);
            int color9 = obtainStyledAttributes.getColor(C4489R.styleable.HorizontalCalendarView_selectorColor, fetchAccentColor());
            float rawSizeValue = getRawSizeValue(obtainStyledAttributes, C4489R.styleable.HorizontalCalendarView_sizeTopText, 14.0f);
            float rawSizeValue2 = getRawSizeValue(obtainStyledAttributes, C4489R.styleable.HorizontalCalendarView_sizeMiddleText, 24.0f);
            float rawSizeValue3 = getRawSizeValue(obtainStyledAttributes, C4489R.styleable.HorizontalCalendarView_sizeBottomText, 14.0f);
            this.defaultStyle = new CalendarItemStyle(color2, color3, color4, (Drawable) null);
            this.selectedItemStyle = new CalendarItemStyle(color6, color7, color8, drawable);
            this.config = new HorizontalCalendarConfig(rawSizeValue, rawSizeValue2, rawSizeValue3, Integer.valueOf(color9));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private float getRawSizeValue(TypedArray typedArray, int i, float f) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue)) {
            return f;
        }
        return TypedValue.complexToFloat(typedValue.data);
    }

    public boolean fling(int i, int i2) {
        return super.fling((int) (((float) i) * 0.5f), i2);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (isInEditMode()) {
            setMeasuredDimension(i, 150);
        } else {
            super.onMeasure(i, i2);
        }
    }

    public float getSmoothScrollSpeed() {
        return getLayoutManager().getSmoothScrollSpeed();
    }

    public void setSmoothScrollSpeed(float f) {
        getLayoutManager().setSmoothScrollSpeed(f);
    }

    public HorizontalCalendarBaseAdapter getAdapter() {
        return (HorizontalCalendarBaseAdapter) super.getAdapter();
    }

    public HorizontalLayoutManager getLayoutManager() {
        return (HorizontalLayoutManager) super.getLayoutManager();
    }

    private int fetchAccentColor() {
        TypedValue typedValue = new TypedValue();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(typedValue.data, new int[]{C4489R.attr.colorAccent});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    public void applyConfigFromLayout(HorizontalCalendar horizontalCalendar) {
        horizontalCalendar.getConfig().setupDefaultValues(this.config);
        horizontalCalendar.getDefaultStyle().setupDefaultValues(this.defaultStyle);
        horizontalCalendar.getSelectedItemStyle().setupDefaultValues(this.selectedItemStyle);
        this.config = null;
        this.defaultStyle = null;
        this.selectedItemStyle = null;
        this.shiftCells = horizontalCalendar.getNumberOfDatesOnScreen() / 2;
    }

    public int getPositionOfCenterItem() {
        int findFirstCompletelyVisibleItemPosition;
        HorizontalLayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null || (findFirstCompletelyVisibleItemPosition = layoutManager.findFirstCompletelyVisibleItemPosition()) == -1) {
            return -1;
        }
        return findFirstCompletelyVisibleItemPosition + this.shiftCells;
    }
}
