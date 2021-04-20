package p035ru.unicorn.ujin.view.activity;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.Resource;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.RegistrationActivity$onCreate$3 */
/* compiled from: RegistrationActivity.kt */
final class RegistrationActivity$onCreate$3<T> implements Observer<Resource<String>> {
    final /* synthetic */ RegistrationActivity this$0;

    RegistrationActivity$onCreate$3(RegistrationActivity registrationActivity) {
        this.this$0 = registrationActivity;
    }

    public final void onChanged(Resource<String> resource) {
        this.this$0.handleRegister1Core(resource);
    }
}
