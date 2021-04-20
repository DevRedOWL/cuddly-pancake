package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company;

import android.view.MenuItem;
import android.widget.PopupMenu;
import androidx.databinding.ObservableField;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.databinding.FragmentApplicationToCompanyBinding;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.request.ApplicationToCompanyBody;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "item", "Landroid/view/MenuItem;", "onMenuItemClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.ApplicationToCompanyFragment$showGenderDialog$1 */
/* compiled from: ApplicationToCompanyFragment.kt */
final class ApplicationToCompanyFragment$showGenderDialog$1 implements PopupMenu.OnMenuItemClickListener {
    final /* synthetic */ ApplicationToCompanyFragment this$0;

    ApplicationToCompanyFragment$showGenderDialog$1(ApplicationToCompanyFragment applicationToCompanyFragment) {
        this.this$0 = applicationToCompanyFragment;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        ObservableField<ApplicationToCompanyBody> applicationToCompanyBodyObservable;
        ApplicationToCompanyBody applicationToCompanyBody;
        Intrinsics.checkNotNullParameter(menuItem, "item");
        ((FragmentApplicationToCompanyBinding) this.this$0.getViewDataBinding()).gender.etValue.setText(menuItem.getTitle());
        PassCompanyVM passCompanyVM = (PassCompanyVM) this.this$0.getViewModell();
        if (passCompanyVM == null || (applicationToCompanyBodyObservable = passCompanyVM.getApplicationToCompanyBodyObservable()) == null || (applicationToCompanyBody = applicationToCompanyBodyObservable.get()) == null) {
            return true;
        }
        applicationToCompanyBody.setGender(this.this$0.getGenderValue(menuItem.getTitle().toString()));
        return true;
    }
}
