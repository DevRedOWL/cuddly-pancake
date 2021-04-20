package p035ru.unicorn.ujin.view.fragments.chats;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p042cz.msebera.android.httpclient.cookie.ClientCookie;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/chats/Attachment;", "", "path", "", "type", "Lru/unicorn/ujin/view/fragments/chats/AttachmentType;", "id", "(Ljava/lang/String;Lru/unicorn/ujin/view/fragments/chats/AttachmentType;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getPath", "getType", "()Lru/unicorn/ujin/view/fragments/chats/AttachmentType;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.Attachment */
/* compiled from: Attachment.kt */
public final class Attachment {

    /* renamed from: id */
    private String f6918id;
    private final String path;
    private final AttachmentType type;

    public Attachment(String str, AttachmentType attachmentType, String str2) {
        Intrinsics.checkNotNullParameter(str, ClientCookie.PATH_ATTR);
        Intrinsics.checkNotNullParameter(attachmentType, "type");
        Intrinsics.checkNotNullParameter(str2, "id");
        this.path = str;
        this.type = attachmentType;
        this.f6918id = str2;
    }

    public final String getId() {
        return this.f6918id;
    }

    public final String getPath() {
        return this.path;
    }

    public final AttachmentType getType() {
        return this.type;
    }

    public final void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f6918id = str;
    }
}
