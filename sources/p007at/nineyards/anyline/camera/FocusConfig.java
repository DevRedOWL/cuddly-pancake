package p007at.nineyards.anyline.camera;

@Deprecated
/* renamed from: at.nineyards.anyline.camera.FocusConfig */
public class FocusConfig {
    public static final int NO_AUTO_FOCUS_TIMER = -1;

    /* renamed from: h */
    private static final String f373h = FocusConfig.class.getSimpleName();

    /* renamed from: a */
    String f374a = "continuous-video";

    /* renamed from: b */
    int f375b = -1;

    /* renamed from: c */
    boolean f376c;

    /* renamed from: d */
    boolean f377d;

    /* renamed from: e */
    boolean f378e = false;

    /* renamed from: f */
    boolean f379f;

    /* renamed from: g */
    boolean f380g = false;

    FocusConfig() {
    }

    @Deprecated
    /* renamed from: at.nineyards.anyline.camera.FocusConfig$Builder */
    public static class Builder {

        /* renamed from: a */
        String f381a;

        /* renamed from: b */
        int f382b = -1;

        /* renamed from: c */
        boolean f383c = false;

        /* renamed from: d */
        boolean f384d = false;

        /* renamed from: e */
        boolean f385e = false;

        /* renamed from: f */
        boolean f386f = false;

        /* renamed from: g */
        boolean f387g = false;

        public Builder setDefaultMode(String str) {
            this.f381a = str;
            return this;
        }

        public String getDefaultMode() {
            return this.f381a;
        }

        public Builder setAutoFocusInterval(int i) {
            this.f382b = i;
            return this;
        }

        public Builder setEnablePhaseAutoFocus(boolean z) {
            this.f383c = z;
            return this;
        }

        public Builder setEnableFocusAreas(boolean z) {
            this.f384d = z;
            return this;
        }

        public Builder setEnableAutoExposureAreas(boolean z) {
            this.f385e = z;
            return this;
        }

        public Builder setEnableFocusOnTouch(boolean z) {
            this.f386f = z;
            return this;
        }

        public Builder setUpdateAreasOnAutoFocus(boolean z) {
            this.f387g = z;
            return this;
        }

        public FocusConfig build() {
            FocusConfig focusConfig = new FocusConfig();
            String str = this.f381a;
            if (str != null) {
                focusConfig.f374a = str;
            }
            focusConfig.f375b = this.f382b;
            focusConfig.f376c = this.f383c;
            focusConfig.f377d = this.f384d;
            focusConfig.f379f = this.f386f;
            focusConfig.f378e = this.f385e;
            focusConfig.f380g = this.f387g;
            return focusConfig;
        }
    }
}
