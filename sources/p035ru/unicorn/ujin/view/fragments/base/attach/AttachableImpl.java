package p035ru.unicorn.ujin.view.fragments.base.attach;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u0010\u0012\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0014"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/base/attach/AttachableImpl;", "Lru/unicorn/ujin/view/fragments/base/attach/AttachablePreview;", "imagePath", "", "fileName", "type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFileName", "()Ljava/lang/String;", "setFileName", "(Ljava/lang/String;)V", "getImagePath", "setImagePath", "getType", "setType", "areContentsTheSame", "", "other", "areItemsTheSame", "imageUrl", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.base.attach.AttachableImpl */
/* compiled from: AttachableImpl.kt */
public final class AttachableImpl implements AttachablePreview {
    private String fileName;
    private String imagePath;
    private String type;

    public AttachableImpl(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "imagePath");
        Intrinsics.checkNotNullParameter(str2, "fileName");
        Intrinsics.checkNotNullParameter(str3, "type");
        this.imagePath = str;
        this.fileName = str2;
        this.type = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AttachableImpl(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getImagePath() {
        return this.imagePath;
    }

    public final String getType() {
        return this.type;
    }

    public final void setFileName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fileName = str;
    }

    public final void setImagePath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imagePath = str;
    }

    public final void setType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public String imageUrl() {
        return this.imagePath;
    }

    public String fileName() {
        return this.fileName;
    }

    public String type() {
        return this.type;
    }

    public boolean areItemsTheSame(AttachablePreview attachablePreview) {
        return Intrinsics.areEqual((Object) this.fileName, (Object) attachablePreview != null ? attachablePreview.fileName() : null);
    }

    public boolean areContentsTheSame(AttachablePreview attachablePreview) {
        return Intrinsics.areEqual((Object) this.imagePath, (Object) attachablePreview != null ? attachablePreview.imageUrl() : null);
    }
}
