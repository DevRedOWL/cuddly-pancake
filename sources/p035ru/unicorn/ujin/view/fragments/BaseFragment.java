package p035ru.unicorn.ujin.view.fragments;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import butterknife.Unbinder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.MainApplication;
import p035ru.unicorn.ujin.data.api.response.SplashscreenResponse;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.Splashscreen;
import p035ru.unicorn.ujin.metrics.MetricsKeys;
import p035ru.unicorn.ujin.util.AppUtils;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.fragments.reactSmartFlat.ReactSmartFlatFragment;
import p035ru.unicorn.ujin.viewModel.RealmViewModel;
import p046io.reactivex.disposables.CompositeDisposable;

/* renamed from: ru.unicorn.ujin.view.fragments.BaseFragment */
public abstract class BaseFragment extends Fragment {
    private AlertDialog alertDialog;
    public CompositeDisposable disposable = new CompositeDisposable();
    @Nullable
    private FragmentListener listener;
    private Boolean needResetToolbar = true;

    /* renamed from: pb */
    public ProgressBar f6913pb;
    Unbinder unbinder;
    public RealmViewModel viewModel;

    /* renamed from: ru.unicorn.ujin.view.fragments.BaseFragment$FragmentListener */
    public interface FragmentListener {
        void onBackFragment();

        void onBackFragment(BaseFragment baseFragment);

        void onFinish(String str);

        void onNextFragment(Fragment fragment, boolean z, String str);

        void pop();

        void popFragment();

        void popTo(String str);

        void setTitle(CharSequence charSequence);
    }

    /* access modifiers changed from: protected */
    public abstract String metricsScreenName();

    /* access modifiers changed from: protected */
    public void showImageToolbar() {
    }

    /* access modifiers changed from: protected */
    public void showLog(String str, String str2) {
    }

