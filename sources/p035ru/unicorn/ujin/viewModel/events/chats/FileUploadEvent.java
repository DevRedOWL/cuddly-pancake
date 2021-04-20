package p035ru.unicorn.ujin.viewModel.events.chats;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p042cz.msebera.android.httpclient.cookie.ClientCookie;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo51343d2 = {"Lru/unicorn/ujin/viewModel/events/chats/FileUploadEvent;", "", "success", "", "message", "", "path", "id", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getMessage", "getPath", "getSuccess", "()Z", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.viewModel.events.chats.FileUploadEvent */
/* compiled from: FileUploadEvent.kt */
public final class FileUploadEvent {

    /* renamed from: id */
    private final String f6954id;
    private final String message;
    private final String path;
    private final boolean success;

    public FileUploadEvent(boolean z, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter(str2, ClientCookie.PATH_ATTR);
        Intrinsics.checkNotNullParameter(str3, "id");
        this.success = z;
        this.message = str;
        this.path = str2;
        this.f6954id = str3;
    }

    public final String getId() {
        return this.f6954id;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getPath() {
        return this.path;
    }

    public final boolean getSuccess() {
        return this.success;
    }
}
