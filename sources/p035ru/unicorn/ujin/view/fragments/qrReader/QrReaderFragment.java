package p035ru.unicorn.ujin.view.fragments.qrReader;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentActivity;
import com.budiyev.android.codescanner.AutoFocusMode;
import com.budiyev.android.codescanner.CodeScanner;
import com.budiyev.android.codescanner.CodeScannerView;
import com.budiyev.android.codescanner.ScanMode;
import com.karumi.dexter.Dexter;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SimpleViewModel;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0002J\u0006\u0010\u0010\u001a\u00020\fJ\b\u0010\u0011\u001a\u00020\u0012H\u0014J,\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00142\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\fH\u0016J\b\u0010\u001d\u001a\u00020\fH\u0016J\u001a\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010 \u001a\u00020\fH\u0002J\b\u0010!\u001a\u00020\fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006#"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/qrReader/QrReaderFragment;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "()V", "codeScanner", "Lcom/budiyev/android/codescanner/CodeScanner;", "simpleViewModel", "Lru/unicorn/ujin/view/activity/navigation/ui/navigation/SimpleViewModel;", "getSimpleViewModel", "()Lru/unicorn/ujin/view/activity/navigation/ui/navigation/SimpleViewModel;", "simpleViewModel$delegate", "Lkotlin/Lazy;", "handleAction", "", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Ljava/lang/Void;", "initScanner", "metricsScreenName", "", "onCreateView", "Landroid/view/View;", "kotlin.jvm.PlatformType", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onViewCreated", "view", "showApplicationSettings", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.qrReader.QrReaderFragment */
/* compiled from: QrReaderFragment.kt */
public final class QrReaderFragment extends BaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "qrReader";
    public static final String TITLE = "title";
    public static final String URL = "url";
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public CodeScanner codeScanner;
    private final Lazy simpleViewModel$delegate = LazyKt.lazy(new QrReaderFragment$simpleViewModel$2(this));

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.qrReader.QrReaderFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[Resource.Status.LOADING.ordinal()] = 1;
            $EnumSwitchMapping$0[Resource.Status.SUCCESS.ordinal()] = 2;
            $EnumSwitchMapping$0[Resource.Status.ERROR.ordinal()] = 3;
        }
    }

    @JvmStatic
    public static final QrReaderFragment newInstance(String str, String str2) {
        return Companion.newInstance(str, str2);
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

    public final SimpleViewModel getSimpleViewModel() {
        return (SimpleViewModel) this.simpleViewModel$delegate.getValue();
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "QR Reader fragment";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ CodeScanner access$getCodeScanner$p(QrReaderFragment qrReaderFragment) {
        CodeScanner codeScanner2 = qrReaderFragment.codeScanner;
        if (codeScanner2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("codeScanner");
        }
        return codeScanner2;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        String str;
        BaseActivity baseActivity = getBaseActivity();
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("title", getString(R.string.scanQrCode))) == null) {
            str = getString(R.string.scanQrCode);
            Intrinsics.checkNotNullExpressionValue(str, "getString(R.string.scanQrCode)");
        }
        baseActivity.setTextTitle(str);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_scan_qr, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Dexter.withActivity(getActivity()).withPermission("android.permission.CAMERA").withListener(new QrReaderFragment$onViewCreated$1(this)).check();
    }

    public final void initScanner() {
        this.codeScanner = new CodeScanner(requireContext(), (CodeScannerView) _$_findCachedViewById(C5619R.C5622id.scannerView));
        CodeScanner codeScanner2 = this.codeScanner;
        if (codeScanner2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("codeScanner");
        }
        codeScanner2.setCamera(-1);
        CodeScanner codeScanner3 = this.codeScanner;
        if (codeScanner3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("codeScanner");
        }
        codeScanner3.setFormats(CodeScanner.ALL_FORMATS);
        CodeScanner codeScanner4 = this.codeScanner;
        if (codeScanner4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("codeScanner");
        }
        codeScanner4.setAutoFocusMode(AutoFocusMode.SAFE);
        CodeScanner codeScanner5 = this.codeScanner;
        if (codeScanner5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("codeScanner");
        }
        codeScanner5.setScanMode(ScanMode.SINGLE);
        CodeScanner codeScanner6 = this.codeScanner;
        if (codeScanner6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("codeScanner");
        }
        codeScanner6.setAutoFocusEnabled(true);
        CodeScanner codeScanner7 = this.codeScanner;
        if (codeScanner7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("codeScanner");
        }
        codeScanner7.setFlashEnabled(false);
        CodeScanner codeScanner8 = this.codeScanner;
        if (codeScanner8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("codeScanner");
        }
        codeScanner8.setDecodeCallback(new QrReaderFragment$initScanner$1(this));
        CodeScanner codeScanner9 = this.codeScanner;
        if (codeScanner9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("codeScanner");
        }
        codeScanner9.setErrorCallback(QrReaderFragment$initScanner$2.INSTANCE);
        ((CodeScannerView) _$_findCachedViewById(C5619R.C5622id.scannerView)).setOnClickListener(new QrReaderFragment$initScanner$3(this));
    }

    /* access modifiers changed from: private */
    public final void handleAction(Resource<Void> resource) {
        Resource.Status status;
        if (resource != null && (status = resource.getStatus()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            boolean z = false;
            if (i == 1) {
                ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.pBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "pBar");
                progressBar.setVisibility(0);
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.pBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "pBar");
                progressBar2.setVisibility(8);
                Context activity = getActivity();
                String message = resource.getMessage();
                Intrinsics.checkNotNullExpressionValue(message, "resource.message");
                if (message.length() == 0) {
                    z = true;
                }
                DialogHelper.showDialogWithTimeout(activity, z ? getString(R.string.smartNavDynamicRequestSent) : resource.getMessage());
                new Handler().postDelayed(new QrReaderFragment$handleAction$1(this), 2000);
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.pBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "pBar");
                progressBar3.setVisibility(8);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
                CodeScanner codeScanner2 = this.codeScanner;
                if (codeScanner2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("codeScanner");
                }
                codeScanner2.startPreview();
            }
        }
    }

    public void onResume() {
        super.onResume();
        if (this.codeScanner != null) {
            CodeScanner codeScanner2 = this.codeScanner;
            if (codeScanner2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("codeScanner");
            }
            codeScanner2.startPreview();
        }
    }

    /* access modifiers changed from: private */
    public final void showApplicationSettings() {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity);
        Intrinsics.checkNotNullExpressionValue(activity, "activity!!");
        intent.setData(Uri.fromParts("package", activity.getPackageName(), (String) null));
        startActivity(intent);
    }

    public void onPause() {
        if (this.codeScanner != null) {
            CodeScanner codeScanner2 = this.codeScanner;
            if (codeScanner2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("codeScanner");
            }
            codeScanner2.releaseResources();
        }
        super.onPause();
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/qrReader/QrReaderFragment$Companion;", "", "()V", "TAG", "", "TITLE", "URL", "newInstance", "Lru/unicorn/ujin/view/fragments/qrReader/QrReaderFragment;", "title", "url", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.qrReader.QrReaderFragment$Companion */
    /* compiled from: QrReaderFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final QrReaderFragment newInstance(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "title");
            Intrinsics.checkNotNullParameter(str2, "url");
            QrReaderFragment qrReaderFragment = new QrReaderFragment();
            Bundle bundle = new Bundle();
            bundle.putString("title", str);
            bundle.putString("url", str2);
            Unit unit = Unit.INSTANCE;
            qrReaderFragment.setArguments(bundle);
            return qrReaderFragment;
        }
    }
}
