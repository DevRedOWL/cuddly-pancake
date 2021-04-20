package p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
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
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.helper.OnDialogClick;
import p035ru.unicorn.ujin.view.activity.navigation.helper.SharedHelper;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.NavigationBaseFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.Rooms;
import p046io.reactivex.functions.Consumer;

@Deprecated
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.ChooseRoomFragment */
public class ChooseRoomFragment extends NavigationBaseFragment {
    private static final String ARG_ROOM = "arg_room";
    private static final String ARG_ROOM_ID = "arg_room_id";
    private SectionedAdapter adapter;
    /* access modifiers changed from: private */
    public AddHardwareViewModel addViewModel;
    private ChooseRoomSection chooseRoomSection;
    @BindView(2131363322)
    RecyclerView recyclerView;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_choose_roome;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
    }

    public static ChooseRoomFragment start(String str, int i) {
        ChooseRoomFragment chooseRoomFragment = new ChooseRoomFragment();
        Bundle bundle = new Bundle();
        bundle.putString(ARG_ROOM, str);
        bundle.putInt(ARG_ROOM_ID, i);
        chooseRoomFragment.setArguments(bundle);
        return chooseRoomFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.recyclerView = (RecyclerView) inflate.findViewById(R.id.rv);
        return inflate;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.menu_add_room, menu);
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_add_room) {
            return false;
        }
        onAddRoom();
        return true;
    }

    public void setToolbarOptions(Toolbar toolbar) {
        UIHelper.baseBackToolbarTitle(getActivity(), toolbar, getString(R.string.label_room));
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.adapter = new SectionedAdapter();
        if (this.chooseRoomSection == null) {
            this.chooseRoomSection = new ChooseRoomSection();
            this.chooseRoomSection.setCurrentId(getArguments().getInt(ARG_ROOM_ID));
            this.chooseRoomSection.specialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    ChooseRoomFragment.this.onRoomClick((Rooms) obj);
                }
            });
        }
        this.adapter.addSection(this.chooseRoomSection);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getActivity(), 1);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.recyclerView.addItemDecoration(dividerItemDecoration);
        this.recyclerView.setAdapter(this.adapter);
        this.addViewModel = (AddHardwareViewModel) ViewModelProviders.m10of((Fragment) this).get(AddHardwareViewModel.class);
        this.addViewModel.getRoomForDeviceModel();
        this.addViewModel.getRoomSingleEvent().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                ChooseRoomFragment.this.onGetRoom((List) obj);
            }
        });
        this.addViewModel.getSingleLiveEventAddRoom().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                ChooseRoomFragment.this.onGetRoom((List) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public void onGetRoom(List<Rooms> list) {
        this.chooseRoomSection.setData(list);
    }

    /* access modifiers changed from: private */
    public void onRoomClick(Rooms rooms) {
        this.adapter.notifyDataSetChanged();
    }

    private void onAddRoom() {
        showAddRoomDialog("", true);
    }

    private void showAddRoomDialog(String str, boolean z) {
        UIHelper.showKeyboard(getActivity());
        DialogHelper.showEdittableDialog(getContext(), str, "Добавить помещение", new OnDialogClick() {
            public void onNegativeClick() {
            }

            public void onPositiveClick(String str, EditText editText) {
                UIHelper.hideKeyboard(ChooseRoomFragment.this.getActivity(), editText);
                ChooseRoomFragment.this.addViewModel.addRoom(str);
            }
        });
    }

    public void onDestroyView() {
        super.onDestroyView();
        Rooms currentRoom = this.chooseRoomSection.getCurrentRoom();
        if (currentRoom != null) {
            SharedHelper.setCurrentRoom(getActivity(), currentRoom.getId(), currentRoom.getTitle());
        }
    }
}
