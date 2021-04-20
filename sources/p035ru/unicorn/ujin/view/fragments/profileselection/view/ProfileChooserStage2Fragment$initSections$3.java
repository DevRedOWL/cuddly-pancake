package p035ru.unicorn.ujin.view.fragments.profileselection.view;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildings;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Lru/unicorn/ujin/view/fragments/profileselection/data/BusinessBuildings;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserStage2Fragment$initSections$3 */
/* compiled from: ProfileChooserStage2Fragment.kt */
final class ProfileChooserStage2Fragment$initSections$3<T> implements Consumer<BusinessBuildings> {
    final /* synthetic */ ProfileChooserStage2Fragment this$0;

    ProfileChooserStage2Fragment$initSections$3(ProfileChooserStage2Fragment profileChooserStage2Fragment) {
        this.this$0 = profileChooserStage2Fragment;
    }

    public final void accept(BusinessBuildings businessBuildings) {
        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) this.this$0._$_findCachedViewById(C5619R.C5622id.buttonNext);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "buttonNext");
        dynamicBackgroundButton.setVisibility(0);
        ProfileSelectionVM access$getViewModell$p = ProfileChooserStage2Fragment.access$getViewModell$p(this.this$0);
        if (access$getViewModell$p != null) {
            access$getViewModell$p.selectBCAddress(businessBuildings);
        }
    }
}
