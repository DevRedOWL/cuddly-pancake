package p035ru.unicorn.ujin.view.fragments.file.model;

import com.facebook.common.util.UriUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.RequestBody;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/file/model/FileData;", "", "type", "", "file", "Lokhttp3/RequestBody;", "(Ljava/lang/String;Lokhttp3/RequestBody;)V", "getFile", "()Lokhttp3/RequestBody;", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.file.model.FileData */
/* compiled from: SendFileOut.kt */
public final class FileData {
    private final RequestBody file;
    private final String type;

    public static /* synthetic */ FileData copy$default(FileData fileData, String str, RequestBody requestBody, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fileData.type;
        }
        if ((i & 2) != 0) {
            requestBody = fileData.file;
        }
        return fileData.copy(str, requestBody);
    }

    public final String component1() {
        return this.type;
    }

    public final RequestBody component2() {
        return this.file;
    }

    public final FileData copy(String str, RequestBody requestBody) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(requestBody, UriUtil.LOCAL_FILE_SCHEME);
        return new FileData(str, requestBody);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileData)) {
            return false;
        }
        FileData fileData = (FileData) obj;
        return Intrinsics.areEqual((Object) this.type, (Object) fileData.type) && Intrinsics.areEqual((Object) this.file, (Object) fileData.file);
    }

    public int hashCode() {
        String str = this.type;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        RequestBody requestBody = this.file;
        if (requestBody != null) {
            i = requestBody.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "FileData(type=" + this.type + ", file=" + this.file + ")";
    }

    public FileData(String str, RequestBody requestBody) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(requestBody, UriUtil.LOCAL_FILE_SCHEME);
        this.type = str;
        this.file = requestBody;
    }

    public final String getType() {
        return this.type;
    }

    public final RequestBody getFile() {
        return this.file;
    }
}
