package p035ru.unicorn.ujin.view.activity.navigation.p058ui.device;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SimpleDividerItemDecoration;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.HardwareSignal;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.OnSendSignal;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.SignalsSection;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.helper.InternetHelper;
import p035ru.unicorn.ujin.view.activity.navigation.helper.OnDialogClick;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.create.CreateDeviceFragment;
import p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device;
import p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.SomeData;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p035ru.unicorn.ujin.view.toolbar.ToolbarsHelper;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.device.DeviceFragment */
public class DeviceFragment extends BaseFragment implements OnSendSignal {
    private static final String ARG_DEVICE_ID = "arg_device_id";
    private static final String ARG_DEVICE_SIGNAL = "arg_device_signal";
    private static final String ARG_DEVICE_SN = "arg_device_sn";
    private ControlTypeSection controlTypeSection;
    private DeviceInfoSection deviceInfoSection;
    private DeviceViewModel deviceViewModel;
    private Hardware hardware;
    private HardwareVersionSection hardwareVersionSection;
    @BindView(2131363166)

    /* renamed from: pb */
    ProgressBar f6760pb;
    @BindView(2131363322)

    /* renamed from: rv */
    RecyclerView f6761rv;
    private SectionedAdapter sectionedAdapter;
    private SignalsSection signalsSection;

