package p035ru.unicorn.ujin.view.fragments.providerService;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/providerService/Service;", "", "id", "", "tariff", "Lru/unicorn/ujin/view/fragments/providerService/Tariff;", "title", "", "(Ljava/lang/Integer;Lru/unicorn/ujin/view/fragments/providerService/Tariff;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTariff", "()Lru/unicorn/ujin/view/fragments/providerService/Tariff;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Lru/unicorn/ujin/view/fragments/providerService/Tariff;Ljava/lang/String;)Lru/unicorn/ujin/view/fragments/providerService/Service;", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.providerService.Service */
/* compiled from: ActiveProviderInfoResponse.kt */
public final class Service {

    /* renamed from: id */
    private final Integer f6950id;
    private final Tariff tariff;
    private final String title;

    public static /* synthetic */ Service copy$default(Service service, Integer num, Tariff tariff2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = service.f6950id;
        }
        if ((i & 2) != 0) {
            tariff2 = service.tariff;
        }
        if ((i & 4) != 0) {
            str = service.title;
        }
        return service.copy(num, tariff2, str);
    }

    public final Integer component1() {
        return this.f6950id;
    }

    public final Tariff component2() {
        return this.tariff;
    }

    public final String component3() {
        return this.title;
    }

    public final Service copy(Integer num, Tariff tariff2, String str) {
        return new Service(num, tariff2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Service)) {
            return false;
        }
        Service service = (Service) obj;
        return Intrinsics.areEqual((Object) this.f6950id, (Object) service.f6950id) && Intrinsics.areEqual((Object) this.tariff, (Object) service.tariff) && Intrinsics.areEqual((Object) this.title, (Object) service.title);
    }

    public int hashCode() {
        Integer num = this.f6950id;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Tariff tariff2 = this.tariff;
        int hashCode2 = (hashCode + (tariff2 != null ? tariff2.hashCode() : 0)) * 31;
        String str = this.title;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "Service(id=" + this.f6950id + ", tariff=" + this.tariff + ", title=" + this.title + ")";
    }

    public Service(Integer num, Tariff tariff2, String str) {
        this.f6950id = num;
        this.tariff = tariff2;
        this.title = str;
    }

    public final Integer getId() {
        return this.f6950id;
    }

    public final Tariff getTariff() {
        return this.tariff;
    }

    public final String getTitle() {
        return this.title;
    }
}
