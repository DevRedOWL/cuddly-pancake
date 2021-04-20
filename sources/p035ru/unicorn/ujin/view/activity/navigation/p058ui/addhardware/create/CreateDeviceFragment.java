package p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.create;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import java.util.List;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.api.DeviceModel;
import p035ru.unicorn.ujin.view.activity.navigation.api.SignalRemote;
import p035ru.unicorn.ujin.view.activity.navigation.api.SignalSettings;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.helper.OnDialogClick;
import p035ru.unicorn.ujin.view.activity.navigation.helper.SharedHelper;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.AddHardwareViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.AddRoomSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.ChooseRoomSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.ClassDevice;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.ClassDeviceSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.ClassModelSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.CurrentDeviceSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.CurrentRoomSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.FinalAddSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.SignalSettingsSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.SomeDevice;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.Rooms;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rooms.DeviceModelSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rooms.TitleSection;
import p035ru.unicorn.ujin.view.activity.navigation.repository.SignalCode;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.create.CreateDeviceFragment */
public class CreateDeviceFragment extends BaseFragment implements View.OnClickListener {
    public static final String ARG_IS_MODE_CREATE = "arg_mode_create";
    private static final String ARG_ROOM = "arg_room";
    private static final String ARG_ROOM_ID = "arg_room_id";
    private static final String ARG_SERIAL_NUMBER = "arg_serial_number";
    public static final String ARG_STAGE = "arg_stage";
    public static final String ARG_TYPE = "arg_type";
    private static final String ARG_TYPE_NAME = "arg_type_name";
    public static final int STAGE_CLASS_DEVICE = 1;
    public static final int STAGE_CLASS_MODEL = 2;
    public static final int STAGE_CLASS_SAVE_DEVICE = 5;
    public static final int STAGE_DEVICE_AND_ROOM = 4;
    public static final int STAGE_FINISH = 7;
    public static final int STAGE_ROOM = 3;
    public static final int STAGE_SHOW_SIGNAL = 6;
    private SectionedAdapter adapter;
    private AddRoomSection addRoomSection;
    /* access modifiers changed from: private */
    public AddHardwareViewModel addViewModel;
    @BindView(2131362104)
    Button btnNext;
    private ChooseRoomSection chooseRoomSection;
    private String classDeviceTitle;
    private ClassDeviceSection classSection;
    private CurrentDeviceSection currentDeviceSection;
    private CurrentRoomSection currentRoomSection;
    private AlertDialog.Builder deleteMessagedialogBuilder;
    private DeviceModelSection deviceModelSection;
    private String deviceName;
    private String deviceType;
    private FinalAddSection finalAddSection;
    private AlertDialog getCodeDialog;
    private Menu menu;
    private ClassModelSection modelSection;
    @BindView(2131363166)

    /* renamed from: pb */
    ProgressBar f6740pb;
    @BindView(2131363322)
    RecyclerView recyclerView;
    private String room;
    private Integer roomId;
    private List<Rooms> rooms;
    String serialNumber;
    /* access modifiers changed from: private */
    public SignalRemote signalRemote;
    private SignalSettings signalSettings;
    private SignalSettingsSection signalSettingsSection;
    private TitleSection titleSection;
    @BindView(2131362099)
    TextView tvDelete;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.add_hardware_fragment;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    public static CreateDeviceFragment start(int i) {
        CreateDeviceFragment createDeviceFragment = new CreateDeviceFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("arg_stage", i);
        createDeviceFragment.setArguments(bundle);
        return createDeviceFragment;
    }

    public static CreateDeviceFragment start(String str, String str2, String str3, int i, int i2, String str4, boolean z) {
        CreateDeviceFragment createDeviceFragment = new CreateDeviceFragment();
        Bundle bundle = new Bundle();
        bundle.putString(ARG_TYPE_NAME, str);
        bundle.putString("arg_type", str2);
        bundle.putString(ARG_ROOM, str3);
        bundle.putInt(ARG_ROOM_ID, i);
        bundle.putInt("arg_stage", i2);
        bundle.putString("arg_serial_number", str4);
        bundle.putBoolean("arg_mode_create", z);
        createDeviceFragment.setArguments(bundle);
        return createDeviceFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.recyclerView = (RecyclerView) inflate.findViewById(R.id.rv);
        this.btnNext = (Button) inflate.findViewById(R.id.btn_next);
        this.btnNext.setOnClickListener(this);
        this.f6740pb = (ProgressBar) inflate.findViewById(R.id.pb);
        return inflate;
    }

