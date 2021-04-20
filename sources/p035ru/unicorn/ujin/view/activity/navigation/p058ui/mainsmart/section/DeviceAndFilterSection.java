package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.section;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.section.DeviceAndFilterSection */
public class DeviceAndFilterSection extends SingleSection<List<Scenario>, ViewHolder> implements View.OnClickListener {
    public static final String ADD_DEVICE = "add_device";
    private boolean hasActiveFilter = false;
    private PublishProcessor<String> onClick = PublishProcessor.create();
    private String title = null;

    public int getLayoutId() {
        return R.layout.item_device_and_filter_sevction;
    }

    public PublishProcessor<String> getOnClick() {
        return this.onClick;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, List<Scenario> list, List<Object> list2) {
        viewHolder.llRoomsFilter.setOnClickListener(this);
        if (this.title != null) {
            viewHolder.labelRoomFilter.setText(this.title);
        }
        viewHolder.itemView.getResources().getColor(this.hasActiveFilter ? R.color.buble_color : R.color.colorYell);
        viewHolder.badge.setVisibility(this.hasActiveFilter ? 0 : 4);
    }

    public void setTitle(String str, String str2) {
        this.title = str;
        this.hasActiveFilter = hasFilter(str2);
        notifySectionChanged();
    }

    public void setActive(String str) {
        this.hasActiveFilter = hasFilter(str);
        notifySectionChanged();
    }

    private boolean hasFilter(String str) {
        return str != null && !Hardware.LABEL_FILTER_ALL.equals(str) && !Hardware.ALL.equals(str);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.image_config) {
            this.onClick.onNext(ADD_DEVICE);
        } else if (id == R.id.ll_filter) {
            this.onClick.onNext(Scenario.DEVICES);
        } else if (id == R.id.ll_rooms) {
            this.onClick.onNext(Scenario.ROOMS);
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.section.DeviceAndFilterSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(2131362718)
        ImageView addDevice = ((ImageView) this.itemView.findViewById(R.id.image_config));
        @BindView(2131361998)
        ImageView badge = ((ImageView) this.itemView.findViewById(R.id.badge));
        @BindView(2131362719)
        ImageView imageFilter = ((ImageView) this.itemView.findViewById(R.id.image_filter));
        @BindView(2131362832)
        TextView labelDeviceFilter = ((TextView) this.itemView.findViewById(R.id.label_device_filter));
        @BindView(2131362834)
        TextView labelRoomFilter = ((TextView) this.itemView.findViewById(R.id.label_room_filter));
        @BindView(2131362907)
        ConstraintLayout llDeviceFilter = ((ConstraintLayout) this.itemView.findViewById(R.id.ll_filter));
        @BindView(2131362910)
        LinearLayout llRoomsFilter = ((LinearLayout) this.itemView.findViewById(R.id.ll_rooms));

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            ButterKnife.bind((Object) this, view);
            this.llRoomsFilter.setOnClickListener(onClickListener);
            this.llRoomsFilter.setTag(this);
            this.llDeviceFilter.setOnClickListener(onClickListener);
            this.llDeviceFilter.setTag(this);
            this.addDevice.setOnClickListener(onClickListener);
            this.addDevice.setTag(this);
        }
    }
}
