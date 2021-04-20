package p035ru.unicorn.ujin.data.registration;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo51343d2 = {"Lru/unicorn/ujin/data/registration/CreateApartment;", "", "id", "", "(Ljava/lang/Integer;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lru/unicorn/ujin/data/registration/CreateApartment;", "equals", "", "other", "hashCode", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.registration.CreateApartment */
/* compiled from: CreateApartmentData.kt */
public final class CreateApartment {

    /* renamed from: id */
    private final Integer f6708id;

    public static /* synthetic */ CreateApartment copy$default(CreateApartment createApartment, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = createApartment.f6708id;
        }
        return createApartment.copy(num);
    }

    public final Integer component1() {
        return this.f6708id;
    }

    public final CreateApartment copy(Integer num) {
        return new CreateApartment(num);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof CreateApartment) && Intrinsics.areEqual((Object) this.f6708id, (Object) ((CreateApartment) obj).f6708id);
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.f6708id;
        if (num != null) {
            return num.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "CreateApartment(id=" + this.f6708id + ")";
    }

    public CreateApartment(Integer num) {
        this.f6708id = num;
    }

    public final Integer getId() {
        return this.f6708id;
    }
}
