package p035ru.unicorn.ujin.data.registration;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo51343d2 = {"Lru/unicorn/ujin/data/registration/CreateApartmentData;", "", "apartment", "Lru/unicorn/ujin/data/registration/CreateApartment;", "token", "", "(Lru/unicorn/ujin/data/registration/CreateApartment;Ljava/lang/String;)V", "getApartment", "()Lru/unicorn/ujin/data/registration/CreateApartment;", "getToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.registration.CreateApartmentData */
/* compiled from: CreateApartmentData.kt */
public final class CreateApartmentData {
    private final CreateApartment apartment;
    private final String token;

    public static /* synthetic */ CreateApartmentData copy$default(CreateApartmentData createApartmentData, CreateApartment createApartment, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            createApartment = createApartmentData.apartment;
        }
        if ((i & 2) != 0) {
            str = createApartmentData.token;
        }
        return createApartmentData.copy(createApartment, str);
    }

    public final CreateApartment component1() {
        return this.apartment;
    }

    public final String component2() {
        return this.token;
    }

    public final CreateApartmentData copy(CreateApartment createApartment, String str) {
        return new CreateApartmentData(createApartment, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateApartmentData)) {
            return false;
        }
        CreateApartmentData createApartmentData = (CreateApartmentData) obj;
        return Intrinsics.areEqual((Object) this.apartment, (Object) createApartmentData.apartment) && Intrinsics.areEqual((Object) this.token, (Object) createApartmentData.token);
    }

    public int hashCode() {
        CreateApartment createApartment = this.apartment;
        int i = 0;
        int hashCode = (createApartment != null ? createApartment.hashCode() : 0) * 31;
        String str = this.token;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "CreateApartmentData(apartment=" + this.apartment + ", token=" + this.token + ")";
    }

    public CreateApartmentData(CreateApartment createApartment, String str) {
        this.apartment = createApartment;
        this.token = str;
    }

    public final CreateApartment getApartment() {
        return this.apartment;
    }

    public final String getToken() {
        return this.token;
    }
}
