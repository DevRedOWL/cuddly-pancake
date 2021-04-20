package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart;

import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.google.android.material.tabs.TabLayout;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.util.AppUtils;
import p035ru.unicorn.ujin.view.WrapContentGridLayoutManager;
import p035ru.unicorn.ujin.view.WrapContentLinearLayoutManager;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.OnHardwareClick;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.OnSendSignal;
import p035ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.OnScenarioClick;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.ScenarioList;
import p035ru.unicorn.ujin.view.activity.navigation.helper.InternetHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.create.CreateDeviceFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.device.DeviceFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.device.WifiConnectionReceiver;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.section.CustomNotification;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.section.DeviceAndFilterSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.section.DeviceSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.section.IChanngeFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.section.IntellectSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.section.MoreIconsInfo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.section.NotificationSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.section.ProblemSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.radiodialogfragment.RadioDialogFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rooms.RoomsFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_list.ScenarioListFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.ScenarioSettingsFragment;
import p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.MainSmartFragment */
public class MainSmartFragment extends BaseFragment implements OnHardwareClick, OnScenarioClick, OnSendSignal, IChanngeFragment, RadioDialogFragment.DialogListener, IMainSmartFragment {
    @BindView(2131362104)
    Button btnNext;
    private DeviceAndFilterSection deviceAndFilterSection;
    private DeviceSection deviceSection;
    private TabLayout deviceTabs;
    private IntellectSection intellectSection;
    /* access modifiers changed from: private */
    public MainSmartViewModel mainSmartViewModel;
    private NotificationSection notificationSection;
    private ProblemSection problemSection;
    private RadioDialogFragment radioDialogFragment;
    private TabLayout roomsTab;
    @BindView(2131363322)

    /* renamed from: rv */
    RecyclerView f6787rv;
    @BindView(2131363322)
    RecyclerView rv2;
    private ScenarioSection scenarioSection;
    private SectionedAdapter sectionedAdapter;
    private SectionedAdapter sectionedAdapter2;
    private List<Device> udpDevices;
    private WifiConnectionReceiver wifiConnectionReceiver;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_main_smart;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    public void onCancel() {
    }

    public void setFilter() {
    }

