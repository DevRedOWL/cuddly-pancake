package p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints.custom.osnova;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.databinding.FragmentGateBinding;
import p035ru.unicorn.ujin.data.realm.Camera;
import p035ru.unicorn.ujin.data.realm.Point;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints.GatesViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseBindingFragment;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.customViews.MjpegView;
import p035ru.unicorn.ujin.view.extensions.ExtensionKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001'B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0015H\u0016J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0013J\b\u0010\u001c\u001a\u00020\u0017H\u0016J\b\u0010\u001d\u001a\u00020\u0017H\u0016J\b\u0010\u001e\u001a\u00020\u0017H\u0016J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\rH\u0016J\u0012\u0010!\u001a\u00020\u00172\b\u0010\"\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\rH\u0002J\b\u0010&\u001a\u00020\u0017H\u0002R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006("}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/alertpoints/custom/osnova/ListOfGateFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseBindingFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/alertpoints/GatesViewModel;", "Lru/unicorn/databinding/FragmentGateBinding;", "Lru/unicorn/ujin/view/customViews/MjpegView$OnStartStream;", "()V", "point", "Lru/unicorn/ujin/data/realm/Point;", "getPoint", "()Lru/unicorn/ujin/data/realm/Point;", "setPoint", "(Lru/unicorn/ujin/data/realm/Point;)V", "sendRequest", "", "getSendRequest", "()Z", "setSendRequest", "(Z)V", "getLayoutRes", "", "getMyToolbarTitle", "", "initView", "", "onFileChoose", "filePath", "onOpenClick", "id", "onPause", "onResume", "onStreamNotStarting", "onStreamStarted", "showLoading", "onViewCreated", "viewModell", "startPreview", "videourl", "showPreview", "subscribeOnEvents", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.custom.osnova.ListOfGateFragment */
/* compiled from: ListOfGateFragment.kt */
public final class ListOfGateFragment extends BaseBindingFragment<GatesViewModel, FragmentGateBinding> implements MjpegView.OnStartStream {
    /* access modifiers changed from: private */
    public static final String ARG_POSITION = "arg_position_gate";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    private Point point;
    private boolean sendRequest;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.custom.osnova.ListOfGateFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[Resource.Status.LOADING.ordinal()] = 1;
            $EnumSwitchMapping$0[Resource.Status.ERROR.ordinal()] = 2;
            $EnumSwitchMapping$0[Resource.Status.SUCCESS.ordinal()] = 3;
        }
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
        return R.layout.fragment_gate;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onFileChoose(String str) {
        Intrinsics.checkNotNullParameter(str, "filePath");
    }

    public void onStreamNotStarting() {
    }

    public final Point getPoint() {
        return this.point;
    }

    public final void setPoint(Point point2) {
        this.point = point2;
    }

    public final boolean getSendRequest() {
        return this.sendRequest;
    }

    public final void setSendRequest(boolean z) {
        this.sendRequest = z;
    }

    public void onResume() {
        Camera camera;
        String videourl;
        super.onResume();
        Point point2 = this.point;
        if (point2 != null && (camera = point2.getCamera()) != null && (videourl = camera.getVideourl()) != null) {
            startPreview(videourl, true);
        }
    }

    public void onPause() {
        Camera camera;
        String videourl;
        Point point2 = this.point;
        if (!(point2 == null || (camera = point2.getCamera()) == null || (videourl = camera.getVideourl()) == null)) {
            startPreview(videourl, false);
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onViewCreated(GatesViewModel gatesViewModel) {
        setNeedResetToolbar(false);
        initView();
        subscribeOnEvents();
    }

    private final void subscribeOnEvents() {
        String str;
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString(ARG_POSITION)) == null) {
            str = "0";
        }
        MutableLiveData<List<Point>> mutableLiveData = ((GatesViewModel) getViewModell()).points;
        Intrinsics.checkNotNullExpressionValue(mutableLiveData, "viewModell.points");
        ExtensionKt.observe((Fragment) this, mutableLiveData, new ListOfGateFragment$subscribeOnEvents$1(this, str));
        SingleLiveEvent<Resource<Void>> onSendCommand = ((GatesViewModel) getViewModell()).onSendCommand();
        Intrinsics.checkNotNullExpressionValue(onSendCommand, "viewModell.onSendCommand()");
        ExtensionKt.observe((Fragment) this, onSendCommand, new ListOfGateFragment$subscribeOnEvents$2(this));
    }

    private final void initView() {
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.open)).setOnClickListener(new ListOfGateFragment$initView$1(this));
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.close)).setOnClickListener(new ListOfGateFragment$initView$2(this));
        ((CardView) _$_findCachedViewById(C5619R.C5622id.f6510cv)).setOnClickListener(new ListOfGateFragment$initView$3(this));
    }

    public final void onOpenClick(int i) {
        this.sendRequest = true;
        ((GatesViewModel) getViewModell()).sendAction(i);
    }

    /* access modifiers changed from: private */
    public final void startPreview(String str, boolean z) {
        if (z) {
            MjpegView mjpegView = (MjpegView) _$_findCachedViewById(C5619R.C5622id.mjpegView);
            Intrinsics.checkNotNullExpressionValue(mjpegView, "mjpegView");
            mjpegView.setMode(1);
            MjpegView mjpegView2 = (MjpegView) _$_findCachedViewById(C5619R.C5622id.mjpegView);
            Intrinsics.checkNotNullExpressionValue(mjpegView2, "mjpegView");
            mjpegView2.setAdjustHeight(true);
            ((MjpegView) _$_findCachedViewById(C5619R.C5622id.mjpegView)).setOnStartStream(this);
            ((MjpegView) _$_findCachedViewById(C5619R.C5622id.mjpegView)).setUrl(str);
            ((MjpegView) _$_findCachedViewById(C5619R.C5622id.mjpegView)).startStream();
            return;
        }
        ((MjpegView) _$_findCachedViewById(C5619R.C5622id.mjpegView)).stopStream();
        ((MjpegView) _$_findCachedViewById(C5619R.C5622id.mjpegView)).setBitmap((Bitmap) null);
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        String string = getString(R.string.label_permisson);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_permisson)");
        return string;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/alertpoints/custom/osnova/ListOfGateFragment$Companion;", "", "()V", "ARG_POSITION", "", "start", "Lru/unicorn/ujin/view/activity/navigation/ui/alertpoints/custom/osnova/ListOfGateFragment;", "id", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.custom.osnova.ListOfGateFragment$Companion */
    /* compiled from: ListOfGateFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ListOfGateFragment start(String str) {
            Intrinsics.checkNotNullParameter(str, "id");
            Bundle bundle = new Bundle();
            bundle.putString(ListOfGateFragment.ARG_POSITION, str);
            ListOfGateFragment listOfGateFragment = new ListOfGateFragment();
            listOfGateFragment.setArguments(bundle);
            return listOfGateFragment;
        }
    }

    public void onStreamStarted(boolean z) {
        BaseActivity baseActivity = getBaseActivity();
        if (baseActivity != null) {
            baseActivity.runOnUiThread(new ListOfGateFragment$onStreamStarted$1(this, z));
        }
    }
}
