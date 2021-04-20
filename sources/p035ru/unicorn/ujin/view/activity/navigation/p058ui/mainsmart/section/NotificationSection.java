package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.section;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.BaseHolder;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.section.NotificationSection */
public class NotificationSection extends SingleSection<CustomNotification, ViewHolder> implements View.OnClickListener {
    PublishProcessor<CustomNotification> onClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_notification_section;
    }

    public PublishProcessor<CustomNotification> getOnClick() {
        return this.onClick;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, CustomNotification customNotification, List<Object> list) {
        Resources resources;
        int i;
        viewHolder.label.setText(customNotification.getMessage());
        ConstraintLayout constraintLayout = viewHolder.f6791cl;
        if (!customNotification.isError()) {
            resources = viewHolder.f6791cl.getResources();
            i = R.color.green_main;
        } else {
            resources = viewHolder.f6791cl.getResources();
            i = R.color.buble_color;
        }
        constraintLayout.setBackgroundColor(resources.getColor(i));
        viewHolder.f6792ll.setOnClickListener(this);
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        if ((view.getTag() instanceof ViewHolder) && getAdapterPositionForViewHolder((ViewHolder) view.getTag()) != -1) {
            this.onClick.onNext(getData());
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.section.NotificationSection$ViewHolder */
    public class ViewHolder extends BaseHolder {
        @BindView(2131362236)

        /* renamed from: cl */
        ConstraintLayout f6791cl;
        @BindView(2131362679)
        ImageView icon;
        @BindView(2131362821)
        TextView label;
        @BindView(2131362880)

        /* renamed from: ll */
        LinearLayout f6792ll;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.label = (TextView) view.findViewById(R.id.label);
            this.icon = (ImageView) view.findViewById(R.id.icon);
            this.f6791cl = (ConstraintLayout) view.findViewById(R.id.cl);
            this.f6792ll = (LinearLayout) view.findViewById(R.id.ll);
            this.f6792ll.setOnClickListener(onClickListener);
            this.f6792ll.setTag(this);
        }
    }
}
