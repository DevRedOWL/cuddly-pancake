package p035ru.unicorn.ujin.data.api.response.chats;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/chats/FileUploadData;", "", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.chats.FileUploadData */
/* compiled from: FileUploadResponse.kt */
public final class FileUploadData {
    @SerializedName("file_id")

    /* renamed from: id */
    private final String f6616id;

    public static /* synthetic */ FileUploadData copy$default(FileUploadData fileUploadData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fileUploadData.f6616id;
        }
        return fileUploadData.copy(str);
    }

    public final String component1() {
        return this.f6616id;
    }

    public final FileUploadData copy(String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        return new FileUploadData(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FileUploadData) && Intrinsics.areEqual((Object) this.f6616id, (Object) ((FileUploadData) obj).f6616id);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f6616id;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "FileUploadData(id=" + this.f6616id + ")";
    }

    public FileUploadData(String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        this.f6616id = str;
    }

    public final String getId() {
        return this.f6616id;
    }
}
