package p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.math.BigDecimal;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.tickets.FlowSection */
public class FlowSection extends MultiSection<TicketListModel, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<TicketListModel> click = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_ticket_flow;
    }

    public PublishProcessor<TicketListModel> ticketClicks() {
        return this.click;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, TicketListModel ticketListModel, int i, List<Object> list) {
        ticketListModel.isNegativeBalance();
        if (i == getData().size() - 1) {
            viewHolder.last.setVisibility(0);
        } else {
            viewHolder.last.setVisibility(8);
        }
        BigDecimal scale = new BigDecimal(ticketListModel.getBalance().doubleValue()).setScale(2, 4);
        OperationType valueOf = OperationType.valueOf(ticketListModel.getType().toUpperCase());
        int i2 = C59421.f6874x52e146b1[valueOf.ordinal()];
        if (i2 == 1) {
            if (scale.compareTo(BigDecimal.ZERO) > 0) {
                scale = scale.negate();
            }
            viewHolder.sum.setTextColor(viewHolder.f6875cl.getResources().getColor(R.color.negativeSum));
            viewHolder.sum.setVisibility(0);
            fillSummValue(viewHolder, scale);
        } else if (i2 == 2) {
            viewHolder.sum.setTextColor(viewHolder.f6875cl.getResources().getColor(R.color.positiveSum));
            viewHolder.sum.setVisibility(0);
            fillSummValue(viewHolder, ticketListModel.getLastSum());
        } else if (i2 == 3) {
            viewHolder.sum.setTextColor(viewHolder.f6875cl.getResources().getColor(R.color.positiveSum));
            viewHolder.sum.setVisibility(0);
            fillSummValue(viewHolder, scale);
        } else if (i2 == 4) {
            viewHolder.sum.setVisibility(8);
        }
        viewHolder.title.setText(valueOf.getTitle());
        viewHolder.date.setText(ticketListModel.getDate());
        if (valueOf.equals(OperationType.FILL)) {
            OperationState valueOf2 = OperationState.valueOf(ticketListModel.getState().toUpperCase());
            int i3 = C59421.f6873x936fbfa[valueOf2.ordinal()];
            if (i3 == 1) {
                viewHolder.state.setTextColor(viewHolder.f6875cl.getResources().getColor(R.color.textSecondary));
            } else if (i3 == 2) {
                viewHolder.state.setTextColor(viewHolder.f6875cl.getResources().getColor(R.color.positiveSum));
            } else if (i3 == 3) {
                viewHolder.state.setTextColor(viewHolder.f6875cl.getResources().getColor(R.color.negativeSum));
            }
            viewHolder.state.setText(valueOf2.getTitle());
            viewHolder.state.setVisibility(0);
            return;
        }
        viewHolder.state.setVisibility(8);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.tickets.FlowSection$1 */
    static /* synthetic */ class C59421 {

        /* renamed from: $SwitchMap$ru$unicorn$ujin$view$activity$navigation$ui$tickets$OperationState */
        static final /* synthetic */ int[] f6873x936fbfa = new int[OperationState.values().length];

        /* renamed from: $SwitchMap$ru$unicorn$ujin$view$activity$navigation$ui$tickets$OperationType */
        static final /* synthetic */ int[] f6874x52e146b1 = new int[OperationType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0051 */
        static {
            /*
                ru.unicorn.ujin.view.activity.navigation.ui.tickets.OperationState[] r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.OperationState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6873x936fbfa = r0
                r0 = 1
                int[] r1 = f6873x936fbfa     // Catch:{ NoSuchFieldError -> 0x0014 }
                ru.unicorn.ujin.view.activity.navigation.ui.tickets.OperationState r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.OperationState.WAITING_FOR_PAYMENT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f6873x936fbfa     // Catch:{ NoSuchFieldError -> 0x001f }
                ru.unicorn.ujin.view.activity.navigation.ui.tickets.OperationState r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.OperationState.PAYMENT_RECEIVED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = f6873x936fbfa     // Catch:{ NoSuchFieldError -> 0x002a }
                ru.unicorn.ujin.view.activity.navigation.ui.tickets.OperationState r4 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.OperationState.PAYMENT_CANCELED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                ru.unicorn.ujin.view.activity.navigation.ui.tickets.OperationType[] r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.OperationType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f6874x52e146b1 = r3
                int[] r3 = f6874x52e146b1     // Catch:{ NoSuchFieldError -> 0x003d }
                ru.unicorn.ujin.view.activity.navigation.ui.tickets.OperationType r4 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.OperationType.RECEIPT     // Catch:{ NoSuchFieldError -> 0x003d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                int[] r0 = f6874x52e146b1     // Catch:{ NoSuchFieldError -> 0x0047 }
                ru.unicorn.ujin.view.activity.navigation.ui.tickets.OperationType r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.OperationType.FILL     // Catch:{ NoSuchFieldError -> 0x0047 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0047 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                int[] r0 = f6874x52e146b1     // Catch:{ NoSuchFieldError -> 0x0051 }
                ru.unicorn.ujin.view.activity.navigation.ui.tickets.OperationType r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.OperationType.PAYMENT     // Catch:{ NoSuchFieldError -> 0x0051 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0051 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0051 }
            L_0x0051:
                int[] r0 = f6874x52e146b1     // Catch:{ NoSuchFieldError -> 0x005c }
                ru.unicorn.ujin.view.activity.navigation.ui.tickets.OperationType r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.OperationType.EDIT     // Catch:{ NoSuchFieldError -> 0x005c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005c }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005c }
            L_0x005c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.FlowSection.C59421.<clinit>():void");
        }
    }

    private void fillSummValue(ViewHolder viewHolder, Number number) {
        viewHolder.sum.setText(getSpannableValue(Math.abs(number.doubleValue()) + " ₽"));
    }

    public void onClick(View view) {
        int adapterPositionForViewHolder;
        ViewHolder viewHolder = (ViewHolder) view.getTag();
        if (viewHolder != null && (adapterPositionForViewHolder = getAdapterPositionForViewHolder(viewHolder)) != -1) {
            this.click.onNext((TicketListModel) getData(adapterPositionForViewHolder));
        }
    }

    private Spannable getSpannableValue(String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new RelativeSizeSpan(2.0f), 0, str.indexOf(".") + 1, 33);
        return spannableString;
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.tickets.FlowSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView balance;

        /* renamed from: cl */
        ConstraintLayout f6875cl;
        TextView date;
        TextView last;
        TextView state;
        TextView sum;
        TextView title;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.title = (TextView) view.findViewById(R.id.title);
            this.sum = (TextView) view.findViewById(R.id.sum);
            this.f6875cl = (ConstraintLayout) view.findViewById(R.id.cl);
            this.date = (TextView) view.findViewById(R.id.status_date);
            this.last = (TextView) view.findViewById(R.id.last);
            this.state = (TextView) view.findViewById(R.id.state);
            view.setTag(this);
            view.setOnClickListener(onClickListener);
        }
    }
}
