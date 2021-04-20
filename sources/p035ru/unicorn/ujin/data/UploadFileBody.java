package p035ru.unicorn.ujin.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo51343d2 = {"Lru/unicorn/ujin/data/UploadFileBody;", "", "file_base64", "", "(Ljava/lang/String;)V", "getFile_base64", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.UploadFileBody */
/* compiled from: UploadFileBody.kt */
public final class UploadFileBody {
    private final String file_base64;

    public static /* synthetic */ UploadFileBody copy$default(UploadFileBody uploadFileBody, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uploadFileBody.file_base64;
        }
        return uploadFileBody.copy(str);
    }

    public final String component1() {
        return this.file_base64;
    }

    public final UploadFileBody copy(String str) {
        Intrinsics.checkNotNullParameter(str, "file_base64");
        return new UploadFileBody(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof UploadFileBody) && Intrinsics.areEqual((Object) this.file_base64, (Object) ((UploadFileBody) obj).file_base64);
        }
        return true;
    }

    public int hashCode() {
        String str = this.file_base64;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "UploadFileBody(file_base64=" + this.file_base64 + ")";
    }

    public UploadFileBody(String str) {
        Intrinsics.checkNotNullParameter(str, "file_base64");
        this.file_base64 = str;
    }

    public final String getFile_base64() {
        return this.file_base64;
    }
}
