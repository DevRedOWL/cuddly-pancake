package p035ru.unicorn.ujin.view.fragments.searchFilter;

import com.crystal.crystalrangeseekbar.interfaces.OnRangeSeekbarChangeListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.customViews.rangeSeekBar.CrystalRangeSeekbar;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "minValue", "", "kotlin.jvm.PlatformType", "maxValue", "valueChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.searchFilter.SearchFilterFragment$onViewCreated$1 */
/* compiled from: SearchFilterFragment.kt */
final class SearchFilterFragment$onViewCreated$1 implements OnRangeSeekbarChangeListener {
    final /* synthetic */ SearchFilterFragment this$0;

    SearchFilterFragment$onViewCreated$1(SearchFilterFragment searchFilterFragment) {
        this.this$0 = searchFilterFragment;
    }

    public final void valueChanged(Number number, Number number2) {
        this.this$0.checkTimer();
        if (this.this$0.isValuesChangingManually()) {
            this.this$0.clearSavedValues();
        }
        CrystalRangeSeekbar crystalRangeSeekbar = (CrystalRangeSeekbar) this.this$0._$_findCachedViewById(C5619R.C5622id.crsSquare);
        Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar, "crsSquare");
        crystalRangeSeekbar.setMinText(String.valueOf(number.intValue()));
        CrystalRangeSeekbar crystalRangeSeekbar2 = (CrystalRangeSeekbar) this.this$0._$_findCachedViewById(C5619R.C5622id.crsSquare);
        Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar2, "crsSquare");
        crystalRangeSeekbar2.setMaxText(String.valueOf(number2.intValue()));
        CrystalRangeSeekbar crystalRangeSeekbar3 = (CrystalRangeSeekbar) this.this$0._$_findCachedViewById(C5619R.C5622id.crsSquare);
        Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar3, "crsSquare");
        crystalRangeSeekbar3.setMinValueMy(Integer.valueOf(number.intValue()));
        CrystalRangeSeekbar crystalRangeSeekbar4 = (CrystalRangeSeekbar) this.this$0._$_findCachedViewById(C5619R.C5622id.crsSquare);
        Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar4, "crsSquare");
        crystalRangeSeekbar4.setMaxValueMy(Integer.valueOf(number2.intValue()));
    }
}
