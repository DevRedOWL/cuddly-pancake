package devs.mulham.horizontalcalendar.model;

public class HorizontalCalendarConfig {
    public static final String DEFAULT_FORMAT_TEXT_BOTTOM = "EEE";
    public static final String DEFAULT_FORMAT_TEXT_MIDDLE = "dd";
    public static final String DEFAULT_FORMAT_TEXT_TOP = "MMM";
    public static final float DEFAULT_SIZE_TEXT_BOTTOM = 14.0f;
    public static final float DEFAULT_SIZE_TEXT_MIDDLE = 24.0f;
    public static final float DEFAULT_SIZE_TEXT_TOP = 14.0f;
    private String formatBottomText;
    private String formatMiddleText;
    private String formatTopText;
    private Integer selectorColor;
    private boolean showBottomText;
    private boolean showTopText;
    private float sizeBottomText;
    private float sizeMiddleText;
    private float sizeTopText;

    public HorizontalCalendarConfig() {
    }

    public HorizontalCalendarConfig(float f, float f2, float f3, Integer num) {
        this.sizeTopText = f;
        this.sizeMiddleText = f2;
        this.sizeBottomText = f3;
        this.selectorColor = num;
    }

    public HorizontalCalendarConfig setFormatTopText(String str) {
        this.formatTopText = str;
        return this;
    }

    public HorizontalCalendarConfig setFormatMiddleText(String str) {
        this.formatMiddleText = str;
        return this;
    }

    public HorizontalCalendarConfig setFormatBottomText(String str) {
        this.formatBottomText = str;
        return this;
    }

    public HorizontalCalendarConfig setSizeTopText(float f) {
        this.sizeTopText = f;
        return this;
    }

    public HorizontalCalendarConfig setSizeMiddleText(float f) {
        this.sizeMiddleText = f;
        return this;
    }

    public HorizontalCalendarConfig setSizeBottomText(float f) {
        this.sizeBottomText = f;
        return this;
    }

    public HorizontalCalendarConfig setSelectorColor(Integer num) {
        this.selectorColor = num;
        return this;
    }

    public HorizontalCalendarConfig setShowTopText(boolean z) {
        this.showTopText = z;
        return this;
    }

    public HorizontalCalendarConfig setShowBottomText(boolean z) {
        this.showBottomText = z;
        return this;
    }

    public String getFormatTopText() {
        return this.formatTopText;
    }

    public String getFormatMiddleText() {
        return this.formatMiddleText;
    }

    public String getFormatBottomText() {
        return this.formatBottomText;
    }

    public float getSizeTopText() {
        return this.sizeTopText;
    }

    public float getSizeMiddleText() {
        return this.sizeMiddleText;
    }

    public float getSizeBottomText() {
        return this.sizeBottomText;
    }

    public Integer getSelectorColor() {
        return this.selectorColor;
    }

    public boolean isShowTopText() {
        return this.showTopText;
    }

    public boolean isShowBottomText() {
        return this.showBottomText;
    }

    public void setupDefaultValues(HorizontalCalendarConfig horizontalCalendarConfig) {
        if (horizontalCalendarConfig != null) {
            if (this.selectorColor == null) {
                this.selectorColor = horizontalCalendarConfig.selectorColor;
            }
            if (this.sizeTopText == 0.0f) {
                this.sizeTopText = horizontalCalendarConfig.sizeTopText;
            }
            if (this.sizeMiddleText == 0.0f) {
                this.sizeMiddleText = horizontalCalendarConfig.sizeMiddleText;
            }
            if (this.sizeBottomText == 0.0f) {
                this.sizeBottomText = horizontalCalendarConfig.sizeBottomText;
            }
        }
    }
}
