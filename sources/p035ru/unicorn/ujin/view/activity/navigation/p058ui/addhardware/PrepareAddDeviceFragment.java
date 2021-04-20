package p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.OnClick;
import java.util.List;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.api.DeviceModel;
import p035ru.unicorn.ujin.view.activity.navigation.api.SignalSettings;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.helper.OnDialogClick;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.NavigationBaseFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.Rooms;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rooms.DeviceModelSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rooms.TitleSection;
import p046io.reactivex.functions.Consumer;

@Deprecated
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.PrepareAddDeviceFragment */
public class PrepareAddDeviceFragment extends NavigationBaseFragment {
    public static final String ARG_IS_MODE_CREATE = "arg_mode_create";
    public static final String ARG_STAGE = "arg_stage";
    public static final int STAGE_CLASS_DEVICE = 1;
    public static final int STAGE_CLASS_MODEL = 2;
    private SectionedAdapter adapter;
    private AddRoomSection addRoomSection;
    /* access modifiers changed from: private */
    public AddHardwareViewModel addViewModel;
    @BindView(2131362104)
    Button btnNext;
    private ChooseRoomSection chooseRoomSection;
    private ClassDeviceSection classSection;
    private DeviceModelSection deviceModelSection;
    private String deviceName;
    private String deviceType;
    private ClassModelSection modelSection;
    @BindView(2131363322)
    RecyclerView recyclerView;
    private List<Rooms> rooms;
    private TitleSection titleSection;

