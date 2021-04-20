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
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.CurrentDeviceSection */
public class CurrentDeviceSection extends SingleSection<SomeString, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<SomeString> specialClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_current_device;
    }

    public PublishProcessor<SomeString> specialClicks() {
        return this.specialClick;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        if ((view.getTag() instanceof ViewHolder) && getAdapterPositionForViewHolder((ViewHolder) view.getTag()) != -1) {
            this.specialClick.onNext((SomeString) getData());
        }
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, SomeString someString, List<Object> list) {
        viewHolder.value.setText(someString.getSomeString());
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.CurrentDeviceSection$ViewHolder */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(2131362384)
        ImageView delete;
        @BindView(2131363987)
        TextView value;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            ButterKnife.bind((Object) this, view);
            this.delete = (ImageView) view.findViewById(R.id.delete);
            this.value = (TextView) view.findViewById(R.id.value);
            view.setTag(this);
            view.setOnClickListener(onClickListener);
        }
    }
}
