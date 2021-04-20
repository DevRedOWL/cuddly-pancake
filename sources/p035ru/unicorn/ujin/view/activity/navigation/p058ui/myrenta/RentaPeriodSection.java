package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentaPeriodSection */
public class RentaPeriodSection extends MultiSection<RentInfo, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<RentInfo> showUsers = PublishProcessor.create();
    private PublishProcessor<RentInfo> specialClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_rent_periods;
    }

    public PublishProcessor<RentInfo> specialClicks() {
        return this.specialClick;
    }

    public PublishProcessor<RentInfo> showUsersClicks() {
        return this.showUsers;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        int adapterPositionForViewHolder;
        ViewHolder viewHolder = (ViewHolder) view.getTag();
        if (viewHolder != null && (adapterPositionForViewHolder = getAdapterPositionForViewHolder(viewHolder)) != -1) {
            RentInfo rentInfo = (RentInfo) getData(adapterPositionForViewHolder);
            if (view.getId() == viewHolder.delete.getId()) {
                this.specialClick.onNext(rentInfo);
            } else if (view.getId() == viewHolder.person.getId()) {
                this.showUsers.onNext(rentInfo);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, RentInfo rentInfo, int i, List<Object> list) {
        viewHolder.label.setText(DateUtils.formatDateShort(rentInfo.getStartDate().longValue() * 1000));
        viewHolder.subtitle.setText(DateUtils.formatTime(Long.valueOf(rentInfo.getStartDate().longValue() * 1000)) + " - " + DateUtils.formatTime(Long.valueOf(rentInfo.getFinishDate().longValue() * 1000)));
        viewHolder.count.setText(String.valueOf(rentInfo.getRentersCount()));
        viewHolder.delete.setVisibility(rentInfo.getRentPermissions().isCanManage() ? 0 : 4);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentaPeriodSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView count;
        ImageView delete;
        TextView label;
        ImageView person;
        TextView subtitle;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.label = (TextView) view.findViewById(R.id.title);
            this.subtitle = (TextView) view.findViewById(R.id.subtitle);
            this.delete = (ImageView) view.findViewById(R.id.delete);
            this.count = (TextView) view.findViewById(R.id.count);
            this.person = (ImageView) view.findViewById(R.id.person);
            this.delete.setTag(this);
            this.delete.setOnClickListener(onClickListener);
            this.person.setTag(this);
            this.person.setOnClickListener(onClickListener);
        }
    }
}
