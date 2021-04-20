package p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.StringListSection */
public class StringListSection extends MultiSection<SomeString, ViewHolder> {
    public int getLayoutId() {
        return R.layout.item_string_section;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, SomeString someString, int i, List<Object> list) {
        viewHolder.label.setText(someString.getSomeString());
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.StringListSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView label;

        public ViewHolder(View view) {
            super(view);
            this.label = (TextView) view.findViewById(R.id.label);
        }
    }
}
