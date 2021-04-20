package p035ru.unicorn.ujin.view.fragments.anotherPass;

import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody;

@Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel$updateUserData$1 */
/* compiled from: AnotherPassViewModel.kt */
final /* synthetic */ class AnotherPassViewModel$updateUserData$1 extends MutablePropertyReference0Impl {
    AnotherPassViewModel$updateUserData$1(AnotherPassViewModel anotherPassViewModel) {
        super(anotherPassViewModel, AnotherPassViewModel.class, "copyAnotherPassBody", "getCopyAnotherPassBody()Lru/unicorn/ujin/view/fragments/anotherPass/request/CreateAnotherPassRequestBody;", 0);
    }

    public Object get() {
        return ((AnotherPassViewModel) this.receiver).getCopyAnotherPassBody();
    }

    public void set(Object obj) {
        ((AnotherPassViewModel) this.receiver).setCopyAnotherPassBody((CreateAnotherPassRequestBody) obj);
    }
}
