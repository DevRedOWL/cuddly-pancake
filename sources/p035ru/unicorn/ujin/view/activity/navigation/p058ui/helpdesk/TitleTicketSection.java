package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TitleTicketSection */
public class TitleTicketSection extends SingleSection<SomeString, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<Integer> onClick = PublishProcessor.create();

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, SomeString someString, List<Object> list) {
    }

    public int getLayoutId() {
        return R.layout.ticket_title_section;
    }

    public PublishProcessor<Integer> getOnClick() {
        return this.onClick;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        int layoutPositionForViewHolder;
        if ((view.getTag() instanceof ViewHolder) && (layoutPositionForViewHolder = getLayoutPositionForViewHolder((ViewHolder) view.getTag())) != -1) {
            getOnClick().onNext(Integer.valueOf(layoutPositionForViewHolder));
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TitleTicketSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        Button createTicket;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.createTicket = (Button) view.findViewById(R.id.new_ticket);
            this.createTicket.setTag(this);
            this.createTicket.setOnClickListener(onClickListener);
        }
    }
}
