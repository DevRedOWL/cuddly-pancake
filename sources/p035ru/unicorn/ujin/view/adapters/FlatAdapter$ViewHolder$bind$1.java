package p035ru.unicorn.ujin.view.adapters;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Flat;
import p035ru.unicorn.ujin.view.adapters.FlatAdapter;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.adapters.FlatAdapter$ViewHolder$bind$1 */
/* compiled from: FlatAdapter.kt */
final class FlatAdapter$ViewHolder$bind$1 implements View.OnClickListener {
    final /* synthetic */ Flat $objFlat;
    final /* synthetic */ int $position;
    final /* synthetic */ FlatAdapter.ViewHolder this$0;

    FlatAdapter$ViewHolder$bind$1(FlatAdapter.ViewHolder viewHolder, Flat flat, int i) {
        this.this$0 = viewHolder;
        this.$objFlat = flat;
        this.$position = i;
    }

    public final void onClick(View view) {
        FlatAdapter.OnFlatSelectedListener onFlatSelectedListener$app_kortrosRelease = this.this$0.this$0.getOnFlatSelectedListener$app_kortrosRelease();
        String flatsUID = this.$objFlat.getFlatsUID();
        Intrinsics.checkNotNullExpressionValue(flatsUID, "objFlat.flatsUID");
        onFlatSelectedListener$app_kortrosRelease.onFlatSelected(flatsUID, this.$position);
    }
}
