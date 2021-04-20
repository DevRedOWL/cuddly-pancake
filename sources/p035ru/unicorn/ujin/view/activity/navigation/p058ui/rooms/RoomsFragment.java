package p035ru.unicorn.ujin.view.activity.navigation.p058ui.rooms;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
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
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.helper.OnDialogClick;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.MainSmartViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.MainViewmodelFactory;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.Rooms;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.SomeRooms;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rooms.RoomsFragment */
public class RoomsFragment extends BaseFragment {
    private SectionedAdapter adapter;
    private Button btnAddRoom;
    private MainSmartViewModel mainSmartViewModel;
    @BindView(2131363166)

    /* renamed from: pb */
    ProgressBar f6864pb;
    @BindView(2131363322)
    RecyclerView recyclerView;
    private RoomSection roomSection;
    private RoomsViewModel roomsViewModel;
    private TitleSection titleSection;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.rooms_fragment;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    public static RoomsFragment start() {
        return new RoomsFragment();
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.recyclerView = (RecyclerView) inflate.findViewById(R.id.rv);
        this.f6864pb = (ProgressBar) inflate.findViewById(R.id.pb);
        this.btnAddRoom = (Button) inflate.findViewById(R.id.btn_add);
        this.btnAddRoom.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                RoomsFragment.this.lambda$onCreateView$0$RoomsFragment(view);
            }
        });
        return inflate;
    }

    public /* synthetic */ void lambda$onCreateView$0$RoomsFragment(View view) {
        onAddRoomClick();
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.adapter = new SectionedAdapter();
        if (this.roomSection == null) {
            this.roomSection = new RoomSection();
            this.disposable.add(this.roomSection.specialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    RoomsFragment.this.lambda$onViewCreated$1$RoomsFragment((SomePair) obj);
                }
            }));
        }
        if (this.titleSection == null) {
            this.titleSection = new TitleSection();
        }
        this.adapter.addSection(this.titleSection);
        this.adapter.addSection(this.roomSection);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getActivity(), 1);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.recyclerView.addItemDecoration(dividerItemDecoration);
        this.recyclerView.setAdapter(this.adapter);
        this.mainSmartViewModel = (MainSmartViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) MainViewmodelFactory.getInstance()).get(MainSmartViewModel.class);
        this.roomsViewModel = (RoomsViewModel) ViewModelProviders.m10of((Fragment) this).get(RoomsViewModel.class);
        this.roomsViewModel.getSomeRoomsMutableLiveData().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                RoomsFragment.this.showHardware((SomeRooms) obj);
            }
        });
        this.roomsViewModel.getShowErrorMutableLiveData().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                RoomsFragment.this.showError((String) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onViewCreated$1$RoomsFragment(SomePair somePair) throws Exception {
        if (somePair.getCount() == 0) {
            this.f6864pb.setVisibility(0);
            this.roomsViewModel.deleteRoom(somePair.getId());
            return;
        }
        DialogHelper.showDialog((Context) getActivity(), "Нельзя удалить комнату в которой есть устройства");
    }

    /* access modifiers changed from: private */
    public void showError(String str) {
        this.f6864pb.setVisibility(4);
        DialogHelper.showDialog((Context) getActivity(), str);
    }

    /* access modifiers changed from: private */
    public void showHardware(SomeRooms someRooms) {
        this.f6864pb.setVisibility(4);
        this.roomSection.setData(Hardware.getDeviceCountByRoom(someRooms.getHardwares(), someRooms.getRooms()));
        this.mainSmartViewModel.getRoomsMutableLiveData().setValue(someRooms.getRooms());
    }

    public void onAddRoomClick() {
        UIHelper.showKeyboard(getActivity());
        DialogHelper.showEdittableDialog2(getContext(), (String) null, "Новое помещение", "введите название", new OnDialogClick() {
            public void onNegativeClick() {
            }

            public void onPositiveClick(String str, EditText editText) {
                UIHelper.hideKeyboard(RoomsFragment.this.getActivity(), editText);
                RoomsFragment.this.addRoom(str);
            }
        }, 2);
    }

    /* access modifiers changed from: package-private */
    public void addRoom(String str) {
        if (!str.isEmpty()) {
            this.f6864pb.setVisibility(0);
            this.roomsViewModel.addRoom_(str);
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rooms.RoomsFragment$2 */
    static /* synthetic */ class C59382 {
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
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.rooms.RoomsFragment.C59382.<clinit>():void");
        }
    }

    private void updateRoomList(Resource<List<Rooms>> resource) {
        if (resource != null) {
            int i = C59382.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6864pb.setVisibility(0);
            } else if (i == 2) {
                this.f6864pb.setVisibility(8);
            } else if (i == 3) {
                this.f6864pb.setVisibility(8);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setTextTitle(getString(R.string.label_room));
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
    }
}