    private void onAddHardawre(Resource<SignalSettings> resource) {
    }

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.add_hardware_fragment;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
    }

    public static PrepareAddDeviceFragment start(boolean z, int i) {
        PrepareAddDeviceFragment prepareAddDeviceFragment = new PrepareAddDeviceFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("arg_mode_create", z);
        bundle.putInt("arg_stage", i);
        prepareAddDeviceFragment.setArguments(bundle);
        return prepareAddDeviceFragment;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.adapter = new SectionedAdapter();
        if (this.classSection == null) {
            this.classSection = new ClassDeviceSection();
            this.classSection.specialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    PrepareAddDeviceFragment.this.lambda$onViewCreated$0$PrepareAddDeviceFragment((ClassDevice) obj);
                }
            });
        }
        if (this.modelSection == null) {
            this.modelSection = new ClassModelSection();
            this.modelSection.specialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    PrepareAddDeviceFragment.this.lambda$onViewCreated$1$PrepareAddDeviceFragment((DeviceModel) obj);
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
                    PrepareAddDeviceFragment.this.lambda$onViewCreated$2$PrepareAddDeviceFragment((Rooms) obj);
                }
            });
        }
        if (this.deviceModelSection == null) {
            this.deviceModelSection = new DeviceModelSection();
            this.deviceModelSection.specialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    PrepareAddDeviceFragment.this.lambda$onViewCreated$3$PrepareAddDeviceFragment((SomeString) obj);
                }
            });
        }
        if (this.addRoomSection == null) {
            this.addRoomSection = new AddRoomSection();
            this.addRoomSection.specialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    PrepareAddDeviceFragment.this.lambda$onViewCreated$4$PrepareAddDeviceFragment((SomeString) obj);
                }
            });
        }
        this.adapter.addSection(this.titleSection);
        this.adapter.addSection(this.classSection);
        this.adapter.addSection(this.deviceModelSection);
        this.adapter.addSection(this.modelSection);
        this.adapter.addSection(this.chooseRoomSection);
        this.adapter.addSection(this.addRoomSection);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getActivity(), 1);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.recyclerView.addItemDecoration(dividerItemDecoration);
        this.recyclerView.setAdapter(this.adapter);
        this.addViewModel = (AddHardwareViewModel) ViewModelProviders.m10of((Fragment) this).get(AddHardwareViewModel.class);
        int i = getArguments().getInt("arg_stage");
    }

    public /* synthetic */ void lambda$onViewCreated$0$PrepareAddDeviceFragment(ClassDevice classDevice) throws Exception {
        this.addViewModel.getDeviceModel(classDevice.getName());
    }

    public /* synthetic */ void lambda$onViewCreated$1$PrepareAddDeviceFragment(DeviceModel deviceModel) throws Exception {
        this.btnNext.setText(getString(R.string.btn_add));
        this.deviceName = deviceModel.getTitle();
        this.deviceType = deviceModel.getName();
        this.addViewModel.getRoomForDeviceModel();
        this.addViewModel.getRoomSingleEvent().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                PrepareAddDeviceFragment.this.showDevicesAndRoom((List) obj);
            }
        });
        this.addViewModel.getSingleLiveEventAddRoom().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                PrepareAddDeviceFragment.this.showDevicesAndRoom((List) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onViewCreated$2$PrepareAddDeviceFragment(Rooms rooms2) throws Exception {
        this.adapter.notifyDataSetChanged();
    }

    public /* synthetic */ void lambda$onViewCreated$3$PrepareAddDeviceFragment(SomeString someString) throws Exception {
        this.btnNext.setVisibility(8);
        this.deviceModelSection.show(false);
        this.modelSection.show(true);
    }

    public /* synthetic */ void lambda$onViewCreated$4$PrepareAddDeviceFragment(SomeString someString) throws Exception {
        showAddRoomDialog((String) null);
    }

    private void showHardware(Resource<List<ClassDevice>> resource) {
        if (resource.getStatus().equals(Resource.Status.SUCCESS)) {
            this.titleSection.setData(new SomeString("Выберите категорию"));
            this.classSection.setData(resource.getData());
        }
    }

    private void showDevices(Resource<List<DeviceModel>> resource) {
        this.classSection.show(false);
        if (resource.getStatus().equals(Resource.Status.SUCCESS)) {
            this.titleSection.setData(new SomeString("Выберите тип устройства"));
            this.modelSection.setData(resource.getData());
        }
    }

    /* access modifiers changed from: private */
    public void showDevicesAndRoom(List<Rooms> list) {
        this.rooms = list;
        this.btnNext.setVisibility(0);
        this.btnNext.setText("Далее");
        this.modelSection.show(false);
        this.titleSection.setData(new SomeString("Выберите комнату"));
        if (!this.deviceModelSection.isShown()) {
            this.deviceModelSection.show(true);
            return;
        }
        this.chooseRoomSection.setData(list);
        this.addRoomSection.setData(new SomeString(""));
        this.deviceModelSection.setData(new SomeString(this.deviceName));
    }

    public void setToolbarOptions(Toolbar toolbar) {
        UIHelper.baseBackToolbarTitle(getActivity(), toolbar, "Добавление устройства");
    }

    @OnClick({2131362104})
    public void onNextClick() {
        boolean z = getArguments().getBoolean("arg_mode_create");
        Rooms findChoosenRoom = findChoosenRoom();
        if (findChoosenRoom == null) {
            DialogHelper.showDialog((Context) getActivity(), "Выберите комнату");
            return;
        }
        nextFragment(AddDeviceFragment.start(this.deviceName, this.deviceType, findChoosenRoom.getTitle(), findChoosenRoom.getId().intValue(), z), false);
    }

    private Rooms findChoosenRoom() {
        int i = this.chooseRoomSection.selectioPosition;
        if (i == -1) {
            return null;
        }
        return (Rooms) this.chooseRoomSection.getData(i);
    }

    private void showAddRoomDialog(String str) {
        UIHelper.showKeyboard(getActivity());
        DialogHelper.showEdittableDialog(getContext(), str, "Добавить помещение", new OnDialogClick() {
            public void onNegativeClick() {
            }

            public void onPositiveClick(String str, EditText editText) {
                UIHelper.hideKeyboard(PrepareAddDeviceFragment.this.getActivity(), editText);
                PrepareAddDeviceFragment.this.addViewModel.addRoom(str);
            }
        });
    }
}
