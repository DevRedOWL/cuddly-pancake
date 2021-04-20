package p035ru.unicorn.ujin.view.customViews.dynamic.button;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.ButtonField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/view/customViews/dynamic/button/BaseButtonHolder$bindButton$1$1$3", "ru/unicorn/ujin/view/customViews/dynamic/button/BaseButtonHolder$$special$$inlined$also$lambda$3"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.button.BaseButtonHolder$bindButton$$inlined$apply$lambda$3 */
/* compiled from: BaseButtonHolder.kt */
final class BaseButtonHolder$bindButton$$inlined$apply$lambda$3 implements View.OnClickListener {
    final /* synthetic */ ButtonField $item$inlined;
    final /* synthetic */ DynamicBackgroundButton $this_apply$inlined;
    final /* synthetic */ BaseButtonHolder this$0;

    BaseButtonHolder$bindButton$$inlined$apply$lambda$3(DynamicBackgroundButton dynamicBackgroundButton, BaseButtonHolder baseButtonHolder, ButtonField buttonField) {
        this.$this_apply$inlined = dynamicBackgroundButton;
        this.this$0 = baseButtonHolder;
        this.$item$inlined = buttonField;
    }

    public final void onClick(View view) {
        String confirmMessage;
        if (this.this$0.isValidToClick(this.$item$inlined)) {
            ClickActionData data = this.$item$inlined.getActions().getClick().getData();
            String str = null;
            if (!(data == null || (confirmMessage = data.getConfirmMessage()) == null)) {
                if (confirmMessage.length() > 0) {
                    View view2 = this.this$0.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                    AlertDialog.Builder builder = new AlertDialog.Builder(view2.getContext());
                    ClickActionData data2 = this.$item$inlined.getActions().getClick().getData();
                    if (data2 != null) {
                        str = data2.getConfirmMessage();
                    }
                    builder.setMessage((CharSequence) str).setPositiveButton((CharSequence) "Да", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
                        final /* synthetic */ BaseButtonHolder$bindButton$$inlined$apply$lambda$3 this$0;

                        {
                            this.this$0 = r1;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                            View view = this.this$0.this$0.itemView;
                            Intrinsics.checkNotNullExpressionValue(view, "itemView");
                            Context context = view.getContext();
                            ClickActionData data = this.this$0.$item$inlined.getActions().getClick().getData();
                            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(data != null ? data.getData() : null)));
                            this.this$0.$item$inlined.getCustomClickListener().invoke(this.this$0.$item$inlined.getName());
                        }
                    }).setNegativeButton((CharSequence) "Нет", (DialogInterface.OnClickListener) BaseButtonHolder$bindButton$1$1$3$2.INSTANCE).show();
                    return;
                }
            }
            View view3 = this.this$0.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            Context context = view3.getContext();
            ClickActionData data3 = this.$item$inlined.getActions().getClick().getData();
            if (data3 != null) {
                str = data3.getData();
            }
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            this.$item$inlined.getCustomClickListener().invoke(this.$item$inlined.getName());
        }
    }
}
