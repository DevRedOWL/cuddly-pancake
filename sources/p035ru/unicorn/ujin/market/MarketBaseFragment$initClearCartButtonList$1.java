package p035ru.unicorn.ujin.market;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.MarketBaseFragment$initClearCartButtonList$1 */
/* compiled from: MarketBaseFragment.kt */
final class MarketBaseFragment$initClearCartButtonList$1 implements View.OnClickListener {
    final /* synthetic */ String $clearButton;
    final /* synthetic */ Function0 $clearCall;
    final /* synthetic */ String $clearMessage;
    final /* synthetic */ MarketBaseFragment this$0;

    MarketBaseFragment$initClearCartButtonList$1(MarketBaseFragment marketBaseFragment, Function0 function0, String str, String str2) {
        this.this$0 = marketBaseFragment;
        this.$clearCall = function0;
        this.$clearMessage = str;
        this.$clearButton = str2;
    }

    public final void onClick(View view) {
        this.this$0.showClearCartDialog(this.$clearCall, this.$clearMessage, this.$clearButton);
    }
}
