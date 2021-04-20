package p035ru.unicorn.ujin.market;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.MarketBaseFragment$showClearCartDialog$1 */
/* compiled from: MarketBaseFragment.kt */
final class MarketBaseFragment$showClearCartDialog$1 implements View.OnClickListener {
    final /* synthetic */ BottomSheetDialog $bottomSheetDialog;
    final /* synthetic */ Function0 $clearCall;

    MarketBaseFragment$showClearCartDialog$1(Function0 function0, BottomSheetDialog bottomSheetDialog) {
        this.$clearCall = function0;
        this.$bottomSheetDialog = bottomSheetDialog;
    }

    public final void onClick(View view) {
        this.$clearCall.invoke();
        this.$bottomSheetDialog.dismiss();
    }
}
