package p035ru.unicorn.ujin.view.fragments.profileselection.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.C4839xaf62461f;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u0010\u0013\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profileselection/data/SearchComplex;", "Lio/realm/RealmObject;", "Lru/unicorn/ujin/view/activity/navigation/adapter/Diffable;", "id", "", "title", "", "(ILjava/lang/String;)V", "getId", "()I", "setId", "(I)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "areContentsTheSame", "", "other", "areItemsTheSame", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.data.SearchComplex */
/* compiled from: SearchBuildingDTO.kt */
public class SearchComplex extends RealmObject implements Diffable<SearchComplex>, C4839xaf62461f {

    /* renamed from: id */
    private int f6945id;
    private String title;

    public SearchComplex() {
        this(0, (String) null, 3, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public int realmGet$id() {
        return this.f6945id;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$id(int i) {
        this.f6945id = i;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public final int getId() {
        return realmGet$id();
    }

    public final void setId(int i) {
        realmSet$id(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchComplex(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? "" : str);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final String getTitle() {
        return realmGet$title();
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$title(str);
    }

    public SearchComplex(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "title");
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(i);
        realmSet$title(str);
    }

    public boolean areItemsTheSame(SearchComplex searchComplex) {
        return searchComplex != null && realmGet$id() == searchComplex.realmGet$id();
    }

    public boolean areContentsTheSame(SearchComplex searchComplex) {
        return Intrinsics.areEqual((Object) realmGet$title(), (Object) searchComplex != null ? searchComplex.realmGet$title() : null);
    }
}
