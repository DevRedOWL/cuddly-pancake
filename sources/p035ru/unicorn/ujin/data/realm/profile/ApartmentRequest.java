package p035ru.unicorn.ujin.data.realm.profile;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import p046io.realm.C4629x56ee5624;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0001\bB\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/profile/ApartmentRequest;", "Lio/realm/RealmObject;", "status", "", "(Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "setStatus", "Consts", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.profile.ApartmentRequest */
/* compiled from: ApartmentRequest.kt */
public class ApartmentRequest extends RealmObject implements C4629x56ee5624 {
    @SerializedName("is_verified")
    private String status;

    public ApartmentRequest() {
        this((String) null, 1, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$status() {
        return this.status;
    }

    public void realmSet$status(String str) {
        this.status = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ApartmentRequest(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final String getStatus() {
        return realmGet$status();
    }

    public final void setStatus(String str) {
        realmSet$status(str);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006¨\u0006\r"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/profile/ApartmentRequest$Consts;", "", "()V", "ACCEPTED", "", "getACCEPTED", "()Ljava/lang/String;", "ON_UK", "getON_UK", "REJECTED", "getREJECTED", "STATUS", "getSTATUS", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.realm.profile.ApartmentRequest$Consts */
    /* compiled from: ApartmentRequest.kt */
    public static final class Consts {
        private static final String ACCEPTED = "Одобрен";
        public static final Consts INSTANCE = new Consts();
        private static final String ON_UK = "На проверке в УК";
        private static final String REJECTED = "Отклонён";
        private static final String STATUS = "Статус";

        private Consts() {
        }

        public final String getSTATUS() {
            return STATUS;
        }

        public final String getON_UK() {
            return ON_UK;
        }

        public final String getACCEPTED() {
            return ACCEPTED;
        }

        public final String getREJECTED() {
            return REJECTED;
        }
    }

    public ApartmentRequest(String str) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$status(str);
    }
}
