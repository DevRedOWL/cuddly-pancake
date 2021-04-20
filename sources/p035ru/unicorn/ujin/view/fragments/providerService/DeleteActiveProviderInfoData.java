package p035ru.unicorn.ujin.view.fragments.providerService;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.api.request.AuthBody;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/providerService/DeleteActiveProviderInfoData;", "", "auth", "Lru/unicorn/ujin/data/api/request/AuthBody;", "data", "Lru/unicorn/ujin/view/fragments/providerService/DeleteActiveProviderData;", "(Lru/unicorn/ujin/data/api/request/AuthBody;Lru/unicorn/ujin/view/fragments/providerService/DeleteActiveProviderData;)V", "getAuth", "()Lru/unicorn/ujin/data/api/request/AuthBody;", "getData", "()Lru/unicorn/ujin/view/fragments/providerService/DeleteActiveProviderData;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.providerService.DeleteActiveProviderInfoData */
/* compiled from: DeleteActiveProviderInfoData.kt */
public final class DeleteActiveProviderInfoData {
    private final AuthBody auth;
    private final DeleteActiveProviderData data;

    public static /* synthetic */ DeleteActiveProviderInfoData copy$default(DeleteActiveProviderInfoData deleteActiveProviderInfoData, AuthBody authBody, DeleteActiveProviderData deleteActiveProviderData, int i, Object obj) {
        if ((i & 1) != 0) {
            authBody = deleteActiveProviderInfoData.auth;
        }
        if ((i & 2) != 0) {
            deleteActiveProviderData = deleteActiveProviderInfoData.data;
        }
        return deleteActiveProviderInfoData.copy(authBody, deleteActiveProviderData);
    }

    public final AuthBody component1() {
        return this.auth;
    }

    public final DeleteActiveProviderData component2() {
        return this.data;
    }

    public final DeleteActiveProviderInfoData copy(AuthBody authBody, DeleteActiveProviderData deleteActiveProviderData) {
        Intrinsics.checkNotNullParameter(authBody, "auth");
        Intrinsics.checkNotNullParameter(deleteActiveProviderData, "data");
        return new DeleteActiveProviderInfoData(authBody, deleteActiveProviderData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteActiveProviderInfoData)) {
            return false;
        }
        DeleteActiveProviderInfoData deleteActiveProviderInfoData = (DeleteActiveProviderInfoData) obj;
        return Intrinsics.areEqual((Object) this.auth, (Object) deleteActiveProviderInfoData.auth) && Intrinsics.areEqual((Object) this.data, (Object) deleteActiveProviderInfoData.data);
    }

    public int hashCode() {
        AuthBody authBody = this.auth;
        int i = 0;
        int hashCode = (authBody != null ? authBody.hashCode() : 0) * 31;
        DeleteActiveProviderData deleteActiveProviderData = this.data;
        if (deleteActiveProviderData != null) {
            i = deleteActiveProviderData.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "DeleteActiveProviderInfoData(auth=" + this.auth + ", data=" + this.data + ")";
    }

    public DeleteActiveProviderInfoData(AuthBody authBody, DeleteActiveProviderData deleteActiveProviderData) {
        Intrinsics.checkNotNullParameter(authBody, "auth");
        Intrinsics.checkNotNullParameter(deleteActiveProviderData, "data");
        this.auth = authBody;
        this.data = deleteActiveProviderData;
    }

    public final AuthBody getAuth() {
        return this.auth;
    }

    public final DeleteActiveProviderData getData() {
        return this.data;
    }
}
