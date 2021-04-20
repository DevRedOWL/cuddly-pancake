package p035ru.unicorn.ujin.data.realm.profile;

import kotlin.Metadata;
import p046io.realm.C4632x6b4fd43c;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/profile/RentComplex;", "Lio/realm/RealmObject;", "id", "", "title", "", "(JLjava/lang/String;)V", "getId", "()J", "setId", "(J)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.profile.RentComplex */
/* compiled from: RentObject.kt */
public class RentComplex extends RealmObject implements C4632x6b4fd43c {
    @PrimaryKey

    /* renamed from: id */
    private long f6704id;
    private String title;

    public RentComplex() {
        this(0, (String) null, 3, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public long realmGet$id() {
        return this.f6704id;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$id(long j) {
        this.f6704id = j;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public final long getId() {
        return realmGet$id();
    }

    public final void setId(long j) {
        realmSet$id(j);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RentComplex(long j, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : j, (i & 2) != 0 ? null : str);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final String getTitle() {
        return realmGet$title();
    }

    public final void setTitle(String str) {
        realmSet$title(str);
    }

    public RentComplex(long j, String str) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(j);
        realmSet$title(str);
    }
}
