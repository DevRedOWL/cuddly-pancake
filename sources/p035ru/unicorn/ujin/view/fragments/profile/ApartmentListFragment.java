package p035ru.unicorn.ujin.view.fragments.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.profile.ProfileViewModel;
import p035ru.unicorn.ujin.data.realm.profile.Apartment;
import p035ru.unicorn.ujin.enums.Flavor;
import p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.BaseTitleFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0014J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u001a\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010 \u001a\u00020\u000eH\u0014J\b\u0010!\u001a\u00020\u000eH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006#"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profile/ApartmentListFragment;", "Lru/unicorn/ujin/view/fragments/BaseTitleFragment;", "()V", "choosenApartment", "Lru/unicorn/ujin/data/realm/profile/Apartment;", "combineCheckedChangeListener", "Landroid/widget/RadioGroup$OnCheckedChangeListener;", "mode", "Lru/unicorn/ujin/view/fragments/profile/Mode;", "getMode", "()Lru/unicorn/ujin/view/fragments/profile/Mode;", "setMode", "(Lru/unicorn/ujin/view/fragments/profile/Mode;)V", "applyAndGoToApartment", "", "getLayoutRes", "", "metricsScreenName", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onGetSchema", "schemas", "Lru/unicorn/ujin/view/activity/navigation/entity/schema/Schemas;", "onViewCreated", "view", "showToolbar", "startFlatActivity", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.ApartmentListFragment */
/* compiled from: ApartmentListFragment.kt */
public final class ApartmentListFragment extends BaseTitleFragment {
    private static final String ARG_MODE = "mode";
    private static final String ARG_TITLE = "title";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public Apartment choosenApartment;
    private final RadioGroup.OnCheckedChangeListener combineCheckedChangeListener = new ApartmentListFragment$combineCheckedChangeListener$1(this);
    public Mode mode;

