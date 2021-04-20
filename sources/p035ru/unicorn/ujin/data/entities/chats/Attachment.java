package p035ru.unicorn.ujin.data.entities.chats;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, mo51343d2 = {"Lru/unicorn/ujin/data/entities/chats/Attachment;", "", "id", "", "preview", "url", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getPreview", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.entities.chats.Attachment */
/* compiled from: Message.kt */
public final class Attachment {

    /* renamed from: id */
    private final String f6625id;
    private final String name;
    private final String preview;
    private final String url;

    public static /* synthetic */ Attachment copy$default(Attachment attachment, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = attachment.f6625id;
        }
        if ((i & 2) != 0) {
            str2 = attachment.preview;
        }
        if ((i & 4) != 0) {
            str3 = attachment.url;
        }
        if ((i & 8) != 0) {
            str4 = attachment.name;
        }
        return attachment.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.f6625id;
    }

    public final String component2() {
        return this.preview;
    }

    public final String component3() {
        return this.url;
    }

    public final String component4() {
        return this.name;
    }

    public final Attachment copy(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW);
        Intrinsics.checkNotNullParameter(str3, "url");
        Intrinsics.checkNotNullParameter(str4, "name");
        return new Attachment(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Attachment)) {
            return false;
        }
        Attachment attachment = (Attachment) obj;
        return Intrinsics.areEqual((Object) this.f6625id, (Object) attachment.f6625id) && Intrinsics.areEqual((Object) this.preview, (Object) attachment.preview) && Intrinsics.areEqual((Object) this.url, (Object) attachment.url) && Intrinsics.areEqual((Object) this.name, (Object) attachment.name);
    }

    public int hashCode() {
        String str = this.f6625id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.preview;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.url;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.name;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "Attachment(id=" + this.f6625id + ", preview=" + this.preview + ", url=" + this.url + ", name=" + this.name + ")";
    }

    public Attachment(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW);
        Intrinsics.checkNotNullParameter(str3, "url");
        Intrinsics.checkNotNullParameter(str4, "name");
        this.f6625id = str;
        this.preview = str2;
        this.url = str3;
        this.name = str4;
    }

    public final String getId() {
        return this.f6625id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPreview() {
        return this.preview;
    }

    public final String getUrl() {
        return this.url;
    }
}
