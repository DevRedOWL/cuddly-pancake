package p035ru.unicorn.ujin.view.fragments.profile;

import android.view.View;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/view/fragments/profile/ProfileEditFragment$setViewsEnabled$2$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.ProfileEditFragment$setViewsEnabled$$inlined$apply$lambda$1 */
/* compiled from: ProfileEditFragment.kt */
final class ProfileEditFragment$setViewsEnabled$$inlined$apply$lambda$1 implements View.OnClickListener {
    final /* synthetic */ boolean $enabled$inlined;
    final /* synthetic */ ProfileEditFragment this$0;

    ProfileEditFragment$setViewsEnabled$$inlined$apply$lambda$1(ProfileEditFragment profileEditFragment, boolean z) {
        this.this$0 = profileEditFragment;
        this.$enabled$inlined = z;
    }

    public final void onClick(View view) {
        if (this.$enabled$inlined) {
            this.this$0.showDatePickerDialog();
        }
    }
}
