package p035ru.unicorn.ujin.view.fragments.providerService;

import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/providerService/DeleteActiveProviderData;", "", "id", "", "(I)V", "getId", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.providerService.DeleteActiveProviderData */
/* compiled from: DeleteActiveProviderInfoData.kt */
public final class DeleteActiveProviderData {

    /* renamed from: id */
    private final int f6948id;

    public static /* synthetic */ DeleteActiveProviderData copy$default(DeleteActiveProviderData deleteActiveProviderData, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = deleteActiveProviderData.f6948id;
        }
        return deleteActiveProviderData.copy(i);
    }

    public final int component1() {
        return this.f6948id;
    }

    public final DeleteActiveProviderData copy(int i) {
        return new DeleteActiveProviderData(i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DeleteActiveProviderData) && this.f6948id == ((DeleteActiveProviderData) obj).f6948id;
        }
        return true;
    }

    public int hashCode() {
        return Integer.valueOf(this.f6948id).hashCode();
    }

    public String toString() {
        return "DeleteActiveProviderData(id=" + this.f6948id + ")";
    }

    public DeleteActiveProviderData(int i) {
        this.f6948id = i;
    }

    public final int getId() {
        return this.f6948id;
    }
}
