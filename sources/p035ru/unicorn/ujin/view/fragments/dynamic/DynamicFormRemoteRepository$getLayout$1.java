package p035ru.unicorn.ujin.view.fragments.dynamic;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.GetLayoutResponse;
import p035ru.unicorn.ujin.viewModel.events.RegisterGhostEvent;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/GetLayoutResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.dynamic.DynamicFormRemoteRepository$getLayout$1 */
/* compiled from: DynamicFormRemoteRepository.kt */
final class DynamicFormRemoteRepository$getLayout$1<T> implements Consumer<GetLayoutResponse> {
    final /* synthetic */ DynamicFormRemoteRepository this$0;

    DynamicFormRemoteRepository$getLayout$1(DynamicFormRemoteRepository dynamicFormRemoteRepository) {
        this.this$0 = dynamicFormRemoteRepository;
    }

    public final void accept(GetLayoutResponse getLayoutResponse) {
        DynamicFormRemoteRepository dynamicFormRemoteRepository = this.this$0;
        String ghostToken = getLayoutResponse.getGhostToken();
        if (ghostToken != null) {
            dynamicFormRemoteRepository.getGhostRegisterSubject().onNext(new RegisterGhostEvent(ghostToken));
        }
        dynamicFormRemoteRepository.getLayoutSubject().onNext(new DynamicFormEvent(getLayoutResponse.getError() == 0, getLayoutResponse.getMessage(), getLayoutResponse.getData()));
    }
}
