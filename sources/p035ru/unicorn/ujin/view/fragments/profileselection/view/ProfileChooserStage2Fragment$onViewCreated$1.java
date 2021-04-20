package p035ru.unicorn.ujin.view.fragments.profileselection.view;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserStage2Fragment$onViewCreated$1 */
/* compiled from: ProfileChooserStage2Fragment.kt */
final class ProfileChooserStage2Fragment$onViewCreated$1<T> implements Observer<Boolean> {
    final /* synthetic */ ProfileChooserStage2Fragment this$0;

    ProfileChooserStage2Fragment$onViewCreated$1(ProfileChooserStage2Fragment profileChooserStage2Fragment) {
        this.this$0 = profileChooserStage2Fragment;
    }

    public final void onChanged(Boolean bool) {
        this.this$0.showBottomSheet(false);
        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) this.this$0._$_findCachedViewById(C5619R.C5622id.buttonNext);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "buttonNext");
        dynamicBackgroundButton.setVisibility(4);
        this.this$0.getChooseBusinessSection().setData(new CityDTO(0, (String) null, 3, (DefaultConstructorMarker) null));
        this.this$0.getBusinessCenterSection().setData(CollectionsKt.emptyList());
        this.this$0.getAvailableAddressesSection().setData(CollectionsKt.emptyList());
    }
}
