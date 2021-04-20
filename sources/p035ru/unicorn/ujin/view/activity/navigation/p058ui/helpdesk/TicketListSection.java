package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.util.AppUtils;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketListSection */
public class TicketListSection extends MultiSection<ServiceTicket, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<ServiceTicket> onClick = PublishProcessor.create();
    private PublishProcessor<ServiceTicket> onEvaluateClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.ticket_section;
    }

    public PublishProcessor<ServiceTicket> getOnClick() {
        return this.onClick;
    }

    public PublishProcessor<ServiceTicket> getOnEvaluateClick() {
        return this.onEvaluateClick;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, ServiceTicket serviceTicket, int i, List<Object> list) {
        viewHolder.title.setText(serviceTicket.getTicketTypeTitle() + " " + serviceTicket.getNumber());
        viewHolder.description.setText(serviceTicket.getTicketTitle());
        viewHolder.date.setText(DateUtils.formatDate(Long.valueOf(Long.parseLong(serviceTicket.getTicketDtStart()) * 1000)));
        viewHolder.status.setTextColor(viewHolder.status.getResources().getColor(R.color.controlTextColor));
        viewHolder.status.setText(serviceTicket.getTicketStateTitle());
        viewHolder.unread.setText(serviceTicket.getUnread());
        viewHolder.unread.setVisibility((serviceTicket.getUnread() == null || serviceTicket.getUnread().equals("0")) ? 4 : 0);
        TicketType byNumber = TicketType.getByNumber(serviceTicket.getTicketStateId());
        if (byNumber != null) {
            viewHolder.ivDotStatus.setColorFilter(ContextCompat.getColor(viewHolder.ivDotStatus.getContext(), byNumber.getColor()));
            if (!byNumber.equals(TicketType.CLOSED)) {
                viewHolder.ratingBar.setVisibility(8);
                viewHolder.tvEvaluateTicket.setVisibility(8);
            } else if (serviceTicket.getRating().floatValue() > 0.0f) {
                viewHolder.tvEvaluateTicket.setVisibility(8);
                viewHolder.ratingBar.setVisibility(0);
                LayerDrawable layerDrawable = (LayerDrawable) viewHolder.ratingBar.getProgressDrawable();
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(viewHolder.ratingBar.getContext().getResources().getColor(R.color.ratingBarColor), PorterDuff.Mode.SRC_ATOP);
                layerDrawable.getDrawable(2).setColorFilter(porterDuffColorFilter);
                layerDrawable.getDrawable(0).setColorFilter(new PorterDuffColorFilter(viewHolder.ratingBar.getContext().getResources().getColor(R.color.ratingBarColorDark), PorterDuff.Mode.SRC_ATOP));
                layerDrawable.getDrawable(1).setColorFilter(porterDuffColorFilter);
                viewHolder.ratingBar.setRating(serviceTicket.getRating().floatValue());
            } else {
                viewHolder.ratingBar.setVisibility(0);
                viewHolder.tvEvaluateTicket.setVisibility(0);
                viewHolder.ratingBar.setRating(0.0f);
                viewHolder.ratingLayout.setTag(getData().get(i));
                viewHolder.ratingLayout.setOnClickListener(this);
            }
        }
        if (i == getSize() - 1) {
            ((RecyclerView.LayoutParams) viewHolder.itemView.getLayoutParams()).bottomMargin = AppUtils.dpToPx(viewHolder.itemView.getContext(), 70);
        } else {
            ((RecyclerView.LayoutParams) viewHolder.itemView.getLayoutParams()).bottomMargin = AppUtils.dpToPx(viewHolder.itemView.getContext(), 0);
        }
    }

    public void onClick(View view) {
        int layoutPositionForViewHolder;
        if (view.getId() == R.id.ratingLayout) {
            getOnEvaluateClick().onNext((ServiceTicket) view.getTag());
        } else if ((view.getTag() instanceof ViewHolder) && (layoutPositionForViewHolder = getLayoutPositionForViewHolder((ViewHolder) view.getTag())) != -1) {
            getOnClick().onNext(getData().get(layoutPositionForViewHolder));
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketListSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView date;
        TextView description;
        ImageView ivDotStatus;
        RatingBar ratingBar;
        ConstraintLayout ratingLayout;
        TextView status;
        TextView title;
        TextView tvEvaluateTicket;
        TextView unread;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.title = (TextView) view.findViewById(R.id.title);
            this.description = (TextView) view.findViewById(R.id.description);
            this.date = (TextView) view.findViewById(R.id.date);
            this.status = (TextView) view.findViewById(R.id.status);
            this.unread = (TextView) view.findViewById(R.id.count);
            this.tvEvaluateTicket = (TextView) view.findViewById(R.id.tvEvaluateTicket);
            this.ratingBar = (RatingBar) view.findViewById(R.id.ratingBar);
            this.ivDotStatus = (ImageView) view.findViewById(R.id.dot);
            this.ratingLayout = (ConstraintLayout) view.findViewById(R.id.ratingLayout);
            view.setTag(this);
            view.setOnClickListener(onClickListener);
        }
    }
}
