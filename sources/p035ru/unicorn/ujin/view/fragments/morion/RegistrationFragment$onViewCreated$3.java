package p035ru.unicorn.ujin.view.fragments.morion;

import android.view.View;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.profile.ProfileViewModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.morion.RegistrationFragment$onViewCreated$3 */
/* compiled from: RegistrationFragment.kt */
final class RegistrationFragment$onViewCreated$3 implements View.OnClickListener {
    final /* synthetic */ RegistrationFragment this$0;

    RegistrationFragment$onViewCreated$3(RegistrationFragment registrationFragment) {
        this.this$0 = registrationFragment;
    }

    public final void onClick(View view) {
        RegistrationFragment.access$getBaseActivity$p(this.this$0).hideKeyboard();
        ProfileViewModel profileViewModel = this.this$0.getProfileViewModel();
        String phone = RegistrationFragment.access$getBaseActivity$p(this.this$0).getPhone();
        String format = new SimpleDateFormat("ZZZZZ", Locale.getDefault()).format(new Date());
        Intrinsics.checkNotNullExpressionValue(format, "SimpleDateFormat(\"ZZZZZ\"…Default()).format(Date())");
        profileViewModel.rentRegisterByPhone(phone, format);
    }
}
