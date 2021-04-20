package p035ru.unicorn.ujin.view.fragments.dynamic;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.Layout;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.dynamic.DynamicFormRemoteRepository$getLayout$2 */
/* compiled from: DynamicFormRemoteRepository.kt */
final class DynamicFormRemoteRepository$getLayout$2<T> implements Consumer<Throwable> {
    final /* synthetic */ DynamicFormRemoteRepository this$0;

    DynamicFormRemoteRepository$getLayout$2(DynamicFormRemoteRepository dynamicFormRemoteRepository) {
        this.this$0 = dynamicFormRemoteRepository;
    }

    public final void accept(Throwable th) {
        this.this$0.getLayoutSubject().onNext(new DynamicFormEvent(false, "Ошибка загрузки формы. Попробуйте позднее", (Layout) null));
    }
}
