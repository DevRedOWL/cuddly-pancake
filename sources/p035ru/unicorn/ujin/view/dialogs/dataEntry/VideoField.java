package p035ru.unicorn.ujin.view.dialogs.dataEntry;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\r"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/VideoField;", "Lru/unicorn/ujin/view/dialogs/dataEntry/Field;", "preview", "", "url", "(Ljava/lang/String;Ljava/lang/String;)V", "getPreview", "()Ljava/lang/String;", "setPreview", "(Ljava/lang/String;)V", "getUrl", "setUrl", "JsonFields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.VideoField */
/* compiled from: DataEntryItem.kt */
public final class VideoField extends Field {
    private String preview;
    private String url;

    public final String getPreview() {
        return this.preview;
    }

    public final void setPreview(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.preview = str;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/VideoField$JsonFields;", "", "()V", "fieldName", "", "getFieldName", "()Ljava/lang/String;", "preview", "getPreview", "url", "getUrl", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.VideoField$JsonFields */
    /* compiled from: DataEntryItem.kt */
    public static final class JsonFields {
        public static final JsonFields INSTANCE = new JsonFields();
        private static final String fieldName = "video";
        private static final String preview = RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW;
        private static final String url = "url";

        private JsonFields() {
        }

        public final String getFieldName() {
            return fieldName;
        }

        public final String getPreview() {
            return preview;
        }

        public final String getUrl() {
            return url;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoField(String str, String str2) {
        super((String) null, false, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW);
        Intrinsics.checkNotNullParameter(str2, "url");
        this.preview = str;
        this.url = str2;
    }
}