    public void onCreateOptionsMenu(Menu menu2, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.menu_edit_device, menu2);
        this.menu = menu2;
        super.onCreateOptionsMenu(menu2, menuInflater);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_add_room) {
            showAddRoomDialog((String) null, true);
            return true;
        } else if (itemId != R.id.menu_delete_device) {
            return false;
        } else {
            showDeleteDeviceDialod();
            return true;
        }
    }

    private void showDeleteDeviceDialod() {
        AlertDialog.Builder createDialogBuilder = DialogHelper.createDialogBuilder(getActivity(), getString(R.string.label_delete_hardware));
        createDialogBuilder.setPositiveButton((CharSequence) getString(R.string.button_delete), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                CreateDeviceFragment.this.lambda$showDeleteDeviceDialod$0$CreateDeviceFragment(dialogInterface, i);
            }
        });
        createDialogBuilder.setNegativeButton((CharSequence) getString(R.string.button_cancel), (DialogInterface.OnClickListener) $$Lambda$CreateDeviceFragment$qLIR8dp917VQnTBQT92PHbBYAdI.INSTANCE);
        createDialogBuilder.create().show();
    }

    public /* synthetic */ void lambda$showDeleteDeviceDialod$0$CreateDeviceFragment(DialogInterface dialogInterface, int i) {
        onDeleteClick();
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.adapter = new SectionedAdapter();
        if (this.classSection == null) {
            this.classSection = new ClassDeviceSection();
            this.classSection.specialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    CreateDeviceFragment.this.lambda$onViewCreated$2$CreateDeviceFragment((ClassDevice) obj);
                }
            });
        }
        if (this.modelSection == null) {
            this.modelSection = new ClassModelSection();
            this.modelSection.specialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    CreateDeviceFragment.this.lambda$onViewCreated$3$CreateDeviceFragment((DeviceModel) obj);
                }
            });
        }
        if (this.titleSection == null) {
            this.titleSection = new TitleSection(false, 16);
        }
        if (this.chooseRoomSection == null) {
            this.chooseRoomSection = new ChooseRoomSection();
            this.chooseRoomSection.specialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    CreateDeviceFragment.this.lambda$onViewCreated$4$CreateDeviceFragment((Rooms) obj);
                }
            });
        }
        if (this.deviceModelSection == null) {
            this.deviceModelSection = new DeviceModelSection();
            this.deviceModelSection.specialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    CreateDeviceFragment.this.lambda$onViewCreated$5$CreateDeviceFragment((SomeString) obj);
                }
            });
        }
        if (this.addRoomSection == null) {
            this.addRoomSection = new AddRoomSection();
            this.addRoomSection.specialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    CreateDeviceFragment.this.lambda$onViewCreated$6$CreateDeviceFragment((SomeString) obj);
                }
            });
        }
        if (this.titleSection == null) {
            this.titleSection = new TitleSection(false, 16);
        }
        if (this.finalAddSection == null) {
            this.finalAddSection = new FinalAddSection();
            this.finalAddSection.specialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    CreateDeviceFragment.this.lambda$onViewCreated$7$CreateDeviceFragment((Integer) obj);
                }
            });
        }
        if (this.deviceModelSection == null) {
            this.deviceModelSection = new DeviceModelSection();
            this.deviceModelSection.specialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    CreateDeviceFragment.this.lambda$onViewCreated$8$CreateDeviceFragment((SomeString) obj);
                }
            });
        }
        if (this.signalSettingsSection == null) {
            this.signalSettingsSection = new SignalSettingsSection();
            this.signalSettingsSection.specialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    CreateDeviceFragment.this.saveSettings((SignalRemote) obj);
                }
            });
        }
        if (this.currentRoomSection == null) {
            this.currentRoomSection = new CurrentRoomSection();
            this.currentRoomSection.specialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    CreateDeviceFragment.this.onChangeRoom((Rooms) obj);
                }
            });
        }
        if (this.currentDeviceSection == null) {
            this.currentDeviceSection = new CurrentDeviceSection();
            this.currentDeviceSection.show(false);
            this.currentDeviceSection.specialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    CreateDeviceFragment.this.onChangeType((SomeString) obj);
                }
            });
        }
        this.adapter.addSection(this.titleSection);
        this.adapter.addSection(this.classSection);
        this.adapter.addSection(this.deviceModelSection);
        this.adapter.addSection(this.modelSection);
        this.adapter.addSection(this.chooseRoomSection);
        this.adapter.addSection(this.addRoomSection);
        this.adapter.addSection(this.finalAddSection);
        this.adapter.addSection(this.currentRoomSection);
        this.adapter.addSection(this.currentDeviceSection);
        this.adapter.addSection(this.signalSettingsSection);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getActivity(), 1);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.recyclerView.addItemDecoration(dividerItemDecoration);
        this.recyclerView.setAdapter(this.adapter);
        this.addViewModel = (AddHardwareViewModel) ViewModelProviders.m10of((Fragment) this).get(AddHardwareViewModel.class);
        int i = getArguments().getInt("arg_stage");
        this.addViewModel.getStage().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                CreateDeviceFragment.this.onChangeStage((Integer) obj);
            }
        });
        if (this.addViewModel.getStage().getValue().intValue() == -1) {
            this.addViewModel.getStage().setValue(Integer.valueOf(i));
        }
        if (SharedHelper.getCurrentRoom(getActivity()) != null) {
            this.addViewModel.getCurrentRoom().postValue(SharedHelper.getCurrentRoom(getActivity()));
            this.addViewModel.getCurrentRoom().observe(this, new Observer() {
                public final void onChanged(Object obj) {
                    CreateDeviceFragment.this.showCurrentRoom((Rooms) obj);
                }
            });
            SharedHelper.setNoneRoom(getActivity());
        }
        this.addViewModel.getSerialNumber().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                CreateDeviceFragment.this.onGetSerialNumber((String) obj);
            }
        });
        this.addViewModel.getCurrentDeviceName().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                CreateDeviceFragment.this.onChangeDeviceName((String) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onViewCreated$2$CreateDeviceFragment(ClassDevice classDevice) throws Exception {
        getBaseActivity().setTextTitle(classDevice.getTitle());
        this.classDeviceTitle = classDevice.getName();
        this.addViewModel.getStage().setValue(2);
    }

    public /* synthetic */ void lambda$onViewCreated$3$CreateDeviceFragment(DeviceModel deviceModel) throws Exception {
        getBaseActivity().setTextTitle(deviceModel.getTitle());
        this.currentDeviceSection.setData(new SomeString(deviceModel.getTitle()));
        this.deviceName = deviceModel.getTitle();
        this.deviceType = deviceModel.getName();
        this.addViewModel.getStage().setValue(Integer.valueOf(this.currentRoomSection.getData() != null ? 4 : 3));
    }

    public /* synthetic */ void lambda$onViewCreated$4$CreateDeviceFragment(Rooms rooms2) throws Exception {
        this.addViewModel.getCurrentRoom().setValue(rooms2);
        this.addViewModel.getStage().setValue(Integer.valueOf(this.addViewModel.getSerialNumber().getValue() != null ? 6 : 4));
    }

    public /* synthetic */ void lambda$onViewCreated$5$CreateDeviceFragment(SomeString someString) throws Exception {
        this.addViewModel.getStage().setValue(2);
    }

    public /* synthetic */ void lambda$onViewCreated$6$CreateDeviceFragment(SomeString someString) throws Exception {
        showAddRoomDialog((String) null, true);
    }

    public /* synthetic */ void lambda$onViewCreated$8$CreateDeviceFragment(SomeString someString) throws Exception {
        backFragment();
    }

    /* access modifiers changed from: private */
    public void onChangeDeviceName(String str) {
        DialogHelper.showDialog((Context) getActivity(), getString(R.string.label_save_success));
        this.f6740pb.setVisibility(4);
        this.finalAddSection.setData(new SomeDevice(((SomeDevice) this.finalAddSection.getData()).getDeviceType(), str));
    }

    /* access modifiers changed from: private */
    public void onGetSerialNumber(String str) {
        this.serialNumber = str;
    }

    /* access modifiers changed from: private */
    public void onChangeRoom(Rooms rooms2) {
        this.addViewModel.getStage().setValue(3);
    }

    /* access modifiers changed from: private */
    public void onChangeType(SomeString someString) {
        this.modelSection.show(true);
        this.titleSection.setData(new SomeString("Выберите тип устройства"));
        this.titleSection.show(true);
        this.btnNext.setVisibility(4);
        this.currentRoomSection.show(false);
        this.chooseRoomSection.show(false);
        this.currentDeviceSection.show(false);
        this.deviceModelSection.show(false);
    }

    /* access modifiers changed from: private */
    public void onChangeStage(Integer num) {
        hideAll();
        switch (num.intValue()) {
            case 1:
                this.classSection.show(true);
                this.titleSection.show(true);
                this.titleSection.setData(new SomeString("Выберите категорию"));
                this.addViewModel.getListHardware().observe(this, new Observer() {
                    public final void onChanged(Object obj) {
                        CreateDeviceFragment.this.showHardware((Resource) obj);
                    }
                });
                return;
            case 2:
                this.titleSection.show(true);
                this.titleSection.setData(new SomeString("Выберите тип устройства"));
                this.modelSection.show(true);
                this.addViewModel.getDeviceModel(this.classDeviceTitle);
                this.addViewModel.getActivateSingleEvent().observe(this, new Observer() {
                    public final void onChanged(Object obj) {
                        CreateDeviceFragment.this.showDevices((Resource) obj);
                    }
                });
                return;
            case 3:
                this.titleSection.show(true);
                this.titleSection.setData(new SomeString("Выберите помещение"));
                showAddRoomIcon(true);
                this.addViewModel.getRoomForDeviceModel();
                this.addViewModel.getRoomSingleEvent().observe(this, new Observer() {
                    public final void onChanged(Object obj) {
                        CreateDeviceFragment.this.showRoomsSelection((List) obj);
                    }
                });
                this.addViewModel.getRoomForDeviceModel();
                this.addViewModel.getRoomSingleEvent().observe(this, new Observer() {
                    public final void onChanged(Object obj) {
                        CreateDeviceFragment.this.showDevicesAndRoom((List) obj);
                    }
                });
                this.addViewModel.getSingleLiveEventAddRoom().observe(this, new Observer() {
                    public final void onChanged(Object obj) {
                        CreateDeviceFragment.this.showDevicesAndRoom((List) obj);
                    }
                });
                this.chooseRoomSection.show(true);
                return;
            case 4:
                getBaseActivity().setTextTitle(getString(R.string.label_new_device));
                this.btnNext.setVisibility(0);
                this.btnNext.setText(getString(R.string.btn_add));
                if (this.deviceName == null) {
                    this.deviceName = "1";
                }
                if (this.deviceType == null) {
                    this.deviceType = "2";
                }
                this.deviceModelSection.show(true);
                this.deviceModelSection.setData(new SomeString(this.deviceName));
                this.currentDeviceSection.show(true);
                this.currentRoomSection.show(true);
                this.addViewModel.getCurrentRoom().observe(this, new Observer() {
                    public final void onChanged(Object obj) {
                        CreateDeviceFragment.this.showCurrentRoom((Rooms) obj);
                    }
                });
                return;
            case 5:
                this.serialNumber = getArguments().getString("arg_serial_number");
                this.btnNext.setVisibility(0);
                this.finalAddSection.show(true);
                this.currentRoomSection.show(true);
                if (this.serialNumber == null) {
                    getBaseActivity().setTextTitle(getString(R.string.label_edit_device));
                    this.signalSettingsSection.show(false);
                    this.btnNext.setText(getText(R.string.btn_save_changes));
                    return;
                }
                this.deviceName = getArguments().getString(ARG_TYPE_NAME);
                this.deviceType = getArguments().getString("arg_type");
                this.room = getArguments().getString(ARG_ROOM);
                this.roomId = Integer.valueOf(getArguments().getInt(ARG_ROOM_ID));
                this.addViewModel.getSerialNumber().setValue(this.serialNumber);
                this.addViewModel.getCurrentRoom().setValue(new Rooms(this.roomId, this.room));
                this.addViewModel.getCurrentRoom().observe(this, new Observer() {
                    public final void onChanged(Object obj) {
                        CreateDeviceFragment.this.showCurrentRoom((Rooms) obj);
                    }
                });
                this.f6740pb.setVisibility(0);
                this.addViewModel.getWindowsSettings(this.serialNumber).observe(this, new Observer() {
                    public final void onChanged(Object obj) {
                        CreateDeviceFragment.this.onAddHardawre((Resource) obj);
                    }
                });
                this.signalSettingsSection.show(true);
                return;
            case 6:
                showDelete(true);
                this.btnNext.setVisibility(0);
                this.btnNext.setText(getString(R.string.btn_save_changes));
                this.finalAddSection.show(true);
                this.currentRoomSection.show(true);
                this.signalSettingsSection.show(true);
                return;
            default:
                return;
        }
    }

    private void hideAll() {
        this.f6740pb.setVisibility(4);
        this.modelSection.show(false);
        this.titleSection.show(false);
        this.deviceModelSection.show(false);
        this.finalAddSection.show(false);
        this.addRoomSection.show(false);
        this.chooseRoomSection.show(false);
        this.signalSettingsSection.show(false);
        this.classSection.show(false);
        this.finalAddSection.show(false);
        this.currentDeviceSection.show(false);
        this.currentRoomSection.show(false);
        this.signalSettingsSection.show(false);
        this.deviceModelSection.show(false);
        this.btnNext.setVisibility(8);
        showAddRoomIcon(false);
        showDelete(false);
    }

    private void showDelete(Boolean bool) {
        MenuItem findItem;
        Menu menu2 = this.menu;
        if (menu2 != null && (findItem = menu2.findItem(R.id.menu_delete_device)) != null) {
            findItem.setVisible(bool.booleanValue());
        }
    }

    private void showAddRoomIcon(Boolean bool) {
        Menu menu2 = this.menu;
        if (menu2 != null) {
            MenuItem findItem = menu2.findItem(R.id.menu_add_room);
            String value = this.addViewModel.getSerialNumber().getValue();
            if (findItem != null && value != null) {
                findItem.setVisible(bool.booleanValue());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: makeBackAction */
    public void lambda$onViewCreated$7$CreateDeviceFragment(Integer num) {
        showChangeDeviceNameDialog(((SomeDevice) this.finalAddSection.getData()).getDeviceName());
    }

    private void showChangeDeviceNameDialog(final String str) {
        UIHelper.showKeyboard(getActivity());
        DialogHelper.showEdittableDialog(getContext(), str, getString(R.string.label_edit_device_name), new OnDialogClick() {
            public void onNegativeClick() {
            }

            public void onPositiveClick(String str, EditText editText) {
                if (!str.isEmpty() && !str.equals(str)) {
                    UIHelper.hideKeyboard(CreateDeviceFragment.this.getActivity(), editText);
                    CreateDeviceFragment.this.onChangeDeviceName(str);
                }
            }
        });
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.create.CreateDeviceFragment$5 */
    static /* synthetic */ class C58015 {
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
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x002a }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.LOADING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.create.CreateDeviceFragment.C58015.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void showHardware(Resource<List<ClassDevice>> resource) {
        if (resource != null) {
            int i = C58015.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6740pb.setVisibility(4);
                this.classSection.setData(resource.getData());
            } else if (i == 2) {
                this.f6740pb.setVisibility(4);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            } else if (i == 3) {
                this.f6740pb.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: private */
    public void showDevices(Resource<List<DeviceModel>> resource) {
        if (resource != null) {
            int i = C58015.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6740pb.setVisibility(4);
                this.modelSection.setData(resource.getData());
            } else if (i == 2) {
                this.f6740pb.setVisibility(4);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            } else if (i == 3) {
                this.f6740pb.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: private */
    public void showRoomsSelection(List<Rooms> list) {
        this.rooms = list;
        this.chooseRoomSection.setData(list);
    }

    /* access modifiers changed from: private */
    public void showDevicesAndRoom(List<Rooms> list) {
        this.f6740pb.setVisibility(4);
        this.addViewModel.getStage().setValue(3);
    }

    /* access modifiers changed from: private */
    public void showCurrentRoom(Rooms rooms2) {
        this.f6740pb.setVisibility(4);
        this.currentRoomSection.setData(rooms2);
    }

    public void onNextClick() {
        Integer value = this.addViewModel.getStage().getValue();
        if (value != null) {
            int intValue = value.intValue();
            if (intValue == 4) {
                Rooms findChoosenRoom = findChoosenRoom();
                this.addViewModel.getStage().setValue(5);
                this.roomId = findChoosenRoom.getId();
                getArguments().getBoolean("arg_mode_create", true);
                String str = this.deviceName;
                this.finalAddSection.setData(SomeDevice.createSomeDevice(str, str));
                if (this.serialNumber == null) {
                    this.f6740pb.setVisibility(0);
                    this.addViewModel.addHardware(this.deviceName, this.deviceType, this.roomId);
                    this.addViewModel.getSingleLiveEventAddHardware().observe(this, new Observer() {
                        public final void onChanged(Object obj) {
                            CreateDeviceFragment.this.onAddHardawre((Resource) obj);
                        }
                    });
                }
            } else if (intValue == 6) {
                getBaseActivity().setTextTitle(getString(R.string.label_edit_device));
                this.btnNext.setVisibility(0);
                this.btnNext.setText(getString(R.string.btn_save_changes));
                SomeDevice someDevice = (SomeDevice) this.finalAddSection.getData();
                Rooms rooms2 = (Rooms) this.currentRoomSection.getData();
                if (someDevice != null) {
                    this.f6740pb.setVisibility(0);
                    this.addViewModel.updateDeviceName(this.serialNumber, someDevice.getDeviceName());
                }
                if (rooms2 != null && rooms2.getId() != null) {
                    this.addViewModel.updateDeviceRoom(this.serialNumber, rooms2.getId());
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void onAddHardawre(Resource<SignalSettings> resource) {
        if (resource.getStatus().equals(Resource.Status.SUCCESS)) {
            this.f6740pb.setVisibility(4);
            SignalSettings data = resource.getData();
            this.finalAddSection.setData(SomeDevice.createSomeDevice(data.getDeviceModelTitle(), data.getTitle(), data.getImage()));
            this.addViewModel.getStage().setValue(6);
            this.signalSettingsSection.setData(SignalRemote.getSignals(resource.getData().getSignals()));
            this.signalSettings = resource.getData();
        }
        if (resource.getStatus().equals(Resource.Status.ERROR)) {
            this.f6740pb.setVisibility(4);
            DialogHelper.showDialog((Context) getActivity(), "ERROR");
        }
    }

    /* access modifiers changed from: private */
    public void saveSettings(SignalRemote signalRemote2) {
        this.signalRemote = signalRemote2;
        if (signalRemote2.getValue() == null) {
            showDialogForCode();
            this.addViewModel.saveCode(signalRemote2.getId(), signalRemote2.getName());
            this.addViewModel.getSingleLiveEventSignalCode().observe(this, new Observer() {
                public final void onChanged(Object obj) {
                    CreateDeviceFragment.this.onSaveCode((Resource) obj);
                }
            });
        }
    }

    private void showDialogForCode() {
        this.getCodeDialog = DialogHelper.createDialog(getActivity(), "Подойдите к мультисенсору и нажмите на кнопку");
        this.getCodeDialog.show();
        this.getCodeDialog.setCanceledOnTouchOutside(false);
    }

    /* access modifiers changed from: private */
    public void onSaveCode(Resource<SignalCode> resource) {
        this.getCodeDialog.dismiss();
        if (resource.getStatus().equals(Resource.Status.SUCCESS)) {
            this.addViewModel.getWindowsSettings(this.signalRemote.getId()).observe(this, new Observer() {
                public final void onChanged(Object obj) {
                    CreateDeviceFragment.this.onAddHardawre((Resource) obj);
                }
            });
            DialogHelper.showDialog((Context) getActivity(), "Команда добавлена");
        }
        if (resource.getStatus().equals(Resource.Status.ERROR)) {
            AlertDialog.Builder createDialogBuilder = DialogHelper.createDialogBuilder(getActivity(), "Команда не добавлена. Повторить?");
            createDialogBuilder.setPositiveButton((CharSequence) getString(R.string.button_repeat), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    CreateDeviceFragment createDeviceFragment = CreateDeviceFragment.this;
                    createDeviceFragment.saveSettings(createDeviceFragment.signalRemote);
                    dialogInterface.dismiss();
                }
            });
            createDialogBuilder.setNegativeButton((CharSequence) getString(R.string.button_cancel), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            createDialogBuilder.create().show();
        }
    }

    private Rooms findChoosenRoom() {
        return (Rooms) this.currentRoomSection.getData();
    }

    public void onDeleteClick() {
        String value = this.addViewModel.getSerialNumber().getValue();
        if (value != null) {
            this.addViewModel.deleteHardware(value);
            this.addViewModel.getSingleLiveEventDeleteHardware().observe(this, new Observer() {
                public final void onChanged(Object obj) {
                    CreateDeviceFragment.this.onHardwareDelete((Resource) obj);
                }
            });
        } else if (getArguments().getString("arg_serial_number") != null) {
            String string = getArguments().getString("arg_serial_number");
            this.serialNumber = string;
            this.addViewModel.deleteHardware(string);
            this.addViewModel.getSingleLiveEventDeleteHardware().observe(this, new Observer() {
                public final void onChanged(Object obj) {
                    CreateDeviceFragment.this.onHardwareDelete((Resource) obj);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void onHardwareDelete(Resource<Void> resource) {
        String str;
        if (resource.getStatus().equals(Resource.Status.LOADING)) {
            this.f6740pb.setVisibility(0);
            return;
        }
        if (resource.getStatus().equals(Resource.Status.SUCCESS)) {
            this.f6740pb.setVisibility(8);
            str = "Устройство удалено";
        } else {
            str = "";
        }
        if (resource.getStatus().equals(Resource.Status.ERROR)) {
            this.f6740pb.setVisibility(8);
            str = resource.getMessage();
        }
        if (this.deleteMessagedialogBuilder == null) {
            this.deleteMessagedialogBuilder = DialogHelper.createDialogBuilder(getActivity(), str);
            this.deleteMessagedialogBuilder.setPositiveButton((CharSequence) getString(R.string.button_ok), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    CreateDeviceFragment.this.lambda$onHardwareDelete$9$CreateDeviceFragment(dialogInterface, i);
                }
            }).create().show();
        }
    }

    public /* synthetic */ void lambda$onHardwareDelete$9$CreateDeviceFragment(DialogInterface dialogInterface, int i) {
        backFragment();
    }

    private void showAddRoomDialog(String str, final boolean z) {
        UIHelper.showKeyboard(getActivity());
        DialogHelper.showEdittableDialog(getContext(), str, "Добавить помещение", new OnDialogClick() {
            public void onNegativeClick() {
            }

            public void onPositiveClick(String str, EditText editText) {
                if (z) {
                    UIHelper.hideKeyboard(CreateDeviceFragment.this.getActivity(), editText);
                    CreateDeviceFragment.this.f6740pb.setVisibility(0);
                    CreateDeviceFragment.this.addViewModel.addRoom(str);
                } else if (str != null) {
                    str.isEmpty();
                }
            }
        });
    }

    public void onClick(View view) {
        if (view.getId() == R.id.btn_next) {
            onNextClick();
        }
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setTextTitle(getString(getArguments().getBoolean("arg_mode_create", true) ? R.string.addDevice : R.string.label_edit_device));
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
    }
}
