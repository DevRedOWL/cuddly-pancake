package p035ru.unicorn.ujin.view.activity.navigation.p058ui.radiodialogfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.Rooms;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.radiodialogfragment.RadioDialogFragment */
public class RadioDialogFragment extends DialogFragment implements View.OnClickListener {
    public static final String ARG_JSON = "arg_json";
    public static final String ARG_LABEL = "arg_label";
    public static final String ARG_TYPE = "arg_type";
    public static final int TYPE_ = 0;
    private RadioChooserAdapter adapter;
    ImageView addRoom;
    @BindView(2131362821)
    TextView label;
    private DialogListener listener;

    /* renamed from: ll */
    LinearLayout f6855ll;
    private View myview;
    @BindView(2131363322)

    /* renamed from: rv */
    RecyclerView f6856rv;
    @BindView(2131363957)
    TextView tvReady;

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.radiodialogfragment.RadioDialogFragment$DialogListener */
    public interface DialogListener {
        void onCancel();

        void onReady(Object obj, String str);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.add_room) {
            onAddRoom(view);
        } else if (id == R.id.ll_tv_ready) {
            onReadyClick(view);
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.myview = layoutInflater.inflate(getArguments().getString("arg_type").equals(Scenario.ROOMS) ? R.layout.dialog_radio_chooser_room : R.layout.dialog_radio_chooser_device, viewGroup);
        this.f6856rv = (RecyclerView) this.myview.findViewById(R.id.rv);
        this.label = (TextView) this.myview.findViewById(R.id.label);
        this.f6855ll = (LinearLayout) this.myview.findViewById(R.id.ll_tv_ready);
        this.f6855ll.setOnClickListener(this);
        this.addRoom = (ImageView) this.myview.findViewById(R.id.add_room);
        this.addRoom.setOnClickListener(this);
        return this.myview;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        ButterKnife.bind((Object) this, view);
        this.label.setText(getArguments().getString("arg_label"));
        initAdapter();
    }

    public static RadioDialogFragment showDialog(String str, ArrayList<String> arrayList, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("arg_label", str);
        bundle.putStringArrayList(ARG_JSON, arrayList);
        bundle.putString("arg_type", str2);
        RadioDialogFragment radioDialogFragment = new RadioDialogFragment();
        radioDialogFragment.setArguments(bundle);
        return radioDialogFragment;
    }

    private void initAdapter() {
        List<RadioChooserObject> list;
        this.adapter = new RadioChooserAdapter();
        if (getArguments().getString("arg_type").equals(Scenario.DEVICES)) {
            list = RadioChooserObject.getData(getArguments().getStringArrayList(ARG_JSON));
            this.adapter.setType(4);
        } else if (getArguments().getString("arg_type").equals(Scenario.ROOMS)) {
            list = RadioChooserObject.getData(getArguments().getStringArrayList(ARG_JSON));
            this.adapter.setType(0);
        } else {
            list = null;
        }
        this.f6856rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        if (list != null) {
            this.adapter.setData(list);
            this.f6856rv.setAdapter(this.adapter);
        }
    }

    public void onReadyClick(View view) {
        RadioChooserObject itemById = this.adapter.getItemById((String) null);
        if (itemById != null) {
            this.listener.onReady(itemById, getArguments().getString("arg_type"));
        }
        dismiss();
    }

    @OnClick({2131361929})
    public void onAddRoom(View view) {
        RadioChooserObject itemById = this.adapter.getItemById((String) null);
        if (itemById != null) {
            this.listener.onReady(itemById, Rooms.ADD_ROOM);
        }
        dismiss();
    }

    public void setListener(DialogListener dialogListener) {
        this.listener = dialogListener;
    }
}
