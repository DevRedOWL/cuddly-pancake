package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.coworking;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.RentChildren;
import p046io.reactivex.processors.PublishProcessor;
import p046io.realm.RealmList;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.coworking.CoworkingChildSection */
public class CoworkingChildSection extends MultiSection<RentChildren, ViewHolder> implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {
    Set<RentChildren> checkedChildren = new HashSet();
    PublishProcessor<Set<RentChildren>> childrenSet = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_co_child;
    }

    public PublishProcessor<Set<RentChildren>> getChildrenSet() {
        return this.childrenSet;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this, this);
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, RentChildren rentChildren, int i, List<Object> list) {
        viewHolder.f6822cb.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        viewHolder.title.setText(rentChildren.getTitle());
        viewHolder.emptyTitle.setText(getEmptyText(viewHolder, rentChildren));
        viewHolder.info.setVisibility(rentChildren.isBusy() ? 0 : 4);
        viewHolder.f6822cb.setChecked(rentChildren.isBusy());
        viewHolder.f6822cb.setEnabled(!rentChildren.isBusy());
        viewHolder.f6822cb.setOnCheckedChangeListener(this);
    }

    private String getEmptyText(ViewHolder viewHolder, RentChildren rentChildren) {
        String str = rentChildren.isBusy() ? "Занято" : "Свободно";
        viewHolder.emptyTitle.setTextColor(ContextCompat.getColor(viewHolder.emptyTitle.getContext(), rentChildren.isBusy() ? R.color.colorAccent : R.color.colorAvailableFree));
        return str;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ViewHolder viewHolder = (ViewHolder) compoundButton.getTag();
        if (viewHolder != null) {
            RentChildren rentChildren = (RentChildren) getData(getAdapterPositionForViewHolder(viewHolder));
            if (z) {
                this.checkedChildren.add(rentChildren);
            } else {
                this.checkedChildren.remove(rentChildren);
            }
            this.childrenSet.onNext(this.checkedChildren);
        }
    }

    public void onClick(View view) {
        ViewHolder viewHolder = (ViewHolder) view.getTag();
        if (viewHolder != null) {
            RentChildren rentChildren = (RentChildren) getData(getAdapterPositionForViewHolder(viewHolder));
            if (view.getId() == R.id.info) {
                showDialog(viewHolder, rentChildren);
            }
        }
    }

    private void showDialog(ViewHolder viewHolder, RentChildren rentChildren) {
        StringBuilder sb = new StringBuilder(viewHolder.title.getContext().getString(R.string.label_rented));
        RealmList<RentInfo> rents = rentChildren.getRents();
        if (rents != null && !rents.isEmpty()) {
            for (int i = 0; i < rents.size(); i++) {
                long longValue = rents.get(i).getStartDate().longValue();
                long longValue2 = rents.get(i).getFinishDate().longValue();
                String formatDate = DateUtils.formatDate(Long.valueOf(longValue * 1000));
                String formatDate2 = DateUtils.formatDate(Long.valueOf(longValue2 * 1000));
                sb.append("\n");
                sb.append("c ");
                sb.append(formatDate);
                sb.append(" по ");
                sb.append(formatDate2);
            }
        }
        DialogHelper.showDialog(viewHolder.info.getContext(), sb.toString());
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.coworking.CoworkingChildSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: cb */
        CheckBox f6822cb;
        TextView emptyTitle;
        ImageView info;
        TextView title;

        public ViewHolder(View view, View.OnClickListener onClickListener, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
            super(view);
            this.title = (TextView) view.findViewById(R.id.title);
            this.emptyTitle = (TextView) view.findViewById(R.id.emptyText);
            this.f6822cb = (CheckBox) view.findViewById(R.id.cb);
            this.info = (ImageView) view.findViewById(R.id.info);
            this.info.setOnClickListener(onClickListener);
            this.info.setTag(this);
            this.f6822cb.setOnCheckedChangeListener(onCheckedChangeListener);
            this.f6822cb.setTag(this);
        }
    }
}
