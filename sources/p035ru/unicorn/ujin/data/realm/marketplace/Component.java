package p035ru.unicorn.ujin.data.realm.marketplace;

import kotlin.Metadata;
import p046io.realm.C4612xcc818814;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/Component;", "Lio/realm/RealmObject;", "type", "", "items", "Lio/realm/RealmList;", "(Ljava/lang/String;Lio/realm/RealmList;)V", "getItems", "()Lio/realm/RealmList;", "setItems", "(Lio/realm/RealmList;)V", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.marketplace.Component */
/* compiled from: Component.kt */
public class Component extends RealmObject implements C4612xcc818814 {
    private RealmList<String> items;
    private String type;

    public Component() {
        this((String) null, (RealmList) null, 3, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public RealmList realmGet$items() {
        return this.items;
    }

    public String realmGet$type() {
        return this.type;
    }

    public void realmSet$items(RealmList realmList) {
        this.items = realmList;
    }

    public void realmSet$type(String str) {
        this.type = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Component(String str, RealmList realmList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : realmList);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final String getType() {
        return realmGet$type();
    }

    public final void setType(String str) {
        realmSet$type(str);
    }

    public final RealmList<String> getItems() {
        return realmGet$items();
    }

    public final void setItems(RealmList<String> realmList) {
        realmSet$items(realmList);
    }

    public Component(String str, RealmList<String> realmList) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$type(str);
        realmSet$items(realmList);
    }
}
