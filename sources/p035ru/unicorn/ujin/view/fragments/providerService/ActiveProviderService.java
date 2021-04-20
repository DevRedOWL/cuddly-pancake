package p035ru.unicorn.ujin.view.fragments.providerService;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/providerService/ActiveProviderService;", "", "contract", "Lru/unicorn/ujin/view/fragments/providerService/Contract;", "callback", "Lru/unicorn/ujin/view/fragments/providerService/Callback;", "service", "Lru/unicorn/ujin/view/fragments/providerService/Service;", "(Lru/unicorn/ujin/view/fragments/providerService/Contract;Lru/unicorn/ujin/view/fragments/providerService/Callback;Lru/unicorn/ujin/view/fragments/providerService/Service;)V", "getCallback", "()Lru/unicorn/ujin/view/fragments/providerService/Callback;", "getContract", "()Lru/unicorn/ujin/view/fragments/providerService/Contract;", "getService", "()Lru/unicorn/ujin/view/fragments/providerService/Service;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.providerService.ActiveProviderService */
/* compiled from: ActiveProviderInfoResponse.kt */
public final class ActiveProviderService {
    private final Callback callback;
    private final Contract contract;
    private final Service service;

    public static /* synthetic */ ActiveProviderService copy$default(ActiveProviderService activeProviderService, Contract contract2, Callback callback2, Service service2, int i, Object obj) {
        if ((i & 1) != 0) {
            contract2 = activeProviderService.contract;
        }
        if ((i & 2) != 0) {
            callback2 = activeProviderService.callback;
        }
        if ((i & 4) != 0) {
            service2 = activeProviderService.service;
        }
        return activeProviderService.copy(contract2, callback2, service2);
    }

    public final Contract component1() {
        return this.contract;
    }

    public final Callback component2() {
        return this.callback;
    }

    public final Service component3() {
        return this.service;
    }

    public final ActiveProviderService copy(Contract contract2, Callback callback2, Service service2) {
        return new ActiveProviderService(contract2, callback2, service2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActiveProviderService)) {
            return false;
        }
        ActiveProviderService activeProviderService = (ActiveProviderService) obj;
        return Intrinsics.areEqual((Object) this.contract, (Object) activeProviderService.contract) && Intrinsics.areEqual((Object) this.callback, (Object) activeProviderService.callback) && Intrinsics.areEqual((Object) this.service, (Object) activeProviderService.service);
    }

    public int hashCode() {
        Contract contract2 = this.contract;
        int i = 0;
        int hashCode = (contract2 != null ? contract2.hashCode() : 0) * 31;
        Callback callback2 = this.callback;
        int hashCode2 = (hashCode + (callback2 != null ? callback2.hashCode() : 0)) * 31;
        Service service2 = this.service;
        if (service2 != null) {
            i = service2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "ActiveProviderService(contract=" + this.contract + ", callback=" + this.callback + ", service=" + this.service + ")";
    }

    public ActiveProviderService(Contract contract2, Callback callback2, Service service2) {
        this.contract = contract2;
        this.callback = callback2;
        this.service = service2;
    }

    public final Contract getContract() {
        return this.contract;
    }

    public final Callback getCallback() {
        return this.callback;
    }

    public final Service getService() {
        return this.service;
    }
}
