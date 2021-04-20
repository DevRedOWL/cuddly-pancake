package p035ru.unicorn.ujin.view.activity.navigation.p058ui.rooms;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rooms.DeviceModelSection */
public class DeviceModelSection extends SingleSection<SomeString, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<SomeString> specialClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_device_model;
    }

    public PublishProcessor<SomeString> specialClicks() {
        return this.specialClick;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, SomeString someString, List<Object> list) {
        viewHolder.value.setText(someString.getSomeString());
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        this.specialClick.onNext(new SomeString(""));
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rooms.DeviceModelSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(2131363987)
        TextView value;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            ButterKnife.bind((Object) this, view);
            this.value = (TextView) view.findViewById(R.id.value);
        }
    }
}
