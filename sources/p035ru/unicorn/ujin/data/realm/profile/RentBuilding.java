package p035ru.unicorn.ujin.data.realm.profile;

import kotlin.Metadata;
import p046io.realm.C4631xa4a4e594;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0016\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001a¨\u0006!"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/profile/RentBuilding;", "Lio/realm/RealmObject;", "id", "", "title", "", "floor", "apartmentCount", "entranceCount", "address", "Lru/unicorn/ujin/data/realm/profile/RentBuildingAddress;", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lru/unicorn/ujin/data/realm/profile/RentBuildingAddress;)V", "getAddress", "()Lru/unicorn/ujin/data/realm/profile/RentBuildingAddress;", "setAddress", "(Lru/unicorn/ujin/data/realm/profile/RentBuildingAddress;)V", "getApartmentCount", "()Ljava/lang/Long;", "setApartmentCount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getEntranceCount", "setEntranceCount", "getFloor", "()Ljava/lang/String;", "setFloor", "(Ljava/lang/String;)V", "getId", "()J", "setId", "(J)V", "getTitle", "setTitle", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.profile.RentBuilding */
/* compiled from: RentObject.kt */
public class RentBuilding extends RealmObject implements C4631xa4a4e594 {
    private RentBuildingAddress address;
    private Long apartmentCount;
    private Long entranceCount;
    private String floor;
    @PrimaryKey

    /* renamed from: id */
    private long f6703id;
    private String title;

    public RentBuilding() {
        this(0, (String) null, (String) null, (Long) null, (Long) null, (RentBuildingAddress) null, 63, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public RentBuildingAddress realmGet$address() {
        return this.address;
    }

    public Long realmGet$apartmentCount() {
        return this.apartmentCount;
    }

    public Long realmGet$entranceCount() {
        return this.entranceCount;
    }

    public String realmGet$floor() {
        return this.floor;
    }

    public long realmGet$id() {
        return this.f6703id;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$address(RentBuildingAddress rentBuildingAddress) {
        this.address = rentBuildingAddress;
    }

    public void realmSet$apartmentCount(Long l) {
        this.apartmentCount = l;
    }

    public void realmSet$entranceCount(Long l) {
        this.entranceCount = l;
    }

    public void realmSet$floor(String str) {
        this.floor = str;
    }

    public void realmSet$id(long j) {
        this.f6703id = j;
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

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RentBuilding(long r10, java.lang.String r12, java.lang.String r13, java.lang.Long r14, java.lang.Long r15, p035ru.unicorn.ujin.data.realm.profile.RentBuildingAddress r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r9 = this;
            r0 = r9
            r1 = r17 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x0009
        L_0x0008:
            r1 = r10
        L_0x0009:
            r3 = r17 & 2
            r4 = 0
            if (r3 == 0) goto L_0x0012
            r3 = r4
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0013
        L_0x0012:
            r3 = r12
        L_0x0013:
            r5 = r17 & 4
            if (r5 == 0) goto L_0x001b
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x001c
        L_0x001b:
            r5 = r13
        L_0x001c:
            r6 = r17 & 8
            if (r6 == 0) goto L_0x0024
            r6 = r4
            java.lang.Long r6 = (java.lang.Long) r6
            goto L_0x0025
        L_0x0024:
            r6 = r14
        L_0x0025:
            r7 = r17 & 16
            if (r7 == 0) goto L_0x002d
            r7 = r4
            java.lang.Long r7 = (java.lang.Long) r7
            goto L_0x002e
        L_0x002d:
            r7 = r15
        L_0x002e:
            r8 = r17 & 32
            if (r8 == 0) goto L_0x0035
            ru.unicorn.ujin.data.realm.profile.RentBuildingAddress r4 = (p035ru.unicorn.ujin.data.realm.profile.RentBuildingAddress) r4
            goto L_0x0037
        L_0x0035:
            r4 = r16
        L_0x0037:
            r10 = r9
            r11 = r1
            r13 = r3
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r4
            r10.<init>(r11, r13, r14, r15, r16, r17)
            boolean r1 = r0 instanceof p046io.realm.internal.RealmObjectProxy
            if (r1 == 0) goto L_0x004d
            r1 = r0
            io.realm.internal.RealmObjectProxy r1 = (p046io.realm.internal.RealmObjectProxy) r1
            r1.realm$injectObjectContext()
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.profile.RentBuilding.<init>(long, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, ru.unicorn.ujin.data.realm.profile.RentBuildingAddress, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getTitle() {
        return realmGet$title();
    }

    public final void setTitle(String str) {
        realmSet$title(str);
    }

    public final String getFloor() {
        return realmGet$floor();
    }

    public final void setFloor(String str) {
        realmSet$floor(str);
    }

    public final Long getApartmentCount() {
        return realmGet$apartmentCount();
    }

    public final void setApartmentCount(Long l) {
        realmSet$apartmentCount(l);
    }

    public final Long getEntranceCount() {
        return realmGet$entranceCount();
    }

    public final void setEntranceCount(Long l) {
        realmSet$entranceCount(l);
    }

    public final RentBuildingAddress getAddress() {
        return realmGet$address();
    }

    public final void setAddress(RentBuildingAddress rentBuildingAddress) {
        realmSet$address(rentBuildingAddress);
    }

    public RentBuilding(long j, String str, String str2, Long l, Long l2, RentBuildingAddress rentBuildingAddress) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(j);
        realmSet$title(str);
        realmSet$floor(str2);
        realmSet$apartmentCount(l);
        realmSet$entranceCount(l2);
        realmSet$address(rentBuildingAddress);
    }
}
