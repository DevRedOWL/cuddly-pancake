package p035ru.unicorn.ujin.view.activity;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "resource", "Lru/unicorn/ujin/view/activity/navigation/entity/schema/Schemas;", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.RegistrationActivity$gotoFlat$1 */
/* compiled from: RegistrationActivity.kt */
final class RegistrationActivity$gotoFlat$1<T> implements Observer<Schemas> {
    final /* synthetic */ RegistrationActivity this$0;

    RegistrationActivity$gotoFlat$1(RegistrationActivity registrationActivity) {
        this.this$0 = registrationActivity;
    }

    public final void onChanged(Schemas schemas) {
        Intrinsics.checkNotNullParameter(schemas, "resource");
        this.this$0.onGetSchema(schemas);
    }
}
