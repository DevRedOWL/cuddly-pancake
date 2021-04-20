package p035ru.unicorn.ujin.view.dialogs.dataEntry;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0013B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/GalleryField;", "Lru/unicorn/ujin/view/dialogs/dataEntry/Field;", "imageList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/dialogs/dataEntry/Image;", "autoSwipe", "", "clickable", "(Ljava/util/ArrayList;ZZ)V", "getAutoSwipe", "()Z", "setAutoSwipe", "(Z)V", "getClickable", "setClickable", "getImageList", "()Ljava/util/ArrayList;", "setImageList", "(Ljava/util/ArrayList;)V", "JsonFields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.GalleryField */
/* compiled from: DataEntryItem.kt */
public final class GalleryField extends Field {
    private boolean autoSwipe;
    private boolean clickable;
    private ArrayList<C5992Image> imageList;

    public final ArrayList<C5992Image> getImageList() {
        return this.imageList;
    }

    public final void setImageList(ArrayList<C5992Image> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.imageList = arrayList;
    }

    public final boolean getAutoSwipe() {
        return this.autoSwipe;
    }

    public final void setAutoSwipe(boolean z) {
        this.autoSwipe = z;
    }

    public final boolean getClickable() {
        return this.clickable;
    }

    public final void setClickable(boolean z) {
        this.clickable = z;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/GalleryField$JsonFields;", "", "()V", "autoSwipe", "", "clickable", "fieldName", "imageList", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.GalleryField$JsonFields */
    /* compiled from: DataEntryItem.kt */
    public static final class JsonFields {
        public static final JsonFields INSTANCE = new JsonFields();
        public static final String autoSwipe = "auto_swipe";
        public static final String clickable = "clickable";
        public static final String fieldName = "gallery";
        public static final String imageList = "images";

        private JsonFields() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryField(ArrayList<C5992Image> arrayList, boolean z, boolean z2) {
        super((String) null, false, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(arrayList, "imageList");
        this.imageList = arrayList;
        this.autoSwipe = z;
        this.clickable = z2;
    }
}
