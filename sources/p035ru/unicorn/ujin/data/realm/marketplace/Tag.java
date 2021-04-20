package p035ru.unicorn.ujin.data.realm.marketplace;

import kotlin.Metadata;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_TagRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/Tag;", "Lio/realm/RealmObject;", "id", "", "title", "", "color", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getColor", "()Ljava/lang/String;", "setColor", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTitle", "setTitle", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.marketplace.Tag */
/* compiled from: Tag.kt */
public class Tag extends RealmObject implements ru_unicorn_ujin_data_realm_marketplace_TagRealmProxyInterface {
    private String color;

    /* renamed from: id */
    private Integer f6698id;
    private String title;

    public Tag() {
        this((Integer) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$color() {
        return this.color;
    }

    public Integer realmGet$id() {
        return this.f6698id;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$color(String str) {
        this.color = str;
    }

    public void realmSet$id(Integer num) {
        this.f6698id = num;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Tag(Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final Integer getId() {
        return realmGet$id();
    }

    public final void setId(Integer num) {
        realmSet$id(num);
    }

    public final String getTitle() {
        return realmGet$title();
    }

    public final void setTitle(String str) {
        realmSet$title(str);
    }

    public final String getColor() {
        return realmGet$color();
    }

    public final void setColor(String str) {
        realmSet$color(str);
    }

    public Tag(Integer num, String str, String str2) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(num);
        realmSet$title(str);
        realmSet$color(str2);
    }
}
