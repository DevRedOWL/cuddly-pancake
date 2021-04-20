package p035ru.unicorn.ujin.view.fragments.searchFilter;

import java.util.Iterator;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.ComplexListResponse;
import p035ru.unicorn.ujin.data.realm.Complex;
import p046io.realm.Realm;
import p046io.realm.RealmModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "realm", "Lio/realm/Realm;", "kotlin.jvm.PlatformType", "execute", "ru/unicorn/ujin/view/fragments/searchFilter/SearchFilterRemoteRepository$requestSearchFilter$1$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.searchFilter.SearchFilterRemoteRepository$requestSearchFilter$1$$special$$inlined$run$lambda$1 */
/* compiled from: SearchFilterRemoteRepository.kt */
final class C6089x175b9857 implements Realm.Transaction {
    final /* synthetic */ ComplexListResponse $response$inlined;
    final /* synthetic */ SearchFilterRemoteRepository$requestSearchFilter$1 this$0;

    C6089x175b9857(SearchFilterRemoteRepository$requestSearchFilter$1 searchFilterRemoteRepository$requestSearchFilter$1, ComplexListResponse complexListResponse) {
        this.this$0 = searchFilterRemoteRepository$requestSearchFilter$1;
        this.$response$inlined = complexListResponse;
    }

    public final void execute(Realm realm) {
        realm.where(Complex.class).equalTo(Complex.Fields.cityId, this.this$0.$cityId).findAll().deleteAllFromRealm();
        if (this.$response$inlined.getData().getComplexList() != null) {
            Iterator<Complex> it = this.$response$inlined.getData().getComplexList().iterator();
            while (it.hasNext()) {
                realm.insertOrUpdate((RealmModel) it.next());
            }
        }
    }
}
