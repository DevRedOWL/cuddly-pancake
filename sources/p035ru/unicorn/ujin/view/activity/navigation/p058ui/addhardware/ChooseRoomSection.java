package p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.Rooms;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.ChooseRoomSection */
public class ChooseRoomSection extends MultiSection<Rooms, ViewHolder> implements View.OnClickListener {
    public int currentId = -1;
    public int selectioPosition = -1;
    private PublishProcessor<Rooms> specialClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_choose_room;
    }

    public PublishProcessor<Rooms> specialClicks() {
        return this.specialClick;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, Rooms rooms, int i, List<Object> list) {
        viewHolder.title.setText(rooms.getTitle());
    }

    public void onClick(View view) {
        int adapterPositionForViewHolder;
        if ((view.getTag() instanceof ViewHolder) && (adapterPositionForViewHolder = getAdapterPositionForViewHolder((ViewHolder) view.getTag())) != -1) {
            this.selectioPosition = adapterPositionForViewHolder;
            Rooms rooms = (Rooms) getData(adapterPositionForViewHolder);
            this.currentId = rooms.getId().intValue();
            this.specialClick.onNext(rooms);
        }
    }

    public void setCurrentId(int i) {
        this.currentId = i;
    }

    public Rooms getCurrentRoom() {
        int i = this.selectioPosition;
        if (i == -1) {
            return null;
        }
        return (Rooms) getData(i);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.ChooseRoomSection$ViewHolder */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(2131362384)
        ImageView delete;
        @BindView(2131363684)
        TextView title;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            ButterKnife.bind((Object) this, view);
            this.title = (TextView) view.findViewById(R.id.title);
            this.delete = (ImageView) view.findViewById(R.id.delete);
            view.setTag(this);
            view.setOnClickListener(onClickListener);
        }
    }
}
