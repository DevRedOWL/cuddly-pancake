package p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.AgreementSection */
class AgreementSection extends SingleSection<ServiceData, ViewHolder> implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    private PublishProcessor<ServiceData> specialClicks = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.agreement_section;
    }

    AgreementSection() {
    }

    public PublishProcessor<ServiceData> getSpecialClicks() {
        return this.specialClicks;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, ServiceData serviceData, List<Object> list) {
        viewHolder.checkBox.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        viewHolder.text.setText(serviceData.getAgreementMessage());
        viewHolder.checkBox.setChecked(serviceData.isAgree() || !serviceData.getStatus().getValue().toLowerCase().equals("cancel"));
        viewHolder.checkBox.setOnCheckedChangeListener(this);
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        ((ServiceData) getData()).setAgree(!((ServiceData) getData()).isAgree());
        getSpecialClicks().onNext(getData());
        notifySectionChanged();
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ServiceData serviceData = (ServiceData) getData();
        serviceData.setAgree(z);
        getSpecialClicks().onNext(serviceData);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.AgreementSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        CheckBox checkBox;
        TextView text;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.checkBox = (CheckBox) view.findViewById(R.id.cb);
            this.text = (TextView) view.findViewById(R.id.title);
            view.setOnClickListener(onClickListener);
            this.text.setOnClickListener(onClickListener);
        }
    }
}
