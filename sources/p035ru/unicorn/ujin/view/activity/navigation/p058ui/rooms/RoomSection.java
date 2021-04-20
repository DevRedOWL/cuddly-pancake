package p035ru.unicorn.ujin.view.activity.navigation.p058ui.rooms;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rooms.RoomSection */
public class RoomSection extends MultiSection<SomePair, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<SomePair> specialClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_room;
    }

    public PublishProcessor<SomePair> specialClicks() {
        return this.specialClick;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, SomePair somePair, int i, List<Object> list) {
        viewHolder.title.setText(somePair.getTitle());
        int count = somePair.getCount();
        viewHolder.device.setText(viewHolder.device.getContext().getResources().getQuantityString(R.plurals.plurals_device_count, count, new Object[]{Integer.valueOf(count)}));
        if (i != 0) {
            viewHolder.delete.setVisibility(0);
        }
    }

    public void onClick(View view) {
        int adapterPositionForViewHolder;
        if ((view.getTag() instanceof ViewHolder) && (adapterPositionForViewHolder = getAdapterPositionForViewHolder((ViewHolder) view.getTag())) != -1) {
            this.specialClick.onNext((SomePair) getData(adapterPositionForViewHolder));
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rooms.RoomSection$ViewHolder */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(2131362384)
        ImageView delete;
        @BindView(2131362406)
        TextView device;
        @BindView(2131363684)
        TextView title;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            ButterKnife.bind((Object) this, view);
            this.title = (TextView) view.findViewById(R.id.title);
            this.device = (TextView) view.findViewById(R.id.device);
            this.delete = (ImageView) view.findViewById(R.id.delete);
            this.delete.setTag(this);
            this.delete.setOnClickListener(onClickListener);
        }
    }
}
