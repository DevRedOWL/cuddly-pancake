package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentaSection */
public class RentaSection extends MultiSection<RentInfo, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<RentInfo> deleteClick = PublishProcessor.create();
    private PublishProcessor<RentInfo> manageClick = PublishProcessor.create();
    protected Map<Integer, List<RentInfo>> periods;
    private PublishProcessor<RentInfo> specialClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_profile_renta;
    }

    public PublishProcessor<RentInfo> getSpecialClick() {
        return this.specialClick;
    }

    public PublishProcessor<RentInfo> deleteClick() {
        return this.deleteClick;
    }

    public PublishProcessor<RentInfo> manageClick() {
        return this.manageClick;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        int adapterPositionForViewHolder;
        if (view.getId() == R.id.delete) {
            this.deleteClick.onNext((RentInfo) view.getTag());
        } else if (view.getId() == R.id.ll) {
            this.manageClick.onNext((RentInfo) view.getTag());
        } else {
            ViewHolder viewHolder = (ViewHolder) view.getTag();
            if (viewHolder != null && (adapterPositionForViewHolder = getAdapterPositionForViewHolder(viewHolder)) != -1) {
                this.specialClick.onNext((RentInfo) getData(adapterPositionForViewHolder));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, RentInfo rentInfo, int i, List<Object> list) {
        viewHolder.label.setText(rentInfo.getPropRenta().getTitle());
        viewHolder.status.setVisibility(8);
        createSubData(viewHolder, rentInfo);
    }

    private void createSubData(ViewHolder viewHolder, RentInfo rentInfo) {
        List list;
        ViewHolder viewHolder2 = viewHolder;
        Context context = viewHolder2.f6820ll.getContext();
        LayoutInflater.from(context).inflate(R.layout.item_rent_periods, viewHolder2.f6820ll, false);
        viewHolder2.f6820ll.removeAllViews();
        Map<Integer, List<RentInfo>> map = this.periods;
        if (map != null && map.containsKey(rentInfo.getPropRenta().getId()) && (list = this.periods.get(rentInfo.getPropRenta().getId())) != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                View inflate = LayoutInflater.from(context).inflate(R.layout.item_rent_periods, viewHolder2.f6820ll, false);
                ImageView imageView = (ImageView) inflate.findViewById(R.id.delete);
                ImageView imageView2 = (ImageView) inflate.findViewById(R.id.person);
                ((TextView) inflate.findViewById(R.id.status)).setText(((RentInfo) list.get(i)).getStateDisplayName());
                ((TextView) inflate.findViewById(R.id.title)).setText(DateUtils.formatDateShort(((RentInfo) list.get(i)).getStartDate().longValue() * 1000));
                ((TextView) inflate.findViewById(R.id.subtitle)).setText(rentInfo.realmGet$startDateHuman() + "\n" + rentInfo.realmGet$finishDateHuman());
                ((TextView) inflate.findViewById(R.id.count)).setText(String.valueOf(((RentInfo) list.get(i)).getRentersCount()));
                imageView.setVisibility(((RentInfo) list.get(i)).getRentPermissions().isCanManage() ? 0 : 4);
                imageView.setOnClickListener(this);
                imageView.setTag(list.get(i));
                viewHolder2.f6820ll.setOnClickListener(this);
                viewHolder2.f6820ll.setTag(list.get(i));
                viewHolder2.f6820ll.addView(inflate);
            }
        }
    }

    public void setPeriods(Map<Integer, List<RentInfo>> map) {
        this.periods = map;
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentaSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView label;

        /* renamed from: ll */
        LinearLayout f6820ll;
        TextView status;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.label = (TextView) view.findViewById(R.id.title);
            this.status = (TextView) view.findViewById(R.id.status);
            this.f6820ll = (LinearLayout) view.findViewById(R.id.ll);
            view.setTag(this);
            view.setOnClickListener(onClickListener);
        }
    }
}
