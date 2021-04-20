package p035ru.unicorn.ujin.view.fragments.profileselection.view;

import kotlin.Metadata;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "bc", "Lru/unicorn/ujin/view/fragments/profileselection/data/BusinessCenterDTO;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserStage2Fragment$initBottomSheet$3 */
/* compiled from: ProfileChooserStage2Fragment.kt */
final class ProfileChooserStage2Fragment$initBottomSheet$3<T> implements Consumer<BusinessCenterDTO> {
    final /* synthetic */ ProfileChooserStage2Fragment this$0;

    ProfileChooserStage2Fragment$initBottomSheet$3(ProfileChooserStage2Fragment profileChooserStage2Fragment) {
        this.this$0 = profileChooserStage2Fragment;
    }

    public final void accept(BusinessCenterDTO businessCenterDTO) {
        ProfileSelectionVM access$getViewModell$p = ProfileChooserStage2Fragment.access$getViewModell$p(this.this$0);
        if (access$getViewModell$p != null) {
            access$getViewModell$p.chooseBusCenter(businessCenterDTO);
        }
    }
}
