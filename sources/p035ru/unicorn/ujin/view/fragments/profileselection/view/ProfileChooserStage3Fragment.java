package p035ru.unicorn.ujin.view.fragments.profileselection.view;

import android.view.View;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.databinding.FragmentProfileSelectionStage3Binding;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseBindingFragment;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0002H\u0014¨\u0006\u0012"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profileselection/view/ProfileChooserStage3Fragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseBindingFragment;", "Lru/unicorn/ujin/view/fragments/profileselection/view/ProfileSelectionVM;", "Lru/unicorn/databinding/FragmentProfileSelectionStage3Binding;", "()V", "getLayoutRes", "", "getMyToolbarTitle", "", "gotoStage4", "", "handleProfileUpdate", "event", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "onFileChoose", "filePath", "onViewCreated", "vm", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserStage3Fragment */
/* compiled from: ProfileChooserStage3Fragment.kt */
public final class ProfileChooserStage3Fragment extends BaseBindingFragment<ProfileSelectionVM, FragmentProfileSelectionStage3Binding> {
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
        return R.layout.fragment_profile_selection_stage_3;
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
        String string = getString(R.string.label_profile_creation);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_profile_creation)");
        return string;
    }

    /* access modifiers changed from: protected */
    public void onViewCreated(ProfileSelectionVM profileSelectionVM) {
        Intrinsics.checkNotNullParameter(profileSelectionVM, "vm");
        BaseActivity baseActivity = getBaseActivity();
        if (baseActivity != null) {
            baseActivity.hideToolbar();
        }
        FragmentProfileSelectionStage3Binding fragmentProfileSelectionStage3Binding = (FragmentProfileSelectionStage3Binding) getViewDataBinding();
        Intrinsics.checkNotNullExpressionValue(fragmentProfileSelectionStage3Binding, "viewDataBinding");
        fragmentProfileSelectionStage3Binding.setLifecycleOwner(getViewLifecycleOwner());
        FragmentProfileSelectionStage3Binding fragmentProfileSelectionStage3Binding2 = (FragmentProfileSelectionStage3Binding) getViewDataBinding();
        Intrinsics.checkNotNullExpressionValue(fragmentProfileSelectionStage3Binding2, "viewDataBinding");
        fragmentProfileSelectionStage3Binding2.setVm((ProfileSelectionVM) getViewModell());
        ((FragmentProfileSelectionStage3Binding) getViewDataBinding()).btnNext.setOnClickListener(new ProfileChooserStage3Fragment$onViewCreated$1(this, profileSelectionVM));
        boolean z = true;
        if (profileSelectionVM.getSurname().length() > 0) {
            if (profileSelectionVM.getName().length() > 0) {
                if (profileSelectionVM.getPatronymic().length() > 0) {
                    if (profileSelectionVM.getEmail().length() <= 0) {
                        z = false;
                    }
                    if (z) {
                        gotoStage4();
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.getSelectedApartmentNumber();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void gotoStage4() {
        /*
            r3 = this;
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r0 = r3.getViewModell()
            ru.unicorn.ujin.view.fragments.profileselection.view.ProfileSelectionVM r0 = (p035ru.unicorn.ujin.view.fragments.profileselection.view.ProfileSelectionVM) r0
            if (r0 == 0) goto L_0x0015
            androidx.lifecycle.MutableLiveData r0 = r0.getSelectedApartmentNumber()
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            r1 = 0
            if (r0 == 0) goto L_0x0026
            ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserUkAttachment4Fragment r0 = new ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserUkAttachment4Fragment
            r0.<init>()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            java.lang.String r2 = "profileChooserAddUk4"
            r3.nextFragment(r0, r1, r2)
            goto L_0x0032
        L_0x0026:
            ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserStage4Fragment r0 = new ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserStage4Fragment
            r0.<init>()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            java.lang.String r2 = "profileChooserAddBc4"
            r3.nextFragment(r0, r1, r2)
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserStage3Fragment.gotoStage4():void");
    }

    /* access modifiers changed from: private */
    public final void handleProfileUpdate(UpdateEvent updateEvent) {
        String str;
        if (updateEvent == null || !updateEvent.getSuccess()) {
            if (updateEvent == null || (str = updateEvent.getMessage()) == null) {
                str = "Ошибка";
            }
            showMessage(str);
            return;
        }
        gotoStage4();
    }
}
