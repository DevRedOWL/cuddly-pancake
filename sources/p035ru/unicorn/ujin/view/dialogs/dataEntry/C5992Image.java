package p035ru.unicorn.ujin.view.dialogs.dataEntry;

import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000fB\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/Image;", "", "url", "", "metaData", "Lru/unicorn/ujin/view/dialogs/dataEntry/ImageMeta;", "(Ljava/lang/String;Lru/unicorn/ujin/view/dialogs/dataEntry/ImageMeta;)V", "getMetaData", "()Lru/unicorn/ujin/view/dialogs/dataEntry/ImageMeta;", "setMetaData", "(Lru/unicorn/ujin/view/dialogs/dataEntry/ImageMeta;)V", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "JsonFields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.Image */
/* compiled from: DataEntryItem.kt */
public final class C5992Image {
    private ImageMeta metaData;
    private String url;

    public C5992Image(String str, ImageMeta imageMeta) {
        this.url = str;
        this.metaData = imageMeta;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final ImageMeta getMetaData() {
        return this.metaData;
    }

    public final void setMetaData(ImageMeta imageMeta) {
        this.metaData = imageMeta;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/Image$JsonFields;", "", "()V", "metaData", "", "url", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.Image$JsonFields */
    /* compiled from: DataEntryItem.kt */
    public static final class JsonFields {
        public static final JsonFields INSTANCE = new JsonFields();
        public static final String metaData = "meta_data";
        public static final String url = "url";

        private JsonFields() {
        }
    }
}
