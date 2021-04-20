package p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.Rooms;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.CurrentRoomSection */
public class CurrentRoomSection extends SingleSection<Rooms, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<Rooms> specialClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_current_room;
    }

    public PublishProcessor<Rooms> specialClicks() {
        return this.specialClick;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        if ((view.getTag() instanceof ViewHolder) && getAdapterPositionForViewHolder((ViewHolder) view.getTag()) != -1) {
            this.specialClick.onNext((Rooms) getData());
        }
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, Rooms rooms, List<Object> list) {
        viewHolder.value.setText(rooms.getTitle());
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.CurrentRoomSection$ViewHolder */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(2131362384)
        ImageView delete;
        @BindView(2131363684)
        TextView title;
        @BindView(2131363987)
        TextView value;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            ButterKnife.bind((Object) this, view);
            this.title = (TextView) view.findViewById(R.id.title);
            this.delete = (ImageView) view.findViewById(R.id.delete);
            this.value = (TextView) view.findViewById(R.id.value);
            view.setTag(this);
            view.setOnClickListener(onClickListener);
        }
    }
}
