package p035ru.unicorn.ujin.view.dialogs.dataEntry;

import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u0012B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/MapPoint;", "", "x", "", "y", "zoom", "", "(DDF)V", "getX", "()D", "setX", "(D)V", "getY", "setY", "getZoom", "()F", "setZoom", "(F)V", "JsonFields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.MapPoint */
/* compiled from: DataEntryItem.kt */
public final class MapPoint {

    /* renamed from: x */
    private double f6909x;

    /* renamed from: y */
    private double f6910y;
    private float zoom;

    public MapPoint(double d, double d2, float f) {
        this.f6909x = d;
        this.f6910y = d2;
        this.zoom = f;
    }

    public final double getX() {
        return this.f6909x;
    }

    public final void setX(double d) {
        this.f6909x = d;
    }

    public final double getY() {
        return this.f6910y;
    }

    public final void setY(double d) {
        this.f6910y = d;
    }

    public final float getZoom() {
        return this.zoom;
    }

    public final void setZoom(float f) {
        this.zoom = f;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/MapPoint$JsonFields;", "", "()V", "x", "", "y", "zoom", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.MapPoint$JsonFields */
    /* compiled from: DataEntryItem.kt */
    public static final class JsonFields {
        public static final JsonFields INSTANCE = new JsonFields();

        /* renamed from: x */
        public static final String f6911x = "x";

        /* renamed from: y */
        public static final String f6912y = "y";
        public static final String zoom = "zoom";

        private JsonFields() {
        }
    }
}
