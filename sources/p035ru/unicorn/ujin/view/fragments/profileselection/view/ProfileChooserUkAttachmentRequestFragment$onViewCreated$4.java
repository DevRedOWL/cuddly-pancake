package p035ru.unicorn.ujin.view.fragments.profileselection.view;

import androidx.lifecycle.Observer;
import java.util.List;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "", "Lru/unicorn/ujin/view/fragments/profileselection/data/CityDTO;", "kotlin.jvm.PlatformType", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserUkAttachmentRequestFragment$onViewCreated$4 */
/* compiled from: ProfileChooserUkAttachmentRequestFragment.kt */
final class ProfileChooserUkAttachmentRequestFragment$onViewCreated$4<T> implements Observer<List<? extends CityDTO>> {
    final /* synthetic */ ProfileChooserUkAttachmentRequestFragment this$0;

    ProfileChooserUkAttachmentRequestFragment$onViewCreated$4(ProfileChooserUkAttachmentRequestFragment profileChooserUkAttachmentRequestFragment) {
        this.this$0 = profileChooserUkAttachmentRequestFragment;
    }

    public final void onChanged(List<? extends CityDTO> list) {
        this.this$0.getCitiesSection().setData(list);
        this.this$0.handleButtonVisibility();
        if (list.size() == 1) {
            this.this$0.getCitiesSection().getItemClick().onNext(list.get(0));
        }
    }
}
