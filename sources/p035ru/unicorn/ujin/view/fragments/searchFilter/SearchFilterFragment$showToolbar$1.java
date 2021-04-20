package p035ru.unicorn.ujin.view.fragments.searchFilter;

import android.view.View;
import android.widget.Switch;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.customViews.rangeSeekBar.CrystalRangeSeekbar;
import p035ru.unicorn.ujin.view.customViews.textRadioButtonGroup.TextRadioButtonGroup;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.searchFilter.SearchFilterFragment$showToolbar$1 */
/* compiled from: SearchFilterFragment.kt */
final class SearchFilterFragment$showToolbar$1 implements View.OnClickListener {
    final /* synthetic */ SearchFilterFragment this$0;

    SearchFilterFragment$showToolbar$1(SearchFilterFragment searchFilterFragment) {
        this.this$0 = searchFilterFragment;
    }

    public final void onClick(View view) {
        this.this$0.clearSavedValues();
        SearchFilterFragment searchFilterFragment = this.this$0;
        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) searchFilterFragment._$_findCachedViewById(C5619R.C5622id.buttonStudia2);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "buttonStudia2");
        searchFilterFragment.uncheckEnabledButton(dynamicBackgroundButton);
        SearchFilterFragment searchFilterFragment2 = this.this$0;
        DynamicBackgroundButton dynamicBackgroundButton2 = (DynamicBackgroundButton) searchFilterFragment2._$_findCachedViewById(C5619R.C5622id.button1room2);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton2, "button1room2");
        searchFilterFragment2.uncheckEnabledButton(dynamicBackgroundButton2);
        SearchFilterFragment searchFilterFragment3 = this.this$0;
        DynamicBackgroundButton dynamicBackgroundButton3 = (DynamicBackgroundButton) searchFilterFragment3._$_findCachedViewById(C5619R.C5622id.button2rooms2);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton3, "button2rooms2");
        searchFilterFragment3.uncheckEnabledButton(dynamicBackgroundButton3);
        SearchFilterFragment searchFilterFragment4 = this.this$0;
        DynamicBackgroundButton dynamicBackgroundButton4 = (DynamicBackgroundButton) searchFilterFragment4._$_findCachedViewById(C5619R.C5622id.button3rooms2);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton4, "button3rooms2");
        searchFilterFragment4.uncheckEnabledButton(dynamicBackgroundButton4);
        SearchFilterFragment searchFilterFragment5 = this.this$0;
        DynamicBackgroundButton dynamicBackgroundButton5 = (DynamicBackgroundButton) searchFilterFragment5._$_findCachedViewById(C5619R.C5622id.button4orMore2);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton5, "button4orMore2");
        searchFilterFragment5.uncheckEnabledButton(dynamicBackgroundButton5);
        Switch switchR = (Switch) this.this$0._$_findCachedViewById(C5619R.C5622id.switchFinished);
        Intrinsics.checkNotNullExpressionValue(switchR, "switchFinished");
        switchR.setChecked(this.this$0.getSavedSwitchFinished());
        Switch switchR2 = (Switch) this.this$0._$_findCachedViewById(C5619R.C5622id.switchSale);
        Intrinsics.checkNotNullExpressionValue(switchR2, "switchSale");
        switchR2.setChecked(this.this$0.getSavedSwitchSale());
        ArrayList<Building> buildingList = this.this$0.getBuildingList();
        if ((buildingList != null ? buildingList.size() : 0) > 0) {
            TextRadioButtonGroup textRadioButtonGroup = (TextRadioButtonGroup) this.this$0._$_findCachedViewById(C5619R.C5622id.trbBuilding);
            Intrinsics.checkNotNullExpressionValue(textRadioButtonGroup, "trbBuilding");
            int childCount = textRadioButtonGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ((TextRadioButtonGroup) this.this$0._$_findCachedViewById(C5619R.C5622id.trbBuilding)).getChildAt(i);
                Intrinsics.checkNotNullExpressionValue(childAt, "trbBuilding.getChildAt(i)");
                childAt.setSelected(false);
            }
            this.this$0.buildingSelected(0);
            View childAt2 = ((TextRadioButtonGroup) this.this$0._$_findCachedViewById(C5619R.C5622id.trbBuilding)).getChildAt(0);
            Intrinsics.checkNotNullExpressionValue(childAt2, "trbBuilding.getChildAt(0)");
            childAt2.setSelected(true);
        }
        ArrayList<Section> sectionList = this.this$0.getSectionList();
        if ((sectionList != null ? sectionList.size() : 0) > 0) {
            TextRadioButtonGroup textRadioButtonGroup2 = (TextRadioButtonGroup) this.this$0._$_findCachedViewById(C5619R.C5622id.trbSection);
            Intrinsics.checkNotNullExpressionValue(textRadioButtonGroup2, "trbSection");
            int childCount2 = textRadioButtonGroup2.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                View childAt3 = ((TextRadioButtonGroup) this.this$0._$_findCachedViewById(C5619R.C5622id.trbSection)).getChildAt(i2);
                Intrinsics.checkNotNullExpressionValue(childAt3, "trbSection.getChildAt(i)");
                childAt3.setSelected(false);
            }
            this.this$0.sectionSelected(0);
            View childAt4 = ((TextRadioButtonGroup) this.this$0._$_findCachedViewById(C5619R.C5622id.trbSection)).getChildAt(0);
            Intrinsics.checkNotNullExpressionValue(childAt4, "trbSection.getChildAt(0)");
            childAt4.setSelected(true);
        }
        CrystalRangeSeekbar crystalRangeSeekbar = (CrystalRangeSeekbar) this.this$0._$_findCachedViewById(C5619R.C5622id.crsSquare);
        Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar, "crsSquare");
        CrystalRangeSeekbar minValue = ((CrystalRangeSeekbar) this.this$0._$_findCachedViewById(C5619R.C5622id.crsSquare)).setMinValue(crystalRangeSeekbar.getMinValue().floatValue());
        CrystalRangeSeekbar crystalRangeSeekbar2 = (CrystalRangeSeekbar) this.this$0._$_findCachedViewById(C5619R.C5622id.crsSquare);
        Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar2, "crsSquare");
        CrystalRangeSeekbar minStartValue = minValue.setMinStartValue(crystalRangeSeekbar2.getMinValue().floatValue());
        CrystalRangeSeekbar crystalRangeSeekbar3 = (CrystalRangeSeekbar) this.this$0._$_findCachedViewById(C5619R.C5622id.crsSquare);
        Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar3, "crsSquare");
        CrystalRangeSeekbar maxValue = minStartValue.setMaxValue(crystalRangeSeekbar3.getMaxValue().floatValue());
        CrystalRangeSeekbar crystalRangeSeekbar4 = (CrystalRangeSeekbar) this.this$0._$_findCachedViewById(C5619R.C5622id.crsSquare);
        Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar4, "crsSquare");
        maxValue.setMaxStartValue(crystalRangeSeekbar4.getMaxValue().floatValue()).setGap(1.0f).apply();
        CrystalRangeSeekbar crystalRangeSeekbar5 = (CrystalRangeSeekbar) this.this$0._$_findCachedViewById(C5619R.C5622id.crsFloor);
        Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar5, "crsFloor");
        CrystalRangeSeekbar minValue2 = ((CrystalRangeSeekbar) this.this$0._$_findCachedViewById(C5619R.C5622id.crsFloor)).setMinValue(crystalRangeSeekbar5.getMinValue().floatValue());
        CrystalRangeSeekbar crystalRangeSeekbar6 = (CrystalRangeSeekbar) this.this$0._$_findCachedViewById(C5619R.C5622id.crsFloor);
        Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar6, "crsFloor");
        CrystalRangeSeekbar minStartValue2 = minValue2.setMinStartValue(crystalRangeSeekbar6.getMinValue().floatValue());
        CrystalRangeSeekbar crystalRangeSeekbar7 = (CrystalRangeSeekbar) this.this$0._$_findCachedViewById(C5619R.C5622id.crsFloor);
        Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar7, "crsFloor");
        CrystalRangeSeekbar maxValue2 = minStartValue2.setMaxValue(crystalRangeSeekbar7.getMaxValue().floatValue());
        CrystalRangeSeekbar crystalRangeSeekbar8 = (CrystalRangeSeekbar) this.this$0._$_findCachedViewById(C5619R.C5622id.crsFloor);
        Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar8, "crsFloor");
        maxValue2.setMaxStartValue(crystalRangeSeekbar8.getMaxValue().floatValue()).setGap(1.0f).apply();
        CrystalRangeSeekbar crystalRangeSeekbar9 = (CrystalRangeSeekbar) this.this$0._$_findCachedViewById(C5619R.C5622id.crsPrice);
        Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar9, "crsPrice");
        CrystalRangeSeekbar minValue3 = ((CrystalRangeSeekbar) this.this$0._$_findCachedViewById(C5619R.C5622id.crsPrice)).setMinValue(crystalRangeSeekbar9.getMinValue().floatValue());
        CrystalRangeSeekbar crystalRangeSeekbar10 = (CrystalRangeSeekbar) this.this$0._$_findCachedViewById(C5619R.C5622id.crsPrice);
        Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar10, "crsPrice");
        CrystalRangeSeekbar minStartValue3 = minValue3.setMinStartValue(crystalRangeSeekbar10.getMinValue().floatValue());
        CrystalRangeSeekbar crystalRangeSeekbar11 = (CrystalRangeSeekbar) this.this$0._$_findCachedViewById(C5619R.C5622id.crsPrice);
        Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar11, "crsPrice");
        CrystalRangeSeekbar maxValue3 = minStartValue3.setMaxValue(crystalRangeSeekbar11.getMaxValue().floatValue());
        CrystalRangeSeekbar crystalRangeSeekbar12 = (CrystalRangeSeekbar) this.this$0._$_findCachedViewById(C5619R.C5622id.crsPrice);
        Intrinsics.checkNotNullExpressionValue(crystalRangeSeekbar12, "crsPrice");
        maxValue3.setMaxStartValue(crystalRangeSeekbar12.getMaxValue().floatValue()).setGap(1.0f).apply();
    }
}
