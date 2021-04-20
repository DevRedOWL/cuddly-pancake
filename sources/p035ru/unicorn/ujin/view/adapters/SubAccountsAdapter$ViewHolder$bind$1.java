package p035ru.unicorn.ujin.view.adapters;

import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.api.response.SubAccount;
import p035ru.unicorn.ujin.view.adapters.SubAccountsAdapter;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.adapters.SubAccountsAdapter$ViewHolder$bind$1 */
/* compiled from: SubAccountsAdapter.kt */
final class SubAccountsAdapter$ViewHolder$bind$1 implements View.OnClickListener {
    final /* synthetic */ SubAccount $subAccount;
    final /* synthetic */ SubAccountsAdapter.ViewHolder this$0;

    SubAccountsAdapter$ViewHolder$bind$1(SubAccountsAdapter.ViewHolder viewHolder, SubAccount subAccount) {
        this.this$0 = viewHolder;
        this.$subAccount = subAccount;
    }

    public final void onClick(View view) {
        View view2 = this.this$0.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        new AlertDialog.Builder(view2.getContext()).setMessage((int) R.string.removeSubAccount).setPositiveButton((int) R.string.button_yes, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
            final /* synthetic */ SubAccountsAdapter$ViewHolder$bind$1 this$0;

            {
                this.this$0 = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                this.this$0.this$0.this$0.requestDelete(this.this$0.$subAccount.getPhone());
            }
        }).setNegativeButton((int) R.string.cancel, (DialogInterface.OnClickListener) C59612.INSTANCE).show();
    }
}
