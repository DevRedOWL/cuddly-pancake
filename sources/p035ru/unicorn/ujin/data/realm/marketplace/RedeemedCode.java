package p035ru.unicorn.ujin.data.realm.marketplace;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import p046io.realm.C4622xd65fbd1b;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0016B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/RedeemedCode;", "Lio/realm/RealmObject;", "id", "", "text", "", "expiredAt", "Lru/unicorn/ujin/data/realm/marketplace/RedeemedCodeDate;", "(Ljava/lang/Integer;Ljava/lang/String;Lru/unicorn/ujin/data/realm/marketplace/RedeemedCodeDate;)V", "getExpiredAt", "()Lru/unicorn/ujin/data/realm/marketplace/RedeemedCodeDate;", "setExpiredAt", "(Lru/unicorn/ujin/data/realm/marketplace/RedeemedCodeDate;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "Fields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.marketplace.RedeemedCode */
/* compiled from: RedeemedCode.kt */
public class RedeemedCode extends RealmObject implements C4622xd65fbd1b {
    @SerializedName("expired_at")
    private RedeemedCodeDate expiredAt;
    @PrimaryKey

    /* renamed from: id */
    private Integer f6694id;
    private String text;

    public RedeemedCode() {
        this((Integer) null, (String) null, (RedeemedCodeDate) null, 7, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public RedeemedCodeDate realmGet$expiredAt() {
        return this.expiredAt;
    }

    public Integer realmGet$id() {
        return this.f6694id;
    }

    public String realmGet$text() {
        return this.text;
    }

    public void realmSet$expiredAt(RedeemedCodeDate redeemedCodeDate) {
        this.expiredAt = redeemedCodeDate;
    }

    public void realmSet$id(Integer num) {
        this.f6694id = num;
    }

    public void realmSet$text(String str) {
        this.text = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RedeemedCode(Integer num, String str, RedeemedCodeDate redeemedCodeDate, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : redeemedCodeDate);
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

    public final String getText() {
        return realmGet$text();
    }

    public final void setText(String str) {
        realmSet$text(str);
    }

    public final RedeemedCodeDate getExpiredAt() {
        return realmGet$expiredAt();
    }

    public final void setExpiredAt(RedeemedCodeDate redeemedCodeDate) {
        realmSet$expiredAt(redeemedCodeDate);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/RedeemedCode$Fields;", "", "()V", "id", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.realm.marketplace.RedeemedCode$Fields */
    /* compiled from: RedeemedCode.kt */
    public static final class Fields {
        public static final Fields INSTANCE = new Fields();

        /* renamed from: id */
        public static final String f6695id = "id";

        private Fields() {
        }
    }

    public RedeemedCode(Integer num, String str, RedeemedCodeDate redeemedCodeDate) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(num);
        realmSet$text(str);
        realmSet$expiredAt(redeemedCodeDate);
    }
}