    public void showErrorNotification() {
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.f6787rv = (RecyclerView) inflate.findViewById(R.id.rv);
        this.rv2 = (RecyclerView) inflate.findViewById(R.id.rv2);
        this.btnNext = (Button) inflate.findViewById(R.id.btn_next);
        this.roomsTab = (TabLayout) inflate.findViewById(R.id.tab);
        this.deviceTabs = (TabLayout) inflate.findViewById(R.id.tab2);
        this.btnNext.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                MainSmartFragment.this.lambda$onCreateView$0$MainSmartFragment(view);
            }
        });
        return inflate;
    }

    public /* synthetic */ void lambda$onCreateView$0$MainSmartFragment(View view) {
        onNextClick();
    }

    public static MainSmartFragment start() {
        return new MainSmartFragment();
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.PROFILE);
        ArrayList arrayList = new ArrayList();
        ImageView imageView = new ImageView(getActivity());
        imageView.setImageResource(R.drawable.ic_plus);
        arrayList.add(imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                MainSmartFragment.this.lambda$showToolbar$1$MainSmartFragment(view);
            }
        });
        getBaseActivity().setToolbarRight(arrayList);
        getBaseActivity().showImageLogo();
        getBaseActivity().removeToolbarElevation();
    }

    public /* synthetic */ void lambda$showToolbar$1$MainSmartFragment(View view) {
        nextFragment(CreateDeviceFragment.start(1), false);
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.sectionedAdapter = new SectionedAdapter();
        this.sectionedAdapter2 = new SectionedAdapter();
        if (this.problemSection == null) {
            this.problemSection = new ProblemSection();
        }
        if (this.intellectSection == null) {
            this.intellectSection = new IntellectSection();
            this.intellectSection.getOnClick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    MainSmartFragment.this.lambda$onViewCreated$2$MainSmartFragment((String) obj);
                }
            });
        }
        if (this.scenarioSection == null) {
            this.scenarioSection = new ScenarioSection(this);
            this.scenarioSection.getOnClick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    MainSmartFragment.this.changeFragment(((Integer) obj).intValue());
                }
            });
        }
        if (this.deviceAndFilterSection == null) {
            this.deviceAndFilterSection = new DeviceAndFilterSection();
            this.deviceAndFilterSection.getOnClick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    MainSmartFragment.this.onFilterByRoom((String) obj);
                }
            });
        }
        if (this.deviceSection == null) {
            this.deviceSection = new DeviceSection(this, this);
        }
        if (this.notificationSection == null) {
            this.notificationSection = new NotificationSection();
            this.notificationSection.getOnClick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    MainSmartFragment.this.closeNotification((CustomNotification) obj);
                }
            });
        }
        this.sectionedAdapter.addSection(this.intellectSection);
        this.sectionedAdapter.addSection(this.notificationSection);
        this.sectionedAdapter.addSection(this.problemSection);
        this.sectionedAdapter.addSection(this.scenarioSection);
        this.sectionedAdapter2.addSection(this.deviceSection);
        this.mainSmartViewModel = (MainSmartViewModel) ViewModelProviders.m10of((Fragment) this).get(MainSmartViewModel.class);
        this.mainSmartViewModel.getScenario();
        this.mainSmartViewModel.getScenarioMutableData().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                MainSmartFragment.this.showScenario((List) obj);
            }
        });
        this.mainSmartViewModel.getFilterData().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                MainSmartFragment.this.showHardware((List) obj);
            }
        });
        this.mainSmartViewModel.getErrorList().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                MainSmartFragment.this.showError((List) obj);
            }
        });
        this.mainSmartViewModel.getRoomFilterName().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                MainSmartFragment.this.setRoomFilterName((String) obj);
            }
        });
        this.mainSmartViewModel.getHasActiveFilter().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                MainSmartFragment.this.setActiveFilterIcon((String) obj);
            }
        });
        this.mainSmartViewModel.getHardware();
        this.mainSmartViewModel.getHardwareMutableLiveData().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                MainSmartFragment.this.showHardware((List) obj);
            }
        });
        registerWifiBroadcast(true);
        onFilterByRoom(Scenario.ROOMS);
        onFilterByRoom(Scenario.DEVICES);
        initAdapter();
        initAdapter2();
        this.roomsTab.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new TabLayout.OnTabSelectedListener() {
            public void onTabReselected(TabLayout.Tab tab) {
            }

            public void onTabUnselected(TabLayout.Tab tab) {
            }

            public void onTabSelected(TabLayout.Tab tab) {
                String lowerCase = ((TextView) tab.getCustomView()).getText().toString().toLowerCase();
                if (!lowerCase.equals(Rooms.ADD_ROOM) || !tab.isSelected()) {
                    MainSmartFragment.this.mainSmartViewModel.getRoomFilterName().postValue(lowerCase);
                } else {
                    MainSmartFragment.this.nextFragment(RoomsFragment.start(), false);
                }
            }
        });
        this.deviceTabs.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new TabLayout.OnTabSelectedListener() {
            public void onTabReselected(TabLayout.Tab tab) {
            }

            public void onTabSelected(TabLayout.Tab tab) {
                tab.setCustomView((View) MainSmartFragment.this.createView(tab, true));
                MainSmartFragment.this.mainSmartViewModel.getHasActiveFilter().postValue(((TextView) tab.getCustomView()).getText().toString());
            }

            public void onTabUnselected(TabLayout.Tab tab) {
                View customView = tab.getCustomView();
                if (customView != null) {
                    customView.setBackgroundResource(R.color.transparent);
                }
            }
        });
    }

    public /* synthetic */ void lambda$onViewCreated$2$MainSmartFragment(String str) throws Exception {
        nextFragment(RoomsFragment.start(), false);
    }

    /* access modifiers changed from: private */
    public TextView createView(TabLayout.Tab tab, boolean z) {
        TextView textView = (TextView) tab.getCustomView();
        if (textView == null) {
            textView = new TextView(tab.parent.getContext());
            textView.setGravity(17);
            int dpToPx = AppUtils.dpToPx(tab.parent.getContext(), 8);
            textView.setPadding(dpToPx, dpToPx, dpToPx, dpToPx);
            textView.setTextColor(textView.getContext().getResources().getColor(R.color.brandTextPrimary));
        }
        if (tab.getText() != null) {
            textView.setText(AppUtils.firstUpperCase(tab.getText().toString()));
        }
        if (z) {
            textView.setBackgroundResource(R.drawable.tab_background_selector);
        }
        return textView;
    }

    private void initTabs(TabLayout tabLayout, ArrayList<String> arrayList) {
        tabLayout.removeAllTabs();
        for (int i = 0; i < arrayList.size(); i++) {
            TabLayout.Tab newTab = tabLayout.newTab();
            TextView createView = createView(newTab, false);
            createView.setText(AppUtils.firstUpperCase(arrayList.get(i)));
            newTab.setCustomView((View) createView);
            tabLayout.addTab(newTab);
        }
    }

    /* access modifiers changed from: private */
    public void setActiveFilterIcon(String str) {
        this.deviceAndFilterSection.setActive(str);
    }

    /* access modifiers changed from: private */
    public void setRoomFilterName(String str) {
        this.deviceAndFilterSection.setTitle(str, this.mainSmartViewModel.getHasActiveFilter().getValue());
    }

    /* access modifiers changed from: private */
    public void closeNotification(CustomNotification customNotification) {
        this.intellectSection.show(true);
        this.notificationSection.show(false);
    }

    /* access modifiers changed from: private */
    public void showError(List<MoreIconsInfo> list) {
        this.problemSection.setData(list);
    }

    private void showRoomFilter(List<Rooms> list) {
        String str = Scenario.ROOMS;
        initTabs(this.roomsTab, Rooms.getStringList(list));
    }

    private void showDeviceFilter(List<Hardware> list) {
        initTabs(this.deviceTabs, Hardware.getUniqeHardwareTitlesString(list));
    }

    public void initAdapter() {
        this.f6787rv.setLayoutManager(new WrapContentLinearLayoutManager(getActivity()));
        this.f6787rv.setAdapter(this.sectionedAdapter);
    }

    public void initAdapter2() {
        this.rv2.setLayoutManager(new WrapContentGridLayoutManager(getActivity(), 2));
        this.rv2.setAdapter(this.sectionedAdapter2);
    }

    public void onDeviceClick(String str, String str2, String str3) {
        nextFragment(DeviceFragment.start(str, str2, str3), false);
    }

    public void onChangeScenario(int i, List<Scenario> list, boolean z) {
        this.mainSmartViewModel.getCurrentId().setValue(Integer.valueOf(i));
        this.mainSmartViewModel.activateScenario(i, z ? 1 : 0);
        this.mainSmartViewModel.getActivateSingleEvent().observe(this, new Observer(list, z) {
            private final /* synthetic */ List f$1;
            private final /* synthetic */ boolean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onChanged(Object obj) {
                MainSmartFragment.this.lambda$onChangeScenario$3$MainSmartFragment(this.f$1, this.f$2, (Resource) obj);
            }
        });
        onChangeScenarioLocally(i);
    }

    public /* synthetic */ void lambda$onChangeScenario$3$MainSmartFragment(List list, boolean z, Resource resource) {
        showScenario(resource, list, this.mainSmartViewModel.getCurrentId().getValue().intValue(), z);
    }

    private void showScenarioData(List<Scenario> list) {
        this.scenarioSection.setData(list);
        this.deviceAndFilterSection.setData(Scenario.getData(list, "1"));
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.MainSmartFragment$3 */
    static /* synthetic */ class C58473 {
        static final /* synthetic */ int[] $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status = new int[Resource.Status.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                ru.unicorn.ujin.data.realm.Resource$Status[] r0 = p035ru.unicorn.ujin.data.realm.Resource.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status = r0
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x0014 }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x001f }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.ERROR     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.MainSmartFragment.C58473.<clinit>():void");
        }
    }

    private void showScenario(Resource<ScenarioList> resource, List<Scenario> list, int i, boolean z) {
        if (resource != null) {
            int i2 = C58473.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i2 == 1) {
                showScenarioData(resource.getData().getScenarioList());
                showNotification(Scenario.findScenarioById(list, i, z), false);
            } else if (i2 == 2) {
                this.scenarioSection.setCurrentActive(-1);
                this.scenarioSection.setData(list);
                showNotification(resource.getMessage(), true);
            }
        }
    }

    private void showNotification(String str, boolean z) {
        if (str != null) {
            if (!this.notificationSection.isShown()) {
                this.notificationSection.show(true);
            }
            this.notificationSection.setData(new CustomNotification(str, z));
            this.f6787rv.scrollToPosition(0);
        }
    }

    public void onSccenarioLongClick(int i, String str) {
        nextFragment(ScenarioSettingsFragment.start(i, str), false);
    }

    public void onFilterByRoom(String str) {
        str.equals(Scenario.ROOMS);
        str.equals(Scenario.DEVICES);
        if (str.equals(DeviceAndFilterSection.ADD_DEVICE)) {
            onNextClick();
        }
    }

    public void onNextClick() {
        nextFragment(CreateDeviceFragment.start(1), false);
    }

    public void sendSignal(Device device) {
        List<Device> list = this.udpDevices;
        if (list != null && !list.isEmpty()) {
            for (Device next : this.udpDevices) {
                if (next.getId().equals(device.getId())) {
                    device.setIpAdress(next.getIpAdress());
                    device.setToken(next.getToken());
                }
            }
        }
        this.mainSmartViewModel.sendCommand(device, InternetHelper.isWifiConnection(getActivity()));
        this.mainSmartViewModel.getGetHardwareResourceSingleEvent().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                MainSmartFragment.this.showHardwareRes((Resource) obj);
            }
        });
    }

    private void onChangeScenarioLocally(int i) {
        new ArrayList();
        List<Device> list = this.udpDevices;
        if (list != null && !list.isEmpty()) {
            this.mainSmartViewModel.filterDeviceByAvailabilityScenario(this.udpDevices, i);
        }
    }

    /* access modifiers changed from: private */
    public void showHardwareRes(Resource<List<Hardware>> resource) {
        if (resource != null && !resource.getStatus().equals(Resource.Status.SUCCESS) && resource.getStatus().equals(Resource.Status.ERROR)) {
            showNotification(resource.getMessage(), true);
            this.mainSmartViewModel.getHardwareFlowableLocally();
            this.mainSmartViewModel.getGetHardwareSingleEvent().observe(this, new Observer() {
                public final void onChanged(Object obj) {
                    MainSmartFragment.this.showHardware((List) obj);
                }
            });
        }
    }

    public void changeFragment(int i) {
        if (i == 1) {
            nextFragment(new ScenarioListFragment(), false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReady(java.lang.Object r6, java.lang.String r7) {
        /*
            r5 = this;
            ru.unicorn.ujin.view.activity.navigation.ui.radiodialogfragment.RadioChooserObject r6 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.radiodialogfragment.RadioChooserObject) r6
            int r0 = r7.hashCode()
            r1 = 108698360(0x67a9af8, float:4.7133627E-35)
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r1) goto L_0x002d
            r1 = 1559801053(0x5cf8acdd, float:5.59966875E17)
            if (r0 == r1) goto L_0x0023
            r1 = 1796926137(0x6b1aeab9, float:1.8728302E26)
            if (r0 == r1) goto L_0x0019
            goto L_0x0037
        L_0x0019:
            java.lang.String r0 = "добавить"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0037
            r7 = 2
            goto L_0x0038
        L_0x0023:
            java.lang.String r0 = "devices"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0037
            r7 = 0
            goto L_0x0038
        L_0x002d:
            java.lang.String r0 = "rooms"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0037
            r7 = 1
            goto L_0x0038
        L_0x0037:
            r7 = -1
        L_0x0038:
            if (r7 == 0) goto L_0x0055
            if (r7 == r4) goto L_0x0047
            if (r7 == r3) goto L_0x003f
            goto L_0x0062
        L_0x003f:
            ru.unicorn.ujin.view.activity.navigation.ui.rooms.RoomsFragment r6 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.rooms.RoomsFragment.start()
            r5.nextFragment(r6, r2)
            goto L_0x0062
        L_0x0047:
            ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.MainSmartViewModel r7 = r5.mainSmartViewModel
            androidx.lifecycle.MutableLiveData r7 = r7.getRoomFilterName()
            java.lang.String r6 = r6.getTitle()
            r7.postValue(r6)
            goto L_0x0062
        L_0x0055:
            ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.MainSmartViewModel r7 = r5.mainSmartViewModel
            androidx.lifecycle.MutableLiveData r7 = r7.getHasActiveFilter()
            java.lang.String r6 = r6.getTitle()
            r7.postValue(r6)
        L_0x0062:
            ru.unicorn.ujin.view.activity.navigation.ui.radiodialogfragment.RadioDialogFragment r6 = r5.radioDialogFragment
            r7 = 0
            r6.setListener(r7)
            r5.onCancel()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.MainSmartFragment.onReady(java.lang.Object, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    public void onHandleDevice(List<Device> list) {
        List<Device> list2 = this.udpDevices;
        if (list2 == null) {
            this.udpDevices = new ArrayList(new HashSet(list));
        } else {
            HashSet hashSet = new HashSet(list2);
            if (this.udpDevices == null) {
                hashSet.addAll(list);
            }
            this.udpDevices = new ArrayList(hashSet);
        }
        Log.d("TAG", "XXX udp devices " + this.udpDevices.toString());
    }

    private void registerWifiBroadcast(boolean z) {
        if (z) {
            this.wifiConnectionReceiver = new WifiConnectionReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
            getActivity().registerReceiver(this.wifiConnectionReceiver, intentFilter);
            this.wifiConnectionReceiver.getHasWifiConnection().observe(this, new Observer() {
                public final void onChanged(Object obj) {
                    MainSmartFragment.this.onStateChanged((Boolean) obj);
                }
            });
            this.wifiConnectionReceiver.getHasWifiConnection().postValue(Boolean.valueOf(InternetHelper.isWifiConnection(getActivity())));
            return;
        }
        getActivity().unregisterReceiver(this.wifiConnectionReceiver);
    }

    /* access modifiers changed from: private */
    public void onStateChanged(Boolean bool) {
        hasWifiConnection(bool.booleanValue());
    }

    private void hasWifiConnection(boolean z) {
        if (z) {
            startScanLocalDevice();
            return;
        }
        List<Device> list = this.udpDevices;
        if (list != null) {
            list.clear();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        registerWifiBroadcast(false);
    }

    private void startScanLocalDevice() {
        try {
            this.mainSmartViewModel.scan(InternetHelper.getBroadcastAddress(getActivity()), InternetHelper.isWifiConnection(getActivity()));
            this.mainSmartViewModel.getMutableScan().observe(this, new Observer() {
                public final void onChanged(Object obj) {
                    MainSmartFragment.this.onHandleDevice((List) obj);
                }
            });
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public void showIntellect(Intellect intellect) {
        this.intellectSection.setData(intellect);
    }

    public void showScenario(List<Scenario> list) {
        this.scenarioSection.setData(list);
        this.deviceAndFilterSection.setData(Scenario.getData(list, "1"));
    }

    public void showHardware(List<Hardware> list) {
        this.btnNext.setVisibility(list.isEmpty() ? 0 : 8);
        this.deviceSection.setData(list);
    }
}
