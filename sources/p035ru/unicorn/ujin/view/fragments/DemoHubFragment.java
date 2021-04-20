package p035ru.unicorn.ujin.view.fragments;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import com.loopj.android.http.JsonHttpResponseHandler;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0004H\u0014J,\u0010\u001a\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u0018H\u0016J\u001a\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010&\u001a\u00020\u0018H\u0002J\b\u0010'\u001a\u00020\u0018H\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\b¨\u0006)"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/DemoHubFragment;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "()V", "complexId", "", "getComplexId", "()Ljava/lang/String;", "setComplexId", "(Ljava/lang/String;)V", "demo2ResponseHandler", "Lcom/loopj/android/http/JsonHttpResponseHandler;", "getDemo2ResponseHandler", "()Lcom/loopj/android/http/JsonHttpResponseHandler;", "demo3ResponseHandler", "getDemo3ResponseHandler", "demoLoginUrl", "getDemoLoginUrl", "flatId", "getFlatId", "setFlatId", "flatUid", "getFlatUid", "setFlatUid", "handleDemoLogout", "", "metricsScreenName", "onCreateView", "Landroid/view/View;", "kotlin.jvm.PlatformType", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onViewCreated", "view", "proceedToStage", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.DemoHubFragment */
/* compiled from: DemoHubFragment.kt */
public final class DemoHubFragment extends BaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    private String complexId;
    private final JsonHttpResponseHandler demo2ResponseHandler = new DemoHubFragment$demo2ResponseHandler$1(this);
    private final JsonHttpResponseHandler demo3ResponseHandler = new DemoHubFragment$demo3ResponseHandler$1(this);
    private final String demoLoginUrl = "https://api-product.mysmartflat.ru/api/auth/authenticate/?login=demo&password=demo";
    private String flatId;
    private String flatUid;

    @JvmStatic
    public static final DemoHubFragment newInstance(String str, String str2, String str3) {
        return Companion.newInstance(str, str2, str3);
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
        return "Деморежим";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final String getFlatUid() {
        return this.flatUid;
    }

    public final void setFlatUid(String str) {
        this.flatUid = str;
    }

    public final String getComplexId() {
        return this.complexId;
    }

    public final void setComplexId(String str) {
        this.complexId = str;
    }

    public final String getFlatId() {
        return this.flatId;
    }

    public final void setFlatId(String str) {
        this.flatId = str;
    }

    public final String getDemoLoginUrl() {
        return this.demoLoginUrl;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitleAccent("Деморежим");
        getBaseActivity().hideBottomNavigation();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_demo_hub, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        int i = getBaseActivity().flavor.isStage2Enabled() ? 0 : 8;
        TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvDemoTitle);
        Intrinsics.checkNotNullExpressionValue(textView, "tvDemoTitle");
        textView.setVisibility(i);
        TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvDemo2nd);
        Intrinsics.checkNotNullExpressionValue(textView2, "tvDemo2nd");
        textView2.setVisibility(i);
        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnDemo2nd);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "btnDemo2nd");
        dynamicBackgroundButton.setVisibility(i);
        ((TextView) _$_findCachedViewById(C5619R.C5622id.tvDemoExit)).setOnClickListener(new DemoHubFragment$onViewCreated$1(this));
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnDemo2nd)).setOnClickListener(new DemoHubFragment$onViewCreated$2(this));
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnDemo3rd)).setOnClickListener(new DemoHubFragment$onViewCreated$3(this));
    }

    public final JsonHttpResponseHandler getDemo3ResponseHandler() {
        return this.demo3ResponseHandler;
    }

    public final JsonHttpResponseHandler getDemo2ResponseHandler() {
        return this.demo2ResponseHandler;
    }

    public void onResume() {
        super.onResume();
        int demoStage = getBaseActivity().profileViewModel.getDemoStage();
        if (demoStage == 2) {
            ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnDemo2nd)).setType(DynamicBackgroundButton.Type.PRIMARY);
            ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnDemo3rd)).setType(DynamicBackgroundButton.Type.NOT_ACTIVE);
            TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvDemoExit);
            Intrinsics.checkNotNullExpressionValue(textView, "tvDemoExit");
            textView.setVisibility(0);
            TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvDemoLogoutHint);
            Intrinsics.checkNotNullExpressionValue(textView2, "tvDemoLogoutHint");
            textView2.setVisibility(0);
            getBaseActivity().setToolbarLeft(ToolbarButtons.NONE);
        } else if (demoStage != 3) {
            ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnDemo2nd)).setType(DynamicBackgroundButton.Type.NOT_ACTIVE);
            ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnDemo3rd)).setType(DynamicBackgroundButton.Type.NOT_ACTIVE);
            TextView textView3 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvDemoExit);
            Intrinsics.checkNotNullExpressionValue(textView3, "tvDemoExit");
            textView3.setVisibility(8);
            TextView textView4 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvDemoLogoutHint);
            Intrinsics.checkNotNullExpressionValue(textView4, "tvDemoLogoutHint");
            textView4.setVisibility(8);
            getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        } else {
            ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnDemo2nd)).setType(DynamicBackgroundButton.Type.NOT_ACTIVE);
            ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnDemo3rd)).setType(DynamicBackgroundButton.Type.PRIMARY);
            TextView textView5 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvDemoExit);
            Intrinsics.checkNotNullExpressionValue(textView5, "tvDemoExit");
            textView5.setVisibility(0);
            TextView textView6 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvDemoLogoutHint);
            Intrinsics.checkNotNullExpressionValue(textView6, "tvDemoLogoutHint");
            textView6.setVisibility(0);
            getBaseActivity().setToolbarLeft(ToolbarButtons.NONE);
        }
    }

    public final void handleDemoLogout() {
        new AlertDialog.Builder(requireContext()).setTitle((CharSequence) "Выйти из деморежима?").setMessage((CharSequence) "Действия, которые вы совершили в деморежиме, не сохранятся.").setPositiveButton((CharSequence) "Выход", (DialogInterface.OnClickListener) new DemoHubFragment$handleDemoLogout$1(this)).setNegativeButton((CharSequence) "Отмена", (DialogInterface.OnClickListener) DemoHubFragment$handleDemoLogout$2.INSTANCE).show();
    }

    /* access modifiers changed from: private */
    public final void proceedToStage() {
        int stage = ProfileLocalRepository.Companion.getInstance().getUser().getStage();
        if (stage == AppStage.NEW_FLAT.getStageNum()) {
            getBaseActivity().startStageOne();
        } else if (stage == AppStage.COMPLEX_CONSTRUCTION.getStageNum()) {
            getBaseActivity().startStageTwo(false);
        } else if (stage == AppStage.SMARTFLAT.getStageNum()) {
            getBaseActivity().startStageThree(getBaseActivity().flavor.getStage3DefaultScreen(), false);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/DemoHubFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/DemoHubFragment;", "flatUid", "", "complexId", "flatId", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.DemoHubFragment$Companion */
    /* compiled from: DemoHubFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final DemoHubFragment newInstance(String str, String str2, String str3) {
            DemoHubFragment demoHubFragment = new DemoHubFragment();
            demoHubFragment.setFlatUid(str);
            demoHubFragment.setComplexId(str2);
            demoHubFragment.setFlatId(str3);
            return demoHubFragment;
        }
    }
}
