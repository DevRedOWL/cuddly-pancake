package p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueData;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.BaseKeyValueSection */
public abstract class BaseKeyValueSection extends MultiSection<IKeyValueData, ViewHolder> implements View.OnClickListener {
    Map<IKeyValueData.OPTIONS, Object> options;
    private PublishProcessor<IKeyValueData> specialClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_key_value_base;
    }

    public PublishProcessor<IKeyValueData> specialClicks() {
        return this.specialClick;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void setValues(Map<IKeyValueData.OPTIONS, Object> map) {
        this.options = map;
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.BaseKeyValueSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView arrow;
        public TextView label;
        public TextView value;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.label = (TextView) view.findViewById(R.id.title);
            this.value = (TextView) view.findViewById(R.id.subtitle);
            this.arrow = (ImageView) view.findViewById(R.id.arrow);
            view.setTag(this);
            view.setOnClickListener(onClickListener);
        }
    }
}