    /* renamed from: sn */
    private String f6762sn;
    private List<Device> udpDevices = new ArrayList();
    private WifiConnectionReceiver wifiConnectionReceiver;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_device;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    public static DeviceFragment start(String str, String str2, String str3) {
        DeviceFragment deviceFragment = new DeviceFragment();
        Bundle bundle = new Bundle();
        bundle.putString(ARG_DEVICE_ID, str);
        bundle.putString(ARG_DEVICE_SIGNAL, str3);
        bundle.putString(ARG_DEVICE_SN, str2);
        deviceFragment.setArguments(bundle);
        return deviceFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.f6761rv = (RecyclerView) inflate.findViewById(R.id.rv);
        this.f6760pb = (ProgressBar) inflate.findViewById(R.id.pb);
        return inflate;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(R.menu.menu_device, menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_edit_device) {
            return false;
        }
        onDescrClick((Hardware) this.deviceInfoSection.getData());
        return true;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.sectionedAdapter = new SectionedAdapter();
        if (this.deviceInfoSection == null) {
            this.deviceInfoSection = new DeviceInfoSection();
            this.deviceInfoSection.getSpecialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    DeviceFragment.this.onDescrClick((Hardware) obj);
                }
            });
        }
        if (this.signalsSection == null) {
            this.signalsSection = new SignalsSection(this);
            this.signalsSection.getOnSpecialClick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    DeviceFragment.this.lambda$onViewCreated$0$DeviceFragment((HardwareSignal) obj);
                }
            });
        }
        if (this.hardwareVersionSection == null) {
            this.hardwareVersionSection = new HardwareVersionSection();
            this.hardwareVersionSection.getSpecialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    DeviceFragment.this.lambda$onViewCreated$1$DeviceFragment((String) obj);
                }
            });
        }
        if (this.controlTypeSection == null) {
            this.controlTypeSection = new ControlTypeSection(this);
        }
        this.sectionedAdapter.addSection(this.deviceInfoSection);
        this.sectionedAdapter.addSection(this.signalsSection);
        this.sectionedAdapter.addSection(this.hardwareVersionSection);
        this.sectionedAdapter.addSection(this.controlTypeSection);
        initAdapter();
        getArguments().getString(ARG_DEVICE_ID);
        this.f6762sn = getArguments().getString(ARG_DEVICE_SN);
        String string = getArguments().getString(ARG_DEVICE_SIGNAL);
        this.deviceViewModel = (DeviceViewModel) ViewModelProviders.m10of((Fragment) this).get(DeviceViewModel.class);
        this.deviceViewModel.getSerialList();
        this.deviceViewModel.getHardware(this.f6762sn, string);
        this.deviceViewModel.getHardwareSingleEvent().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                DeviceFragment.this.showHardware((Resource) obj);
            }
        });
        this.deviceViewModel.getIsActiveWifi().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                DeviceFragment.this.hasWifiConnection(((Boolean) obj).booleanValue());
            }
        });
        registerWifiBroadcast(true);
    }

    public /* synthetic */ void lambda$onViewCreated$0$DeviceFragment(final HardwareSignal hardwareSignal) throws Exception {
        if (hardwareSignal.getTypeControl().equals("list")) {
            showTypeControlList(hardwareSignal);
        } else if (hardwareSignal.getTypeControl().equals("text")) {
            UIHelper.showKeyboard(getActivity());
            DialogHelper.showEdittableDialog2(getContext(), (String) null, "Новое значение", "введите значение", new OnDialogClick() {
                public void onNegativeClick() {
                }

                public void onPositiveClick(String str, EditText editText) {
                    UIHelper.hideKeyboard(DeviceFragment.this.getActivity(), editText);
                    try {
                        Integer valueOf = Integer.valueOf(editText.getText().toString());
                        Device device = new Device();
                        device.setId(Long.valueOf(Long.parseLong(hardwareSignal.getId())));
                        device.setName(hardwareSignal.getName());
                        device.setValue(valueOf.intValue());
                        DeviceFragment.this.sendSignal(device);
                        DeviceFragment.this.updateSignal();
                    } catch (NumberFormatException unused) {
                        DialogHelper.showDialog((Context) DeviceFragment.this.getActivity(), "Введите цифры");
                    }
                }
            }, 2);
        }
    }

    public /* synthetic */ void lambda$onViewCreated$1$DeviceFragment(String str) throws Exception {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    public void hasWifiConnection(boolean z) {
        if (z) {
            startScanLocalDevice();
        } else {
            this.udpDevices.clear();
        }
    }

    private void startScanLocalDevice() {
        try {
            this.deviceViewModel.scan(InternetHelper.getBroadcastAddress(getActivity()), InternetHelper.isWifiConnection(getActivity()));
            this.deviceViewModel.getMutableScan().observe(this, new Observer() {
                public final void onChanged(Object obj) {
                    DeviceFragment.this.onHandleDevice((List) obj);
                }
            });
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    private void showHardware2(Resource<SomeData> resource) {
        Log.d("TAG", "XXX get-settings 3 " + resource.getStatus());
    }

    private void showTypeControlList(HardwareSignal hardwareSignal) {
        showList(true);
        this.controlTypeSection.setData(hardwareSignal.getListControlTypes());
        this.controlTypeSection.setHardwareSignal(hardwareSignal);
    }

    private void showList(boolean z) {
        this.controlTypeSection.show(z);
        this.hardwareVersionSection.show(!z);
        this.deviceInfoSection.show(!z);
        this.signalsSection.show(!z);
    }

    /* access modifiers changed from: private */
    public void onHandleDevice(List<Device> list) {
        List<Device> list2 = this.udpDevices;
        if (list2 == null) {
            this.udpDevices = list;
            return;
        }
        HashSet hashSet = new HashSet(list2);
        hashSet.addAll(list);
        this.udpDevices = new ArrayList(hashSet);
    }

    private void initAdapter() {
        this.f6761rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f6761rv.addItemDecoration(new SimpleDividerItemDecoration(getActivity()));
        this.f6761rv.setAdapter(this.sectionedAdapter);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.device.DeviceFragment$2 */
    static /* synthetic */ class C58132 {
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
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.device.DeviceFragment.C58132.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void showHardware(Resource<Hardware> resource) {
        if (resource != null) {
            int i = C58132.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6760pb.setVisibility(0);
            } else if (i == 2) {
                this.f6760pb.setVisibility(8);
                this.hardware = resource.getData();
                VersionData data = VersionData.getData(this.hardware);
                this.deviceInfoSection.setData(this.hardware);
                if (Hardware.getData(this.hardware.getSignals()) != null) {
                    List valueAt = Hardware.getData(this.hardware.getSignals()).valueAt(0);
                    List valueAt2 = Hardware.getData(this.hardware.getSignals()).valueAt(1);
                    if (valueAt != null && !valueAt.isEmpty()) {
                        this.signalsSection.setData(valueAt);
                    }
                    if (valueAt2 != null && !valueAt2.isEmpty()) {
                        this.signalsSection.setData(valueAt2);
                    }
                    if (data != null && data.hasVersion()) {
                        this.hardwareVersionSection.setData(data);
                    }
                }
            } else if (i == 3) {
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            }
        }
    }

    public void sendSignal(Device device) {
        boolean z = false;
        if (this.controlTypeSection.isShown()) {
            showList(false);
        }
        if (!this.udpDevices.isEmpty()) {
            for (Device next : this.udpDevices) {
                if (next.getId().equals(device.getId())) {
                    device.setIpAdress(next.getIpAdress());
                    device.setToken(next.getToken());
                }
            }
        }
        DeviceViewModel deviceViewModel2 = this.deviceViewModel;
        List<Device> list = this.udpDevices;
        if (list != null && list.size() > 0) {
            z = true;
        }
        deviceViewModel2.sendCommand(device, z);
        this.deviceViewModel.getSendSignalSingleEvent().observe(this, new Observer(device) {
            private final /* synthetic */ Device f$1;

            {
                this.f$1 = r2;
            }

            public final void onChanged(Object obj) {
                DeviceFragment.this.lambda$sendSignal$2$DeviceFragment(this.f$1, (Resource) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: onSendSignal */
    public void lambda$sendSignal$2$DeviceFragment(Resource<SomeData> resource, Device device) {
        if (resource != null && C58132.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()] == 3) {
            this.f6760pb.setVisibility(8);
            DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
        }
    }

    public void onDescrClick(Hardware hardware2) {
        if (hardware2 != null) {
            String title = hardware2.getTitle();
            String title2 = hardware2.getRoomInfo().getTitle();
            Integer id = hardware2.getRoomInfo().getId();
            String string = getArguments().getString(ARG_DEVICE_SN);
            nextFragment(CreateDeviceFragment.start(title, string, title2, id.intValue(), 5, string, false), false);
        }
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
                    DeviceFragment.this.onStateChanged((Boolean) obj);
                }
            });
            this.deviceViewModel.getIsActiveWifi().postValue(Boolean.valueOf(InternetHelper.isWifiConnection(getActivity())));
            return;
        }
        getActivity().unregisterReceiver(this.wifiConnectionReceiver);
    }

    /* access modifiers changed from: private */
    public void onStateChanged(Boolean bool) {
        hasWifiConnection(bool.booleanValue());
    }

    public void onDestroyView() {
        super.onDestroyView();
        registerWifiBroadcast(false);
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setTextTitle(getString(R.string.label_one_device));
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().removeToolbarElevation();
        ArrayList<View> createSingleButton = new ToolbarsHelper(getActivity()).createSingleButton(R.drawable.ic_svg_pencil_edit);
        createSingleButton.get(0).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                DeviceFragment.this.lambda$showToolbar$3$DeviceFragment(view);
            }
        });
        getBaseActivity().setToolbarRight(createSingleButton);
    }

    public /* synthetic */ void lambda$showToolbar$3$DeviceFragment(View view) {
        onDescrClick((Hardware) this.deviceInfoSection.getData());
    }

    public void updateSignal() {
        this.f6762sn = getArguments().getString(ARG_DEVICE_SN);
        this.deviceViewModel.getHardware(this.f6762sn, getArguments().getString(ARG_DEVICE_SIGNAL));
    }
}