    /* access modifiers changed from: protected */
    public abstract void showToolbar();

    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("TAG", "XXX Fragment " + getClass().getName());
        try {
            this.listener = getBaseActivity();
        } catch (ClassCastException unused) {
            throw new ClassCastException();
        }
    }

    public void onDetach() {
        super.onDetach();
        this.listener = null;
    }

    public void onStart() {
        super.onStart();
        MainApplication.mContext = getContext();
    }

    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public BaseActivity getBaseActivity() {
        return (BaseActivity) getActivity();
    }

    /* access modifiers changed from: protected */
    public RealmViewModel getViewModel() {
        return this.viewModel;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.viewModel = getBaseActivity().getViewModel();
    }

    public void onResume() {
        super.onResume();
        if (this.needResetToolbar.booleanValue() && (getArguments() == null || getArguments().getInt("arg_position") != 6)) {
            getBaseActivity().resetToolbarAndNavigation();
            showToolbar();
            if (getBaseActivity().profileViewModel.getDemoStage() > 0 && getBaseActivity().flavor.isStage1Enabled() && !(this instanceof DemoHubFragment)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(initDemoExitButton());
                if (getBaseActivity().hasToolbarRight()) {
                    getBaseActivity().addToolbarRight(arrayList);
                } else {
                    getBaseActivity().setToolbarRight(arrayList);
                }
            }
            getBaseActivity().getCurrentApartment();
            if (!getBaseActivity().hasBottomSheet() || (this instanceof DemoHubFragment)) {
                getBaseActivity().llBottomSheet.setVisibility(8);
                getBaseActivity().mainFrame.setPadding(0, 0, 0, 0);
            } else {
                getBaseActivity().llBottomSheet.setVisibility(0);
                getBaseActivity().mainFrame.setPadding(0, 0, 0, AppUtils.dpToPx(getContext(), 35));
            }
            if (this instanceof ReactSmartFlatFragment) {
                getBaseActivity().mainFrame.setLayoutParams(new CoordinatorLayout.LayoutParams(-1, -1));
                getBaseActivity().mainFrame.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    public void onGlobalLayout() {
                        if (BaseFragment.this.getBaseActivity() != null && BaseFragment.this.getBaseActivity().mainFrame != null) {
                            BaseFragment.this.getBaseActivity().mainFrame.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                            BaseFragment.this.getBaseActivity().mainFrame.setLayoutParams(new CoordinatorLayout.LayoutParams(-1, BaseFragment.this.getBaseActivity().mainFrame.getMeasuredHeight()));
                        }
                    }
                });
            } else {
                getBaseActivity().mainFrame.setLayoutParams(new CoordinatorLayout.LayoutParams(-1, -1));
            }
        }
        if (getBaseActivity().keyboardVehicleMask.getVisibility() == 0) {
            getBaseActivity().hideSoftKeyboard(getBaseActivity());
        }
    }

    /* access modifiers changed from: protected */
    public View initDemoExitButton() {
        TextView textView = (TextView) LayoutInflater.from(getBaseActivity()).inflate(R.layout.item_toolbar_black_button, getBaseActivity().llButtonsRight, false);
        textView.setText(R.string.demoExit);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_cross_main, 0, 0, 0);
        textView.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                BaseFragment.this.lambda$initDemoExitButton$0$BaseFragment(view);
            }
        });
        return textView;
    }

    public /* synthetic */ void lambda$initDemoExitButton$0$BaseFragment(View view) {
        getBaseActivity().finish();
    }

    /* renamed from: ru.unicorn.ujin.view.fragments.BaseFragment$2 */
    static /* synthetic */ class C59942 {
        static final /* synthetic */ int[] $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status = new int[Resource.Status.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                ru.unicorn.ujin.data.realm.Resource$Status[] r0 = p035ru.unicorn.ujin.data.realm.Resource.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status = r0
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x0014 }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.LOADING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x001f }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.SUCCESS     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x002a }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.ERROR     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.BaseFragment.C59942.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void handleSplashScreen(Resource<SplashscreenResponse> resource) {
        int i;
        ArrayList<Splashscreen> splashscreenList;
        if (resource != null && getBaseActivity().needToShowDefaultToolbar() && (i = C59942.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()]) != 1) {
            if (i == 2) {
                if (!(resource.getData() == null || (splashscreenList = resource.getData().getSplashscreenList()) == null || splashscreenList.isEmpty())) {
                    getBaseActivity().loadImageTitle(splashscreenList.get(0));
                }
                if (resource.getData() == null || resource.getData().getSplashscreenList() == null || resource.getData().getSplashscreenList().isEmpty() || StringUtils.isBlank(resource.getData().getSplashscreenList().get(0).getToolbarUrl())) {
                    getBaseActivity().profileViewModel.setSplashScreenLoaded(true);
                    showImageToolbar();
                }
            } else if (i == 3) {
                getBaseActivity().profileViewModel.setSplashScreenLoaded(true);
                showImageToolbar();
            }
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getBaseActivity().profileViewModel.getSplashscreenListLiveData().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                BaseFragment.this.handleSplashScreen((Resource) obj);
            }
        });
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void nextFragment(Fragment fragment, boolean z, String str) {
        FragmentListener fragmentListener = this.listener;
        if (fragmentListener != null) {
            fragmentListener.onNextFragment(fragment, z, str);
        }
    }

    public void nextFragment(Fragment fragment, boolean z) {
        nextFragment(fragment, z, "");
    }

    public void nextFragmentWithoutStack(Fragment fragment, boolean z, ArrayList<String> arrayList) {
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            removeFragmentFromBackStack(it.next());
        }
        nextFragment(fragment, z);
    }

    public void nextFragmentWithoutStack(Fragment fragment, boolean z, ArrayList<String> arrayList, String str) {
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            removeFragmentFromBackStack(it.next());
        }
        nextFragment(fragment, z, str);
    }

    public void popFragment() {
        FragmentListener fragmentListener = this.listener;
        if (fragmentListener != null) {
            fragmentListener.popFragment();
        }
    }

    public void finishActivity(String str, boolean z) {
        FragmentListener fragmentListener = this.listener;
        if (fragmentListener != null) {
            fragmentListener.onFinish(str);
        }
    }

    public void pop() {
        FragmentListener fragmentListener = this.listener;
        if (fragmentListener != null) {
            fragmentListener.pop();
        }
    }

    public void popTo(String str) {
        FragmentListener fragmentListener = this.listener;
        if (fragmentListener != null) {
            fragmentListener.popTo(str);
        }
    }

    public void backFragment() {
        FragmentListener fragmentListener = this.listener;
        if (fragmentListener != null) {
            fragmentListener.onBackFragment();
        }
    }

    public void backFragment(BaseFragment baseFragment) {
        FragmentListener fragmentListener = this.listener;
        if (fragmentListener != null) {
            fragmentListener.onBackFragment(baseFragment);
        }
    }

    public void removeFragmentFromBackStack(String str) {
        if (getBaseActivity().getSupportFragmentManager().findFragmentByTag(str) != null) {
            getBaseActivity().getSupportFragmentManager().popBackStack(str, 1);
        }
    }

    public void onDestroyView() {
        Unbinder unbinder2 = this.unbinder;
        if (unbinder2 != null) {
            unbinder2.unbind();
        }
        CompositeDisposable compositeDisposable = this.disposable;
        if (compositeDisposable != null) {
            compositeDisposable.clear();
        }
        super.onDestroyView();
    }

    /* access modifiers changed from: protected */
    public void showLoader(Boolean bool, ProgressBar progressBar) {
        if (progressBar != null && bool != null) {
            progressBar.setVisibility(bool.booleanValue() ? 0 : 4);
        }
    }

    /* access modifiers changed from: protected */
    public void showMessage(String str) {
        getBaseActivity().showMessage(str);
    }

    /* access modifiers changed from: protected */
    public void showMessage(int i) {
        getBaseActivity().showMessage(i);
    }

    /* access modifiers changed from: protected */
    public HashMap<String, Object> getBaseMetricsPayload() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(MetricsKeys.userId.getValue(), Long.valueOf(ProfileLocalRepository.Companion.getInstance().getUser().getId()));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public void setNeedResetToolbar(Boolean bool) {
        this.needResetToolbar = bool;
    }

    /* access modifiers changed from: protected */
    public void showErrorMessage(String str) {
        AlertDialog alertDialog2 = this.alertDialog;
        if (alertDialog2 == null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setMessage((CharSequence) str).setPositiveButton((CharSequence) getResources().getString(R.string.button_OK), (DialogInterface.OnClickListener) $$Lambda$BaseFragment$kEdoaccvgrJDOa0UUSHVJj96s.INSTANCE);
            this.alertDialog = builder.create();
        } else {
            alertDialog2.setMessage(str);
        }
        if (!this.alertDialog.isShowing()) {
            this.alertDialog.show();
            this.alertDialog.setCanceledOnTouchOutside(false);
        }
    }
}
