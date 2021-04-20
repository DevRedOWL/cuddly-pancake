package p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofon;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.IntercomVal;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofon.DomofonListSection */
public class DomofonListSection extends MultiSection<IntercomVal, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<IntercomVal> specialClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_domofon;
    }

    public PublishProcessor<IntercomVal> getSpecialClick() {
        return this.specialClick;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(final ViewHolder viewHolder, IntercomVal intercomVal, int i, List<Object> list) {
        viewHolder.tvTitle.setText(intercomVal.getName());
        int i2 = 0;
        if (intercomVal.getPreview() == null || intercomVal.getPreview().isEmpty()) {
            viewHolder.tvNoPreview.setVisibility(0);
        } else {
            Picasso.get().load(intercomVal.getPreview()).into(viewHolder.ivPreview, new Callback() {
                public void onSuccess() {
                    viewHolder.tvNoPreview.setVisibility(8);
                }

                public void onError(Exception exc) {
                    viewHolder.tvNoPreview.setVisibility(0);
                }
            });
        }
        DynamicBackgroundButton dynamicBackgroundButton = viewHolder.btnOpen;
        if (intercomVal.isButtonNeedHide()) {
            i2 = 8;
        }
        dynamicBackgroundButton.setVisibility(i2);
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        ViewHolder viewHolder = (ViewHolder) view.getTag();
        if (viewHolder != null) {
            IntercomVal intercomVal = (IntercomVal) getData(getAdapterPositionForViewHolder(viewHolder));
            if (view.getId() == R.id.btnOpen) {
                intercomVal.setOpenDoor(true);
                getSpecialClick().onNext(intercomVal);
                return;
            }
            intercomVal.setOpenDoor(false);
            getSpecialClick().onNext(intercomVal);
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofon.DomofonListSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        DynamicBackgroundButton btnOpen;
        ImageView ivPreview;
        TextView tvNoPreview;
        TextView tvTitle;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.btnOpen = (DynamicBackgroundButton) view.findViewById(R.id.btnOpen);
            this.ivPreview = (ImageView) view.findViewById(R.id.ivPreview);
            this.tvTitle = (TextView) view.findViewById(R.id.tvTitle);
            this.tvNoPreview = (TextView) view.findViewById(R.id.tvNoPreview);
            this.tvTitle.setOnClickListener(onClickListener);
            this.tvTitle.setTag(this);
            this.ivPreview.setOnClickListener(onClickListener);
            this.ivPreview.setTag(this);
            this.btnOpen.setOnClickListener(onClickListener);
            this.btnOpen.setTag(this);
        }
    }
}
