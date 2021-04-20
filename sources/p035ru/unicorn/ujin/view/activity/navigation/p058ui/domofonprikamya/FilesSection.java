package p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.FilesSection */
class FilesSection extends MultiSection<FilesUrl, ViewHolder> {
    public int getLayoutId() {
        return R.layout.files_name_section;
    }

    FilesSection() {
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, FilesUrl filesUrl, int i, List<Object> list) {
        viewHolder.title.setText(filesUrl.getFileName());
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.FilesSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;

        public ViewHolder(View view) {
            super(view);
            this.title = (TextView) view.findViewById(R.id.title);
        }
    }
}
