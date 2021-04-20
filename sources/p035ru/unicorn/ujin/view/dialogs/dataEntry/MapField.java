package p035ru.unicorn.ujin.view.dialogs.dataEntry;

import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000fB\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/MapField;", "Lru/unicorn/ujin/view/dialogs/dataEntry/Field;", "center", "Lru/unicorn/ujin/view/dialogs/dataEntry/MapPoint;", "pointList", "Ljava/util/ArrayList;", "(Lru/unicorn/ujin/view/dialogs/dataEntry/MapPoint;Ljava/util/ArrayList;)V", "getCenter", "()Lru/unicorn/ujin/view/dialogs/dataEntry/MapPoint;", "setCenter", "(Lru/unicorn/ujin/view/dialogs/dataEntry/MapPoint;)V", "getPointList", "()Ljava/util/ArrayList;", "setPointList", "(Ljava/util/ArrayList;)V", "JsonFields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.MapField */
/* compiled from: DataEntryItem.kt */
public final class MapField extends Field {
    private MapPoint center;
    private ArrayList<MapPoint> pointList;

    public final MapPoint getCenter() {
        return this.center;
    }

    public final void setCenter(MapPoint mapPoint) {
        this.center = mapPoint;
    }

    public final ArrayList<MapPoint> getPointList() {
        return this.pointList;
    }

    public final void setPointList(ArrayList<MapPoint> arrayList) {
        this.pointList = arrayList;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/MapField$JsonFields;", "", "()V", "center", "", "fieldName", "pointList", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.MapField$JsonFields */
    /* compiled from: DataEntryItem.kt */
    public static final class JsonFields {
        public static final JsonFields INSTANCE = new JsonFields();
        public static final String center = "center";
        public static final String fieldName = "map";
        public static final String pointList = "points";

        private JsonFields() {
        }
    }

    public MapField(MapPoint mapPoint, ArrayList<MapPoint> arrayList) {
        super((String) null, false, 3, (DefaultConstructorMarker) null);
        this.center = mapPoint;
        this.pointList = arrayList;
    }
}
