package p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist;

import android.text.Html;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.FakeSection */
public class FakeSection extends SingleSection<SomeString, ViewHolder> {
    public int getLayoutId() {
        return R.layout.fake_section;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, SomeString someString, List<Object> list) {
        viewHolder.textView.setText(Html.fromHtml(someString.getSomeString()));
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.FakeSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public ViewHolder(View view) {
            super(view);
            this.textView = (TextView) view.findViewById(R.id.textView);
        }
    }
}
