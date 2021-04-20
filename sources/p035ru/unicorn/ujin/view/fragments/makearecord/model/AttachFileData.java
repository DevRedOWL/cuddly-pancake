package p035ru.unicorn.ujin.view.fragments.makearecord.model;

import com.facebook.common.util.UriUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/model/AttachFileData;", "", "file", "Lru/unicorn/ujin/view/fragments/makearecord/model/AttachFile;", "(Lru/unicorn/ujin/view/fragments/makearecord/model/AttachFile;)V", "getFile", "()Lru/unicorn/ujin/view/fragments/makearecord/model/AttachFile;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.model.AttachFileData */
/* compiled from: AttachDataIn.kt */
public final class AttachFileData {
    private final AttachFile file;

    public AttachFileData() {
        this((AttachFile) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ AttachFileData copy$default(AttachFileData attachFileData, AttachFile attachFile, int i, Object obj) {
        if ((i & 1) != 0) {
            attachFile = attachFileData.file;
        }
        return attachFileData.copy(attachFile);
    }

    public final AttachFile component1() {
        return this.file;
    }

    public final AttachFileData copy(AttachFile attachFile) {
        Intrinsics.checkNotNullParameter(attachFile, UriUtil.LOCAL_FILE_SCHEME);
        return new AttachFileData(attachFile);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AttachFileData) && Intrinsics.areEqual((Object) this.file, (Object) ((AttachFileData) obj).file);
        }
        return true;
    }

    public int hashCode() {
        AttachFile attachFile = this.file;
        if (attachFile != null) {
            return attachFile.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "AttachFileData(file=" + this.file + ")";
    }

    public AttachFileData(AttachFile attachFile) {
        Intrinsics.checkNotNullParameter(attachFile, UriUtil.LOCAL_FILE_SCHEME);
        this.file = attachFile;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AttachFileData(AttachFile attachFile, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AttachFile(0, 0, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null) : attachFile);
    }

    public final AttachFile getFile() {
        return this.file;
    }
}
