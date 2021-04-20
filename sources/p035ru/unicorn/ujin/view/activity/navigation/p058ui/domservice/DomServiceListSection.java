package p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p046io.reactivex.processors.PublishProcessor;
import p046io.realm.RealmList;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServiceListSection */
public class DomServiceListSection extends MultiSection<DomServiceTariff, ViewHolder> implements View.OnClickListener {
    boolean isDetailType = false;
    private PublishProcessor<DomServiceTariff> specialClick = PublishProcessor.create();

    public PublishProcessor<DomServiceTariff> getSpecialClick() {
        return this.specialClick;
    }

    public int getLayoutId() {
        return isDetailType() ? R.layout.item_domservice_detail : R.layout.item_domservice;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        int adapterPositionForViewHolder;
        ViewHolder viewHolder = (ViewHolder) view.getTag();
        if (viewHolder != null && (adapterPositionForViewHolder = getAdapterPositionForViewHolder(viewHolder)) != -1) {
            getSpecialClick().onNext((DomServiceTariff) getData(adapterPositionForViewHolder));
        }
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, DomServiceTariff domServiceTariff, int i, List<Object> list) {
        RealmList<DomServiceIndicator> indicators = domServiceTariff.getIndicators();
        viewHolder.title.setText(domServiceTariff.getTitle());
        if (isDetailType()) {
            viewHolder.descr.setText(domServiceTariff.getDescription1());
        }
        for (int i2 = 0; i2 < indicators.size(); i2++) {
            Spannable spannableValue = getSpannableValue(indicators.get(i2).getValue(), indicators.get(i2).getUnit(), viewHolder);
            if (i2 == 0) {
                viewHolder.tv1.setText(spannableValue);
            } else if (i2 == 1) {
                viewHolder.tv2.setText(spannableValue);
            } else if (i2 == 2) {
                viewHolder.tv3.setText(spannableValue);
            }
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServiceListSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView descr;
        TextView title;
        TextView tv1;
        TextView tv2;
        TextView tv3;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.tv1 = (TextView) view.findViewById(R.id.tv1);
            this.tv2 = (TextView) view.findViewById(R.id.tv2);
            this.tv3 = (TextView) view.findViewById(R.id.tv3);
            this.title = (TextView) view.findViewById(R.id.label);
            this.descr = (TextView) view.findViewById(R.id.description);
            view.setOnClickListener(onClickListener);
            view.setTag(this);
        }
    }

    private Spannable getSpannableValue(Integer num, String str, ViewHolder viewHolder) {
        SpannableString spannableString = new SpannableString(num + "\n" + str);
        spannableString.setSpan(new ForegroundColorSpan(viewHolder.title.getResources().getColor(R.color.bottomNavigationIconTintSelected)), 0, num.toString().length(), 33);
        spannableString.setSpan(new ForegroundColorSpan(viewHolder.title.getResources().getColor(R.color.brandTextPrimary)), num.toString().length() + 1, num.toString().length() + str.length() + 1, 33);
        return spannableString;
    }

    public void setDetailType(boolean z) {
        this.isDetailType = z;
    }

    public boolean isDetailType() {
        return this.isDetailType;
    }
}