    @JvmStatic
    public static final ApartmentListFragment newInstance(String str, Mode mode2) {
        return Companion.newInstance(str, mode2);
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

    public int getLayoutRes() {
        return R.layout.fragment_apartment_list;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "Список квартир";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
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
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        if (((p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity) r1).getAppStage() == p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage.NEW_FLAT) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void showToolbar() {
        /*
            r5 = this;
            ru.unicorn.ujin.view.activity.BaseActivity r0 = r5.getBaseActivity()
            ru.unicorn.ujin.view.fragments.profile.Mode r1 = r5.mode
            java.lang.String r2 = "mode"
            if (r1 != 0) goto L_0x000d
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x000d:
            ru.unicorn.ujin.view.fragments.profile.Mode r3 = p035ru.unicorn.ujin.view.fragments.profile.Mode.FROM_PROFILE
            if (r1 != r3) goto L_0x0014
            ru.unicorn.ujin.view.toolbar.ToolbarButtons r1 = p035ru.unicorn.ujin.view.toolbar.ToolbarButtons.BACK
            goto L_0x0016
        L_0x0014:
            ru.unicorn.ujin.view.toolbar.ToolbarButtons r1 = p035ru.unicorn.ujin.view.toolbar.ToolbarButtons.NONE
        L_0x0016:
            r0.setToolbarLeft(r1)
            ru.unicorn.ujin.view.activity.BaseActivity r0 = r5.getBaseActivity()
            java.lang.String r1 = r5.getTitle()
            r0.setTextTitle(r1)
            ru.unicorn.ujin.view.activity.BaseActivity r0 = r5.getBaseActivity()
            r0.hideBottomNavigation()
            ru.unicorn.ujin.enums.Flavor$Companion r0 = p035ru.unicorn.ujin.enums.Flavor.Companion
            ru.unicorn.ujin.enums.Flavor r0 = r0.current()
            ru.unicorn.ujin.view.fragments.profile.Mode r1 = r5.mode
            if (r1 != 0) goto L_0x0038
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0038:
            ru.unicorn.ujin.view.fragments.profile.Mode r2 = p035ru.unicorn.ujin.view.fragments.profile.Mode.FROM_PROFILE
            if (r1 != r2) goto L_0x009b
            boolean r1 = r0.isStage1Enabled()
            if (r1 == 0) goto L_0x005b
            ru.unicorn.ujin.view.activity.BaseActivity r1 = r5.getBaseActivity()
            if (r1 == 0) goto L_0x0053
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity r1 = (p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity) r1
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r1 = r1.getAppStage()
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r2 = p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage.NEW_FLAT
            if (r1 != r2) goto L_0x006d
            goto L_0x005b
        L_0x0053:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity"
            r0.<init>(r1)
            throw r0
        L_0x005b:
            boolean r1 = r0.isCommerceAvailable()
            if (r1 != 0) goto L_0x006d
            boolean r1 = r0.isUkAddingAvailable()
            if (r1 != 0) goto L_0x006d
            boolean r0 = r0.isJustSmartFlatAvailable()
            if (r0 == 0) goto L_0x009b
        L_0x006d:
            ru.unicorn.ujin.view.activity.BaseActivity r0 = r5.getBaseActivity()
            r1 = 1
            android.view.View[] r1 = new android.view.View[r1]
            r2 = 0
            androidx.appcompat.widget.AppCompatImageView r3 = new androidx.appcompat.widget.AppCompatImageView
            android.content.Context r4 = r5.requireContext()
            r3.<init>(r4)
            r4 = 2131231251(0x7f080213, float:1.8078578E38)
            r3.setImageResource(r4)
            ru.unicorn.ujin.view.fragments.profile.ApartmentListFragment$showToolbar$$inlined$apply$lambda$1 r4 = new ru.unicorn.ujin.view.fragments.profile.ApartmentListFragment$showToolbar$$inlined$apply$lambda$1
            r4.<init>(r5)
            android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4
            r3.setOnClickListener(r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            android.view.View r3 = (android.view.View) r3
            r1[r2] = r3
            java.util.ArrayList r1 = kotlin.collections.CollectionsKt.arrayListOf(r1)
            r0.setToolbarRight(r1)
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.profile.ApartmentListFragment.showToolbar():void");
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profile/ApartmentListFragment$Companion;", "", "()V", "ARG_MODE", "", "ARG_TITLE", "newInstance", "Lru/unicorn/ujin/view/fragments/profile/ApartmentListFragment;", "title", "mode", "Lru/unicorn/ujin/view/fragments/profile/Mode;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.profile.ApartmentListFragment$Companion */
    /* compiled from: ApartmentListFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ApartmentListFragment newInstance(String str, Mode mode) {
            Intrinsics.checkNotNullParameter(str, "title");
            Intrinsics.checkNotNullParameter(mode, ApartmentListFragment.ARG_MODE);
            ApartmentListFragment apartmentListFragment = new ApartmentListFragment();
            Bundle bundle = new Bundle();
            bundle.putString("title", str);
            bundle.putSerializable(ApartmentListFragment.ARG_MODE, mode);
            Unit unit = Unit.INSTANCE;
            apartmentListFragment.setArguments(bundle);
            return apartmentListFragment;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("title", "");
            Intrinsics.checkNotNullExpressionValue(string, "it.getString(ARG_TITLE, \"\")");
            setTitle(string);
            Serializable serializable = arguments.getSerializable(ARG_MODE);
            if (serializable != null) {
                this.mode = (Mode) serializable;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.fragments.profile.Mode");
            }
        }
        return layoutInflater.inflate(R.layout.fragment_apartment_list, viewGroup, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.util.Collection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v22, resolved type: java.util.List} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0072, code lost:
        if (getBaseActivity().flavor.isStage2Enabled() == false) goto L_0x0076;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x002c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x013a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0113 A[LOOP:1: B:33:0x00b0->B:54:0x0113, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            r13 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            super.onViewCreated(r14, r15)
            ru.unicorn.ujin.data.profile.ProfileViewModel r14 = r13.getProfileViewModel()
            java.lang.String r14 = r14.getUserToken()
            ru.unicorn.ujin.data.profile.ProfileViewModel r15 = r13.getProfileViewModel()
            io.realm.RealmList r15 = r15.getUserApartments()
            java.lang.String r0 = "it"
            r1 = 0
            r2 = 1
            r3 = 0
            if (r15 == 0) goto L_0x0081
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r15 = r15.iterator()
        L_0x002c:
            boolean r5 = r15.hasNext()
            if (r5 == 0) goto L_0x007d
            java.lang.Object r5 = r15.next()
            r6 = r5
            ru.unicorn.ujin.data.realm.profile.Apartment r6 = (p035ru.unicorn.ujin.data.realm.profile.Apartment) r6
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            java.lang.Integer r7 = r6.getId()
            if (r7 == 0) goto L_0x0076
            java.lang.Integer r7 = r6.getStage()
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r8 = p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage.SMARTFLAT
            int r8 = r8.getStageNum()
            if (r7 != 0) goto L_0x004f
            goto L_0x0055
        L_0x004f:
            int r7 = r7.intValue()
            if (r7 == r8) goto L_0x0074
        L_0x0055:
            java.lang.Integer r6 = r6.getStage()
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r7 = p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage.COMPLEX_CONSTRUCTION
            int r7 = r7.getStageNum()
            if (r6 != 0) goto L_0x0062
            goto L_0x0076
        L_0x0062:
            int r6 = r6.intValue()
            if (r6 != r7) goto L_0x0076
            ru.unicorn.ujin.view.activity.BaseActivity r6 = r13.getBaseActivity()
            ru.unicorn.ujin.enums.Flavor r6 = r6.flavor
            boolean r6 = r6.isStage2Enabled()
            if (r6 == 0) goto L_0x0076
        L_0x0074:
            r6 = 1
            goto L_0x0077
        L_0x0076:
            r6 = 0
        L_0x0077:
            if (r6 == 0) goto L_0x002c
            r4.add(r5)
            goto L_0x002c
        L_0x007d:
            r15 = r4
            java.util.List r15 = (java.util.List) r15
            goto L_0x0082
        L_0x0081:
            r15 = r1
        L_0x0082:
            java.lang.String r4 = "null cannot be cast to non-null type android.widget.RadioButton"
            r5 = 2131558841(0x7f0d01b9, float:1.874301E38)
            java.lang.String r6 = "apartment"
            if (r15 == 0) goto L_0x0140
            r7 = r15
            java.util.Collection r7 = (java.util.Collection) r7
            if (r7 == 0) goto L_0x0099
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            r7 = 0
            goto L_0x009a
        L_0x0099:
            r7 = 1
        L_0x009a:
            if (r7 != 0) goto L_0x0140
            int r7 = p035ru.unicorn.C5619R.C5622id.apartmentParent
            android.view.View r7 = r13._$_findCachedViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            java.lang.String r8 = "apartmentParent"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            r7.setVisibility(r3)
            java.util.Iterator r7 = r15.iterator()
        L_0x00b0:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0140
            java.lang.Object r8 = r7.next()
            ru.unicorn.ujin.data.realm.profile.Apartment r8 = (p035ru.unicorn.ujin.data.realm.profile.Apartment) r8
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r6)
            java.lang.String r9 = r8.getUserToken()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x00f0
            ru.unicorn.ujin.view.activity.BaseActivity r9 = r13.getBaseActivity()
            if (r9 == 0) goto L_0x00e8
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity r9 = (p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity) r9
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r9 = r9.getAppStage()
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r10 = p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage.NEW_FLAT
            if (r9 == r10) goto L_0x00f0
            ru.unicorn.ujin.view.fragments.profile.Mode r9 = r13.mode
            if (r9 != 0) goto L_0x00e2
            java.lang.String r10 = "mode"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r10)
        L_0x00e2:
            ru.unicorn.ujin.view.fragments.profile.Mode r10 = p035ru.unicorn.ujin.view.fragments.profile.Mode.FROM_LOGIN
            if (r9 == r10) goto L_0x00f0
            r9 = 1
            goto L_0x00f1
        L_0x00e8:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            java.lang.String r15 = "null cannot be cast to non-null type ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity"
            r14.<init>(r15)
            throw r14
        L_0x00f0:
            r9 = 0
        L_0x00f1:
            if (r9 == 0) goto L_0x00f5
            r13.choosenApartment = r8
        L_0x00f5:
            int r10 = p035ru.unicorn.C5619R.C5622id.rgApartmentList
            android.view.View r10 = r13._$_findCachedViewById(r10)
            android.widget.RadioGroup r10 = (android.widget.RadioGroup) r10
            android.content.Context r11 = r13.getContext()
            android.view.LayoutInflater r11 = android.view.LayoutInflater.from(r11)
            int r12 = p035ru.unicorn.C5619R.C5622id.rgApartmentList
            android.view.View r12 = r13._$_findCachedViewById(r12)
            android.widget.RadioGroup r12 = (android.widget.RadioGroup) r12
            android.view.View r11 = r11.inflate(r5, r12, r3)
            if (r11 == 0) goto L_0x013a
            android.widget.RadioButton r11 = (android.widget.RadioButton) r11
            java.lang.String r12 = r8.getTitle()
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r11.setText(r12)
            r11.setChecked(r9)
            java.lang.Integer r8 = r8.getId()
            java.lang.String r9 = "apartment.id"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
            int r8 = r8.intValue()
            r11.setId(r8)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            android.view.View r11 = (android.view.View) r11
            r10.addView(r11)
            goto L_0x00b0
        L_0x013a:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            r14.<init>(r4)
            throw r14
        L_0x0140:
            ru.unicorn.ujin.data.profile.ProfileViewModel r7 = r13.getProfileViewModel()
            io.realm.RealmList r7 = r7.getCommerceApartments()
            if (r7 == 0) goto L_0x019c
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r7 = r7.iterator()
        L_0x0157:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x019a
            java.lang.Object r8 = r7.next()
            r9 = r8
            ru.unicorn.ujin.data.realm.profile.Apartment r9 = (p035ru.unicorn.ujin.data.realm.profile.Apartment) r9
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            java.lang.Integer r9 = r9.getStage()
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r10 = p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage.SMARTFLAT
            int r10 = r10.getStageNum()
            if (r9 != 0) goto L_0x0174
            goto L_0x017a
        L_0x0174:
            int r9 = r9.intValue()
            if (r9 == r10) goto L_0x0193
        L_0x017a:
            java.lang.String r9 = "kortros"
            java.lang.String r10 = "pan"
            java.lang.String r11 = "newcity"
            java.lang.String r12 = "ujin"
            java.lang.String[] r10 = new java.lang.String[]{r9, r10, r11, r12}
            java.util.List r10 = kotlin.collections.CollectionsKt.listOf(r10)
            boolean r9 = r10.contains(r9)
            if (r9 == 0) goto L_0x0191
            goto L_0x0193
        L_0x0191:
            r9 = 0
            goto L_0x0194
        L_0x0193:
            r9 = 1
        L_0x0194:
            if (r9 == 0) goto L_0x0157
            r1.add(r8)
            goto L_0x0157
        L_0x019a:
            java.util.List r1 = (java.util.List) r1
        L_0x019c:
            if (r1 == 0) goto L_0x0227
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x01ac
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01aa
            goto L_0x01ac
        L_0x01aa:
            r0 = 0
            goto L_0x01ad
        L_0x01ac:
            r0 = 1
        L_0x01ad:
            if (r0 != 0) goto L_0x0227
            int r0 = p035ru.unicorn.C5619R.C5622id.commerceParent
            android.view.View r0 = r13._$_findCachedViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            java.lang.String r7 = "commerceParent"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r7)
            r0.setVisibility(r3)
            java.util.Iterator r0 = r1.iterator()
        L_0x01c3:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0227
            java.lang.Object r7 = r0.next()
            ru.unicorn.ujin.data.realm.profile.Apartment r7 = (p035ru.unicorn.ujin.data.realm.profile.Apartment) r7
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            java.lang.String r8 = r7.getUserToken()
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r8)
            if (r8 == 0) goto L_0x01de
            r13.choosenApartment = r7
        L_0x01de:
            int r9 = p035ru.unicorn.C5619R.C5622id.rgCommerceList
            android.view.View r9 = r13._$_findCachedViewById(r9)
            android.widget.RadioGroup r9 = (android.widget.RadioGroup) r9
            android.content.Context r10 = r13.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            int r11 = p035ru.unicorn.C5619R.C5622id.rgCommerceList
            android.view.View r11 = r13._$_findCachedViewById(r11)
            android.widget.RadioGroup r11 = (android.widget.RadioGroup) r11
            android.view.View r10 = r10.inflate(r5, r11, r3)
            if (r10 == 0) goto L_0x0221
            android.widget.RadioButton r10 = (android.widget.RadioButton) r10
            java.lang.String r11 = r7.getTitle()
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            r10.setText(r11)
            r10.setChecked(r8)
            java.lang.String r7 = r7.getComplexId()
            if (r7 == 0) goto L_0x0215
            int r7 = java.lang.Integer.parseInt(r7)
            goto L_0x0216
        L_0x0215:
            r7 = 0
        L_0x0216:
            r10.setId(r7)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            android.view.View r10 = (android.view.View) r10
            r9.addView(r10)
            goto L_0x01c3
        L_0x0221:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            r14.<init>(r4)
            throw r14
        L_0x0227:
            int r14 = p035ru.unicorn.C5619R.C5622id.rgApartmentList
            android.view.View r14 = r13._$_findCachedViewById(r14)
            android.widget.RadioGroup r14 = (android.widget.RadioGroup) r14
            android.widget.RadioGroup$OnCheckedChangeListener r0 = r13.combineCheckedChangeListener
            r14.setOnCheckedChangeListener(r0)
            int r14 = p035ru.unicorn.C5619R.C5622id.rgCommerceList
            android.view.View r14 = r13._$_findCachedViewById(r14)
            android.widget.RadioGroup r14 = (android.widget.RadioGroup) r14
            android.widget.RadioGroup$OnCheckedChangeListener r0 = r13.combineCheckedChangeListener
            r14.setOnCheckedChangeListener(r0)
            int r14 = p035ru.unicorn.C5619R.C5622id.btnApplyChanges
            android.view.View r14 = r13._$_findCachedViewById(r14)
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r14 = (p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton) r14
            java.lang.String r0 = "btnApplyChanges"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r0)
            java.util.Collection r15 = (java.util.Collection) r15
            if (r15 == 0) goto L_0x025b
            boolean r15 = r15.isEmpty()
            if (r15 == 0) goto L_0x0259
            goto L_0x025b
        L_0x0259:
            r15 = 0
            goto L_0x025c
        L_0x025b:
            r15 = 1
        L_0x025c:
            if (r15 == 0) goto L_0x0270
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x026b
            boolean r15 = r1.isEmpty()
            if (r15 == 0) goto L_0x0269
            goto L_0x026b
        L_0x0269:
            r15 = 0
            goto L_0x026c
        L_0x026b:
            r15 = 1
        L_0x026c:
            if (r15 == 0) goto L_0x0270
            r15 = 1
            goto L_0x0271
        L_0x0270:
            r15 = 0
        L_0x0271:
            if (r15 != r2) goto L_0x0275
            r3 = 8
        L_0x0275:
            r14.setVisibility(r3)
            int r14 = p035ru.unicorn.C5619R.C5622id.btnApplyChanges
            android.view.View r14 = r13._$_findCachedViewById(r14)
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r14 = (p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton) r14
            ru.unicorn.ujin.view.fragments.profile.ApartmentListFragment$onViewCreated$3 r15 = new ru.unicorn.ujin.view.fragments.profile.ApartmentListFragment$onViewCreated$3
            r15.<init>(r13)
            android.view.View$OnClickListener r15 = (android.view.View.OnClickListener) r15
            r14.setOnClickListener(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.profile.ApartmentListFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* access modifiers changed from: private */
    public final void applyAndGoToApartment() {
        Apartment apartment = this.choosenApartment;
        if (apartment != null) {
            if (apartment.getStage() == null) {
                apartment.setStage(3);
            }
            ProfileViewModel profileViewModel = getProfileViewModel();
            String userToken = apartment.getUserToken();
            Intrinsics.checkNotNullExpressionValue(userToken, "it.userToken");
            Integer stage = apartment.getStage();
            Intrinsics.checkNotNullExpressionValue(stage, "it.stage");
            profileViewModel.applyFlat(userToken, stage.intValue());
            ProfileViewModel profileViewModel2 = getProfileViewModel();
            String buildingId = apartment.getBuildingId();
            Intrinsics.checkNotNullExpressionValue(buildingId, "it.buildingId");
            profileViewModel2.loadBuilding(buildingId);
            DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnApplyChanges);
            Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "btnApplyChanges");
            dynamicBackgroundButton.setEnabled(false);
            ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            progressBar.setVisibility(0);
            if (Flavor.Companion.current().getHasDynamicBottomNavigationViewSupport()) {
                getSimpleViewModel().setIsSchemaLoading(true);
                getSimpleViewModel().deleteSchema();
                getSimpleViewModel().getSingleSchema(false);
                getSimpleViewModel().getSchemasSingleEvent().observe(getViewLifecycleOwner(), new C6058xb6a4ac98(this));
                return;
            }
            getSimpleViewModel().deleteSchema();
            startFlatActivity();
            return;
        }
        showMessage("Выберите объект!");
    }

    /* access modifiers changed from: private */
    public final void onGetSchema(Schemas schemas) {
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        progressBar.setVisibility(8);
        startFlatActivity();
    }

    private final void startFlatActivity() {
        Apartment apartment = this.choosenApartment;
        if (apartment != null) {
            Integer stage = apartment.getStage();
            int stageNum = AppStage.SMARTFLAT.getStageNum();
            if (stage != null && stage.intValue() == stageNum) {
                Mode mode2 = this.mode;
                if (mode2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(ARG_MODE);
                }
                if (mode2 == Mode.FROM_PROFILE) {
                    getBaseActivity().startStageThreeFromApartmentChooser(getProfileViewModel().getDefaultBottomNavigationTab());
                } else {
                    getBaseActivity().startStageThree(getProfileViewModel().getDefaultBottomNavigationTab(), false);
                }
            } else {
                int stageNum2 = AppStage.COMPLEX_CONSTRUCTION.getStageNum();
                if (stage != null && stage.intValue() == stageNum2) {
                    getBaseActivity().startStageTwo(true);
                }
            }
        }
    }
}
