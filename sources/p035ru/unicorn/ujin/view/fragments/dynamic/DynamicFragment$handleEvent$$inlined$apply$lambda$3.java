package p035ru.unicorn.ujin.view.fragments.dynamic;

import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, mo51343d2 = {"<anonymous>", "", "editText", "Landroid/widget/EditText;", "hint", "invoke", "ru/unicorn/ujin/view/fragments/dynamic/DynamicFragment$handleEvent$1$1$3", "ru/unicorn/ujin/view/fragments/dynamic/DynamicFragment$$special$$inlined$let$lambda$3"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.dynamic.DynamicFragment$handleEvent$$inlined$apply$lambda$3 */
/* compiled from: DynamicFragment.kt */
final class DynamicFragment$handleEvent$$inlined$apply$lambda$3 extends Lambda implements Function2<EditText, EditText, Unit> {
    final /* synthetic */ DynamicFormEvent $event$inlined;
    final /* synthetic */ RecyclerView $this_apply$inlined;
    final /* synthetic */ DynamicFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DynamicFragment$handleEvent$$inlined$apply$lambda$3(RecyclerView recyclerView, DynamicFragment dynamicFragment, DynamicFormEvent dynamicFormEvent) {
        super(2);
        this.$this_apply$inlined = recyclerView;
        this.this$0 = dynamicFragment;
        this.$event$inlined = dynamicFormEvent;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((EditText) obj, (EditText) obj2);
        return Unit.INSTANCE;
    }

    public final void invoke(EditText editText, EditText editText2) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        Intrinsics.checkNotNullParameter(editText2, "hint");
        this.this$0.setupVehicleNumberKeyboard(editText, editText2);
    }
}
