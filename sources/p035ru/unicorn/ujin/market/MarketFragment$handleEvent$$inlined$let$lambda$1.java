package p035ru.unicorn.ujin.market;

import com.afollestad.materialdialogs.MaterialDialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Resource;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke", "ru/unicorn/ujin/market/MarketFragment$handleEvent$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.MarketFragment$handleEvent$$inlined$let$lambda$1 */
/* compiled from: MarketFragment.kt */
final class MarketFragment$handleEvent$$inlined$let$lambda$1 extends Lambda implements Function1<MaterialDialog, Unit> {
    final /* synthetic */ Resource $resource$inlined;
    final /* synthetic */ MarketFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MarketFragment$handleEvent$$inlined$let$lambda$1(MarketFragment marketFragment, Resource resource) {
        super(1);
        this.this$0 = marketFragment;
        this.$resource$inlined = resource;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((MaterialDialog) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(MaterialDialog materialDialog) {
        Intrinsics.checkNotNullParameter(materialDialog, "it");
        this.this$0.getBaseActivity().setBottomItemClick(R.id.navigation_market);
    }
}
