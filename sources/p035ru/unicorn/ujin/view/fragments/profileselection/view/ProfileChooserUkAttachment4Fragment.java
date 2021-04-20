package p035ru.unicorn.ujin.view.fragments.profileselection.view;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.databinding.FragmentProfileSelectionUkAttachment4Binding;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseBindingFragment;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0014J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0012\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0014¨\u0006\u0010"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profileselection/view/ProfileChooserUkAttachment4Fragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseBindingFragment;", "Lru/unicorn/ujin/view/fragments/profileselection/view/ProfileSelectionVM;", "Lru/unicorn/databinding/FragmentProfileSelectionUkAttachment4Binding;", "()V", "getLayoutRes", "", "getMyToolbarTitle", "", "onFileChoose", "", "filePath", "onViewCreated", "vm", "showMessage", "message", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserUkAttachment4Fragment */
/* compiled from: ProfileChooserUkAttachment4Fragment.kt */
public final class ProfileChooserUkAttachment4Fragment extends BaseBindingFragment<ProfileSelectionVM, FragmentProfileSelectionUkAttachment4Binding> {
    private HashMap _$_findViewCache;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_profile_selection_uk_attachment_4;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onFileChoose(String str) {
        Intrinsics.checkNotNullParameter(str, "filePath");
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        String string = getString(R.string.label_profile_creation_uk);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_profile_creation_uk)");
        return string;
    }

    /* access modifiers changed from: protected */
    public void onViewCreated(ProfileSelectionVM profileSelectionVM) {
        LiveData<Unit> onJoinUkSuccess;
        BaseActivity baseActivity = getBaseActivity();
        if (baseActivity != null) {
            baseActivity.hideToolbar();
        }
        FragmentProfileSelectionUkAttachment4Binding fragmentProfileSelectionUkAttachment4Binding = (FragmentProfileSelectionUkAttachment4Binding) getViewDataBinding();
        Intrinsics.checkNotNullExpressionValue(fragmentProfileSelectionUkAttachment4Binding, "viewDataBinding");
        fragmentProfileSelectionUkAttachment4Binding.setLifecycleOwner(getViewLifecycleOwner());
        FragmentProfileSelectionUkAttachment4Binding fragmentProfileSelectionUkAttachment4Binding2 = (FragmentProfileSelectionUkAttachment4Binding) getViewDataBinding();
        Intrinsics.checkNotNullExpressionValue(fragmentProfileSelectionUkAttachment4Binding2, "viewDataBinding");
        fragmentProfileSelectionUkAttachment4Binding2.setVm((ProfileSelectionVM) getViewModell());
        ((FragmentProfileSelectionUkAttachment4Binding) getViewDataBinding()).btnNext.setOnClickListener(new ProfileChooserUkAttachment4Fragment$onViewCreated$1(this, profileSelectionVM));
        if (!(profileSelectionVM == null || (onJoinUkSuccess = profileSelectionVM.getOnJoinUkSuccess()) == null)) {
            onJoinUkSuccess.observe(getViewLifecycleOwner(), new ProfileChooserUkAttachment4Fragment$onViewCreated$2(this));
        }
        TextView textView = ((FragmentProfileSelectionUkAttachment4Binding) getViewDataBinding()).description;
        Intrinsics.checkNotNullExpressionValue(textView, "viewDataBinding.description");
        textView.setText(getResources().getString(R.string.profile_selection_finish_4));
    }

    /* access modifiers changed from: protected */
    public void showMessage(String str) {
        super.showMessage(str);
        ProgressBar progressBar = this.f6913pb;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
        DynamicBackgroundButton dynamicBackgroundButton = ((FragmentProfileSelectionUkAttachment4Binding) getViewDataBinding()).btnNext;
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "viewDataBinding.btnNext");
        dynamicBackgroundButton.setEnabled(true);
    }
}
