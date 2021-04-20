package p035ru.unicorn.ujin.view.fragments.profileselection.view;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.databinding.FragmentProfileSelectionBinding;
import p035ru.unicorn.ujin.ReactConst;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseBindingFragment;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Contact;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryDialog;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.EditField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Field;
import p035ru.unicorn.ujin.view.fragments.profile.Mode;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002!\"B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\fH\u0002J\u0012\u0010\u001d\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u001f\u001a\u00020\u0010H\u0002J\b\u0010 \u001a\u00020\u0010H\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006#"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profileselection/view/ProfileChooserFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseBindingFragment;", "Lru/unicorn/ujin/view/fragments/profileselection/view/ProfileSelectionVM;", "Lru/unicorn/databinding/FragmentProfileSelectionBinding;", "()V", "mode", "Lru/unicorn/ujin/view/fragments/profile/Mode;", "getMode", "()Lru/unicorn/ujin/view/fragments/profile/Mode;", "setMode", "(Lru/unicorn/ujin/view/fragments/profile/Mode;)V", "getLayoutRes", "", "getMyToolbarTitle", "", "handleSave", "", "dialog", "Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryDialog;", "onCreateView", "root", "Landroid/view/View;", "onFileChoose", "filePath", "onGetSchema", "schemas", "Lru/unicorn/ujin/view/activity/navigation/entity/schema/Schemas;", "onItemClick", "position", "onViewCreated", "vm", "showChooseUjinDialog", "showToolbar", "BindHelper", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserFragment */
/* compiled from: ProfileChooserFragment.kt */
public final class ProfileChooserFragment extends BaseBindingFragment<ProfileSelectionVM, FragmentProfileSelectionBinding> {
    private static final String ARG_MODE = "mode";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    public Mode mode;

    @JvmStatic
    public static final ProfileChooserFragment newInstance(Mode mode2) {
        return Companion.newInstance(mode2);
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
        return R.layout.fragment_profile_selection;
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

    public final Mode getMode() {
        Mode mode2 = this.mode;
        if (mode2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ARG_MODE);
        }
        return mode2;
    }

