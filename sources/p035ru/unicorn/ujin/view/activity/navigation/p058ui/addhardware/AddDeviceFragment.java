package p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
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
import p035ru.unicorn.ujin.view.activity.navigation.api.SignalRemote;
import p035ru.unicorn.ujin.view.activity.navigation.api.SignalSettings;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.helper.OnDialogClick;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.NavigationBaseFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.Rooms;
import p035ru.unicorn.ujin.view.activity.navigation.repository.SignalCode;
import p046io.reactivex.functions.Consumer;

@Deprecated
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.AddDeviceFragment */
public class AddDeviceFragment extends NavigationBaseFragment {
    public static final String ARG_IS_MODE_CREATE = "arg_mode_create";
    private static final String ARG_ROOM = "arg_room";
    private static final String ARG_ROOM_ID = "arg_room_id";
    public static final String ARG_TYPE = "arg_type";
    private static final String ARG_TYPE_NAME = "arg_type_name";
    SectionedAdapter adapter;
    AddHardwareViewModel addViewModel;
    @BindView(2131362104)
    Button btnNext;
    /* access modifiers changed from: private */
    public String deviceName;
    FinalAddSection finalAddSection;
    private AlertDialog getCodeDialog;
    @BindView(2131363322)
    RecyclerView recyclerView;
    /* access modifiers changed from: private */
    public String room;
    private int roomId;
    /* access modifiers changed from: private */
    public SignalRemote signalRemote;
    private SignalSettings signalSettings;
    SignalSettingsSection signalSettingsSection;
    @BindView(2131362099)
    TextView tvDelete;

    private void showDevicesAndRoom(List<Rooms> list) {
    }

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.add_hardware_fragment;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    public void setToolbarOptions(Toolbar toolbar) {
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
    }

    public static AddDeviceFragment start(String str, String str2, String str3, int i, boolean z) {
        AddDeviceFragment addDeviceFragment = new AddDeviceFragment();
        Bundle bundle = new Bundle();
        bundle.putString("arg_type", str);
        bundle.putString(ARG_TYPE_NAME, str2);
        bundle.putString(ARG_ROOM, str3);
        bundle.putInt(ARG_ROOM_ID, i);
        bundle.putBoolean("arg_mode_create", z);
        addDeviceFragment.setArguments(bundle);
        return addDeviceFragment;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.adapter = new SectionedAdapter();
        if (this.finalAddSection == null) {
            this.finalAddSection = new FinalAddSection();
            this.finalAddSection.specialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    AddDeviceFragment.this.lambda$onViewCreated$0$AddDeviceFragment((Integer) obj);
                }
            });
        }
        if (this.signalSettingsSection == null) {
            this.signalSettingsSection = new SignalSettingsSection();
            this.signalSettingsSection.specialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    AddDeviceFragment.this.lambda$onViewCreated$1$AddDeviceFragment((SignalRemote) obj);
                }
            });
        }
        this.adapter.addSection(this.finalAddSection);
        this.adapter.addSection(this.signalSettingsSection);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getActivity(), 1);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.recyclerView.addItemDecoration(dividerItemDecoration);
        this.recyclerView.setAdapter(this.adapter);
        this.addViewModel = (AddHardwareViewModel) ViewModelProviders.m10of((Fragment) this).get(AddHardwareViewModel.class);
        this.deviceName = getArguments().getString("arg_type");
        this.room = getArguments().getString(ARG_ROOM);
        Boolean valueOf = Boolean.valueOf(getArguments().getBoolean("arg_mode_create"));
        this.btnNext.setVisibility(0);
        this.btnNext.setText(getString(valueOf.booleanValue() ? R.string.btn_add : R.string.button_save));
    }

    /* access modifiers changed from: private */
    /* renamed from: makeBackAction */
    public void lambda$onViewCreated$0$AddDeviceFragment(Integer num) {
        num.intValue();
    }

    private void showAddRoomDialog(String str) {
        UIHelper.showKeyboard(getActivity());
        DialogHelper.showEdittableDialog(getContext(), str, "Добавить помещение", new OnDialogClick() {
            public void onNegativeClick() {
            }

            public void onPositiveClick(String str, EditText editText) {
                UIHelper.hideKeyboard(AddDeviceFragment.this.getActivity(), editText);
                if (str != null && !str.isEmpty()) {
                    AddDeviceFragment.this.finalAddSection.setData(SomeDevice.createSomeDevice(AddDeviceFragment.this.deviceName, AddDeviceFragment.this.room));
                }
            }
        });
    }

    @OnClick({2131362104})
    public void onNextClick() {
        SomeDevice someDevice = (SomeDevice) this.finalAddSection.getData();
        if (getArguments().getBoolean("arg_mode_create")) {
            getArguments().getString(ARG_TYPE_NAME);
            Integer.valueOf(getArguments().getInt(ARG_ROOM_ID));
            this.addViewModel.getSingleLiveEventAddHardware().observe(this, new Observer() {
                public final void onChanged(Object obj) {
                    AddDeviceFragment.this.onAddHardawre((Resource) obj);
                }
            });
            return;
        }
        getArguments().getString(ARG_TYPE_NAME);
    }

    /* access modifiers changed from: private */
    public void onAddHardawre(Resource<SignalSettings> resource) {
        if (resource.getStatus().equals(Resource.Status.SUCCESS)) {
            this.btnNext.setText("Сохранить устройство");
            this.tvDelete.setVisibility(0);
            this.signalSettings = resource.getData();
            this.signalSettingsSection.setData(resource.getData().getSignals());
        }
        if (resource.getStatus().equals(Resource.Status.ERROR)) {
            DialogHelper.showDialog((Context) getActivity(), "ERROR");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: saveSettings */
    public void lambda$onViewCreated$1$AddDeviceFragment(SignalRemote signalRemote2) {
        this.signalRemote = signalRemote2;
        if (signalRemote2.getValue() == null) {
            showDialogForCode();
            this.addViewModel.saveCode(signalRemote2.getId(), signalRemote2.getName());
            this.addViewModel.getSingleLiveEventSignalCode().observe(this, new Observer() {
                public final void onChanged(Object obj) {
                    AddDeviceFragment.this.onSaveCode((Resource) obj);
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
                    AddDeviceFragment.this.onAddHardawre((Resource) obj);
                }
            });
            DialogHelper.showDialog((Context) getActivity(), "Команда добавлена");
        }
        if (resource.getStatus().equals(Resource.Status.ERROR)) {
            AlertDialog.Builder createDialogBuilder = DialogHelper.createDialogBuilder(getActivity(), "Команда не добавлена. Повторить?");
            createDialogBuilder.setPositiveButton((CharSequence) getString(R.string.button_repeat), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    AddDeviceFragment addDeviceFragment = AddDeviceFragment.this;
                    addDeviceFragment.lambda$onViewCreated$1$AddDeviceFragment(addDeviceFragment.signalRemote);
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

    @OnClick({2131362099})
    public void onDeleteClick() {
        SignalSettings signalSettings2 = this.signalSettings;
        if (signalSettings2 != null && signalSettings2.getSignals() != null && !this.signalSettings.getSignals().isEmpty()) {
            this.signalSettings.getSignals().get(0).getId();
        }
    }

    private void onHardwareDelete(Resource<Void> resource) {
        String str;
        if (resource.getStatus().equals(Resource.Status.SUCCESS)) {
            str = "Устройство удалено";
        } else {
            str = resource.getStatus().equals(Resource.Status.ERROR) ? resource.getMessage() : "";
        }
        DialogHelper.showDialog((Context) getActivity(), str);
        backFragment();
    }
}
