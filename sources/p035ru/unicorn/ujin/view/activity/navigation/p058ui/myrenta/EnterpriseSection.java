package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.EnterpriseSection */
public class EnterpriseSection extends SingleSection<RentCompany, ViewHolder> implements View.OnClickListener {
    private int position;
    PublishProcessor<Integer> sectionClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.enterprise_section;
    }

    public EnterpriseSection(int i) {
        this.position = i;
    }

    public PublishProcessor<Integer> getSectionClick() {
        return this.sectionClick;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, RentCompany rentCompany, List<Object> list) {
        viewHolder.title.setText(rentCompany.getTitle());
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        getSectionClick().onNext(Integer.valueOf(this.position));
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.EnterpriseSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView arrow;
        TextView title;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.title = (TextView) view.findViewById(R.id.title);
            this.arrow = (ImageView) view.findViewById(R.id.arrow);
            this.arrow.setOnClickListener(onClickListener);
            this.arrow.setTag(this);
        }
    }
}
