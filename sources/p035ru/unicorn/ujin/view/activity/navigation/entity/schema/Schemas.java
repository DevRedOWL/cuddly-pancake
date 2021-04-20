package p035ru.unicorn.ujin.view.activity.navigation.entity.schema;

import kotlin.Metadata;
import p046io.realm.C4671x675ee51d;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0016\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f¨\u0006\u001c"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/entity/schema/Schemas;", "Lio/realm/RealmObject;", "id", "", "guard", "Lio/realm/RealmList;", "Lru/unicorn/ujin/view/activity/navigation/entity/schema/Schema;", "hotkeys", "services", "cabinet", "meta", "(ILio/realm/RealmList;Lio/realm/RealmList;Lio/realm/RealmList;Lio/realm/RealmList;Lio/realm/RealmList;)V", "getCabinet", "()Lio/realm/RealmList;", "setCabinet", "(Lio/realm/RealmList;)V", "getGuard", "setGuard", "getHotkeys", "setHotkeys", "getId", "()I", "setId", "(I)V", "getMeta", "setMeta", "getServices", "setServices", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas */
/* compiled from: Schemas.kt */
public class Schemas extends RealmObject implements C4671x675ee51d {
    private RealmList<Schema> cabinet;
    private RealmList<Schema> guard;
    private RealmList<Schema> hotkeys;
    @PrimaryKey

    /* renamed from: id */
    private int f6728id;
    private RealmList<Schema> meta;
    private RealmList<Schema> services;

    public Schemas() {
        this(0, (RealmList) null, (RealmList) null, (RealmList) null, (RealmList) null, (RealmList) null, 63, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public RealmList realmGet$cabinet() {
        return this.cabinet;
    }

    public RealmList realmGet$guard() {
        return this.guard;
    }

    public RealmList realmGet$hotkeys() {
        return this.hotkeys;
    }

    public int realmGet$id() {
        return this.f6728id;
    }

    public RealmList realmGet$meta() {
        return this.meta;
    }

    public RealmList realmGet$services() {
        return this.services;
    }

    public void realmSet$cabinet(RealmList realmList) {
        this.cabinet = realmList;
    }

    public void realmSet$guard(RealmList realmList) {
        this.guard = realmList;
    }

    public void realmSet$hotkeys(RealmList realmList) {
        this.hotkeys = realmList;
    }

    public void realmSet$id(int i) {
        this.f6728id = i;
    }

    public void realmSet$meta(RealmList realmList) {
        this.meta = realmList;
    }

    public void realmSet$services(RealmList realmList) {
        this.services = realmList;
    }

    public final int getId() {
        return realmGet$id();
    }

    public final void setId(int i) {
        realmSet$id(i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Schemas(int r5, p046io.realm.RealmList r6, p046io.realm.RealmList r7, p046io.realm.RealmList r8, p046io.realm.RealmList r9, p046io.realm.RealmList r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0005
            r5 = 0
        L_0x0005:
            r12 = r11 & 2
            r0 = 0
            if (r12 == 0) goto L_0x000d
            r6 = r0
            io.realm.RealmList r6 = (p046io.realm.RealmList) r6
        L_0x000d:
            r12 = r6
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0015
            r7 = r0
            io.realm.RealmList r7 = (p046io.realm.RealmList) r7
        L_0x0015:
            r1 = r7
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001d
            r8 = r0
            io.realm.RealmList r8 = (p046io.realm.RealmList) r8
        L_0x001d:
            r2 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0025
            r9 = r0
            io.realm.RealmList r9 = (p046io.realm.RealmList) r9
        L_0x0025:
            r3 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L_0x002d
            r10 = r0
            io.realm.RealmList r10 = (p046io.realm.RealmList) r10
        L_0x002d:
            r0 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            boolean r5 = r4 instanceof p046io.realm.internal.RealmObjectProxy
            if (r5 == 0) goto L_0x0042
            r5 = r4
            io.realm.internal.RealmObjectProxy r5 = (p046io.realm.internal.RealmObjectProxy) r5
            r5.realm$injectObjectContext()
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas.<init>(int, io.realm.RealmList, io.realm.RealmList, io.realm.RealmList, io.realm.RealmList, io.realm.RealmList, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final RealmList<Schema> getGuard() {
        return realmGet$guard();
    }

    public final void setGuard(RealmList<Schema> realmList) {
        realmSet$guard(realmList);
    }

    public final RealmList<Schema> getHotkeys() {
        return realmGet$hotkeys();
    }

    public final void setHotkeys(RealmList<Schema> realmList) {
        realmSet$hotkeys(realmList);
    }

    public final RealmList<Schema> getServices() {
        return realmGet$services();
    }

    public final void setServices(RealmList<Schema> realmList) {
        realmSet$services(realmList);
    }

    public final RealmList<Schema> getCabinet() {
        return realmGet$cabinet();
    }

    public final void setCabinet(RealmList<Schema> realmList) {
        realmSet$cabinet(realmList);
    }

    public final RealmList<Schema> getMeta() {
        return realmGet$meta();
    }

    public final void setMeta(RealmList<Schema> realmList) {
        realmSet$meta(realmList);
    }

    public Schemas(int i, RealmList<Schema> realmList, RealmList<Schema> realmList2, RealmList<Schema> realmList3, RealmList<Schema> realmList4, RealmList<Schema> realmList5) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(i);
        realmSet$guard(realmList);
        realmSet$hotkeys(realmList2);
        realmSet$services(realmList3);
        realmSet$cabinet(realmList4);
        realmSet$meta(realmList5);
    }
}
