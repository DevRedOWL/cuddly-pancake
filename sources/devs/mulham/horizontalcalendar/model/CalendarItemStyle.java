package devs.mulham.horizontalcalendar.model;

import android.graphics.drawable.Drawable;

public class CalendarItemStyle {
    private Drawable background;
    private int colorBottomText;
    private int colorMiddleText;
    private int colorTopText;

    public CalendarItemStyle() {
    }

    public CalendarItemStyle(int i, Drawable drawable) {
        this(i, i, i, drawable);
    }

    public CalendarItemStyle(int i, int i2, int i3, Drawable drawable) {
        this.colorTopText = i;
        this.colorMiddleText = i2;
        this.colorBottomText = i3;
        this.background = drawable;
    }

    public int getColorTopText() {
        return this.colorTopText;
    }

    public CalendarItemStyle setColorTopText(int i) {
        this.colorTopText = i;
        return this;
    }

    public int getColorMiddleText() {
        return this.colorMiddleText;
    }

    public CalendarItemStyle setColorMiddleText(int i) {
        this.colorMiddleText = i;
        return this;
    }

    public int getColorBottomText() {
        return this.colorBottomText;
    }

    public CalendarItemStyle setColorBottomText(int i) {
        this.colorBottomText = i;
        return this;
    }

    public Drawable getBackground() {
        return this.background;
    }

    public CalendarItemStyle setBackground(Drawable drawable) {
        this.background = drawable;
        return this;
    }

    public void setupDefaultValues(CalendarItemStyle calendarItemStyle) {
        if (calendarItemStyle != null) {
            if (this.colorTopText == 0) {
                this.colorTopText = calendarItemStyle.colorTopText;
            }
            if (this.colorMiddleText == 0) {
                this.colorMiddleText = calendarItemStyle.colorMiddleText;
            }
            if (this.colorBottomText == 0) {
                this.colorBottomText = calendarItemStyle.colorBottomText;
            }
            if (this.background == null) {
                this.background = calendarItemStyle.background;
            }
        }
    }
}
