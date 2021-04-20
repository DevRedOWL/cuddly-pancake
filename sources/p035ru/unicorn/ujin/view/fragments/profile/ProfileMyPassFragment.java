package p035ru.unicorn.ujin.view.fragments.profile;

import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.MyPassIn;
import p035ru.unicorn.ujin.data.profile.ProfileViewModel;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.PassDetailFragment2;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.PassSection2;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseSectionFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.TextSection;
import p035ru.unicorn.ujin.view.extensions.ExtensionKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u0002H\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profile/ProfileMyPassFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseSectionFragment;", "Lru/unicorn/ujin/data/profile/ProfileViewModel;", "()V", "dialog", "Landroidx/appcompat/app/AlertDialog;", "getDialog", "()Landroidx/appcompat/app/AlertDialog;", "setDialog", "(Landroidx/appcompat/app/AlertDialog;)V", "passSection", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/PassSection2;", "getPassSection", "()Lru/unicorn/ujin/view/activity/navigation/ui/corona/PassSection2;", "passSection$delegate", "Lkotlin/Lazy;", "textSection", "Lru/unicorn/ujin/view/activity/navigation/ui/tickets/TextSection;", "getTextSection", "()Lru/unicorn/ujin/view/activity/navigation/ui/tickets/TextSection;", "textSection$delegate", "getLayoutRes", "", "getMyToolbarTitle", "", "initSections", "", "onClick", "pass", "Lru/unicorn/ujin/data/MyPassIn;", "onViewCreated", "vm", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.ProfileMyPassFragment */
/* compiled from: ProfileMyPassFragment.kt */
public final class ProfileMyPassFragment extends BaseSectionFragment<ProfileViewModel> {
    private HashMap _$_findViewCache;
    public AlertDialog dialog;
    private final Lazy passSection$delegate = LazyKt.lazy(ProfileMyPassFragment$passSection$2.INSTANCE);
    private final Lazy textSection$delegate = LazyKt.lazy(ProfileMyPassFragment$textSection$2.INSTANCE);

    /* access modifiers changed from: private */
    public final PassSection2 getPassSection() {
        return (PassSection2) this.passSection$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final TextSection getTextSection() {
        return (TextSection) this.textSection$delegate.getValue();
    }

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
        return R.layout.fragment_section_base;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ ProfileViewModel access$getViewModell$p(ProfileMyPassFragment profileMyPassFragment) {
        return (ProfileViewModel) profileMyPassFragment.viewModell;
    }

    public final AlertDialog getDialog() {
        AlertDialog alertDialog = this.dialog;
        if (alertDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        }
        return alertDialog;
    }

    public final void setDialog(AlertDialog alertDialog) {
        Intrinsics.checkNotNullParameter(alertDialog, "<set-?>");
        this.dialog = alertDialog;
    }

    /* access modifiers changed from: protected */
    public void onViewCreated(ProfileViewModel profileViewModel) {
        Intrinsics.checkNotNullParameter(profileViewModel, "vm");
        profileViewModel.loadMyPass();
        ExtensionKt.observe((Fragment) this, profileViewModel.getMyPass(), new ProfileMyPassFragment$onViewCreated$1(this));
        ExtensionKt.observe((Fragment) this, profileViewModel.getShowProgressLiveData(), new ProfileMyPassFragment$onViewCreated$2(this));
    }

    /* access modifiers changed from: protected */
    public void initSections() {
        this.sectionedAdapter.addSectionSafety(getPassSection());
        this.sectionedAdapter.addSectionSafety(getTextSection());
        this.disposable.add(getPassSection().getItemClick().subscribe(new ProfileMyPassFragment$initSections$1(this)));
    }

    /* access modifiers changed from: private */
    public final void onClick(MyPassIn myPassIn) {
        ProgressBar progressBar = this.f6913pb;
        Intrinsics.checkNotNullExpressionValue(progressBar, "pb");
        progressBar.setVisibility(0);
        ((ProfileViewModel) this.viewModell).setCurrentPass(myPassIn);
        nextFragment(new PassDetailFragment2(), false, BaseActivity.FRAGMENT_MY_PASS);
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        String string = getString(R.string.label_my_ticket);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_my_ticket)");
        return string;
    }
}
