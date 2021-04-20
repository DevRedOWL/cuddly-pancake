package p035ru.unicorn.ujin.view.activity.navigation.p058ui.morionserviceticket;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueData;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.morionserviceticket.DesireAttributeSection */
public class DesireAttributeSection extends MultiSection<IKeyValueData, C5852VH> {
    public int getLayoutId() {
        return R.layout.item_label_value_section;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(C5852VH vh, IKeyValueData iKeyValueData, int i, List<Object> list) {
        vh.title.setText(iKeyValueData.getKey());
        vh.value.setText(iKeyValueData.getValue().toString());
    }

    /* access modifiers changed from: protected */
    public C5852VH createViewHolder(View view) {
        return new C5852VH(view);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.morionserviceticket.DesireAttributeSection$VH */
    public class C5852VH extends RecyclerView.ViewHolder {
        TextView title;
        TextView value;

        public C5852VH(View view) {
            super(view);
            this.title = (TextView) view.findViewById(R.id.title);
            this.value = (TextView) view.findViewById(R.id.value);
        }
    }
}
