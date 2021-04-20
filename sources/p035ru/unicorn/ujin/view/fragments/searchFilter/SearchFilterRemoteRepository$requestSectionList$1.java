package p035ru.unicorn.ujin.view.fragments.searchFilter;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.SectionListResponse;
import p035ru.unicorn.ujin.data.api.response.SectionListResponseData;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/SectionListResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.searchFilter.SearchFilterRemoteRepository$requestSectionList$1 */
/* compiled from: SearchFilterRemoteRepository.kt */
final class SearchFilterRemoteRepository$requestSectionList$1<T> implements Consumer<SectionListResponse> {
    final /* synthetic */ SearchFilterRemoteRepository this$0;

    SearchFilterRemoteRepository$requestSectionList$1(SearchFilterRemoteRepository searchFilterRemoteRepository) {
        this.this$0 = searchFilterRemoteRepository;
    }

    public final void accept(SectionListResponse sectionListResponse) {
        PublishSubject<SectionListEvent> sectionListSubject = this.this$0.getSectionListSubject();
        boolean z = sectionListResponse.getError() == 0;
        String message = sectionListResponse.getMessage();
        SectionListResponseData data = sectionListResponse.getData();
        sectionListSubject.onNext(new SectionListEvent(z, message, data != null ? data.getSectionList() : null));
    }
}
