package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.CommentsSection */
public class CommentsSection extends MultiSection<ServiceMessages, ViewHolder> {
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy, HH:mm", Locale.getDefault());

    public int getLayoutId() {
        return R.layout.comments_section;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, ServiceMessages serviceMessages, int i, List<Object> list) {
        viewHolder.date.setText(this.simpleDateFormat.format(new Date(Long.parseLong(serviceMessages.getMessageDt()) * 1000)));
        viewHolder.text.setText(serviceMessages.getMessageText());
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.CommentsSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView date;
        TextView text;

        public ViewHolder(View view) {
            super(view);
            this.date = (TextView) view.findViewById(R.id.date);
            this.text = (TextView) view.findViewById(R.id.text);
        }
    }
}
