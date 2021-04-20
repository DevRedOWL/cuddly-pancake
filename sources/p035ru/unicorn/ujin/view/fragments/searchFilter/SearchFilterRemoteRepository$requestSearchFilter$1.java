package p035ru.unicorn.ujin.view.fragments.searchFilter;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.ComplexListResponse;
import p035ru.unicorn.ujin.data.api.response.ComplexListResponseData;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/ComplexListResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.searchFilter.SearchFilterRemoteRepository$requestSearchFilter$1 */
/* compiled from: SearchFilterRemoteRepository.kt */
final class SearchFilterRemoteRepository$requestSearchFilter$1<T> implements Consumer<ComplexListResponse> {
    final /* synthetic */ String $cityId;
    final /* synthetic */ SearchFilterRemoteRepository this$0;

    SearchFilterRemoteRepository$requestSearchFilter$1(SearchFilterRemoteRepository searchFilterRemoteRepository, String str) {
        this.this$0 = searchFilterRemoteRepository;
        this.$cityId = str;
    }

    public final void accept(ComplexListResponse complexListResponse) {
        SearchFilterRemoteRepository searchFilterRemoteRepository = this.this$0;
        if (complexListResponse.getError() == 0) {
            searchFilterRemoteRepository.getRealm().executeTransaction(new C6089x175b9857(this, complexListResponse));
        }
        PublishSubject<ComplexListEvent> complexListSubject = searchFilterRemoteRepository.getComplexListSubject();
        boolean z = complexListResponse.getError() == 0;
        String message = complexListResponse.getMessage();
        ComplexListResponseData data = complexListResponse.getData();
        complexListSubject.onNext(new ComplexListEvent(z, message, data != null ? data.getComplexList() : null));
    }
}
