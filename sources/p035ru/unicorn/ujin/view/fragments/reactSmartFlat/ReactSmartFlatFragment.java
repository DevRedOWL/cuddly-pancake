package p035ru.unicorn.ujin.view.fragments.reactSmartFlat;

import android.app.Application;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.LifecycleState;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.MainApplication;
import p035ru.unicorn.ujin.ReactConst;
import p035ru.unicorn.ujin.ReactEventCallback;
import p035ru.unicorn.ujin.data.profile.ProfileViewModel;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.profile.Apartment;
import p035ru.unicorn.ujin.metrics.MetricsFacade;
import p035ru.unicorn.ujin.util.Flavors;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 82\u00020\u00012\u00020\u0002:\u00018B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001e\u001a\u00020\u0005H\u0016J\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000f2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\b\u0010$\u001a\u00020 H\u0002J\b\u0010%\u001a\u00020\u000fH\u0014J\u0010\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020(H\u0016J$\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00101\u001a\u00020 H\u0016J\b\u00102\u001a\u00020 H\u0016J\b\u00103\u001a\u00020 H\u0016J\b\u00104\u001a\u00020 H\u0016J\u001a\u00105\u001a\u00020 2\u0006\u00106\u001a\u00020*2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00107\u001a\u00020 H\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX.¢\u0006\u0002\n\u0000¨\u00069"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/reactSmartFlat/ReactSmartFlatFragment;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "Lcom/facebook/react/ReactApplication;", "()V", "mReactNativeHost", "Lcom/facebook/react/ReactNativeHost;", "getMReactNativeHost", "()Lcom/facebook/react/ReactNativeHost;", "setMReactNativeHost", "(Lcom/facebook/react/ReactNativeHost;)V", "mediaPlayer", "Landroid/media/MediaPlayer;", "getMediaPlayer", "()Landroid/media/MediaPlayer;", "mp3", "", "getMp3", "()Ljava/lang/String;", "setMp3", "(Ljava/lang/String;)V", "profileViewModel", "Lru/unicorn/ujin/data/profile/ProfileViewModel;", "getProfileViewModel", "()Lru/unicorn/ujin/data/profile/ProfileViewModel;", "setProfileViewModel", "(Lru/unicorn/ujin/data/profile/ProfileViewModel;)V", "reactEventCallback", "Lru/unicorn/ujin/ReactEventCallback;", "reactInstanceManager", "Lcom/facebook/react/ReactInstanceManager;", "getReactNativeHost", "handleEvent", "", "reason", "map", "Lcom/facebook/react/bridge/ReadableMap;", "handleExitEvent", "metricsScreenName", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onDetach", "onPause", "onResume", "onViewCreated", "view", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.reactSmartFlat.ReactSmartFlatFragment */
/* compiled from: ReactSmartFlatFragment.kt */
public final class ReactSmartFlatFragment extends BaseFragment implements ReactApplication {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    private ReactNativeHost mReactNativeHost;
    private final MediaPlayer mediaPlayer = new MediaPlayer();
    private String mp3;
    public ProfileViewModel profileViewModel;
    /* access modifiers changed from: private */
    public ReactEventCallback reactEventCallback;
    private ReactInstanceManager reactInstanceManager;

    @JvmStatic
    public static final ReactSmartFlatFragment newInstance(String str) {
        return Companion.newInstance(str);
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
        return "reactSmartFlat";
    }

    public static final /* synthetic */ ReactEventCallback access$getReactEventCallback$p(ReactSmartFlatFragment reactSmartFlatFragment) {
        ReactEventCallback reactEventCallback2 = reactSmartFlatFragment.reactEventCallback;
        if (reactEventCallback2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reactEventCallback");
        }
        return reactEventCallback2;
    }

    public final ProfileViewModel getProfileViewModel() {
        ProfileViewModel profileViewModel2 = this.profileViewModel;
        if (profileViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("profileViewModel");
        }
        return profileViewModel2;
    }

    public final void setProfileViewModel(ProfileViewModel profileViewModel2) {
        Intrinsics.checkNotNullParameter(profileViewModel2, "<set-?>");
        this.profileViewModel = profileViewModel2;
    }

    public final MediaPlayer getMediaPlayer() {
        return this.mediaPlayer;
    }

    public final String getMp3() {
        return this.mp3;
    }

    public final void setMp3(String str) {
        this.mp3 = str;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().hideToolbar();
        if (Intrinsics.areEqual((Object) "kortros", (Object) Flavors.LAKEWOOD)) {
            getBaseActivity().hideBottomNavigation();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_react, viewGroup, false);
        Intrinsics.checkNotNull(inflate);
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ViewModel viewModel = ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(ProfileViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel, "ViewModelProviders.of(th…ileViewModel::class.java)");
        this.profileViewModel = (ProfileViewModel) viewModel;
        this.reactEventCallback = new ReactSmartFlatFragment$onViewCreated$1(this);
        ReactInstanceManager reactInstanceManager2 = getReactNativeHost().getReactInstanceManager();
        Intrinsics.checkNotNullExpressionValue(reactInstanceManager2, "reactNativeHost.reactInstanceManager");
        this.reactInstanceManager = reactInstanceManager2;
        ReactRootView reactRootView = (ReactRootView) _$_findCachedViewById(C5619R.C5622id.rootView);
        ReactInstanceManager reactInstanceManager3 = this.reactInstanceManager;
        if (reactInstanceManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reactInstanceManager");
        }
        reactRootView.startReactApplication(reactInstanceManager3, "kortros", (Bundle) null);
    }

    public final ReactNativeHost getMReactNativeHost() {
        return this.mReactNativeHost;
    }

    public final void setMReactNativeHost(ReactNativeHost reactNativeHost) {
        this.mReactNativeHost = reactNativeHost;
    }

    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        Application application = activity != null ? activity.getApplication() : null;
        if (application != null) {
            ((MainApplication) application).reactFragment = this;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.MainApplication");
    }

    public void onDetach() {
        super.onDetach();
        FragmentActivity activity = getActivity();
        Application application = activity != null ? activity.getApplication() : null;
        if (application != null) {
            ((MainApplication) application).reactFragment = null;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.MainApplication");
    }

    public ReactNativeHost getReactNativeHost() {
        FragmentActivity activity = getActivity();
        this.mReactNativeHost = new ReactSmartFlatFragment$getReactNativeHost$1(this, activity != null ? activity.getApplication() : null);
        ReactNativeHost reactNativeHost = this.mReactNativeHost;
        if (reactNativeHost != null) {
            return reactNativeHost;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.facebook.react.ReactNativeHost");
    }

    public void onDestroyView() {
        ReactInstanceManager reactInstanceManager2;
        ReactRootView reactRootView = (ReactRootView) _$_findCachedViewById(C5619R.C5622id.rootView);
        if (reactRootView != null) {
            reactRootView.unmountReactApplication();
        }
        ReactNativeHost reactNativeHost = this.mReactNativeHost;
        if (!(reactNativeHost == null || !reactNativeHost.hasInstance() || (reactInstanceManager2 = reactNativeHost.getReactInstanceManager()) == null || reactInstanceManager2.getLifecycleState() == LifecycleState.RESUMED)) {
            reactInstanceManager2.onHostDestroy(getActivity());
            reactNativeHost.clear();
        }
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onPause() {
        ReactInstanceManager reactInstanceManager2;
        ReactNativeHost reactNativeHost = this.mReactNativeHost;
        if (!(reactNativeHost == null || (reactInstanceManager2 = reactNativeHost.getReactInstanceManager()) == null)) {
            reactInstanceManager2.onHostPause(getBaseActivity());
        }
        super.onPause();
    }

    public void onResume() {
        ReactInstanceManager reactInstanceManager2;
        super.onResume();
        ReactNativeHost reactNativeHost = this.mReactNativeHost;
        if (reactNativeHost != null && (reactInstanceManager2 = reactNativeHost.getReactInstanceManager()) != null) {
            reactInstanceManager2.onHostResume(getBaseActivity(), getBaseActivity());
        }
    }

    /* access modifiers changed from: private */
    public final void handleEvent(String str, ReadableMap readableMap) {
        Object obj = null;
        switch (str.hashCode()) {
            case -2123207647:
                if (str.equals(ReactConst.EXIT_DEMO)) {
                    getBaseActivity().finish();
                    return;
                }
                return;
            case -1905196798:
                if (str.equals(ReactConst.PLAY_AUDIO)) {
                    JSONObject jSONObject = null;
                    if (readableMap != null) {
                        try {
                            jSONObject = new JSONObject(readableMap.toString());
                        } catch (JSONException e) {
                            e.printStackTrace();
                            return;
                        }
                    }
                    JSONObject jSONObject2 = jSONObject != null ? jSONObject.getJSONObject("NativeMap") : null;
                    this.mp3 = jSONObject2 != null ? jSONObject2.getString("argument") : null;
                    Uri parse = Uri.parse(this.mp3);
                    this.mediaPlayer.reset();
                    try {
                        FragmentActivity activity = getActivity();
                        if (activity != null) {
                            this.mediaPlayer.setDataSource(activity, parse);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    FragmentActivity activity2 = getActivity();
                    if (activity2 != null) {
                        obj = activity2.getSystemService("audio");
                    }
                    AudioManager audioManager = (AudioManager) obj;
                    if (audioManager == null || audioManager.getStreamVolume(3) != 0) {
                        this.mediaPlayer.setAudioStreamType(3);
                        this.mediaPlayer.setLooping(false);
                        try {
                            this.mediaPlayer.prepare();
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                        this.mediaPlayer.start();
                        return;
                    }
                    return;
                }
                return;
            case -1774127679:
                if (str.equals(ReactConst.HIDE_MENU)) {
                    getBaseActivity().runOnUiThread(new ReactSmartFlatFragment$handleEvent$6(this));
                    return;
                }
                return;
            case -1176828268:
                if (str.equals(ReactConst.NATIVE_BACK)) {
                    getBaseActivity().rnBackPressed();
                    return;
                }
                return;
            case -1081306052:
                if (!str.equals(ReactConst.MARKET)) {
                    return;
                }
                if (getBaseActivity().needToShowBottomNavigation()) {
                    getBaseActivity().openMarketFromReact = true;
                    getBaseActivity().runOnUiThread(new ReactSmartFlatFragment$handleEvent$5(this));
                    return;
                }
                getBaseActivity().showUrl(getResources().getString(R.string.url_ujin_marketplace));
                return;
            case -339042820:
                if (str.equals(ReactConst.SHOW_MENU)) {
                    getBaseActivity().runOnUiThread(new ReactSmartFlatFragment$handleEvent$7(this));
                    return;
                }
                return;
            case -309425751:
                if (str.equals("profile")) {
                    getBaseActivity().showProfile((String) null);
                    return;
                }
                return;
            case 689798866:
                if (str.equals(ReactConst.NEW_CONTRACT)) {
                    handleExitEvent();
                    return;
                }
                return;
            case 1165961623:
                if (str.equals(ReactConst.MAIN_SCREEN_BACK_PRESS)) {
                    getBaseActivity().reactMainScreenBackPressed();
                    return;
                }
                return;
            case 2038902134:
                if (str.equals(ReactConst.OTHER_FLAT)) {
                    Intrinsics.checkNotNull(readableMap);
                    String string = readableMap.getString("argument");
                    ProfileViewModel profileViewModel2 = this.profileViewModel;
                    if (profileViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("profileViewModel");
                    }
                    RealmList<Apartment> apartmentList = profileViewModel2.getUser().getApartmentList();
                    Intrinsics.checkNotNull(apartmentList);
                    Iterator<Apartment> it = apartmentList.iterator();
                    while (it.hasNext()) {
                        Apartment next = it.next();
                        Intrinsics.checkNotNullExpressionValue(next, "apartment");
                        Integer id = next.getId();
                        Intrinsics.checkNotNull(id);
                        if (Intrinsics.areEqual((Object) string, (Object) String.valueOf(id.intValue()))) {
                            ProfileLocalRepository profileLocalRepository = MetricsFacade.Companion.getProfileLocalRepository();
                            String userToken = next.getUserToken();
                            Intrinsics.checkNotNullExpressionValue(userToken, "apartment.userToken");
                            Integer stage = next.getStage();
                            Intrinsics.checkNotNull(stage);
                            profileLocalRepository.applyFlat(userToken, stage.intValue());
                            Integer stage2 = next.getStage();
                            if (stage2 != null && stage2.intValue() == 2 && CollectionsKt.listOf("kortros", Flavors.PAN).contains("kortros")) {
                                getBaseActivity().runOnUiThread(new ReactSmartFlatFragment$handleEvent$3(this));
                            } else {
                                Integer stage3 = next.getStage();
                                if (stage3 != null && stage3.intValue() == 3) {
                                    getBaseActivity().runOnUiThread(new ReactSmartFlatFragment$handleEvent$4(this));
                                }
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void handleExitEvent() {
        getBaseActivity().logout();
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/reactSmartFlat/ReactSmartFlatFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/reactSmartFlat/ReactSmartFlatFragment;", "tab", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.reactSmartFlat.ReactSmartFlatFragment$Companion */
    /* compiled from: ReactSmartFlatFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ReactSmartFlatFragment newInstance(String str) {
            Intrinsics.checkNotNullParameter(str, "tab");
            return new ReactSmartFlatFragment();
        }
    }
}
