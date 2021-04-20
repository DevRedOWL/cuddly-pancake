package p035ru.unicorn.ujin.view.fragments.file.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/file/model/SendFileOut;", "", "data", "Lru/unicorn/ujin/view/fragments/file/model/FileData;", "token", "", "(Lru/unicorn/ujin/view/fragments/file/model/FileData;Ljava/lang/String;)V", "getData", "()Lru/unicorn/ujin/view/fragments/file/model/FileData;", "getToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.file.model.SendFileOut */
/* compiled from: SendFileOut.kt */
public final class SendFileOut {
    private final FileData data;
    private final String token;

    public static /* synthetic */ SendFileOut copy$default(SendFileOut sendFileOut, FileData fileData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            fileData = sendFileOut.data;
        }
        if ((i & 2) != 0) {
            str = sendFileOut.token;
        }
        return sendFileOut.copy(fileData, str);
    }

    public final FileData component1() {
        return this.data;
    }

    public final String component2() {
        return this.token;
    }

    public final SendFileOut copy(FileData fileData, String str) {
        Intrinsics.checkNotNullParameter(fileData, "data");
        Intrinsics.checkNotNullParameter(str, "token");
        return new SendFileOut(fileData, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendFileOut)) {
            return false;
        }
        SendFileOut sendFileOut = (SendFileOut) obj;
        return Intrinsics.areEqual((Object) this.data, (Object) sendFileOut.data) && Intrinsics.areEqual((Object) this.token, (Object) sendFileOut.token);
    }

    public int hashCode() {
        FileData fileData = this.data;
        int i = 0;
        int hashCode = (fileData != null ? fileData.hashCode() : 0) * 31;
        String str = this.token;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "SendFileOut(data=" + this.data + ", token=" + this.token + ")";
    }

    public SendFileOut(FileData fileData, String str) {
        Intrinsics.checkNotNullParameter(fileData, "data");
        Intrinsics.checkNotNullParameter(str, "token");
        this.data = fileData;
        this.token = str;
    }

    public final FileData getData() {
        return this.data;
    }

    public final String getToken() {
        return this.token;
    }
}
