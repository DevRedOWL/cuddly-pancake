package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.RentTicketListSection */
public class RentTicketListSection extends MultiSection<Tickets, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<Tickets> onClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.ticket_section;
    }

    public PublishProcessor<Tickets> getOnClick() {
        return this.onClick;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        int layoutPositionForViewHolder;
        if ((view.getTag() instanceof ViewHolder) && (layoutPositionForViewHolder = getLayoutPositionForViewHolder((ViewHolder) view.getTag())) != -1) {
            getOnClick().onNext(getData().get(layoutPositionForViewHolder));
        }
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, Tickets tickets, int i, List<Object> list) {
        int i2 = 0;
        viewHolder.title.setText(viewHolder.title.getResources().getString(R.string.label_ticket, new Object[]{String.valueOf(tickets.getTicket().getNumber())}));
        viewHolder.description.setText(tickets.getTicket().getTitle());
        viewHolder.date.setText(DateUtils.formatDate(Long.valueOf(tickets.getTicket().getDateStart() * 1000)));
        viewHolder.status.setTextColor(viewHolder.status.getResources().getColor(R.color.brandMain));
        viewHolder.status.setText(tickets.getTicket().getTicketState().getTitle());
        TextView textView = viewHolder.unread;
        if (tickets.getTicketChatData().getNotRead() == null || (tickets.getTicketChatData().getNotRead() != null && tickets.getTicketChatData().getNotRead().intValue() == 0)) {
            i2 = 4;
        }
        textView.setVisibility(i2);
        viewHolder.unread.setText(tickets.getTicketChatData().getNotRead() != null ? String.valueOf(tickets.getTicketChatData().getNotRead()) : "0");
        viewHolder.ratingLayout.setVisibility(4);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.RentTicketListSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView date;
        TextView description;
        ConstraintLayout ratingLayout;
        TextView status;
        TextView title;
        TextView unread;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.title = (TextView) view.findViewById(R.id.title);
            this.description = (TextView) view.findViewById(R.id.description);
            this.date = (TextView) view.findViewById(R.id.date);
            this.status = (TextView) view.findViewById(R.id.status);
            this.unread = (TextView) view.findViewById(R.id.count);
            this.ratingLayout = (ConstraintLayout) view.findViewById(R.id.ratingLayout);
            view.setTag(this);
            view.setOnClickListener(onClickListener);
        }
    }
}
