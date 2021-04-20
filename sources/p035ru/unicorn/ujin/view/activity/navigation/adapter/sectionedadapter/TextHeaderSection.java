package p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import java.util.List;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.TextHeaderSection */
public class TextHeaderSection extends SingleSection<String, ViewHolder> {
    public int getLayoutId() {
        return R.layout.item_text_header_section;
    }

    public TextHeaderSection(String str) {
        setData(str);
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view);
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, String str, List<Object> list) {
        viewHolder.title.setText(str);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.TextHeaderSection$ViewHolder */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(2131363684)
        TextView title;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
        }
    }
}
