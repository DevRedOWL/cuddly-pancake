package p035ru.unicorn.ujin.view.fragments.dynamic;

import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "editText", "Landroid/widget/EditText;", "invoke", "ru/unicorn/ujin/view/fragments/dynamic/DynamicFragment$handleEvent$1$1$4", "ru/unicorn/ujin/view/fragments/dynamic/DynamicFragment$$special$$inlined$let$lambda$4"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.dynamic.DynamicFragment$handleEvent$$inlined$apply$lambda$4 */
/* compiled from: DynamicFragment.kt */
final class DynamicFragment$handleEvent$$inlined$apply$lambda$4 extends Lambda implements Function1<EditText, Unit> {
    final /* synthetic */ DynamicFormEvent $event$inlined;
    final /* synthetic */ RecyclerView $this_apply$inlined;
    final /* synthetic */ DynamicFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DynamicFragment$handleEvent$$inlined$apply$lambda$4(RecyclerView recyclerView, DynamicFragment dynamicFragment, DynamicFormEvent dynamicFormEvent) {
        super(1);
        this.$this_apply$inlined = recyclerView;
        this.this$0 = dynamicFragment;
        this.$event$inlined = dynamicFormEvent;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((EditText) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        this.this$0.disableVehicleNumberKeyboard(editText);
    }
}
