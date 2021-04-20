package p035ru.unicorn.ujin.view.fragments.profile;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.profile.ProfileViewModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/view/fragments/profile/ProfileEditFragment$showToolbar$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.ProfileEditFragment$showToolbar$$inlined$apply$lambda$1 */
/* compiled from: ProfileEditFragment.kt */
final class ProfileEditFragment$showToolbar$$inlined$apply$lambda$1 implements View.OnClickListener {
    final /* synthetic */ TextView $this_apply;
    final /* synthetic */ ProfileEditFragment this$0;

    ProfileEditFragment$showToolbar$$inlined$apply$lambda$1(TextView textView, ProfileEditFragment profileEditFragment) {
        this.$this_apply = textView;
        this.this$0 = profileEditFragment;
    }

    public final void onClick(View view) {
        Boolean bool = this.this$0.getProfileViewModel().getProfileModeEdit().get();
        if (bool == null) {
            bool = false;
        }
        if (Intrinsics.areEqual((Object) bool, (Object) true)) {
            this.this$0.setViewsEnabled(false);
            String str = this.this$0.getProfileViewModel().getUserAvatarPath().get();
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            Intrinsics.checkNotNullExpressionValue(str, "profileViewModel.userAvatarPath.get() ?: \"\"");
            ProfileViewModel profileViewModel = this.this$0.getProfileViewModel();
            TextInputEditText textInputEditText = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etSurname);
            Intrinsics.checkNotNullExpressionValue(textInputEditText, "etSurname");
            String valueOf = String.valueOf(textInputEditText.getText());
            TextInputEditText textInputEditText2 = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etName);
            Intrinsics.checkNotNullExpressionValue(textInputEditText2, "etName");
            String valueOf2 = String.valueOf(textInputEditText2.getText());
            TextInputEditText textInputEditText3 = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etPatronymic);
            Intrinsics.checkNotNullExpressionValue(textInputEditText3, "etPatronymic");
            String valueOf3 = String.valueOf(textInputEditText3.getText());
            TextInputEditText textInputEditText4 = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etPhone);
            Intrinsics.checkNotNullExpressionValue(textInputEditText4, "etPhone");
            String valueOf4 = String.valueOf(textInputEditText4.getText());
            TextInputEditText textInputEditText5 = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etEmail);
            Intrinsics.checkNotNullExpressionValue(textInputEditText5, "etEmail");
            String valueOf5 = String.valueOf(textInputEditText5.getText());
            if (!StringsKt.isBlank(str)) {
                str2 = this.this$0.convertImageFileToBase64(new File(str));
            }
            TextInputEditText textInputEditText6 = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etBirthday);
            Intrinsics.checkNotNullExpressionValue(textInputEditText6, "etBirthday");
            profileViewModel.requestUpdateProfile(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, str2, String.valueOf(textInputEditText6.getText()));
        } else if (Intrinsics.areEqual((Object) bool, (Object) false)) {
            this.this$0.getProfileViewModel().getProfileModeEdit().set(true);
            this.$this_apply.setText(this.this$0.getString(R.string.profileSave));
            this.this$0.setViewsEnabled(true);
        }
    }
}
