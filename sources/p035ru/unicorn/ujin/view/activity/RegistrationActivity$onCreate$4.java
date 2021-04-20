package p035ru.unicorn.ujin.view.activity;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.authorization.Register2coreResponseData;
import p035ru.unicorn.ujin.data.realm.Resource;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/authorization/Register2coreResponseData;", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.RegistrationActivity$onCreate$4 */
/* compiled from: RegistrationActivity.kt */
final class RegistrationActivity$onCreate$4<T> implements Observer<Resource<Register2coreResponseData>> {
    final /* synthetic */ RegistrationActivity this$0;

    RegistrationActivity$onCreate$4(RegistrationActivity registrationActivity) {
        this.this$0 = registrationActivity;
    }

    public final void onChanged(Resource<Register2coreResponseData> resource) {
        this.this$0.handleRegister2Core(resource);
    }
}
