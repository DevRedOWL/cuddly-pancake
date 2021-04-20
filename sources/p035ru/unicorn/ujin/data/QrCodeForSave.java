package p035ru.unicorn.ujin.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_QrCodeForSaveRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\f"}, mo51343d2 = {"Lru/unicorn/ujin/data/QrCodeForSave;", "Lio/realm/RealmObject;", "id", "", "qr", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getQr", "setQr", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.QrCodeForSave */
/* compiled from: ListMyPassIn.kt */
public class QrCodeForSave extends RealmObject implements ru_unicorn_ujin_data_QrCodeForSaveRealmProxyInterface {
    @PrimaryKey

    /* renamed from: id */
    private String f6609id;

    /* renamed from: qr */
    private String f6610qr;

    public QrCodeForSave() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$id() {
        return this.f6609id;
    }

    public String realmGet$qr() {
        return this.f6610qr;
    }

    public void realmSet$id(String str) {
        this.f6609id = str;
    }

    public void realmSet$qr(String str) {
        this.f6610qr = str;
    }

    public final String getId() {
        return realmGet$id();
    }

    public final void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$id(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QrCodeForSave(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final String getQr() {
        return realmGet$qr();
    }

    public final void setQr(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$qr(str);
    }

    public QrCodeForSave(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "qr");
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(str);
        realmSet$qr(str2);
    }
}
