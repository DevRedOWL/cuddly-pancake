package p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.activity.navigation.api.SignalRemote;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.SignalSettingsSection */
public class SignalSettingsSection extends MultiSection<SignalRemote, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<SignalRemote> specialClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_signal_settings;
    }

    public PublishProcessor<SignalRemote> specialClicks() {
        return this.specialClick;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        int adapterPositionForViewHolder;
        if ((view.getTag() instanceof ViewHolder) && (adapterPositionForViewHolder = getAdapterPositionForViewHolder((ViewHolder) view.getTag())) != -1) {
            this.specialClick.onNext((SignalRemote) getData(adapterPositionForViewHolder));
        }
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, SignalRemote signalRemote, int i, List<Object> list) {
        viewHolder.title.setText(signalRemote.getTitle());
        viewHolder.setCommand.setText(signalRemote.getValue() != null ? "изменить" : "настройка");
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.SignalSettingsSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(2131362110)
        TextView setCommand;
        @BindView(2131363684)
        TextView title;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            ButterKnife.bind((Object) this, view);
            this.title = (TextView) view.findViewById(R.id.title);
            this.setCommand = (TextView) view.findViewById(R.id.btn_settings);
            this.setCommand.setTag(this);
            this.setCommand.setOnClickListener(onClickListener);
        }
    }
}
