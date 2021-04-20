package p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.DialogBehavior;
import com.afollestad.materialdialogs.MaterialDialog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.mobileid.Api;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral;
import p035ru.unicorn.ujin.data.realm.Camera;
import p035ru.unicorn.ujin.data.realm.MyBeacon;
import p035ru.unicorn.ujin.data.realm.Point;
import p035ru.unicorn.ujin.data.realm.Points;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.service.location.LocationService;
import p035ru.unicorn.ujin.enums.Flavor;
import p035ru.unicorn.ujin.p057di.koin.KoinData;
import p035ru.unicorn.ujin.util.ServiceHelper;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.MjpegVideoActivity;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.entity.video.VideoDataSaver;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.PassDetailFragment2;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.EmptySection;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p035ru.unicorn.ujin.view.toolbar.ToolbarsHelper;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.processors.PublishProcessor;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 T2\u00020\u0001:\u0001TB\u0005¢\u0006\u0002\u0010\u0002J$\u0010&\u001a\u0014\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0'0\u000b2\b\u0010(\u001a\u0004\u0018\u00010)H\u0002J\b\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020+H\u0002J\b\u0010-\u001a\u00020+H\u0002J\b\u0010.\u001a\u00020+H\u0002J\b\u0010/\u001a\u000200H\u0014J\b\u00101\u001a\u00020+H\u0002J\u001c\u00102\u001a\u00020+2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000bH\u0002J&\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010<\u001a\u00020+H\u0016J-\u0010=\u001a\u00020+2\u0006\u0010>\u001a\u00020\u00042\u000e\u0010?\u001a\n\u0012\u0006\b\u0001\u0012\u0002000@2\u0006\u0010A\u001a\u00020BH\u0016¢\u0006\u0002\u0010CJ\b\u0010D\u001a\u00020+H\u0016J\u0010\u0010E\u001a\u00020+2\u0006\u0010F\u001a\u000200H\u0002J\b\u0010G\u001a\u00020+H\u0016J\u001a\u0010H\u001a\u00020+2\u0006\u0010I\u001a\u0002052\b\u0010:\u001a\u0004\u0018\u00010;H\u0017J\u0018\u0010J\u001a\u00020+2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010'H\u0002J\u0018\u0010K\u001a\u00020+2\u000e\u0010L\u001a\n\u0012\u0004\u0012\u00020N\u0018\u00010MH\u0002J\u0018\u0010O\u001a\u00020+2\u000e\u0010L\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010MH\u0002J\b\u0010P\u001a\u00020+H\u0002J\b\u0010Q\u001a\u00020+H\u0014J\u001c\u0010R\u001a\u00020+2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\b\u0010S\u001a\u00020+H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#XD¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u000e¢\u0006\u0002\n\u0000¨\u0006U"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/alertpoints/GatesFragment;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "()V", "LOCATION_REQUEST_CODE", "", "LOCATION_REQUEST_CODE_FOR_GATE", "adapter", "Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SectionedAdapter;", "central", "Lru/unicorn/ujin/ble/ble_helper_class/BluetoothCentral;", "currentPair", "Lkotlin/Pair;", "Lru/unicorn/ujin/data/realm/Point;", "emptySection", "Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/EmptySection;", "gatesSection", "Lru/unicorn/ujin/view/activity/navigation/ui/alertpoints/GatesSection;", "gatesViewModel", "Lru/unicorn/ujin/view/activity/navigation/ui/alertpoints/GatesViewModel;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "handler$delegate", "Lkotlin/Lazy;", "layoutRes", "getLayoutRes", "()I", "r", "Ljava/lang/Runnable;", "getR", "()Ljava/lang/Runnable;", "rv", "Landroidx/recyclerview/widget/RecyclerView;", "scanTime", "", "wasServiceRunning", "", "calculateData", "", "points", "Lru/unicorn/ujin/data/realm/Points;", "drawSettingIcon", "", "enableBT", "initAdapter", "initBleSearch", "metricsScreenName", "", "onBeaconFound", "onButtonClick", "pair", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onShowVideoClick", "url", "onStop", "onViewCreated", "view", "saveUrl", "sendActionResult", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Ljava/lang/Void;", "showData", "showTimeoutError", "showToolbar", "startSearch", "stopServiceIfNeeded", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.GatesFragment */
/* compiled from: GatesFragment.kt */
public final class GatesFragment extends BaseFragment {
    /* access modifiers changed from: private */
    public static final String ARG_TITLE = "arg_titile";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final int LOCATION_REQUEST_CODE = 51;
    private final int LOCATION_REQUEST_CODE_FOR_GATE = 52;
    private HashMap _$_findViewCache;
    private SectionedAdapter adapter;
    /* access modifiers changed from: private */
    public BluetoothCentral central;
    /* access modifiers changed from: private */
    public Pair<Integer, ? extends Point> currentPair;
    private EmptySection emptySection;
    private GatesSection gatesSection;
    private GatesViewModel gatesViewModel;
    private final Lazy handler$delegate = LazyKt.lazy(GatesFragment$handler$2.INSTANCE);
    private final int layoutRes = R.layout.fragment_gates;

