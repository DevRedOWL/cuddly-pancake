package p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.BaseAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.BaseHolder;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.ticket.TicketDetailAdapter */
public class TicketDetailAdapter extends BaseAdapter<TicketDescription, TicketDetailHolder> {
    public TicketDescription getItemById(String str) {
        return null;
    }

    /* access modifiers changed from: protected */
    public TicketDetailHolder getViewHolder(View view, int i, int i2) {
        return new TicketDetailHolder(LayoutInflater.from(view.getContext()).inflate(R.layout.item_ticket_detail, (ViewGroup) view, false));
    }

    /* access modifiers changed from: protected */
    public void onBindViewHolder(TicketDetailHolder ticketDetailHolder, TicketDescription ticketDescription, int i, int i2) {
        ticketDetailHolder.tvTicketDate.setText(ticketDescription.getTitle());
        ticketDetailHolder.tvTicketSum.setText(ticketDescription.getSum());
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.ticket.TicketDetailAdapter$TicketDetailHolder */
    public class TicketDetailHolder extends BaseHolder {
        @BindView(2131363963)
        TextView tvTicketDate;
        @BindView(2131363962)
        TextView tvTicketSum;

        public TicketDetailHolder(View view) {
            super(view);
            view.setTag(this);
            this.tvTicketDate = (TextView) view.findViewById(R.id.tv_ticket_title);
            this.tvTicketSum = (TextView) view.findViewById(R.id.tv_ticket_summ);
        }
    }
}
