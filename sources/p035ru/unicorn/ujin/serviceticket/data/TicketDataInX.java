package p035ru.unicorn.ujin.serviceticket.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p046io.realm.C4636x66dc8dd2;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, mo51343d2 = {"Lru/unicorn/ujin/serviceticket/data/TicketDataInX;", "Lio/realm/RealmObject;", "()V", "id", "", "getId", "()I", "setId", "(I)V", "number", "", "getNumber", "()Ljava/lang/String;", "setNumber", "(Ljava/lang/String;)V", "title", "getTitle", "setTitle", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.serviceticket.data.TicketDataInX */
/* compiled from: TicketListDataInX.kt */
public class TicketDataInX extends RealmObject implements C4636x66dc8dd2 {
    @PrimaryKey

    /* renamed from: id */
    private int f6712id;
    private String number;
    private String title;

    public int realmGet$id() {
        return this.f6712id;
    }

    public String realmGet$number() {
        return this.number;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$id(int i) {
        this.f6712id = i;
    }

    public void realmSet$number(String str) {
        this.number = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public TicketDataInX() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$number("");
        realmSet$title("");
    }

    public final int getId() {
        return realmGet$id();
    }

    public final void setId(int i) {
        realmSet$id(i);
    }

    public final String getNumber() {
        return realmGet$number();
    }

    public final void setNumber(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$number(str);
    }

    public final String getTitle() {
        return realmGet$title();
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$title(str);
    }
}
