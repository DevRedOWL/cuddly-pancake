package p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.tickets.AccountDataSection */
public class AccountDataSection extends MultiSection<AccountModel, ViewHolder> {
    public int getLayoutId() {
        return R.layout.item_tickets;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view);
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, AccountModel accountModel, int i, List<Object> list) {
        viewHolder.key.setText(accountModel.getKey());
        viewHolder.value.setText(accountModel.getValue());
        if (i == getData().size() - 1) {
            viewHolder.placeholder.setVisibility(0);
        } else {
            viewHolder.placeholder.setVisibility(8);
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.tickets.AccountDataSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView key;
        View placeholder;
        TextView value;

        public ViewHolder(View view) {
            super(view);
            this.key = (TextView) view.findViewById(R.id.key);
            this.value = (TextView) view.findViewById(R.id.value);
            this.placeholder = view.findViewById(R.id.placeholder);
        }
    }
}
