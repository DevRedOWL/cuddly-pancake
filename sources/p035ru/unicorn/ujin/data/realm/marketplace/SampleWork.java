package p035ru.unicorn.ujin.data.realm.marketplace;

import kotlin.Metadata;
import p046io.realm.C4623x4c2f6c68;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\f"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/SampleWork;", "Lio/realm/RealmObject;", "image", "", "preview", "(Ljava/lang/String;Ljava/lang/String;)V", "getImage", "()Ljava/lang/String;", "setImage", "(Ljava/lang/String;)V", "getPreview", "setPreview", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.marketplace.SampleWork */
/* compiled from: SampleWork.kt */
public class SampleWork extends RealmObject implements C4623x4c2f6c68 {
    private String image;
    private String preview;

    public SampleWork() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$image() {
        return this.image;
    }

    public String realmGet$preview() {
        return this.preview;
    }

    public void realmSet$image(String str) {
        this.image = str;
    }

    public void realmSet$preview(String str) {
        this.preview = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SampleWork(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final String getImage() {
        return realmGet$image();
    }

    public final void setImage(String str) {
        realmSet$image(str);
    }

    public final String getPreview() {
        return realmGet$preview();
    }

    public final void setPreview(String str) {
        realmSet$preview(str);
    }

    public SampleWork(String str, String str2) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$image(str);
        realmSet$preview(str2);
    }
}
