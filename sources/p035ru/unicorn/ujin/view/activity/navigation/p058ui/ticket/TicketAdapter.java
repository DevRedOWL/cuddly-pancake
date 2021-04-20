package p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.BaseAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.BaseHolder;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.ticket.TicketAdapter */
public class TicketAdapter extends BaseAdapter<TicketList, TicketHolder> {
    /* access modifiers changed from: private */
    public PublishProcessor<TicketList> ticketClick = PublishProcessor.create();

    public TicketList getItemById(String str) {
        return null;
    }

    public PublishProcessor<TicketList> ticketClicks() {
        return this.ticketClick;
    }

    /* access modifiers changed from: protected */
    public TicketHolder getViewHolder(View view, int i, int i2) {
        return new TicketHolder(LayoutInflater.from(view.getContext()).inflate(R.layout.item_ticket, (ViewGroup) view, false));
    }

    /* access modifiers changed from: protected */
    public void onBindViewHolder(TicketHolder ticketHolder, TicketList ticketList, int i, int i2) {
        ticketHolder.tvTicketDate.setText(ticketList.getTickets().getDateTitle());
        ticketHolder.tvTicketSum.setText(ticketList.getTickets().getSum() + ticketList.getTickets().getMeasure());
        ticketHolder.tvTicketSum.setCompoundDrawablesWithIntrinsicBounds(ticketList.getTickets().getPaid().intValue() == 1 ? R.drawable.ic_check : R.drawable.ic_close, 0, 0, 0);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.ticket.TicketAdapter$TicketHolder */
    public class TicketHolder extends BaseHolder implements View.OnClickListener {
        @BindView(2131363963)
        TextView tvTicketDate;
        @BindView(2131363962)
        TextView tvTicketSum;

        public TicketHolder(View view) {
            super(view);
            this.tvTicketDate = (TextView) view.findViewById(R.id.tv_ticket_title);
            this.tvTicketSum = (TextView) view.findViewById(R.id.tv_ticket_summ);
            view.setTag(this);
            view.setOnClickListener(this);
        }

        public void onClick(View view) {
            int adapterPosition = ((TicketHolder) view.getTag()).getAdapterPosition();
            TicketAdapter.this.ticketClick.onNext((TicketList) TicketAdapter.this.getItem(adapterPosition));
        }
    }
}
