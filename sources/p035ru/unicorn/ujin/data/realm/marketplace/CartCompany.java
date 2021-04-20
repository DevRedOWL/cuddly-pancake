package p035ru.unicorn.ujin.data.realm.marketplace;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.C4603xa36a2614;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0014B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0007J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u0010\u0013\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u0015"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/CartCompany;", "Lio/realm/RealmObject;", "Lru/unicorn/ujin/view/activity/navigation/adapter/Diffable;", "id", "", "title", "delivery", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDelivery", "()Ljava/lang/String;", "setDelivery", "(Ljava/lang/String;)V", "getId", "setId", "getTitle", "setTitle", "areContentsTheSame", "", "other", "areItemsTheSame", "Fields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.marketplace.CartCompany */
/* compiled from: CartCompany.kt */
public class CartCompany extends RealmObject implements Diffable<CartCompany>, C4603xa36a2614 {
    private String delivery;
    @PrimaryKey

    /* renamed from: id */
    private String f6671id;
    private String title;

    public CartCompany() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$delivery() {
        return this.delivery;
    }

    public String realmGet$id() {
        return this.f6671id;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$delivery(String str) {
        this.delivery = str;
    }

    public void realmSet$id(String str) {
        this.f6671id = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CartCompany(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final String getId() {
        return realmGet$id();
    }

    public final void setId(String str) {
        realmSet$id(str);
    }

    public final String getTitle() {
        return realmGet$title();
    }

    public final void setTitle(String str) {
        realmSet$title(str);
    }

    public final String getDelivery() {
        return realmGet$delivery();
    }

    public final void setDelivery(String str) {
        realmSet$delivery(str);
    }

    public CartCompany(String str, String str2, String str3) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(str);
        realmSet$title(str2);
        realmSet$delivery(str3);
    }

    public boolean areItemsTheSame(CartCompany cartCompany) {
        return Intrinsics.areEqual((Object) realmGet$id(), (Object) cartCompany != null ? cartCompany.realmGet$id() : null);
    }

    public boolean areContentsTheSame(CartCompany cartCompany) {
        String str = null;
        if (Intrinsics.areEqual((Object) realmGet$title(), (Object) cartCompany != null ? cartCompany.realmGet$title() : null)) {
            String realmGet$delivery = realmGet$delivery();
            if (cartCompany != null) {
                str = cartCompany.realmGet$delivery();
            }
            if (Intrinsics.areEqual((Object) realmGet$delivery, (Object) str)) {
                return true;
            }
        }
        return false;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/CartCompany$Fields;", "", "()V", "id", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.realm.marketplace.CartCompany$Fields */
    /* compiled from: CartCompany.kt */
    public static final class Fields {
        public static final Fields INSTANCE = new Fields();

        /* renamed from: id */
        public static final String f6672id = "id";

        private Fields() {
        }
    }
}
