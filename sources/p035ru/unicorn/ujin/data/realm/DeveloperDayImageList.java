package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR.\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/DeveloperDayImageList;", "", "group", "", "imageList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/data/realm/ImageData;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "getGroup", "()Ljava/lang/String;", "setGroup", "(Ljava/lang/String;)V", "getImageList", "()Ljava/util/ArrayList;", "setImageList", "(Ljava/util/ArrayList;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.DeveloperDayImageList */
/* compiled from: DeveloperDayImageList.kt */
public final class DeveloperDayImageList {
    @SerializedName("group")
    private String group;
    @SerializedName("images")
    private ArrayList<ImageData> imageList;

    public static /* synthetic */ DeveloperDayImageList copy$default(DeveloperDayImageList developerDayImageList, String str, ArrayList<ImageData> arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = developerDayImageList.group;
        }
        if ((i & 2) != 0) {
            arrayList = developerDayImageList.imageList;
        }
        return developerDayImageList.copy(str, arrayList);
    }

    public final String component1() {
        return this.group;
    }

    public final ArrayList<ImageData> component2() {
        return this.imageList;
    }

    public final DeveloperDayImageList copy(String str, ArrayList<ImageData> arrayList) {
        Intrinsics.checkNotNullParameter(str, "group");
        Intrinsics.checkNotNullParameter(arrayList, "imageList");
        return new DeveloperDayImageList(str, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeveloperDayImageList)) {
            return false;
        }
        DeveloperDayImageList developerDayImageList = (DeveloperDayImageList) obj;
        return Intrinsics.areEqual((Object) this.group, (Object) developerDayImageList.group) && Intrinsics.areEqual((Object) this.imageList, (Object) developerDayImageList.imageList);
    }

    public int hashCode() {
        String str = this.group;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ArrayList<ImageData> arrayList = this.imageList;
        if (arrayList != null) {
            i = arrayList.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "DeveloperDayImageList(group=" + this.group + ", imageList=" + this.imageList + ")";
    }

    public DeveloperDayImageList(String str, ArrayList<ImageData> arrayList) {
        Intrinsics.checkNotNullParameter(str, "group");
        Intrinsics.checkNotNullParameter(arrayList, "imageList");
        this.group = str;
        this.imageList = arrayList;
    }

    public final String getGroup() {
        return this.group;
    }

    public final void setGroup(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.group = str;
    }

    public final ArrayList<ImageData> getImageList() {
        return this.imageList;
    }

    public final void setImageList(ArrayList<ImageData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.imageList = arrayList;
    }
}
