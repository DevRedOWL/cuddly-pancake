package p035ru.unicorn.ujin.market;

import android.content.DialogInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "<anonymous parameter 1>", "", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.MarketBaseFragment$showCartMessage$1 */
/* compiled from: MarketBaseFragment.kt */
final class MarketBaseFragment$showCartMessage$1 implements DialogInterface.OnClickListener {
    public static final MarketBaseFragment$showCartMessage$1 INSTANCE = new MarketBaseFragment$showCartMessage$1();

    MarketBaseFragment$showCartMessage$1() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(dialogInterface, "dialog");
        dialogInterface.cancel();
    }
}
