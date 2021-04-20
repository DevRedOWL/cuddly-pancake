package p035ru.unicorn.ujin.view.fragments.profileselection.view;

import com.google.android.gms.actions.SearchIntents;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "query", "", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserUkAttachmentRequestFragment$initSections$2 */
/* compiled from: ProfileChooserUkAttachmentRequestFragment.kt */
final class ProfileChooserUkAttachmentRequestFragment$initSections$2<T> implements Consumer<String> {
    final /* synthetic */ ProfileChooserUkAttachmentRequestFragment this$0;

    ProfileChooserUkAttachmentRequestFragment$initSections$2(ProfileChooserUkAttachmentRequestFragment profileChooserUkAttachmentRequestFragment) {
        this.this$0 = profileChooserUkAttachmentRequestFragment;
    }

    public final void accept(String str) {
        ProfileSelectionVM access$getViewModell$p = ProfileChooserUkAttachmentRequestFragment.access$getViewModell$p(this.this$0);
        if (access$getViewModell$p != null) {
            Intrinsics.checkNotNullExpressionValue(str, SearchIntents.EXTRA_QUERY);
            access$getViewModell$p.searchBuildings(str);
        }
    }
}
