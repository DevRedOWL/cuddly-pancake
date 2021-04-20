package p035ru.unicorn.ujin.view.activity.navigation.entity.scenario;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.BaseAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.BaseHolder;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.Rooms;
import p046io.reactivex.subjects.BehaviorSubject;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.scenario.RoomsAdapter */
public class RoomsAdapter extends BaseAdapter<SomeString, RoomsHolder> {
    public static final int TYPE_BUBBLE = 1;
    public static final int TYPE_UNDERLINE = 0;
    private int backgroundRes;
    public int currentSelectedItem = 0;
    /* access modifiers changed from: private */
    public BehaviorSubject<String> filterSubject = BehaviorSubject.createDefault(Hardware.ALL);
    OnFilterHardware onFilterHardware;

    public SomeString getItemById(String str) {
        return null;
    }

    public BehaviorSubject<String> getFilterSubject() {
        return this.filterSubject;
    }

    public RoomsAdapter(int i, OnFilterHardware onFilterHardware2) {
        this.backgroundRes = i == 0 ? R.drawable.bg_underline : R.drawable.bg_bubble_white;
        this.onFilterHardware = onFilterHardware2;
    }

    /* access modifiers changed from: protected */
    public RoomsHolder getViewHolder(View view, int i, int i2) {
        return new RoomsHolder(LayoutInflater.from(view.getContext()).inflate(R.layout.item_rooms, (ViewGroup) view, false));
    }

    /* access modifiers changed from: protected */
    public void onBindViewHolder(RoomsHolder roomsHolder, SomeString someString, int i, int i2) {
        roomsHolder.descr.setText(someString.getSomeString());
        if (this.currentSelectedItem == i2) {
            roomsHolder.descr.setBackgroundResource(this.backgroundRes);
        } else {
            roomsHolder.descr.setBackground((Drawable) null);
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.scenario.RoomsAdapter$RoomsHolder */
    public class RoomsHolder extends BaseHolder implements View.OnClickListener {
        @BindView(2131363481)
        TextView descr;
        @BindView(2131362679)
        ImageView icon;

        public RoomsHolder(View view) {
            super(view);
            view.setTag(this);
            view.setOnClickListener(this);
        }

        public void onClick(View view) {
            RoomsAdapter.this.currentSelectedItem = getAdapterPosition();
            if (RoomsAdapter.this.currentSelectedItem == RoomsAdapter.this.getItemCount()) {
                RoomsAdapter.this.filterSubject.onNext(Rooms.ADD_ROOM);
            }
            if (RoomsAdapter.this.currentSelectedItem != -1) {
                RoomsAdapter roomsAdapter = RoomsAdapter.this;
                RoomsAdapter.this.filterSubject.onNext(((SomeString) roomsAdapter.getItem(roomsAdapter.currentSelectedItem)).getSomeString());
            }
            RoomsAdapter.this.notifyDataSetChanged();
        }
    }
}
