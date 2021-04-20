package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.EmptySection */
public class EmptySection extends SingleSection<SomeString, TitleHolder> {
    int fontSize = 20;
    boolean isBold = true;

    public int getLayoutId() {
        return R.layout.item_empty;
    }

    public EmptySection() {
    }

    public EmptySection(boolean z, int i) {
        this.isBold = z;
        this.fontSize = i;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(TitleHolder titleHolder, SomeString someString, List<Object> list) {
        titleHolder.title.setTextSize((float) this.fontSize);
        if (this.isBold) {
            titleHolder.title.setTypeface((Typeface) null, 1);
        }
        titleHolder.title.setText(someString.getSomeString());
    }

    /* access modifiers changed from: protected */
    public TitleHolder createViewHolder(View view) {
        return new TitleHolder(view);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.EmptySection$TitleHolder */
    public class TitleHolder extends RecyclerView.ViewHolder {
        @BindView(2131363684)
        TextView title;

        public TitleHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
            this.title = (TextView) view.findViewById(R.id.title);
        }
    }
}
