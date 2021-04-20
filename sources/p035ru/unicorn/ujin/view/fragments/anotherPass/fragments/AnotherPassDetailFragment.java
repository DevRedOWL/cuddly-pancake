package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.afollestad.materialdialogs.DialogBehavior;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.customview.DialogCustomViewExtKt;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.customViews.dynamic.DatePickerViewHolder;
import p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel;
import p035ru.unicorn.ujin.view.fragments.anotherPass.response.AnotherPassResponse;
import p035ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;
import p042cz.msebera.android.httpclient.protocol.HTTP;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0016\u0010\u0017\u001a\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0014J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010&\u001a\u00020\u0013H\u0002J\b\u0010'\u001a\u00020\u0013H\u0002J\b\u0010(\u001a\u00020\u0013H\u0002J\b\u0010)\u001a\u00020\u0013H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\t¨\u0006+"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/fragments/AnotherPassDetailFragment;", "Lru/unicorn/ujin/view/fragments/anotherPass/fragments/BaseAnotherPassFragment;", "()V", "dateFormat", "Ljava/text/SimpleDateFormat;", "isActive", "", "()Z", "setActive", "(Z)V", "justCopy", "getJustCopy", "setJustCopy", "passe", "Lru/unicorn/ujin/view/fragments/anotherPass/response/passList/Passe;", "toSavePass", "getToSavePass", "setToSavePass", "getPassInviteText", "", "handleInviteText", "event", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "handlePassGet", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/fragments/anotherPass/response/AnotherPassResponse;", "metricsScreenName", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showDialogOnCreatePass", "showDialogOnCreatedPass", "showDialogOnWaitingPass", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassDetailFragment */
/* compiled from: AnotherPassDetailFragment.kt */
public final class AnotherPassDetailFragment extends BaseAnotherPassFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    private final SimpleDateFormat dateFormat = new SimpleDateFormat(DatePickerViewHolder.DATE_FORMAT, Locale.getDefault());
    private boolean isActive = true;
    private boolean justCopy = true;
    /* access modifiers changed from: private */
    public Passe passe;
    private boolean toSavePass;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassDetailFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[Resource.Status.ERROR.ordinal()] = 1;
            $EnumSwitchMapping$0[Resource.Status.SUCCESS.ordinal()] = 2;
        }
    }

    @JvmStatic
    public static final AnotherPassDetailFragment newInstance(Passe passe2, boolean z) {
        return Companion.newInstance(passe2, z);
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
    public String metricsScreenName() {
        return "Экран подробной инфы об очередном пропуске";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ Passe access$getPasse$p(AnotherPassDetailFragment anotherPassDetailFragment) {
        Passe passe2 = anotherPassDetailFragment.passe;
        if (passe2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("passe");
        }
        return passe2;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final void setActive(boolean z) {
        this.isActive = z;
    }

    public final boolean getToSavePass() {
        return this.toSavePass;
    }

    public final void setToSavePass(boolean z) {
        this.toSavePass = z;
    }

    public final boolean getJustCopy() {
        return this.justCopy;
    }

    public final void setJustCopy(boolean z) {
        this.justCopy = z;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getString(R.string.anotherPassInfoTitle));
        Passe passe2 = this.passe;
        if (passe2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("passe");
        }
        if (!passe2.is_archive() && !this.toSavePass) {
            BaseActivity baseActivity = getBaseActivity();
            ArrayList arrayList = new ArrayList();
            Unit unit = Unit.INSTANCE;
            baseActivity.setToolbarRight(arrayList);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_another_pass_info, viewGroup, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0461, code lost:
        if ((r1 == null || kotlin.text.StringsKt.isBlank(r1)) == false) goto L_0x0463;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r17, android.os.Bundle r18) {
        /*
            r16 = this;
            r0 = r16
            java.lang.String r1 = "view"
            r2 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            super.onViewCreated(r17, r18)
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r1 = r0.passe
            java.lang.String r2 = "passe"
            if (r1 != 0) goto L_0x0015
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0015:
            boolean r1 = r1.is_archive()
            java.lang.String r3 = "btnCheckStatus"
            java.lang.String r4 = "btnShare"
            java.lang.String r5 = "btnCopy"
            java.lang.String r6 = "tvStatus"
            r7 = 8
            r8 = 0
            if (r1 == 0) goto L_0x008c
            int r1 = p035ru.unicorn.C5619R.C5622id.tvStatus
            android.view.View r1 = r0._$_findCachedViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
            r6 = 2131886197(0x7f120075, float:1.9406966E38)
            java.lang.String r6 = r0.getString(r6)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r1.setText(r6)
            int r1 = p035ru.unicorn.C5619R.C5622id.btnCopy
            android.view.View r1 = r0._$_findCachedViewById(r1)
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r1 = (p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            r1.setVisibility(r7)
            int r1 = p035ru.unicorn.C5619R.C5622id.btnShare
            android.view.View r1 = r0._$_findCachedViewById(r1)
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r1 = (p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            r1.setVisibility(r7)
            int r1 = p035ru.unicorn.C5619R.C5622id.btnCheckStatus
            android.view.View r1 = r0._$_findCachedViewById(r1)
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r1 = (p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            r1.setVisibility(r7)
            ru.unicorn.ujin.view.activity.BaseActivity r1 = r16.getBaseActivity()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.setToolbarRight(r3)
            int r1 = p035ru.unicorn.C5619R.C5622id.btnCreateAgain
            android.view.View r1 = r0._$_findCachedViewById(r1)
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r1 = (p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton) r1
            r1.setVisibility(r8)
            ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassDetailFragment$onViewCreated$$inlined$apply$lambda$1 r3 = new ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassDetailFragment$onViewCreated$$inlined$apply$lambda$1
            r3.<init>(r0)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r1.setOnClickListener(r3)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto L_0x0161
        L_0x008c:
            int r1 = p035ru.unicorn.C5619R.C5622id.btnCreateAgain
            android.view.View r1 = r0._$_findCachedViewById(r1)
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r1 = (p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton) r1
            java.lang.String r9 = "btnCreateAgain"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r9)
            r1.setVisibility(r7)
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r1 = r0.passe
            if (r1 != 0) goto L_0x00a3
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x00a3:
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.State r1 = r1.getState()
            java.lang.String r1 = r1.getSlug()
            int r9 = r1.hashCode()
            r10 = 1116313165(0x4289964d, float:68.79356)
            if (r9 == r10) goto L_0x00b5
            goto L_0x0114
        L_0x00b5:
            java.lang.String r9 = "waiting"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x0114
            int r1 = p035ru.unicorn.C5619R.C5622id.tvStatus
            android.view.View r1 = r0._$_findCachedViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
            r3 = 2131886210(0x7f120082, float:1.9406992E38)
            java.lang.String r3 = r0.getString(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r1.setText(r3)
            int r1 = p035ru.unicorn.C5619R.C5622id.btnCopy
            android.view.View r1 = r0._$_findCachedViewById(r1)
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r1 = (p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            r1.setVisibility(r7)
            int r1 = p035ru.unicorn.C5619R.C5622id.btnShare
            android.view.View r1 = r0._$_findCachedViewById(r1)
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r1 = (p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            r1.setVisibility(r7)
            int r1 = p035ru.unicorn.C5619R.C5622id.btnCheckStatus
            android.view.View r1 = r0._$_findCachedViewById(r1)
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r1 = (p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton) r1
            r1.setVisibility(r8)
            ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassDetailFragment$onViewCreated$$inlined$apply$lambda$2 r3 = new ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassDetailFragment$onViewCreated$$inlined$apply$lambda$2
            r3.<init>(r1, r0)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r1.setOnClickListener(r3)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            ru.unicorn.ujin.view.activity.BaseActivity r1 = r16.getBaseActivity()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.setToolbarRight(r3)
            goto L_0x0161
        L_0x0114:
            int r1 = p035ru.unicorn.C5619R.C5622id.tvStatus
            android.view.View r1 = r0._$_findCachedViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
            r6 = 2131886177(0x7f120061, float:1.9406925E38)
            java.lang.String r6 = r0.getString(r6)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r1.setText(r6)
            int r1 = p035ru.unicorn.C5619R.C5622id.btnCopy
            android.view.View r1 = r0._$_findCachedViewById(r1)
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r1 = (p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            r1.setVisibility(r8)
            int r1 = p035ru.unicorn.C5619R.C5622id.btnShare
            android.view.View r1 = r0._$_findCachedViewById(r1)
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r1 = (p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            r1.setVisibility(r8)
            int r1 = p035ru.unicorn.C5619R.C5622id.btnCheckStatus
            android.view.View r1 = r0._$_findCachedViewById(r1)
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r1 = (p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            r1.setVisibility(r7)
            ru.unicorn.ujin.view.activity.BaseActivity r1 = r16.getBaseActivity()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.setToolbarRight(r3)
        L_0x0161:
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r1 = r16.getPassViewModel()
            ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent r1 = r1.showLoader
            androidx.lifecycle.LifecycleOwner r3 = r16.getViewLifecycleOwner()
            ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassDetailFragment$onViewCreated$3 r4 = new ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassDetailFragment$onViewCreated$3
            r4.<init>(r0)
            androidx.lifecycle.Observer r4 = (androidx.lifecycle.Observer) r4
            r1.observe(r3, r4)
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r1 = r16.getPassViewModel()
            ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent r1 = r1.getInviteTextMutableLiveData()
            androidx.lifecycle.LifecycleOwner r3 = r16.getViewLifecycleOwner()
            ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassDetailFragment$onViewCreated$4 r4 = new ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassDetailFragment$onViewCreated$4
            r4.<init>(r0)
            androidx.lifecycle.Observer r4 = (androidx.lifecycle.Observer) r4
            r1.observe(r3, r4)
            boolean r1 = r0.toSavePass
            if (r1 == 0) goto L_0x0192
            r16.showDialogOnCreatedPass()
        L_0x0192:
            int r1 = p035ru.unicorn.C5619R.C5622id.tvPassType
            android.view.View r1 = r0._$_findCachedViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r3 = "tvPassType"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Гость"
            r3.append(r4)
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r4 = r0.passe
            if (r4 != 0) goto L_0x01b0
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x01b0:
            java.util.List r4 = r4.getVehicles()
            if (r4 == 0) goto L_0x01bb
            int r4 = r4.size()
            goto L_0x01bc
        L_0x01bb:
            r4 = 0
        L_0x01bc:
            if (r4 <= 0) goto L_0x01c1
            java.lang.String r4 = "+авто"
            goto L_0x01c3
        L_0x01c1:
            java.lang.String r4 = ""
        L_0x01c3:
            r3.append(r4)
            r4 = 47
            r3.append(r4)
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r4 = r0.passe
            if (r4 != 0) goto L_0x01d2
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x01d2:
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Strategy r4 = r4.getStrategy()
            java.lang.String r4 = r4.getTitle()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r1.setText(r3)
            int r1 = p035ru.unicorn.C5619R.C5622id.llInfo
            android.view.View r1 = r0._$_findCachedViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.removeAllViews()
            ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository$Companion r1 = p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository.Companion
            ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository r1 = r1.getInstance()
            ru.unicorn.ujin.data.realm.profile.User r1 = r1.getUser()
            boolean r1 = r1.isCurrentCommerce()
            java.lang.String r3 = "this.rv"
            java.lang.String r4 = "this.tvTitle"
            java.lang.String r5 = "this"
            r6 = 2131558839(0x7f0d01b7, float:1.8743005E38)
            java.lang.String r9 = "llInfo"
            r11 = 1
            if (r1 == 0) goto L_0x02d9
            int r1 = p035ru.unicorn.C5619R.C5622id.llInfo
            android.view.View r1 = r0._$_findCachedViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            int r12 = p035ru.unicorn.C5619R.C5622id.llInfo
            android.view.View r12 = r0._$_findCachedViewById(r12)
            android.widget.LinearLayout r12 = (android.widget.LinearLayout) r12
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r9)
            android.content.Context r12 = r12.getContext()
            android.view.LayoutInflater r12 = android.view.LayoutInflater.from(r12)
            int r13 = p035ru.unicorn.C5619R.C5622id.llInfo
            android.view.View r13 = r0._$_findCachedViewById(r13)
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            android.view.View r12 = r12.inflate(r6, r13, r8)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r5)
            int r13 = p035ru.unicorn.C5619R.C5622id.tvTitle
            android.view.View r13 = r12.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r4)
            java.lang.String r14 = "Место"
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            r13.setText(r14)
            int r13 = p035ru.unicorn.C5619R.C5622id.f6518rv
            android.view.View r13 = r12.findViewById(r13)
            androidx.recyclerview.widget.RecyclerView r13 = (androidx.recyclerview.widget.RecyclerView) r13
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r3)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo r15 = new ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r10 = r0.passe
            if (r10 != 0) goto L_0x0262
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0262:
            ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany r10 = r10.getEnterprise()
            if (r10 == 0) goto L_0x026d
            java.lang.String r10 = r10.getTitle()
            goto L_0x026e
        L_0x026d:
            r10 = 0
        L_0x026e:
            java.lang.String r7 = "Компания"
            r15.<init>(r7, r10)
            r14.add(r15)
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r7 = r0.passe
            if (r7 != 0) goto L_0x027d
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x027d:
            ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany r7 = r7.getEnterprise()
            if (r7 == 0) goto L_0x02b3
            java.lang.String r7 = r7.getAddress()
            if (r7 == 0) goto L_0x02b3
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            int r7 = r7.length()
            if (r7 <= 0) goto L_0x0293
            r7 = 1
            goto L_0x0294
        L_0x0293:
            r7 = 0
        L_0x0294:
            if (r7 != r11) goto L_0x02b3
            ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo r7 = new ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r10 = r0.passe
            if (r10 != 0) goto L_0x029f
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x029f:
            ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany r10 = r10.getEnterprise()
            if (r10 == 0) goto L_0x02aa
            java.lang.String r10 = r10.getAddress()
            goto L_0x02ab
        L_0x02aa:
            r10 = 0
        L_0x02ab:
            java.lang.String r15 = "Адрес"
            r7.<init>(r15, r10)
            r14.add(r7)
        L_0x02b3:
            ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo r7 = new ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r10 = r0.passe
            if (r10 != 0) goto L_0x02bc
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x02bc:
            java.lang.String r10 = r10.getComment()
            java.lang.String r15 = "Офис"
            r7.<init>(r15, r10)
            r14.add(r7)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            ru.unicorn.ujin.view.fragments.parking.adapters.SlotInfoAdapter r7 = new ru.unicorn.ujin.view.fragments.parking.adapters.SlotInfoAdapter
            r7.<init>(r14)
            androidx.recyclerview.widget.RecyclerView$Adapter r7 = (androidx.recyclerview.widget.RecyclerView.Adapter) r7
            r13.setAdapter(r7)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            r1.addView(r12)
        L_0x02d9:
            int r1 = p035ru.unicorn.C5619R.C5622id.llInfo
            android.view.View r1 = r0._$_findCachedViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            int r7 = p035ru.unicorn.C5619R.C5622id.llInfo
            android.view.View r7 = r0._$_findCachedViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r9)
            android.content.Context r7 = r7.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r10 = p035ru.unicorn.C5619R.C5622id.llInfo
            android.view.View r10 = r0._$_findCachedViewById(r10)
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            android.view.View r7 = r7.inflate(r6, r10, r8)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            int r10 = p035ru.unicorn.C5619R.C5622id.tvTitle
            android.view.View r10 = r7.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r4)
            java.lang.String r12 = "Данные гостя"
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r10.setText(r12)
            int r10 = p035ru.unicorn.C5619R.C5622id.f6518rv
            android.view.View r10 = r7.findViewById(r10)
            androidx.recyclerview.widget.RecyclerView r10 = (androidx.recyclerview.widget.RecyclerView) r10
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r3)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo r13 = new ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r14 = r0.passe
            if (r14 != 0) goto L_0x032e
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x032e:
            java.lang.String r14 = r14.getUser_surname()
            java.lang.String r15 = "Фамилия"
            r13.<init>(r15, r14)
            r12.add(r13)
            ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo r13 = new ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r14 = r0.passe
            if (r14 != 0) goto L_0x0343
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0343:
            java.lang.String r14 = r14.getUser_name()
            java.lang.String r15 = "Имя"
            r13.<init>(r15, r14)
            r12.add(r13)
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r13 = r0.passe
            if (r13 != 0) goto L_0x0356
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0356:
            java.lang.String r13 = r13.getUser_patronymic()
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            int r13 = r13.length()
            if (r13 <= 0) goto L_0x0364
            r13 = 1
            goto L_0x0365
        L_0x0364:
            r13 = 0
        L_0x0365:
            if (r13 == 0) goto L_0x037c
            ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo r13 = new ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r14 = r0.passe
            if (r14 != 0) goto L_0x0370
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0370:
            java.lang.String r14 = r14.getUser_patronymic()
            java.lang.String r15 = "Отчество"
            r13.<init>(r15, r14)
            r12.add(r13)
        L_0x037c:
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r13 = r0.passe
            if (r13 != 0) goto L_0x0383
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0383:
            java.lang.String r13 = r13.getUser_phone()
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            int r13 = r13.length()
            if (r13 <= 0) goto L_0x0391
            r13 = 1
            goto L_0x0392
        L_0x0391:
            r13 = 0
        L_0x0392:
            if (r13 == 0) goto L_0x03a9
            ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo r13 = new ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r14 = r0.passe
            if (r14 != 0) goto L_0x039d
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x039d:
            java.lang.String r14 = r14.getUser_phone()
            java.lang.String r15 = "Телефон"
            r13.<init>(r15, r14)
            r12.add(r13)
        L_0x03a9:
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r13 = r0.passe
            if (r13 != 0) goto L_0x03b0
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x03b0:
            java.lang.String r13 = r13.getUser_email()
            if (r13 == 0) goto L_0x03d8
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            int r13 = r13.length()
            if (r13 <= 0) goto L_0x03c0
            r13 = 1
            goto L_0x03c1
        L_0x03c0:
            r13 = 0
        L_0x03c1:
            if (r13 != r11) goto L_0x03d8
            ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo r13 = new ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r14 = r0.passe
            if (r14 != 0) goto L_0x03cc
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x03cc:
            java.lang.String r14 = r14.getUser_email()
            java.lang.String r15 = "E-mail"
            r13.<init>(r15, r14)
            r12.add(r13)
        L_0x03d8:
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r13 = r0.passe
            if (r13 != 0) goto L_0x03df
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x03df:
            java.lang.String r13 = r13.getUser_company_name()
            if (r13 == 0) goto L_0x0407
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            int r13 = r13.length()
            if (r13 <= 0) goto L_0x03ef
            r13 = 1
            goto L_0x03f0
        L_0x03ef:
            r13 = 0
        L_0x03f0:
            if (r13 != r11) goto L_0x0407
            ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo r13 = new ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r14 = r0.passe
            if (r14 != 0) goto L_0x03fb
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x03fb:
            java.lang.String r14 = r14.getUser_company_name()
            java.lang.String r15 = "Место работы"
            r13.<init>(r15, r14)
            r12.add(r13)
        L_0x0407:
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r13 = r0.passe
            if (r13 != 0) goto L_0x040e
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x040e:
            java.lang.String r13 = r13.getUser_company()
            if (r13 == 0) goto L_0x0420
            ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo r14 = new ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo
            java.lang.String r15 = "Компания"
            r14.<init>(r15, r13)
            r12.add(r14)
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
        L_0x0420:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            ru.unicorn.ujin.view.fragments.parking.adapters.SlotInfoAdapter r13 = new ru.unicorn.ujin.view.fragments.parking.adapters.SlotInfoAdapter
            r13.<init>(r12)
            androidx.recyclerview.widget.RecyclerView$Adapter r13 = (androidx.recyclerview.widget.RecyclerView.Adapter) r13
            r10.setAdapter(r13)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            r1.addView(r7)
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r1 = r0.passe
            if (r1 != 0) goto L_0x0438
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0438:
            java.util.List r1 = r1.getIdentity_documents()
            if (r1 == 0) goto L_0x0443
            int r1 = r1.size()
            goto L_0x0444
        L_0x0443:
            r1 = 0
        L_0x0444:
            java.lang.String r7 = "yyyy-MM-dd"
            if (r1 > 0) goto L_0x0463
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r1 = r0.passe
            if (r1 != 0) goto L_0x044f
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x044f:
            java.lang.String r1 = r1.getUser_birthday()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x0460
            boolean r1 = kotlin.text.StringsKt.isBlank(r1)
            if (r1 == 0) goto L_0x045e
            goto L_0x0460
        L_0x045e:
            r1 = 0
            goto L_0x0461
        L_0x0460:
            r1 = 1
        L_0x0461:
            if (r1 != 0) goto L_0x05b6
        L_0x0463:
            int r1 = p035ru.unicorn.C5619R.C5622id.llInfo
            android.view.View r1 = r0._$_findCachedViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            int r10 = p035ru.unicorn.C5619R.C5622id.llInfo
            android.view.View r10 = r0._$_findCachedViewById(r10)
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r9)
            android.content.Context r10 = r10.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            int r12 = p035ru.unicorn.C5619R.C5622id.llInfo
            android.view.View r12 = r0._$_findCachedViewById(r12)
            android.widget.LinearLayout r12 = (android.widget.LinearLayout) r12
            android.view.View r10 = r10.inflate(r6, r12, r8)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r5)
            int r12 = p035ru.unicorn.C5619R.C5622id.tvTitle
            android.view.View r12 = r10.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r4)
            java.lang.String r13 = "Удостоверение личности"
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            r12.setText(r13)
            int r12 = p035ru.unicorn.C5619R.C5622id.f6518rv
            android.view.View r12 = r10.findViewById(r12)
            androidx.recyclerview.widget.RecyclerView r12 = (androidx.recyclerview.widget.RecyclerView) r12
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r3)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r14 = r0.passe
            if (r14 != 0) goto L_0x04b6
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x04b6:
            java.lang.String r14 = r14.getUser_birthday()
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            if (r14 == 0) goto L_0x04c7
            boolean r14 = kotlin.text.StringsKt.isBlank(r14)
            if (r14 == 0) goto L_0x04c5
            goto L_0x04c7
        L_0x04c5:
            r14 = 0
            goto L_0x04c8
        L_0x04c7:
            r14 = 1
        L_0x04c8:
            if (r14 != 0) goto L_0x04f2
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r14 = r0.passe
            if (r14 != 0) goto L_0x04d1
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x04d1:
            java.lang.String r14 = r14.getUser_birthday()
            java.util.Calendar r14 = p035ru.unicorn.ujin.util.DateUtils.parseDate(r14, r7)
            ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo r15 = new ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo
            java.text.SimpleDateFormat r6 = r0.dateFormat
            java.lang.String r11 = "calendar"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r11)
            java.util.Date r11 = r14.getTime()
            java.lang.String r6 = r6.format(r11)
            java.lang.String r11 = "Дата рождения"
            r15.<init>(r11, r6)
            r13.add(r15)
        L_0x04f2:
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r6 = r0.passe
            if (r6 != 0) goto L_0x04f9
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x04f9:
            java.util.List r6 = r6.getIdentity_documents()
            if (r6 == 0) goto L_0x050c
            java.lang.Object r6 = kotlin.collections.CollectionsKt.getOrNull(r6, r8)
            ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument r6 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument) r6
            if (r6 == 0) goto L_0x050c
            java.lang.String r6 = r6.getNumber()
            goto L_0x050d
        L_0x050c:
            r6 = 0
        L_0x050d:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L_0x051a
            boolean r6 = kotlin.text.StringsKt.isBlank(r6)
            if (r6 == 0) goto L_0x0518
            goto L_0x051a
        L_0x0518:
            r6 = 0
            goto L_0x051b
        L_0x051a:
            r6 = 1
        L_0x051b:
            if (r6 != 0) goto L_0x0542
            ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo r6 = new ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r11 = r0.passe
            if (r11 != 0) goto L_0x0526
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0526:
            java.util.List r11 = r11.getIdentity_documents()
            if (r11 == 0) goto L_0x0539
            java.lang.Object r11 = r11.get(r8)
            ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument r11 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument) r11
            if (r11 == 0) goto L_0x0539
            java.lang.String r11 = r11.getNumber()
            goto L_0x053a
        L_0x0539:
            r11 = 0
        L_0x053a:
            java.lang.String r14 = "Паспорт"
            r6.<init>(r14, r11)
            r13.add(r6)
        L_0x0542:
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r6 = r0.passe
            if (r6 != 0) goto L_0x0549
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0549:
            java.util.List r6 = r6.getIdentity_documents()
            if (r6 == 0) goto L_0x055c
            java.lang.Object r6 = kotlin.collections.CollectionsKt.getOrNull(r6, r8)
            ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument r6 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument) r6
            if (r6 == 0) goto L_0x055c
            java.lang.String r6 = r6.getIssuedDate()
            goto L_0x055d
        L_0x055c:
            r6 = 0
        L_0x055d:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L_0x056a
            boolean r6 = kotlin.text.StringsKt.isBlank(r6)
            if (r6 == 0) goto L_0x0568
            goto L_0x056a
        L_0x0568:
            r6 = 0
            goto L_0x056b
        L_0x056a:
            r6 = 1
        L_0x056b:
            if (r6 != 0) goto L_0x05a5
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r6 = r0.passe
            if (r6 != 0) goto L_0x0574
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0574:
            java.util.List r6 = r6.getIdentity_documents()
            if (r6 == 0) goto L_0x0587
            java.lang.Object r6 = r6.get(r8)
            ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument r6 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument) r6
            if (r6 == 0) goto L_0x0587
            java.lang.String r6 = r6.getIssuedDate()
            goto L_0x0588
        L_0x0587:
            r6 = 0
        L_0x0588:
            java.util.Calendar r6 = p035ru.unicorn.ujin.util.DateUtils.parseDate(r6, r7)
            ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo r11 = new ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo
            java.text.SimpleDateFormat r14 = r0.dateFormat
            java.lang.String r15 = "calendar"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r15)
            java.util.Date r6 = r6.getTime()
            java.lang.String r6 = r14.format(r6)
            java.lang.String r14 = "Выдан"
            r11.<init>(r14, r6)
            r13.add(r11)
        L_0x05a5:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            ru.unicorn.ujin.view.fragments.parking.adapters.SlotInfoAdapter r6 = new ru.unicorn.ujin.view.fragments.parking.adapters.SlotInfoAdapter
            r6.<init>(r13)
            androidx.recyclerview.widget.RecyclerView$Adapter r6 = (androidx.recyclerview.widget.RecyclerView.Adapter) r6
            r12.setAdapter(r6)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            r1.addView(r10)
        L_0x05b6:
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r1 = r0.passe
            if (r1 != 0) goto L_0x05bd
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x05bd:
            java.util.List r1 = r1.getVehicles()
            if (r1 == 0) goto L_0x06cf
            r6 = r1
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            r10 = 1
            r6 = r6 ^ r10
            if (r6 == 0) goto L_0x06cd
            int r6 = p035ru.unicorn.C5619R.C5622id.llInfo
            android.view.View r6 = r0._$_findCachedViewById(r6)
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            int r10 = p035ru.unicorn.C5619R.C5622id.llInfo
            android.view.View r10 = r0._$_findCachedViewById(r10)
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r9)
            android.content.Context r10 = r10.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            int r11 = p035ru.unicorn.C5619R.C5622id.llInfo
            android.view.View r11 = r0._$_findCachedViewById(r11)
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            r12 = 2131558839(0x7f0d01b7, float:1.8743005E38)
            android.view.View r10 = r10.inflate(r12, r11, r8)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r5)
            int r11 = p035ru.unicorn.C5619R.C5622id.tvTitle
            android.view.View r11 = r10.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r4)
            java.lang.String r12 = "Автомобиль"
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r11.setText(r12)
            int r11 = p035ru.unicorn.C5619R.C5622id.f6518rv
            android.view.View r11 = r10.findViewById(r11)
            androidx.recyclerview.widget.RecyclerView r11 = (androidx.recyclerview.widget.RecyclerView) r11
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r3)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.lang.Object r13 = r1.get(r8)
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Vehicle r13 = (p035ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Vehicle) r13
            java.lang.String r13 = r13.getBrand()
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            if (r13 == 0) goto L_0x0634
            boolean r13 = kotlin.text.StringsKt.isBlank(r13)
            if (r13 == 0) goto L_0x0632
            goto L_0x0634
        L_0x0632:
            r13 = 0
            goto L_0x0635
        L_0x0634:
            r13 = 1
        L_0x0635:
            if (r13 != 0) goto L_0x064b
            ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo r13 = new ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo
            java.lang.Object r14 = r1.get(r8)
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Vehicle r14 = (p035ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Vehicle) r14
            java.lang.String r14 = r14.getBrand()
            java.lang.String r15 = "Марка"
            r13.<init>(r15, r14)
            r12.add(r13)
        L_0x064b:
            java.lang.Object r13 = r1.get(r8)
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Vehicle r13 = (p035ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Vehicle) r13
            java.lang.String r13 = r13.getId_number()
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            if (r13 == 0) goto L_0x0662
            boolean r13 = kotlin.text.StringsKt.isBlank(r13)
            if (r13 == 0) goto L_0x0660
            goto L_0x0662
        L_0x0660:
            r13 = 0
            goto L_0x0663
        L_0x0662:
            r13 = 1
        L_0x0663:
            if (r13 != 0) goto L_0x0679
            ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo r13 = new ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo
            java.lang.Object r1 = r1.get(r8)
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Vehicle r1 = (p035ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Vehicle) r1
            java.lang.String r1 = r1.getId_number()
            java.lang.String r14 = "Номер"
            r13.<init>(r14, r1)
            r12.add(r13)
        L_0x0679:
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r1 = r0.passe
            if (r1 != 0) goto L_0x0680
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0680:
            ru.unicorn.ujin.view.fragments.parking.response.ParkingSlot r1 = r1.getSlot()
            if (r1 == 0) goto L_0x068b
            java.lang.String r1 = r1.getNumber()
            goto L_0x068c
        L_0x068b:
            r1 = 0
        L_0x068c:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x0699
            boolean r1 = kotlin.text.StringsKt.isBlank(r1)
            if (r1 == 0) goto L_0x0697
            goto L_0x0699
        L_0x0697:
            r1 = 0
            goto L_0x069a
        L_0x0699:
            r1 = 1
        L_0x069a:
            if (r1 != 0) goto L_0x06bc
            ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo r1 = new ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r13 = r0.passe
            if (r13 != 0) goto L_0x06a5
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x06a5:
            ru.unicorn.ujin.view.fragments.parking.response.ParkingSlot r13 = r13.getSlot()
            if (r13 == 0) goto L_0x06b2
            java.lang.String r13 = r13.getNumber()
            if (r13 == 0) goto L_0x06b2
            goto L_0x06b4
        L_0x06b2:
            java.lang.String r13 = ""
        L_0x06b4:
            java.lang.String r14 = "Парковочное место"
            r1.<init>(r14, r13)
            r12.add(r1)
        L_0x06bc:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            ru.unicorn.ujin.view.fragments.parking.adapters.SlotInfoAdapter r1 = new ru.unicorn.ujin.view.fragments.parking.adapters.SlotInfoAdapter
            r1.<init>(r12)
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = (androidx.recyclerview.widget.RecyclerView.Adapter) r1
            r11.setAdapter(r1)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            r6.addView(r10)
        L_0x06cd:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x06cf:
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r1 = r0.passe
            if (r1 != 0) goto L_0x06d6
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x06d6:
            java.util.List r1 = r1.getVehicles()
            if (r1 == 0) goto L_0x06e1
            int r1 = r1.size()
            goto L_0x06e2
        L_0x06e1:
            r1 = 0
        L_0x06e2:
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r1 = r0.passe
            if (r1 != 0) goto L_0x06e9
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x06e9:
            java.lang.Boolean r1 = r1.getWith_stuff()
            r10 = 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r10)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r6)
            if (r1 == 0) goto L_0x0709
            int r1 = p035ru.unicorn.C5619R.C5622id.ivTmcBox
            android.view.View r1 = r0._$_findCachedViewById(r1)
            androidx.appcompat.widget.AppCompatImageView r1 = (androidx.appcompat.widget.AppCompatImageView) r1
            java.lang.String r6 = "ivTmcBox"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
            r1.setVisibility(r8)
            goto L_0x071b
        L_0x0709:
            int r1 = p035ru.unicorn.C5619R.C5622id.ivTmcBox
            android.view.View r1 = r0._$_findCachedViewById(r1)
            androidx.appcompat.widget.AppCompatImageView r1 = (androidx.appcompat.widget.AppCompatImageView) r1
            java.lang.String r6 = "ivTmcBox"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
            r6 = 8
            r1.setVisibility(r6)
        L_0x071b:
            int r1 = p035ru.unicorn.C5619R.C5622id.llInfo
            android.view.View r1 = r0._$_findCachedViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            int r6 = p035ru.unicorn.C5619R.C5622id.llInfo
            android.view.View r6 = r0._$_findCachedViewById(r6)
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r9)
            android.content.Context r6 = r6.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            int r9 = p035ru.unicorn.C5619R.C5622id.llInfo
            android.view.View r9 = r0._$_findCachedViewById(r9)
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r11 = 2131558839(0x7f0d01b7, float:1.8743005E38)
            android.view.View r6 = r6.inflate(r11, r9, r8)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            int r5 = p035ru.unicorn.C5619R.C5622id.tvTitle
            android.view.View r5 = r6.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            java.lang.String r4 = "Время действия"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r5.setText(r4)
            int r4 = p035ru.unicorn.C5619R.C5622id.f6518rv
            android.view.View r4 = r6.findViewById(r4)
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r5 = r0.passe
            if (r5 != 0) goto L_0x0771
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0771:
            java.lang.String r5 = r5.getActive_from()
            java.util.Calendar r5 = p035ru.unicorn.ujin.util.DateUtils.parseDate(r5, r7)
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r9 = r0.passe
            if (r9 != 0) goto L_0x0780
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0780:
            java.lang.String r9 = r9.getActive_to()
            java.util.Calendar r7 = p035ru.unicorn.ujin.util.DateUtils.parseDate(r9, r7)
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r9 = r0.passe
            if (r9 != 0) goto L_0x078f
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x078f:
            java.lang.String r9 = r9.getActive_from()
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r11 = r0.passe
            if (r11 != 0) goto L_0x079a
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x079a:
            java.lang.String r11 = r11.getActive_to()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r11)
            if (r9 == 0) goto L_0x07be
            ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo r7 = new ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo
            java.text.SimpleDateFormat r9 = r0.dateFormat
            java.lang.String r11 = "calendarStart"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r11)
            java.util.Date r5 = r5.getTime()
            java.lang.String r5 = r9.format(r5)
            java.lang.String r9 = "Дата"
            r7.<init>(r9, r5)
            r3.add(r7)
            goto L_0x07f0
        L_0x07be:
            ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo r9 = new ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo
            java.text.SimpleDateFormat r11 = r0.dateFormat
            java.lang.String r12 = "calendarStart"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r12)
            java.util.Date r5 = r5.getTime()
            java.lang.String r5 = r11.format(r5)
            java.lang.String r11 = "Дата с"
            r9.<init>(r11, r5)
            r3.add(r9)
            ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo r5 = new ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo
            java.text.SimpleDateFormat r9 = r0.dateFormat
            java.lang.String r11 = "calendarEnd"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r11)
            java.util.Date r7 = r7.getTime()
            java.lang.String r7 = r9.format(r7)
            java.lang.String r9 = "Дата до"
            r5.<init>(r9, r7)
            r3.add(r5)
        L_0x07f0:
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r5 = r0.passe
            if (r5 != 0) goto L_0x07f7
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x07f7:
            java.lang.String r5 = r5.getWork_time_from()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            if (r5 == 0) goto L_0x0808
            boolean r5 = kotlin.text.StringsKt.isBlank(r5)
            if (r5 == 0) goto L_0x0806
            goto L_0x0808
        L_0x0806:
            r5 = 0
            goto L_0x0809
        L_0x0808:
            r5 = 1
        L_0x0809:
            if (r5 != 0) goto L_0x0857
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r5 = r0.passe
            if (r5 != 0) goto L_0x0812
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0812:
            java.lang.String r5 = r5.getWork_time_to()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            if (r5 == 0) goto L_0x0820
            boolean r5 = kotlin.text.StringsKt.isBlank(r5)
            if (r5 == 0) goto L_0x0821
        L_0x0820:
            r8 = 1
        L_0x0821:
            if (r8 != 0) goto L_0x0857
            ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo r5 = new ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r8 = r0.passe
            if (r8 != 0) goto L_0x0831
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0831:
            java.lang.String r8 = r8.getWork_time_from()
            r7.append(r8)
            java.lang.String r8 = " - "
            r7.append(r8)
            ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r8 = r0.passe
            if (r8 != 0) goto L_0x0844
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0844:
            java.lang.String r2 = r8.getWork_time_to()
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            java.lang.String r7 = "Время работы"
            r5.<init>(r7, r2)
            r3.add(r5)
        L_0x0857:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            ru.unicorn.ujin.view.fragments.parking.adapters.SlotInfoAdapter r2 = new ru.unicorn.ujin.view.fragments.parking.adapters.SlotInfoAdapter
            r2.<init>(r3)
            androidx.recyclerview.widget.RecyclerView$Adapter r2 = (androidx.recyclerview.widget.RecyclerView.Adapter) r2
            r4.setAdapter(r2)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            r1.addView(r6)
            int r1 = p035ru.unicorn.C5619R.C5622id.btnCopy
            android.view.View r1 = r0._$_findCachedViewById(r1)
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r1 = (p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton) r1
            ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassDetailFragment$onViewCreated$10 r2 = new ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassDetailFragment$onViewCreated$10
            r2.<init>(r0)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
            int r1 = p035ru.unicorn.C5619R.C5622id.btnShare
            android.view.View r1 = r0._$_findCachedViewById(r1)
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r1 = (p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton) r1
            ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassDetailFragment$onViewCreated$11 r2 = new ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassDetailFragment$onViewCreated$11
            r2.<init>(r0)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassDetailFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void showDialogOnCreatedPass() {
        new AlertDialog.Builder(getBaseActivity()).setTitle((int) R.string.label_create_pass_confirm).setMessage((int) R.string.label_create_pass_message).setPositiveButton((int) R.string.ok, (DialogInterface.OnClickListener) AnotherPassDetailFragment$showDialogOnCreatedPass$1.INSTANCE).show();
    }

    private final void showDialogOnWaitingPass() {
        new AlertDialog.Builder(getBaseActivity()).setTitle((int) R.string.anotherPassWaiting).setMessage((int) R.string.label_create_pass_message).setPositiveButton((int) R.string.ok, (DialogInterface.OnClickListener) AnotherPassDetailFragment$showDialogOnWaitingPass$1.INSTANCE).show();
    }

    private final void showDialogOnCreatePass() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intrinsics.checkNotNullExpressionValue(activity, "it");
            MaterialDialog customView$default = DialogCustomViewExtKt.customView$default(new MaterialDialog(activity, (DialogBehavior) null, 2, (DefaultConstructorMarker) null), Integer.valueOf(R.layout.dialog_bran_bg), (View) null, false, false, false, false, 62, (Object) null);
            View view = customView$default.getView();
            ((TextView) view.findViewById(C5619R.C5622id.close)).setOnClickListener(new AnotherPassDetailFragment$showDialogOnCreatePass$1$1(customView$default));
            ((TextView) view.findViewById(C5619R.C5622id.share)).setOnClickListener(new C5998x83049556(customView$default, this));
            customView$default.show();
        }
    }

    /* access modifiers changed from: private */
    public final void handleInviteText(UpdateEvent updateEvent) {
        if (!updateEvent.getSuccess()) {
            showMessage(updateEvent.getMessage());
        } else if (this.justCopy) {
            ClipboardManager clipboardManager = (ClipboardManager) ContextCompat.getSystemService(requireContext(), ClipboardManager.class);
            ClipData newPlainText = ClipData.newPlainText("Пропуск", updateEvent.getMessage());
            Intrinsics.checkNotNullExpressionValue(newPlainText, "ClipData.newPlainText(\n …message\n                )");
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(newPlainText);
            }
            showMessage("Данные пропуска скопированы в буфер обмена, вы можете отправить их гостю любым удобным для вас способом.");
        } else {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(HTTP.PLAIN_TEXT_TYPE);
            intent.putExtra("android.intent.extra.TEXT", updateEvent.getMessage());
            Unit unit = Unit.INSTANCE;
            startActivity(Intent.createChooser(intent, "Поделиться с помощью"));
        }
    }

    /* access modifiers changed from: private */
    public final void handlePassGet(Resource<AnotherPassResponse> resource) {
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.pbLoading);
        Intrinsics.checkNotNullExpressionValue(progressBar, "pbLoading");
        progressBar.setVisibility(8);
        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnCheckStatus);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "btnCheckStatus");
        dynamicBackgroundButton.setEnabled(true);
        Resource.Status status = resource.getStatus();
        if (status != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                showMessage(resource.getMessage());
            } else if (i == 2) {
                String slug = resource.getData().getPass().getState().getSlug();
                if (slug.hashCode() == 1116313165 && slug.equals("waiting")) {
                    TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvStatus);
                    Intrinsics.checkNotNullExpressionValue(textView, "tvStatus");
                    textView.setText(getString(R.string.anotherPassWaiting));
                    DynamicBackgroundButton dynamicBackgroundButton2 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnCopy);
                    Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton2, "btnCopy");
                    dynamicBackgroundButton2.setVisibility(8);
                    DynamicBackgroundButton dynamicBackgroundButton3 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnShare);
                    Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton3, "btnShare");
                    dynamicBackgroundButton3.setVisibility(8);
                    DynamicBackgroundButton dynamicBackgroundButton4 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnCheckStatus);
                    Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton4, "btnCheckStatus");
                    dynamicBackgroundButton4.setVisibility(0);
                    showDialogOnWaitingPass();
                    return;
                }
                TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvStatus);
                Intrinsics.checkNotNullExpressionValue(textView2, "tvStatus");
                textView2.setText(getString(R.string.anotherPassActive));
                DynamicBackgroundButton dynamicBackgroundButton5 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnCheckStatus);
                Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton5, "btnCheckStatus");
                dynamicBackgroundButton5.setVisibility(8);
                DynamicBackgroundButton dynamicBackgroundButton6 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnCopy);
                Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton6, "btnCopy");
                dynamicBackgroundButton6.setVisibility(0);
                DynamicBackgroundButton dynamicBackgroundButton7 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnShare);
                Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton7, "btnShare");
                dynamicBackgroundButton7.setVisibility(0);
                showDialogOnCreatePass();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void getPassInviteText() {
        AnotherPassViewModel passViewModel = getPassViewModel();
        Passe passe2 = this.passe;
        if (passe2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("passe");
        }
        passViewModel.requestText(passe2.getId());
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/fragments/AnotherPassDetailFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/anotherPass/fragments/AnotherPassDetailFragment;", "passe", "Lru/unicorn/ujin/view/fragments/anotherPass/response/passList/Passe;", "toSavePass", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassDetailFragment$Companion */
    /* compiled from: AnotherPassDetailFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final AnotherPassDetailFragment newInstance(Passe passe, boolean z) {
            Intrinsics.checkNotNullParameter(passe, "passe");
            AnotherPassDetailFragment anotherPassDetailFragment = new AnotherPassDetailFragment();
            anotherPassDetailFragment.passe = passe;
            anotherPassDetailFragment.setToSavePass(z);
            return anotherPassDetailFragment;
        }
    }
}
