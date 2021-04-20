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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.customViews.dynamic.DatePickerViewHolder;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.UpdateTicketSection */
class UpdateTicketSection extends SingleSection<ServiceTicket, ViewHolder> implements View.OnClickListener {
    private boolean hasFiles;
    private PublishProcessor<ServiceTicket> onClick = PublishProcessor.create();
    private PublishProcessor<ServiceTicket> onEvaluateClick = PublishProcessor.create();
    private PublishProcessor<ServiceTicket> onGoChatClick = PublishProcessor.create();
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DatePickerViewHolder.DATE_FORMAT, Locale.getDefault());

    public int getLayoutId() {
        return R.layout.update_ticket_section;
    }

    UpdateTicketSection() {
    }

    public PublishProcessor<ServiceTicket> getOnClick() {
        return this.onClick;
    }

    public PublishProcessor<ServiceTicket> getOnGoChatClick() {
        return this.onGoChatClick;
    }

    public PublishProcessor<ServiceTicket> getOnEvaluateClick() {
        return this.onEvaluateClick;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, ServiceTicket serviceTicket, List<Object> list) {
        viewHolder.title.setText(serviceTicket.getTicketTitle());
        viewHolder.description.setText(serviceTicket.getTicketText());
        viewHolder.ticketNumber.setText(viewHolder.ticketNumber.getResources().getString(R.string.label_ticket, new Object[]{serviceTicket.getNumber()}));
        int i = 8;
        viewHolder.hasPerformer.setVisibility((serviceTicket.getPerformerId() == null || serviceTicket.getPerformerId().equals("0")) ? 8 : 0);
        viewHolder.performer.setText(serviceTicket.getPerformerFio() != null ? serviceTicket.getPerformerFio() : "Не заполнено");
        viewHolder.status.setText(serviceTicket.getTicketStateTitle());
        viewHolder.startTicketDate.setText(viewHolder.startTicketDate.getResources().getString(R.string.label_create_date, new Object[]{getPrettyDate(serviceTicket.getTicketDtStart())}));
        viewHolder.lastChangeTicket.setText(viewHolder.lastChangeTicket.getResources().getString(R.string.label_last_change_date, new Object[]{getPrettyDate(serviceTicket.getTicketDtStart())}));
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
                viewHolder.ratingLayout.setTag(serviceTicket);
                viewHolder.ratingLayout.setOnClickListener(this);
            }
        }
        viewHolder.btnGoChat.setTag(serviceTicket);
        viewHolder.btnGoChat.setOnClickListener(this);
        viewHolder.divider2.setVisibility(this.hasFiles ? 8 : 0);
        TextView textView = viewHolder.tvFilesTitle;
        if (this.hasFiles) {
            i = 0;
        }
        textView.setVisibility(i);
    }

    public void setHasFiles(boolean z) {
        this.hasFiles = z;
    }

    private String getPrettyDate(String str) {
        return this.simpleDateFormat.format(new Date(Long.parseLong(str) * 1000));
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.ratingLayout) {
            getOnEvaluateClick().onNext(getData());
        } else if (view.getId() == R.id.btnGoChat) {
            getOnGoChatClick().onNext(getData());
        } else if (view.getTag() instanceof ViewHolder) {
            getOnClick().onNext(getData());
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.UpdateTicketSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView arrow;
        DynamicBackgroundButton btnGoChat;
        TextView description;
        View divider2;
        ConstraintLayout hasPerformer;
        ImageView ivDotStatus;
        TextView lastChangeTicket;
        TextView performer;
        RatingBar ratingBar;
        ConstraintLayout ratingLayout;
        TextView startTicketDate;
        TextView status;
        TextView ticketNumber;
        TextView title;
        TextView tvEvaluateTicket;
        TextView tvFilesTitle;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.title = (TextView) view.findViewById(R.id.theme_title_value);
            this.description = (TextView) view.findViewById(R.id.theme_desc_value);
            this.ticketNumber = (TextView) view.findViewById(R.id.ticket_number);
            this.hasPerformer = (ConstraintLayout) view.findViewById(R.id.has_performer);
            this.performer = (TextView) view.findViewById(R.id.value_performer);
            this.status = (TextView) view.findViewById(R.id.value_status);
            this.startTicketDate = (TextView) view.findViewById(R.id.value_start_date);
            this.lastChangeTicket = (TextView) view.findViewById(R.id.value_change_date);
            this.arrow = (ImageView) view.findViewById(R.id.arrow);
            this.ratingBar = (RatingBar) view.findViewById(R.id.ratingBar);
            this.ivDotStatus = (ImageView) view.findViewById(R.id.dot);
            this.btnGoChat = (DynamicBackgroundButton) view.findViewById(R.id.btnGoChat);
            this.tvFilesTitle = (TextView) view.findViewById(R.id.tvFilesTitle);
            this.divider2 = view.findViewById(R.id.divider2);
            this.ratingLayout = (ConstraintLayout) view.findViewById(R.id.ratingLayout);
            this.tvEvaluateTicket = (TextView) view.findViewById(R.id.tvEvaluateTicket);
        }
    }
}
