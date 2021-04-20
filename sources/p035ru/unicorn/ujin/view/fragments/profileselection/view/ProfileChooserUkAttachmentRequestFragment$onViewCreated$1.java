package p035ru.unicorn.ujin.view.fragments.profileselection.view;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.SearchSection;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildings;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.SearchBuildingDTO;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.SearchComplex;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.sections.SearchBuildingSection;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserUkAttachmentRequestFragment$onViewCreated$1 */
/* compiled from: ProfileChooserUkAttachmentRequestFragment.kt */
final class ProfileChooserUkAttachmentRequestFragment$onViewCreated$1<T> implements Observer<Boolean> {
    final /* synthetic */ ProfileSelectionVM $vm;
    final /* synthetic */ ProfileChooserUkAttachmentRequestFragment this$0;

    ProfileChooserUkAttachmentRequestFragment$onViewCreated$1(ProfileChooserUkAttachmentRequestFragment profileChooserUkAttachmentRequestFragment, ProfileSelectionVM profileSelectionVM) {
        this.this$0 = profileChooserUkAttachmentRequestFragment;
        this.$vm = profileSelectionVM;
    }

    public final void onChanged(Boolean bool) {
        this.this$0.showBottomSheet(false);
        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) this.this$0._$_findCachedViewById(C5619R.C5622id.buttonNext);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "buttonNext");
        dynamicBackgroundButton.setVisibility(4);
        SearchBuildingSection access$getSearchBuildingSection$p = this.this$0.getSearchBuildingSection();
        SearchBuildingDTO value = this.$vm.getSelectedBuildingMutable().getValue();
        if (value == null) {
            value = new SearchBuildingDTO((SearchComplex) null, (BusinessBuildings) null, 3, (DefaultConstructorMarker) null);
        }
        access$getSearchBuildingSection$p.setData(value);
        this.this$0.getSearchBuildingSection().show(true);
        SearchSection access$getApartmentNumberSection$p = this.this$0.getApartmentNumberSection();
        String value2 = this.$vm.getSelectedApartmentNumber().getValue();
        if (value2 == null) {
            value2 = "";
        }
        access$getApartmentNumberSection$p.setData(new SomeString(value2));
        this.this$0.getApartmentNumberTitleSection().show(true);
        this.this$0.getComplexSection().setData(CollectionsKt.emptyList());
        this.this$0.getBuildingSection().setData(CollectionsKt.emptyList());
        this.this$0.handleButtonVisibility();
    }
}
