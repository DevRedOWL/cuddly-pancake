package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.response;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/response/CompanyObjectsResponse;", "", "objects", "", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/response/CompanyObject;", "(Ljava/util/List;)V", "getObjects", "()Ljava/util/List;", "setObjects", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.response.CompanyObjectsResponse */
/* compiled from: CompanyObjectsResponse.kt */
public final class CompanyObjectsResponse {
    private List<CompanyObject> objects;

    public CompanyObjectsResponse() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CompanyObjectsResponse copy$default(CompanyObjectsResponse companyObjectsResponse, List<CompanyObject> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = companyObjectsResponse.objects;
        }
        return companyObjectsResponse.copy(list);
    }

    public final List<CompanyObject> component1() {
        return this.objects;
    }

    public final CompanyObjectsResponse copy(List<CompanyObject> list) {
        return new CompanyObjectsResponse(list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof CompanyObjectsResponse) && Intrinsics.areEqual((Object) this.objects, (Object) ((CompanyObjectsResponse) obj).objects);
        }
        return true;
    }

    public int hashCode() {
        List<CompanyObject> list = this.objects;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "CompanyObjectsResponse(objects=" + this.objects + ")";
    }

    public CompanyObjectsResponse(List<CompanyObject> list) {
        this.objects = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CompanyObjectsResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    public final List<CompanyObject> getObjects() {
        return this.objects;
    }

    public final void setObjects(List<CompanyObject> list) {
        this.objects = list;
    }
}
