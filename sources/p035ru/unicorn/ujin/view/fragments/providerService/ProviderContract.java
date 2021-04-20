package p035ru.unicorn.ujin.view.fragments.providerService;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/providerService/ProviderContract;", "", "id", "", "number", "", "title", "(ILjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getNumber", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.providerService.ProviderContract */
/* compiled from: ProviderAddedResponse.kt */
public final class ProviderContract {

    /* renamed from: id */
    private final int f6949id;
    private final String number;
    private final String title;

    public static /* synthetic */ ProviderContract copy$default(ProviderContract providerContract, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = providerContract.f6949id;
        }
        if ((i2 & 2) != 0) {
            str = providerContract.number;
        }
        if ((i2 & 4) != 0) {
            str2 = providerContract.title;
        }
        return providerContract.copy(i, str, str2);
    }

    public final int component1() {
        return this.f6949id;
    }

    public final String component2() {
        return this.number;
    }

    public final String component3() {
        return this.title;
    }

    public final ProviderContract copy(int i, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, CardFragment.ARG_NUMBER);
        Intrinsics.checkNotNullParameter(str2, "title");
        return new ProviderContract(i, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProviderContract)) {
            return false;
        }
        ProviderContract providerContract = (ProviderContract) obj;
        return this.f6949id == providerContract.f6949id && Intrinsics.areEqual((Object) this.number, (Object) providerContract.number) && Intrinsics.areEqual((Object) this.title, (Object) providerContract.title);
    }

    public int hashCode() {
        int hashCode = Integer.valueOf(this.f6949id).hashCode() * 31;
        String str = this.number;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.title;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "ProviderContract(id=" + this.f6949id + ", number=" + this.number + ", title=" + this.title + ")";
    }

    public ProviderContract(int i, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, CardFragment.ARG_NUMBER);
        Intrinsics.checkNotNullParameter(str2, "title");
        this.f6949id = i;
        this.number = str;
        this.title = str2;
    }

    public final int getId() {
        return this.f6949id;
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getTitle() {
        return this.title;
    }
}
