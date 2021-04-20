package p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter;

import android.view.View;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.BaseKeyValueSection;
import p035ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueData;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.KeyValueSection */
public class KeyValueSection extends BaseKeyValueSection {
    /* access modifiers changed from: protected */
    public void bindViewHolder(BaseKeyValueSection.ViewHolder viewHolder, IKeyValueData iKeyValueData, int i, List<Object> list) {
        if (iKeyValueData.getOptions() != null) {
            this.options = iKeyValueData.getOptions();
        } else {
            this.options = null;
        }
        if (iKeyValueData.getKey() != null) {
            viewHolder.label.setText(iKeyValueData.getKey());
        }
        if (iKeyValueData.getValue() != null) {
            viewHolder.value.setText((String) iKeyValueData.getValue());
        }
        if (this.options != null && this.options.containsKey(IKeyValueData.OPTIONS.ARROW)) {
            viewHolder.arrow.setVisibility(0);
        }
        if (this.options != null && this.options.containsKey(IKeyValueData.OPTIONS.ARROW_DOWN)) {
            viewHolder.arrow.setVisibility(0);
            viewHolder.arrow.setImageResource(R.drawable.ic_svg_arrow_down);
            viewHolder.arrow.setOnClickListener(this);
        }
    }

    public void onClick(View view) {
        BaseKeyValueSection.ViewHolder viewHolder = (BaseKeyValueSection.ViewHolder) view.getTag();
        if (viewHolder != null) {
            specialClicks().onNext((IKeyValueData) getData(getAdapterPositionForViewHolder(viewHolder)));
        }
    }
}
