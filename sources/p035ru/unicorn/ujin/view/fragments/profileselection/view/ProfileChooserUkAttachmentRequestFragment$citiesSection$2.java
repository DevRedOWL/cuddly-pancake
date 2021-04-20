package p035ru.unicorn.ujin.view.fragments.profileselection.view;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.sections.CitiesSection;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/view/fragments/profileselection/view/sections/CitiesSection;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserUkAttachmentRequestFragment$citiesSection$2 */
/* compiled from: ProfileChooserUkAttachmentRequestFragment.kt */
final class ProfileChooserUkAttachmentRequestFragment$citiesSection$2 extends Lambda implements Function0<CitiesSection> {
    final /* synthetic */ ProfileChooserUkAttachmentRequestFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProfileChooserUkAttachmentRequestFragment$citiesSection$2(ProfileChooserUkAttachmentRequestFragment profileChooserUkAttachmentRequestFragment) {
        super(0);
        this.this$0 = profileChooserUkAttachmentRequestFragment;
    }

    public final CitiesSection invoke() {
        CitiesSection citiesSection = new CitiesSection();
        citiesSection.getItemClick().doOnComplete(new C6070x909f6f02(this));
        return citiesSection;
    }
}
