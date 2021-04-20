package p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.BaseAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.BaseHolder;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.ticket.AccountAdapter */
public class AccountAdapter extends BaseAdapter<TicketList, TicketHolder> {
    private PublishProcessor<List<Ticket>> accountNumberClick = PublishProcessor.create();

    public TicketList getItemById(String str) {
        return null;
    }

    public PublishProcessor<List<Ticket>> accountClicks() {
        return this.accountNumberClick;
    }

    /* access modifiers changed from: protected */
    public TicketHolder getViewHolder(View view, int i, int i2) {
        return new TicketHolder(LayoutInflater.from(view.getContext()).inflate(R.layout.item_ticket, (ViewGroup) view, false));
    }

    /* access modifiers changed from: protected */
    public void onBindViewHolder(TicketHolder ticketHolder, TicketList ticketList, int i, int i2) {
        ticketHolder.tvTicketDate.setText(ticketList.getTitle());
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.ticket.AccountAdapter$TicketHolder */
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
            ((TicketHolder) view.getTag()).getAdapterPosition();
        }
    }
}