    /* renamed from: r */
    private final Runnable f6741r = new GatesFragment$r$1(this);

    /* renamed from: rv */
    private RecyclerView f6742rv;
    private final long scanTime = PassDetailFragment2.CANCEL_DIALOG_DELAY;
    private boolean wasServiceRunning;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.GatesFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Resource.Status.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[Resource.Status.LOADING.ordinal()] = 1;
            $EnumSwitchMapping$0[Resource.Status.ERROR.ordinal()] = 2;
            $EnumSwitchMapping$0[Resource.Status.SUCCESS.ordinal()] = 3;
            $EnumSwitchMapping$1[Resource.Status.LOADING.ordinal()] = 1;
            $EnumSwitchMapping$1[Resource.Status.SUCCESS.ordinal()] = 2;
            $EnumSwitchMapping$1[Resource.Status.ERROR.ordinal()] = 3;
        }
    }

    /* access modifiers changed from: private */
    public final Handler getHandler() {
        return (Handler) this.handler$delegate.getValue();
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
        return "";
    }

    public final int getLayoutRes() {
        return this.layoutRes;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(this.layoutRes, viewGroup, false);
        this.f6913pb = (ProgressBar) inflate.findViewById(R.id.pb);
        this.f6742rv = (RecyclerView) inflate.findViewById(R.id.rv);
        return inflate;
    }

    public void onResume() {
        String string;
        super.onResume();
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString(ARG_TITLE)) != null) {
            Intrinsics.checkNotNullExpressionValue(string, "it");
            if (string.length() > 0) {
                getBaseActivity().setTextTitle(string);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        PublishProcessor<String> publishProcessor;
        PublishProcessor<Pair<Integer, Point>> onClick;
        MutableLiveData<Resource<Points>> mutableData;
        Intrinsics.checkNotNullParameter(view, "view");
        this.gatesViewModel = (GatesViewModel) ViewModelProviders.m10of((Fragment) this).get(GatesViewModel.class);
        GatesViewModel gatesViewModel2 = this.gatesViewModel;
        if (gatesViewModel2 != null) {
            gatesViewModel2.getActionList(true);
        }
        GatesViewModel gatesViewModel3 = this.gatesViewModel;
        if (!(gatesViewModel3 == null || (mutableData = gatesViewModel3.getMutableData()) == null)) {
            mutableData.observe(getViewLifecycleOwner(), new GatesFragment$onViewCreated$1(this));
        }
        this.adapter = new SectionedAdapter();
        if (this.gatesSection == null) {
            this.gatesSection = new GatesSection();
            GatesSection gatesSection2 = this.gatesSection;
            if (!(gatesSection2 == null || (onClick = gatesSection2.getOnClick()) == null)) {
                onClick.subscribe((Consumer<? super Pair<Integer, Point>>) new GatesFragment$onViewCreated$2(this));
            }
            GatesSection gatesSection3 = this.gatesSection;
            if (!(gatesSection3 == null || (publishProcessor = gatesSection3.showVideo) == null)) {
                publishProcessor.subscribe((Consumer<? super String>) new GatesFragment$onViewCreated$3(this));
            }
        }
        if (this.emptySection == null) {
            this.emptySection = new EmptySection(false, 14);
        }
        SectionedAdapter sectionedAdapter = this.adapter;
        if (sectionedAdapter != null) {
            sectionedAdapter.addSection(this.gatesSection);
        }
        SectionedAdapter sectionedAdapter2 = this.adapter;
        if (sectionedAdapter2 != null) {
            sectionedAdapter2.addSection(this.emptySection);
        }
        initAdapter();
        if (Flavor.Companion.isCurrent(Flavor.MORIONDIGITAL)) {
            this.wasServiceRunning = ServiceHelper.isMyServiceRunning(LocationService.class, getBaseActivity());
            initBleSearch();
        }
    }

    /* access modifiers changed from: private */
    public final void onShowVideoClick(String str) {
        MjpegVideoActivity.Companion companion = MjpegVideoActivity.Companion;
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        getBaseActivity().startActivity(companion.start(baseActivity, str, "", VideoDataSaver.VideoDataType.FROM_GATE_PREVIEW));
    }

    /* access modifiers changed from: private */
    public final void onButtonClick(Pair<Integer, ? extends Point> pair) {
        SingleLiveEvent<Resource<Void>> onSendCommand;
        if (Flavor.Companion.isCurrent(Flavor.MORIONDIGITAL)) {
            BluetoothCentral bluetoothCentral = this.central;
            if (bluetoothCentral != null && !bluetoothCentral.isScanning()) {
                stopServiceIfNeeded();
                this.currentPair = pair;
                startSearch(pair);
            }
        } else {
            GatesViewModel gatesViewModel2 = this.gatesViewModel;
            if (gatesViewModel2 != null) {
                gatesViewModel2.sendAction(pair.getFirst().intValue());
            }
        }
        GatesViewModel gatesViewModel3 = this.gatesViewModel;
        if (gatesViewModel3 != null && (onSendCommand = gatesViewModel3.onSendCommand()) != null) {
            onSendCommand.observe(getViewLifecycleOwner(), new GatesFragment$onButtonClick$1(this));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        r4 = r4.get(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void startSearch(kotlin.Pair<java.lang.Integer, ? extends p035ru.unicorn.ujin.data.realm.Point> r4) {
        /*
            r3 = this;
            ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral r0 = r3.central
            if (r0 == 0) goto L_0x006b
            boolean r1 = r0.isBluetoothEnabled()
            if (r1 == 0) goto L_0x004d
            boolean r1 = r0.permissionsGranted()
            if (r1 == 0) goto L_0x004d
            android.widget.ProgressBar r0 = r3.f6913pb
            java.lang.String r1 = "pb"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = 0
            r0.setVisibility(r1)
            ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral r0 = r3.central
            if (r0 == 0) goto L_0x0041
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object r4 = r4.getSecond()
            ru.unicorn.ujin.data.realm.Point r4 = (p035ru.unicorn.ujin.data.realm.Point) r4
            io.realm.RealmList r4 = r4.getBeacons()
            if (r4 == 0) goto L_0x003b
            java.lang.Object r4 = r4.get(r1)
            ru.unicorn.ujin.data.realm.MyBeacon r4 = (p035ru.unicorn.ujin.data.realm.MyBeacon) r4
            if (r4 == 0) goto L_0x003b
            java.lang.String r4 = r4.getBssid()
            goto L_0x003c
        L_0x003b:
            r4 = 0
        L_0x003c:
            r2[r1] = r4
            r0.scanForPeripheralsWithAddresses(r2)
        L_0x0041:
            android.os.Handler r4 = r3.getHandler()
            java.lang.Runnable r0 = r3.f6741r
            long r1 = r3.scanTime
            r4.postDelayed(r0, r1)
            goto L_0x006b
        L_0x004d:
            boolean r4 = r0.isBluetoothEnabled()
            if (r4 != 0) goto L_0x005e
            ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral r4 = r3.central
            if (r4 == 0) goto L_0x005a
            r4.close()
        L_0x005a:
            r3.enableBT()
            goto L_0x006b
        L_0x005e:
            java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            java.lang.String[] r4 = new java.lang.String[]{r4, r0}
            int r0 = r3.LOCATION_REQUEST_CODE
            r3.requestPermissions(r4, r0)
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints.GatesFragment.startSearch(kotlin.Pair):void");
    }

    /* access modifiers changed from: private */
    public final void sendActionResult(Resource<Void> resource) {
        Resource.Status status;
        if (resource != null && (status = resource.getStatus()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                this.f6913pb.setVisibility(0);
            } else if (i == 2) {
                ProgressBar progressBar = this.f6913pb;
                if (progressBar != null) {
                    progressBar.setVisibility(4);
                }
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            } else if (i == 3) {
                ProgressBar progressBar2 = this.f6913pb;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(4);
                }
                DialogHelper.showDialogWithTimeout(getActivity(), getString(R.string.smartNavDynamicRequestSent));
            }
        }
    }

    private final void initAdapter() {
        RecyclerView recyclerView = this.f6742rv;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        }
        RecyclerView recyclerView2 = this.f6742rv;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.adapter);
        }
    }

    /* access modifiers changed from: private */
    public final void showData(Resource<Points> resource) {
        Resource.Status status;
        if (resource != null && (status = resource.getStatus()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$1[status.ordinal()];
            if (i == 1) {
                this.f6913pb.setVisibility(0);
            } else if (i == 2) {
                this.f6913pb.setVisibility(8);
                Pair<Boolean, List<Point>> calculateData = calculateData(resource.getData());
                EmptySection emptySection2 = this.emptySection;
                if (emptySection2 != null) {
                    emptySection2.show(calculateData.getSecond().isEmpty());
                }
                if (calculateData.getSecond().isEmpty()) {
                    EmptySection emptySection3 = this.emptySection;
                    if (emptySection3 != null) {
                        emptySection3.setData(new SomeString(getResources().getString(R.string.no_points_message)));
                        return;
                    }
                    return;
                }
                GatesSection gatesSection2 = this.gatesSection;
                if (gatesSection2 != null) {
                    gatesSection2.setData(calculateData.getSecond());
                }
                saveUrl(calculateData.getSecond());
                if (calculateData.getFirst().booleanValue() && Flavor.Companion.current().getHasBeaconsSupport()) {
                    drawSettingIcon();
                }
            } else if (i == 3) {
                ProgressBar progressBar = this.f6913pb;
                Intrinsics.checkNotNullExpressionValue(progressBar, "pb");
                progressBar.setVisibility(8);
                AlertDialog.Builder createDialogBuilder = DialogHelper.createDialogBuilder(getActivity(), resource.getMessage());
                createDialogBuilder.setPositiveButton((int) R.string.button_ok, (DialogInterface.OnClickListener) new GatesFragment$showData$1(this));
                createDialogBuilder.create().show();
            }
        }
    }

    private final void saveUrl(List<? extends Point> list) {
        if (list != null) {
            Collection arrayList = new ArrayList();
            for (Point camera : list) {
                Camera camera2 = camera.getCamera();
                if (camera2 != null) {
                    arrayList.add(camera2);
                }
            }
            List list2 = (List) arrayList;
            if (!list2.isEmpty()) {
                BaseActivity baseActivity = getBaseActivity();
                Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
                new VideoDataSaver(baseActivity).saveListOfVideo(list2, VideoDataSaver.VideoDataType.FROM_GATE_PREVIEW);
            }
        }
    }

    private final Pair<Boolean, List<Point>> calculateData(Points points) {
        RealmList<MyBeacon> beacons;
        List arrayList = new ArrayList();
        boolean z = false;
        if (points == null || points.getPoints() == null) {
            return new Pair<>(false, arrayList);
        }
        for (Point next : points.getPoints()) {
            if (next.getHide() == 0) {
                Intrinsics.checkNotNullExpressionValue(next, "point");
                arrayList.add(next);
            }
            if (!z && next != null && (beacons = next.getBeacons()) != null && beacons.size() > 0) {
                z = true;
            }
        }
        return new Pair<>(Boolean.valueOf(z), arrayList);
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        setNeedResetToolbar(false);
        getBaseActivity().setTextTitle(getString(R.string.label_domofon_access));
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
    }

    private final void drawSettingIcon() {
        ArrayList<View> createSingleButton = new ToolbarsHelper(getActivity()).createSingleButton(R.drawable.ic_svg_settings);
        createSingleButton.get(0).setOnClickListener(new GatesFragment$drawSettingIcon$1(this));
        getBaseActivity().setToolbarRight(createSingleButton);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.getApplicationContext();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void initBleSearch() {
        /*
            r5 = this;
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            if (r0 == 0) goto L_0x0022
            android.content.Context r0 = r0.getApplicationContext()
            if (r0 == 0) goto L_0x0022
            ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral r1 = new ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral
            ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.GatesFragment$initBleSearch$$inlined$let$lambda$1 r2 = new ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.GatesFragment$initBleSearch$$inlined$let$lambda$1
            r2.<init>(r5)
            ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentralCallback r2 = (p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentralCallback) r2
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r3.<init>(r4)
            r1.<init>(r0, r2, r3)
            goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            r5.central = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints.GatesFragment.initBleSearch():void");
    }

    /* access modifiers changed from: private */
    public final void onBeaconFound() {
        Integer first;
        Pair<Integer, ? extends Point> pair = this.currentPair;
        if (pair != null && (first = pair.getFirst()) != null) {
            int intValue = first.intValue();
            GatesViewModel gatesViewModel2 = this.gatesViewModel;
            if (gatesViewModel2 != null) {
                gatesViewModel2.sendAction(intValue);
            }
        }
    }

    private final void enableBT() {
        FragmentActivity activity;
        FragmentActivity activity2 = getActivity();
        Object systemService = activity2 != null ? activity2.getSystemService("bluetooth") : null;
        if (systemService != null) {
            BluetoothAdapter adapter2 = ((BluetoothManager) systemService).getAdapter();
            Intrinsics.checkNotNullExpressionValue(adapter2, "bluetoothManager.adapter");
            if (adapter2.isEnabled() || (activity = getActivity()) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue(activity, "it");
            MaterialDialog.negativeButton$default(MaterialDialog.positiveButton$default(MaterialDialog.message$default(MaterialDialog.title$default(new MaterialDialog(activity, (DialogBehavior) null, 2, (DefaultConstructorMarker) null), Integer.valueOf(R.string.dialog_bt_label_error_title), (String) null, 2, (Object) null), Integer.valueOf(R.string.dialog_bt_label_error_message), (CharSequence) null, (Function1) null, 6, (Object) null), Integer.valueOf(R.string.button_enable), (CharSequence) null, new GatesFragment$enableBT$$inlined$let$lambda$1(this), 2, (Object) null), Integer.valueOf(R.string.button_CANCEL), (CharSequence) null, GatesFragment$enableBT$1$2.INSTANCE, 2, (Object) null).show();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.bluetooth.BluetoothManager");
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, "permissions");
        Intrinsics.checkNotNullParameter(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == this.LOCATION_REQUEST_CODE) {
            if (!(iArr.length == 0)) {
                int i2 = iArr[0];
            }
        } else if (i == this.LOCATION_REQUEST_CODE_FOR_GATE) {
            if ((!(iArr.length == 0)) && iArr[0] == 0 && KoinData.INSTANCE.isInit()) {
                Api api = Api.INSTANCE;
                BaseActivity baseActivity = getBaseActivity();
                Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
                Api.requestAccess$default(api, baseActivity, (String) null, 2, (Object) null);
            }
        }
    }

    public final Runnable getR() {
        return this.f6741r;
    }

    /* access modifiers changed from: private */
    public final void showTimeoutError() {
        DialogHelper.showDialog((Context) getActivity(), getString(R.string.label_open_gate_error));
    }

    public void onDestroyView() {
        setNeedResetToolbar(true);
        BluetoothCentral bluetoothCentral = this.central;
        if (bluetoothCentral != null) {
            bluetoothCentral.close();
        }
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onStop() {
        super.onStop();
        getHandler().removeCallbacks(this.f6741r);
        if (this.wasServiceRunning) {
            ServiceHelper.startLocationService(getBaseActivity());
        }
    }

    private final void stopServiceIfNeeded() {
        if (ServiceHelper.isMyServiceRunning(LocationService.class, getBaseActivity())) {
            ServiceHelper.stopLocationService(getBaseActivity());
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/alertpoints/GatesFragment$Companion;", "", "()V", "ARG_TITLE", "", "start", "Lru/unicorn/ujin/view/activity/navigation/ui/alertpoints/GatesFragment;", "title", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.GatesFragment$Companion */
    /* compiled from: GatesFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final GatesFragment start(String str) {
            Intrinsics.checkNotNullParameter(str, "title");
            Bundle bundle = new Bundle();
            bundle.putString(GatesFragment.ARG_TITLE, str);
            GatesFragment gatesFragment = new GatesFragment();
            gatesFragment.setArguments(bundle);
            return gatesFragment;
        }
    }
}
