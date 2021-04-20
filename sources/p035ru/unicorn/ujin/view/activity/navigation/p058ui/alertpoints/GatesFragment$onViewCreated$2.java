package p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Point;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "pair", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lru/unicorn/ujin/data/realm/Point;", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.GatesFragment$onViewCreated$2 */
/* compiled from: GatesFragment.kt */
final class GatesFragment$onViewCreated$2<T> implements Consumer<Pair<? extends Integer, ? extends Point>> {
    final /* synthetic */ GatesFragment this$0;

    GatesFragment$onViewCreated$2(GatesFragment gatesFragment) {
        this.this$0 = gatesFragment;
    }

    public final void accept(Pair<Integer, ? extends Point> pair) {
        GatesFragment gatesFragment = this.this$0;
        Intrinsics.checkNotNullExpressionValue(pair, "pair");
        gatesFragment.onButtonClick(pair);
    }
}