    public final void setMode(Mode mode2) {
        Intrinsics.checkNotNullParameter(mode2, "<set-?>");
        this.mode = mode2;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        Mode mode2 = this.mode;
        if (mode2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ARG_MODE);
        }
        if (mode2 == Mode.FROM_PROFILE) {
            getBaseActivity().setTextTitle(getMyToolbarTitle());
            getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
            return;
        }
        getBaseActivity().hideToolbar();
    }

    public void onCreateView(View view) {
        super.onCreateView(view);
        getBaseActivity().setRegistrationStarted();
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable(ARG_MODE);
            if (serializable != null) {
                this.mode = (Mode) serializable;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.fragments.profile.Mode");
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u0011"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profileselection/view/ProfileChooserFragment$BindHelper;", "", "mode", "Lru/unicorn/ujin/view/fragments/profile/Mode;", "showNewApartment", "", "showJustUjin", "showNewCommerce", "showAddUK", "(Lru/unicorn/ujin/view/fragments/profile/Mode;ZZZZ)V", "getMode", "()Lru/unicorn/ujin/view/fragments/profile/Mode;", "getShowAddUK", "()Z", "getShowJustUjin", "getShowNewApartment", "getShowNewCommerce", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserFragment$BindHelper */
    /* compiled from: ProfileChooserFragment.kt */
    public static final class BindHelper {
        private final Mode mode;
        private final boolean showAddUK;
        private final boolean showJustUjin;
        private final boolean showNewApartment;
        private final boolean showNewCommerce;

        public BindHelper(Mode mode2, boolean z, boolean z2, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(mode2, ProfileChooserFragment.ARG_MODE);
            this.mode = mode2;
            this.showNewApartment = z;
            this.showJustUjin = z2;
            this.showNewCommerce = z3;
            this.showAddUK = z4;
        }

        public final Mode getMode() {
            return this.mode;
        }

        public final boolean getShowNewApartment() {
            return this.showNewApartment;
        }

        public final boolean getShowJustUjin() {
            return this.showJustUjin;
        }

        public final boolean getShowNewCommerce() {
            return this.showNewCommerce;
        }

        public final boolean getShowAddUK() {
            return this.showAddUK;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x014f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(p035ru.unicorn.ujin.view.fragments.profileselection.view.ProfileSelectionVM r14) {
        /*
            r13 = this;
            androidx.databinding.ViewDataBinding r0 = r13.getViewDataBinding()
            ru.unicorn.databinding.FragmentProfileSelectionBinding r0 = (p035ru.unicorn.databinding.FragmentProfileSelectionBinding) r0
            java.lang.String r1 = "viewDataBinding"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            androidx.lifecycle.LifecycleOwner r2 = r13.getViewLifecycleOwner()
            r0.setLifecycleOwner(r2)
            androidx.databinding.ViewDataBinding r0 = r13.getViewDataBinding()
            ru.unicorn.databinding.FragmentProfileSelectionBinding r0 = (p035ru.unicorn.databinding.FragmentProfileSelectionBinding) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r2 = r13.getViewModell()
            ru.unicorn.ujin.view.fragments.profileselection.view.ProfileSelectionVM r2 = (p035ru.unicorn.ujin.view.fragments.profileselection.view.ProfileSelectionVM) r2
            r0.setVm(r2)
            ru.unicorn.ujin.enums.Flavor$Companion r0 = p035ru.unicorn.ujin.enums.Flavor.Companion
            ru.unicorn.ujin.enums.Flavor r0 = r0.current()
            androidx.databinding.ViewDataBinding r2 = r13.getViewDataBinding()
            ru.unicorn.databinding.FragmentProfileSelectionBinding r2 = (p035ru.unicorn.databinding.FragmentProfileSelectionBinding) r2
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserFragment$BindHelper r1 = new ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserFragment$BindHelper
            ru.unicorn.ujin.view.fragments.profile.Mode r4 = r13.mode
            java.lang.String r9 = "mode"
            if (r4 != 0) goto L_0x003e
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r9)
        L_0x003e:
            boolean r3 = r0.isStage1Enabled()
            java.lang.String r10 = "null cannot be cast to non-null type ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity"
            r11 = 1
            r12 = 0
            if (r3 == 0) goto L_0x0060
            ru.unicorn.ujin.view.activity.BaseActivity r3 = r13.getBaseActivity()
            if (r3 == 0) goto L_0x005a
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity r3 = (p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity) r3
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r3 = r3.getAppStage()
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r5 = p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage.NEW_FLAT
            if (r3 == r5) goto L_0x0060
            r5 = 1
            goto L_0x0061
        L_0x005a:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            r14.<init>(r10)
            throw r14
        L_0x0060:
            r5 = 0
        L_0x0061:
            boolean r6 = r0.isJustSmartFlatAvailable()
            boolean r7 = r0.isCommerceAvailable()
            boolean r8 = r0.isUkAddingAvailable()
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            r2.setBinder(r1)
            if (r14 == 0) goto L_0x008a
            androidx.lifecycle.LiveData r1 = r14.getSelectNumber()
            if (r1 == 0) goto L_0x008a
            androidx.lifecycle.LifecycleOwner r2 = r13.getViewLifecycleOwner()
            ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserFragment$onViewCreated$1 r3 = new ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserFragment$onViewCreated$1
            r3.<init>(r13)
            androidx.lifecycle.Observer r3 = (androidx.lifecycle.Observer) r3
            r1.observe(r2, r3)
        L_0x008a:
            if (r14 == 0) goto L_0x00a0
            androidx.lifecycle.LiveData r1 = r14.getOnJoinUjinSuccess()
            if (r1 == 0) goto L_0x00a0
            androidx.lifecycle.LifecycleOwner r2 = r13.getViewLifecycleOwner()
            ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserFragment$onViewCreated$2 r3 = new ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserFragment$onViewCreated$2
            r3.<init>(r13)
            androidx.lifecycle.Observer r3 = (androidx.lifecycle.Observer) r3
            r1.observe(r2, r3)
        L_0x00a0:
            androidx.databinding.ViewDataBinding r1 = r13.getViewDataBinding()
            ru.unicorn.databinding.FragmentProfileSelectionBinding r1 = (p035ru.unicorn.databinding.FragmentProfileSelectionBinding) r1
            androidx.appcompat.widget.AppCompatImageView r1 = r1.ivLogo
            java.lang.String r2 = "viewDataBinding.ivLogo"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            ru.unicorn.ujin.view.fragments.profile.Mode r2 = r13.mode
            if (r2 != 0) goto L_0x00b4
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r9)
        L_0x00b4:
            ru.unicorn.ujin.view.fragments.profile.Mode r3 = p035ru.unicorn.ujin.view.fragments.profile.Mode.FROM_PROFILE
            if (r2 != r3) goto L_0x00ba
            r2 = 1
            goto L_0x00bb
        L_0x00ba:
            r2 = 0
        L_0x00bb:
            if (r2 != r11) goto L_0x00c0
            r2 = 8
            goto L_0x00c1
        L_0x00c0:
            r2 = 0
        L_0x00c1:
            r1.setVisibility(r2)
            androidx.databinding.ViewDataBinding r1 = r13.getViewDataBinding()
            ru.unicorn.databinding.FragmentProfileSelectionBinding r1 = (p035ru.unicorn.databinding.FragmentProfileSelectionBinding) r1
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r1 = r1.btnNext
            ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserFragment$onViewCreated$3 r2 = new ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserFragment$onViewCreated$3
            r2.<init>(r13, r14)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
            r14 = 4
            java.lang.Boolean[] r1 = new java.lang.Boolean[r14]
            boolean r2 = r0.isStage1Enabled()
            if (r2 == 0) goto L_0x00f7
            ru.unicorn.ujin.view.activity.BaseActivity r2 = r13.getBaseActivity()
            if (r2 == 0) goto L_0x00f1
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity r2 = (p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity) r2
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r2 = r2.getAppStage()
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r3 = p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage.NEW_FLAT
            if (r2 == r3) goto L_0x00f7
            r2 = 1
            goto L_0x00f8
        L_0x00f1:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            r14.<init>(r10)
            throw r14
        L_0x00f7:
            r2 = 0
        L_0x00f8:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1[r12] = r2
            boolean r2 = r0.isJustSmartFlatAvailable()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1[r11] = r2
            boolean r2 = r0.isCommerceAvailable()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3 = 2
            r1[r3] = r2
            boolean r0 = r0.isUkAddingAvailable()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2 = 3
            r1[r2] = r0
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r1)
            java.lang.Boolean[] r1 = new java.lang.Boolean[r14]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r11)
            r1[r12] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r12)
            r1[r11] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r12)
            r1[r3] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r12)
            r1[r2] = r4
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r1 == 0) goto L_0x014f
            ru.unicorn.ujin.view.activity.BaseActivity r14 = r13.getBaseActivity()
            r14.startStageOne()
            goto L_0x01f1
        L_0x014f:
            java.lang.Boolean[] r1 = new java.lang.Boolean[r14]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r12)
            r1[r12] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r11)
            r1[r11] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r12)
            r1[r3] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r12)
            r1[r2] = r4
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r1 == 0) goto L_0x0178
            r13.showChooseUjinDialog()
            goto L_0x01f1
        L_0x0178:
            java.lang.Boolean[] r1 = new java.lang.Boolean[r14]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r12)
            r1[r12] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r12)
            r1[r11] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r11)
            r1[r3] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r12)
            r1[r2] = r4
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r1 == 0) goto L_0x01b5
            ru.unicorn.ujin.view.activity.navigation.ui.base.ViewmodelFactorys r14 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys.getInstance()
            java.lang.Class<ru.unicorn.ujin.view.fragments.profileselection.view.ProfileSelectionVM> r0 = p035ru.unicorn.ujin.view.fragments.profileselection.view.ProfileSelectionVM.class
            r14.clear(r0)
            r13.popFragment()
            ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserStage2Fragment r14 = new ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserStage2Fragment
            r14.<init>()
            androidx.fragment.app.Fragment r14 = (androidx.fragment.app.Fragment) r14
            java.lang.String r0 = "profileChooserAddBc2"
            r13.nextFragment(r14, r12, r0)
            goto L_0x01f1
        L_0x01b5:
            java.lang.Boolean[] r14 = new java.lang.Boolean[r14]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            r14[r12] = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            r14[r11] = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            r14[r3] = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r11)
            r14[r2] = r1
            java.util.List r14 = kotlin.collections.CollectionsKt.listOf(r14)
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r14)
            if (r14 == 0) goto L_0x01f1
            ru.unicorn.ujin.view.activity.navigation.ui.base.ViewmodelFactorys r14 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys.getInstance()
            java.lang.Class<ru.unicorn.ujin.view.fragments.profileselection.view.ProfileSelectionVM> r0 = p035ru.unicorn.ujin.view.fragments.profileselection.view.ProfileSelectionVM.class
            r14.clear(r0)
            r13.popFragment()
            ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserUkAttachmentRequestFragment r14 = new ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserUkAttachmentRequestFragment
            r14.<init>()
            androidx.fragment.app.Fragment r14 = (androidx.fragment.app.Fragment) r14
            java.lang.String r0 = "profileChooserAddUk"
            r13.nextFragment(r14, r12, r0)
        L_0x01f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserFragment.onViewCreated(ru.unicorn.ujin.view.fragments.profileselection.view.ProfileSelectionVM):void");
    }

    /* access modifiers changed from: private */
    public final void onGetSchema(Schemas schemas) {
        ProgressBar progressBar = this.f6913pb;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
        getBaseActivity().setRegistrationFinished();
        getBaseActivity().startStageThreeFromProfileChooser(ReactConst.SMARTFLAT);
    }

    /* access modifiers changed from: private */
    public final void showChooseUjinDialog() {
        List arrayList = new ArrayList();
        EditField editField = new EditField("text", getResources().getString(R.string.label_flat_address), "", "", (Function2) null, (Function1) null, 48, (DefaultConstructorMarker) null);
        editField.setName(Contact.Type.address);
        editField.setRequired(true);
        arrayList.add(editField);
        DataEntryDialog newInstance = DataEntryDialog.Companion.newInstance((int) R.string.label_enter_flat_address, (List<? extends Field>) arrayList, (int) R.string.ok);
        newInstance.setLambdaSave(new ProfileChooserFragment$showChooseUjinDialog$1(this, newInstance));
        newInstance.show(getChildFragmentManager(), "enterApartmentAddress");
    }

    /* access modifiers changed from: private */
    public final void handleSave(DataEntryDialog dataEntryDialog) {
        ((ProfileSelectionVM) getViewModell()).getApartmentTitleMutable().setValue(dataEntryDialog.getValuesList()[0]);
        ((ProfileSelectionVM) getViewModell()).connectToUjin();
        dataEntryDialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void onItemClick(int i) {
        TextView textView = ((FragmentProfileSelectionBinding) getViewDataBinding()).description;
        Intrinsics.checkNotNullExpressionValue(textView, "viewDataBinding.description");
        textView.setText(getResources().getStringArray(R.array.profile_selection)[i]);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profileselection/view/ProfileChooserFragment$Companion;", "", "()V", "ARG_MODE", "", "newInstance", "Lru/unicorn/ujin/view/fragments/profileselection/view/ProfileChooserFragment;", "mode", "Lru/unicorn/ujin/view/fragments/profile/Mode;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserFragment$Companion */
    /* compiled from: ProfileChooserFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ProfileChooserFragment newInstance(Mode mode) {
            Intrinsics.checkNotNullParameter(mode, ProfileChooserFragment.ARG_MODE);
            ProfileChooserFragment profileChooserFragment = new ProfileChooserFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable(ProfileChooserFragment.ARG_MODE, mode);
            Unit unit = Unit.INSTANCE;
            profileChooserFragment.setArguments(bundle);
            return profileChooserFragment;
        }
    }
}
