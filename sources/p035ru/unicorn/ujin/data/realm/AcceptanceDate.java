package p035ru.unicorn.ujin.data.realm;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u0010\r\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0000H\u0016R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u000e"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/AcceptanceDate;", "Lio/realm/RealmObject;", "Lru/unicorn/ujin/view/activity/navigation/adapter/Diffable;", "date", "", "(Ljava/lang/Long;)V", "getDate", "()Ljava/lang/Long;", "setDate", "Ljava/lang/Long;", "areContentsTheSame", "", "other", "areItemsTheSame", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.AcceptanceDate */
/* compiled from: AcceptanceDate.kt */
public class AcceptanceDate extends RealmObject implements Diffable<AcceptanceDate>, ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxyInterface {
    private Long date;

    public AcceptanceDate() {
        this((Long) null, 1, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public Long realmGet$date() {
        return this.date;
    }

    public void realmSet$date(Long l) {
        this.date = l;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AcceptanceDate(Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final Long getDate() {
        return realmGet$date();
    }

    public final void setDate(Long l) {
        realmSet$date(l);
    }

    public AcceptanceDate(Long l) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$date(l);
    }

    public boolean areItemsTheSame(AcceptanceDate acceptanceDate) {
        return Intrinsics.areEqual((Object) realmGet$date(), (Object) acceptanceDate != null ? acceptanceDate.realmGet$date() : null);
    }

    public boolean areContentsTheSame(AcceptanceDate acceptanceDate) {
        return Intrinsics.areEqual((Object) realmGet$date(), (Object) acceptanceDate != null ? acceptanceDate.realmGet$date() : null);
    }
}
