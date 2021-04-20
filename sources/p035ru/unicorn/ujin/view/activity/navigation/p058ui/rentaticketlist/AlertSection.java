package p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.AlertSection */
class AlertSection extends SingleSection<SomeString, ViewHolder> {
    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, SomeString someString, List<Object> list) {
    }

    public int getLayoutId() {
        return R.layout.alert_section;
    }

    AlertSection() {
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.AlertSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View view) {
            super(view);
        }
    }
}
