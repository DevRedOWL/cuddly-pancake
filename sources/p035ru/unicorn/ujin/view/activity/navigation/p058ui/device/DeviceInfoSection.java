package p035ru.unicorn.ujin.view.activity.navigation.p058ui.device;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.ButterKnife;
import com.squareup.picasso.Picasso;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.device.DeviceInfoSection */
public class DeviceInfoSection extends SingleSection<Hardware, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<Hardware> specialClicks = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_device_info_section;
    }

    public PublishProcessor<Hardware> getSpecialClicks() {
        return this.specialClicks;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, Hardware hardware, List<Object> list) {
        Resources resources;
        int i;
        Drawable drawable = AppCompatResources.getDrawable(viewHolder.icon.getContext(), R.drawable.ic_svg_plug_device);
        Picasso picasso = Picasso.get();
        picasso.load("https://cndslctl.mysmartflat.ru/" + hardware.getImgApp()).placeholder(drawable).error(drawable).into(viewHolder.icon);
        viewHolder.title.setText(hardware.getTitle());
        viewHolder.tvDescr.setText(hardware.getRoomInfo().getTitle());
        viewHolder.tvState.setText(hardware.getStateText());
        Drawable drawable2 = AppCompatResources.getDrawable(viewHolder.iconState.getContext(), R.drawable.ic_svg_ellipse);
        if (hardware.getStateText().toLowerCase().contains("нет связи")) {
            resources = viewHolder.icon.getResources();
            i = R.color.hardware_inactive;
        } else {
            resources = viewHolder.icon.getResources();
            i = R.color.hardware_active;
        }
        drawable2.setColorFilter(resources.getColor(i), PorterDuff.Mode.SRC_ATOP);
        viewHolder.iconState.setBackground(drawable2);
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        this.specialClicks.onNext(getData());
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.device.DeviceInfoSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView icon;
        ImageView iconState;
        TextView title;
        TextView tvDescr;
        TextView tvState;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            ButterKnife.bind((Object) this, view);
            this.icon = (ImageView) view.findViewById(R.id.icon);
            this.iconState = (ImageView) view.findViewById(R.id.icon_state);
            this.title = (TextView) view.findViewById(R.id.device_title);
            this.tvState = (TextView) view.findViewById(R.id.state);
            this.tvDescr = (TextView) view.findViewById(R.id.device_description);
        }
    }
}
