package p035ru.unicorn.ujin.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo51343d2 = {"Lru/unicorn/ujin/data/UkAttachApartment;", "", "id", "", "token", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getToken", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lru/unicorn/ujin/data/UkAttachApartment;", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.UkAttachApartment */
/* compiled from: UkAttachData.kt */
public final class UkAttachApartment {

    /* renamed from: id */
    private final Integer f6611id;
    private final String token;

    public static /* synthetic */ UkAttachApartment copy$default(UkAttachApartment ukAttachApartment, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = ukAttachApartment.f6611id;
        }
        if ((i & 2) != 0) {
            str = ukAttachApartment.token;
        }
        return ukAttachApartment.copy(num, str);
    }

    public final Integer component1() {
        return this.f6611id;
    }

    public final String component2() {
        return this.token;
    }

    public final UkAttachApartment copy(Integer num, String str) {
        return new UkAttachApartment(num, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UkAttachApartment)) {
            return false;
        }
        UkAttachApartment ukAttachApartment = (UkAttachApartment) obj;
        return Intrinsics.areEqual((Object) this.f6611id, (Object) ukAttachApartment.f6611id) && Intrinsics.areEqual((Object) this.token, (Object) ukAttachApartment.token);
    }

    public int hashCode() {
        Integer num = this.f6611id;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.token;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "UkAttachApartment(id=" + this.f6611id + ", token=" + this.token + ")";
    }

    public UkAttachApartment(Integer num, String str) {
        this.f6611id = num;
        this.token = str;
    }

    public final Integer getId() {
        return this.f6611id;
    }

    public final String getToken() {
        return this.token;
    }
}
