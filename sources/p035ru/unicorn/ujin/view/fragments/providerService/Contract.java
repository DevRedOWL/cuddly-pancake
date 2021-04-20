package p035ru.unicorn.ujin.view.fragments.providerService;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JJ\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006#"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/providerService/Contract;", "", "id", "", "number", "", "title", "balance", "", "provider", "Lru/unicorn/ujin/view/fragments/providerService/ContractProvider;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lru/unicorn/ujin/view/fragments/providerService/ContractProvider;)V", "getBalance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNumber", "()Ljava/lang/String;", "getProvider", "()Lru/unicorn/ujin/view/fragments/providerService/ContractProvider;", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lru/unicorn/ujin/view/fragments/providerService/ContractProvider;)Lru/unicorn/ujin/view/fragments/providerService/Contract;", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.providerService.Contract */
/* compiled from: ActiveProviderInfoResponse.kt */
public final class Contract {
    private final Double balance;

    /* renamed from: id */
    private final Integer f6947id;
    private final String number;
    private final ContractProvider provider;
    private final String title;

    public static /* synthetic */ Contract copy$default(Contract contract, Integer num, String str, String str2, Double d, ContractProvider contractProvider, int i, Object obj) {
        if ((i & 1) != 0) {
            num = contract.f6947id;
        }
        if ((i & 2) != 0) {
            str = contract.number;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = contract.title;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            d = contract.balance;
        }
        Double d2 = d;
        if ((i & 16) != 0) {
            contractProvider = contract.provider;
        }
        return contract.copy(num, str3, str4, d2, contractProvider);
    }

    public final Integer component1() {
        return this.f6947id;
    }

    public final String component2() {
        return this.number;
    }

    public final String component3() {
        return this.title;
    }

    public final Double component4() {
        return this.balance;
    }

    public final ContractProvider component5() {
        return this.provider;
    }

    public final Contract copy(Integer num, String str, String str2, Double d, ContractProvider contractProvider) {
        return new Contract(num, str, str2, d, contractProvider);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Contract)) {
            return false;
        }
        Contract contract = (Contract) obj;
        return Intrinsics.areEqual((Object) this.f6947id, (Object) contract.f6947id) && Intrinsics.areEqual((Object) this.number, (Object) contract.number) && Intrinsics.areEqual((Object) this.title, (Object) contract.title) && Intrinsics.areEqual((Object) this.balance, (Object) contract.balance) && Intrinsics.areEqual((Object) this.provider, (Object) contract.provider);
    }

    public int hashCode() {
        Integer num = this.f6947id;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.number;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Double d = this.balance;
        int hashCode4 = (hashCode3 + (d != null ? d.hashCode() : 0)) * 31;
        ContractProvider contractProvider = this.provider;
        if (contractProvider != null) {
            i = contractProvider.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "Contract(id=" + this.f6947id + ", number=" + this.number + ", title=" + this.title + ", balance=" + this.balance + ", provider=" + this.provider + ")";
    }

    public Contract(Integer num, String str, String str2, Double d, ContractProvider contractProvider) {
        this.f6947id = num;
        this.number = str;
        this.title = str2;
        this.balance = d;
        this.provider = contractProvider;
    }

    public final Integer getId() {
        return this.f6947id;
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Double getBalance() {
        return this.balance;
    }

    public final ContractProvider getProvider() {
        return this.provider;
    }
}
