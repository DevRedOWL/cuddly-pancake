package p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets;

import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.regex.Pattern;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.tickets.TicketDescriptionSection */
public class TicketDescriptionSection extends MultiSection<OperationModel, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<OperationModel> onClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_tickets_operation;
    }

    public PublishProcessor<OperationModel> getOnClick() {
        return this.onClick;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view);
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, OperationModel operationModel, int i, List<Object> list) {
        if (operationModel.getProperties() != null) {
            viewHolder.key.setText(operationModel.getKey());
            Pattern.compile("");
            if (!operationModel.getProperties().getUrl().equals("")) {
                viewHolder.key.setOnClickListener(this);
            }
            viewHolder.key.setTextColor(ContextCompat.getColor(viewHolder.itemView.getContext(), operationModel.getProperties().getValColor()));
            viewHolder.value.setVisibility(operationModel.getProperties().getValVisability());
            return;
        }
        viewHolder.key.setText(operationModel.getKey());
        viewHolder.value.setText(operationModel.getValue());
    }

    public void onClick(View view) {
        this.onClick.onNext(getData(getSize() - 1));
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.tickets.TicketDescriptionSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView key;
        TextView value;

        public ViewHolder(View view) {
            super(view);
            this.key = (TextView) view.findViewById(R.id.key);
            this.value = (TextView) view.findViewById(R.id.value);
            view.setTag(this);
        }
    }
}
