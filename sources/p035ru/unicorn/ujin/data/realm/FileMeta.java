package p035ru.unicorn.ujin.data.realm;

import kotlin.Metadata;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_FileMetaRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\f"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/FileMeta;", "Lio/realm/RealmObject;", "width", "", "height", "(Ljava/lang/String;Ljava/lang/String;)V", "getHeight", "()Ljava/lang/String;", "setHeight", "(Ljava/lang/String;)V", "getWidth", "setWidth", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.FileMeta */
/* compiled from: FileData.kt */
public class FileMeta extends RealmObject implements ru_unicorn_ujin_data_realm_FileMetaRealmProxyInterface {
    private String height;
    private String width;

    public FileMeta() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$height() {
        return this.height;
    }

    public String realmGet$width() {
        return this.width;
    }

    public void realmSet$height(String str) {
        this.height = str;
    }

    public void realmSet$width(String str) {
        this.width = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FileMeta(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final String getWidth() {
        return realmGet$width();
    }

    public final void setWidth(String str) {
        realmSet$width(str);
    }

    public final String getHeight() {
        return realmGet$height();
    }

    public final void setHeight(String str) {
        realmSet$height(str);
    }

    public FileMeta(String str, String str2) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$width(str);
        realmSet$height(str2);
    }
}
