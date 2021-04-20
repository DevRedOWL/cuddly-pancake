package p035ru.unicorn.ujin.view.customViews.dynamic.button;

import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.ButtonField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/view/customViews/dynamic/button/BaseButtonHolder$bindButton$1$1$5", "ru/unicorn/ujin/view/customViews/dynamic/button/BaseButtonHolder$$special$$inlined$also$lambda$5"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.button.BaseButtonHolder$bindButton$$inlined$apply$lambda$5 */
/* compiled from: BaseButtonHolder.kt */
final class BaseButtonHolder$bindButton$$inlined$apply$lambda$5 implements View.OnClickListener {
    final /* synthetic */ ButtonField $item$inlined;
    final /* synthetic */ DynamicBackgroundButton $this_apply$inlined;
    final /* synthetic */ BaseButtonHolder this$0;

    BaseButtonHolder$bindButton$$inlined$apply$lambda$5(DynamicBackgroundButton dynamicBackgroundButton, BaseButtonHolder baseButtonHolder, ButtonField buttonField) {
        this.$this_apply$inlined = dynamicBackgroundButton;
        this.this$0 = baseButtonHolder;
        this.$item$inlined = buttonField;
    }

    public final void onClick(View view) {
        String confirmMessage;
        if (this.this$0.isValidToClick(this.$item$inlined)) {
            ClickActionData data = this.$item$inlined.getActions().getClick().getData();
            if (!(data == null || (confirmMessage = data.getConfirmMessage()) == null)) {
                if (confirmMessage.length() > 0) {
                    View view2 = this.this$0.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                    AlertDialog.Builder builder = new AlertDialog.Builder(view2.getContext());
                    ClickActionData data2 = this.$item$inlined.getActions().getClick().getData();
                    builder.setMessage((CharSequence) data2 != null ? data2.getConfirmMessage() : null).setPositiveButton((CharSequence) "Да", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
                        final /* synthetic */ BaseButtonHolder$bindButton$$inlined$apply$lambda$5 this$0;

                        {
                            this.this$0 = r1;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                            this.this$0.this$0.apiCall(this.this$0.$item$inlined);
                        }
                    }).setNegativeButton((CharSequence) "Нет", (DialogInterface.OnClickListener) BaseButtonHolder$bindButton$1$1$5$2.INSTANCE).show();
                    return;
                }
            }
            this.this$0.apiCall(this.$item$inlined);
        }
    }
}
