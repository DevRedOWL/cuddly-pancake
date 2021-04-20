package p035ru.unicorn.ujin.data.api.response.marketplace;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.marketplace.RedeemedCode;
import p046io.realm.C4596x638dff4c;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/marketplace/RedeemCodeResponseData;", "Lio/realm/RealmObject;", "code", "Lru/unicorn/ujin/data/realm/marketplace/RedeemedCode;", "(Lru/unicorn/ujin/data/realm/marketplace/RedeemedCode;)V", "getCode", "()Lru/unicorn/ujin/data/realm/marketplace/RedeemedCode;", "setCode", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.marketplace.RedeemCodeResponseData */
/* compiled from: RedeemCodeResponse.kt */
public class RedeemCodeResponseData extends RealmObject implements C4596x638dff4c {
    private RedeemedCode code;

    public RedeemCodeResponseData() {
        this((RedeemedCode) null, 1, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public RedeemedCode realmGet$code() {
        return this.code;
    }

    public void realmSet$code(RedeemedCode redeemedCode) {
        this.code = redeemedCode;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RedeemCodeResponseData(RedeemedCode redeemedCode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : redeemedCode);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final RedeemedCode getCode() {
        return realmGet$code();
    }

    public final void setCode(RedeemedCode redeemedCode) {
        realmSet$code(redeemedCode);
    }

    public RedeemCodeResponseData(RedeemedCode redeemedCode) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$code(redeemedCode);
    }
}
