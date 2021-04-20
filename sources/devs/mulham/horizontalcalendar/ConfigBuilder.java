package devs.mulham.horizontalcalendar;

import android.graphics.drawable.Drawable;
import devs.mulham.horizontalcalendar.HorizontalCalendar;
import devs.mulham.horizontalcalendar.model.CalendarItemStyle;
import devs.mulham.horizontalcalendar.model.HorizontalCalendarConfig;

public class ConfigBuilder {
    private final HorizontalCalendar.Builder calendarBuilder;
    private int colorTextBottom;
    private int colorTextBottomSelected;
    private int colorTextMiddle;
    private int colorTextMiddleSelected;
    private int colorTextTop;
    private int colorTextTopSelected;
    private String formatBottomText;
    private String formatMiddleText;
    private String formatTopText;
    private Drawable selectedItemBackground;
    private Integer selectorColor;
    private boolean showBottomText = true;
    private boolean showTopText = true;
    private float sizeBottomText;
    private float sizeMiddleText;
    private float sizeTopText;

    public ConfigBuilder(HorizontalCalendar.Builder builder) {
        this.calendarBuilder = builder;
    }

    public ConfigBuilder textSize(float f, float f2, float f3) {
        this.sizeTopText = f;
        this.sizeMiddleText = f2;
        this.sizeBottomText = f3;
        return this;
    }

    public ConfigBuilder sizeTopText(float f) {
        this.sizeTopText = f;
        return this;
    }

    public ConfigBuilder sizeMiddleText(float f) {
        this.sizeMiddleText = f;
        return this;
    }

    public ConfigBuilder sizeBottomText(float f) {
        this.sizeBottomText = f;
        return this;
    }

    public ConfigBuilder selectorColor(Integer num) {
        this.selectorColor = num;
        return this;
    }

    public ConfigBuilder formatTopText(String str) {
        this.formatTopText = str;
        return this;
    }

    public ConfigBuilder formatMiddleText(String str) {
        this.formatMiddleText = str;
        return this;
    }

    public ConfigBuilder formatBottomText(String str) {
        this.formatBottomText = str;
        return this;
    }

    public ConfigBuilder showTopText(boolean z) {
        this.showTopText = z;
        return this;
    }

    public ConfigBuilder showBottomText(boolean z) {
        this.showBottomText = z;
        return this;
    }

    public ConfigBuilder textColor(int i, int i2) {
        this.colorTextTop = i;
        this.colorTextMiddle = i;
        this.colorTextBottom = i;
        this.colorTextTopSelected = i2;
        this.colorTextMiddleSelected = i2;
        this.colorTextBottomSelected = i2;
        return this;
    }

    public ConfigBuilder colorTextTop(int i, int i2) {
        this.colorTextTop = i;
        this.colorTextTopSelected = i2;
        return this;
    }

    public ConfigBuilder colorTextMiddle(int i, int i2) {
        this.colorTextMiddle = i;
        this.colorTextMiddleSelected = i2;
        return this;
    }

    public ConfigBuilder colorTextBottom(int i, int i2) {
        this.colorTextBottom = i;
        this.colorTextBottomSelected = i2;
        return this;
    }

    public ConfigBuilder selectedDateBackground(Drawable drawable) {
        this.selectedItemBackground = drawable;
        return this;
    }

    public HorizontalCalendar.Builder end() {
        if (this.formatMiddleText == null) {
            this.formatMiddleText = HorizontalCalendarConfig.DEFAULT_FORMAT_TEXT_MIDDLE;
        }
        if (this.formatTopText == null && this.showTopText) {
            this.formatTopText = HorizontalCalendarConfig.DEFAULT_FORMAT_TEXT_TOP;
        }
        if (this.formatBottomText == null && this.showBottomText) {
            this.formatBottomText = HorizontalCalendarConfig.DEFAULT_FORMAT_TEXT_BOTTOM;
        }
        return this.calendarBuilder;
    }

    /* access modifiers changed from: package-private */
    public HorizontalCalendarConfig createConfig() {
        HorizontalCalendarConfig horizontalCalendarConfig = new HorizontalCalendarConfig(this.sizeTopText, this.sizeMiddleText, this.sizeBottomText, this.selectorColor);
        horizontalCalendarConfig.setFormatTopText(this.formatTopText);
        horizontalCalendarConfig.setFormatMiddleText(this.formatMiddleText);
        horizontalCalendarConfig.setFormatBottomText(this.formatBottomText);
        horizontalCalendarConfig.setShowTopText(this.showTopText);
        horizontalCalendarConfig.setShowBottomText(this.showBottomText);
        return horizontalCalendarConfig;
    }

    /* access modifiers changed from: package-private */
    public CalendarItemStyle createDefaultStyle() {
        return new CalendarItemStyle(this.colorTextTop, this.colorTextMiddle, this.colorTextBottom, (Drawable) null);
    }

    /* access modifiers changed from: package-private */
    public CalendarItemStyle createSelectedItemStyle() {
        return new CalendarItemStyle(this.colorTextTopSelected, this.colorTextMiddleSelected, this.colorTextBottomSelected, this.selectedItemBackground);
    }
}
