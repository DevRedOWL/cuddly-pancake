package p035ru.unicorn.ujin.view.fragments.anotherPass;

import kotlin.Metadata;
import p046io.reactivex.functions.Action;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "run"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel$createAnotherPass$2 */
/* compiled from: AnotherPassViewModel.kt */
final class AnotherPassViewModel$createAnotherPass$2 implements Action {
    final /* synthetic */ AnotherPassViewModel this$0;

    AnotherPassViewModel$createAnotherPass$2(AnotherPassViewModel anotherPassViewModel) {
        this.this$0 = anotherPassViewModel;
    }

    public final void run() {
        this.this$0.showLoader.postValue(false);
    }
}
