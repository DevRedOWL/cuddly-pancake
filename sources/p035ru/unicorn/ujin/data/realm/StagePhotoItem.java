package p035ru.unicorn.ujin.data.realm;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ<\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006&"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/StagePhotoItem;", "", "type", "", "title", "", "image", "Lru/unicorn/ujin/data/realm/ImageData;", "imagePosition", "(ILjava/lang/String;Lru/unicorn/ujin/data/realm/ImageData;Ljava/lang/Integer;)V", "getImage", "()Lru/unicorn/ujin/data/realm/ImageData;", "setImage", "(Lru/unicorn/ujin/data/realm/ImageData;)V", "getImagePosition", "()Ljava/lang/Integer;", "setImagePosition", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getType", "()I", "setType", "(I)V", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/String;Lru/unicorn/ujin/data/realm/ImageData;Ljava/lang/Integer;)Lru/unicorn/ujin/data/realm/StagePhotoItem;", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.StagePhotoItem */
/* compiled from: StagePhotoItem.kt */
public final class StagePhotoItem {
    private ImageData image;
    private Integer imagePosition;
    private String title;
    private int type;

    public static /* synthetic */ StagePhotoItem copy$default(StagePhotoItem stagePhotoItem, int i, String str, ImageData imageData, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = stagePhotoItem.type;
        }
        if ((i2 & 2) != 0) {
            str = stagePhotoItem.title;
        }
        if ((i2 & 4) != 0) {
            imageData = stagePhotoItem.image;
        }
        if ((i2 & 8) != 0) {
            num = stagePhotoItem.imagePosition;
        }
        return stagePhotoItem.copy(i, str, imageData, num);
    }

    public final int component1() {
        return this.type;
    }

    public final String component2() {
        return this.title;
    }

    public final ImageData component3() {
        return this.image;
    }

    public final Integer component4() {
        return this.imagePosition;
    }

    public final StagePhotoItem copy(int i, String str, ImageData imageData, Integer num) {
        return new StagePhotoItem(i, str, imageData, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StagePhotoItem)) {
            return false;
        }
        StagePhotoItem stagePhotoItem = (StagePhotoItem) obj;
        return this.type == stagePhotoItem.type && Intrinsics.areEqual((Object) this.title, (Object) stagePhotoItem.title) && Intrinsics.areEqual((Object) this.image, (Object) stagePhotoItem.image) && Intrinsics.areEqual((Object) this.imagePosition, (Object) stagePhotoItem.imagePosition);
    }

    public int hashCode() {
        int hashCode = Integer.valueOf(this.type).hashCode() * 31;
        String str = this.title;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        ImageData imageData = this.image;
        int hashCode3 = (hashCode2 + (imageData != null ? imageData.hashCode() : 0)) * 31;
        Integer num = this.imagePosition;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "StagePhotoItem(type=" + this.type + ", title=" + this.title + ", image=" + this.image + ", imagePosition=" + this.imagePosition + ")";
    }

    public StagePhotoItem(int i, String str, ImageData imageData, Integer num) {
        this.type = i;
        this.title = str;
        this.image = imageData;
        this.imagePosition = num;
    }

    public final int getType() {
        return this.type;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final ImageData getImage() {
        return this.image;
    }

    public final void setImage(ImageData imageData) {
        this.image = imageData;
    }

    public final Integer getImagePosition() {
        return this.imagePosition;
    }

    public final void setImagePosition(Integer num) {
        this.imagePosition = num;
    }
}
