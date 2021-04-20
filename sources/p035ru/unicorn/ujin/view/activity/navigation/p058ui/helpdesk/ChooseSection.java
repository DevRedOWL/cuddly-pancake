package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ChooseSection */
public class ChooseSection extends SingleSection<SomeString, ViewHolder> implements View.OnClickListener {
    public static final String ARROW_VISABILITY = "arrow_visability";
    public static final String NAME = "name";
    private boolean hideTitle;
    private PublishProcessor<SomeString> onClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.choose_rent__section;
    }

    public PublishProcessor<SomeString> getOnCkick() {
        return this.onClick;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        ViewHolder viewHolder = (ViewHolder) view.getTag();
        if (viewHolder != null && getAdapterPositionForViewHolder(viewHolder) != -1) {
            getOnCkick().onNext((SomeString) getData());
        }
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, SomeString someString, List<Object> list) {
        int i = 0;
        viewHolder.title.setVisibility(this.hideTitle ? 8 : 0);
        viewHolder.subtitle.setText(someString.getSomeString());
        if (someString.getValues() != null && !someString.getValues().isEmpty()) {
            if (someString.getValues().containsKey("name")) {
                viewHolder.title.setText(someString.getValues().get("name").toString());
            }
            if (someString.getValues().containsKey(ARROW_VISABILITY)) {
                boolean booleanValue = ((Boolean) someString.getValues().get(ARROW_VISABILITY)).booleanValue();
                ImageView imageView = viewHolder.arrow;
                if (!booleanValue) {
                    i = 4;
                }
                imageView.setVisibility(i);
                if (!booleanValue) {
                    viewHolder.arrow.setOnClickListener((View.OnClickListener) null);
                }
            }
        }
    }

    public void setHideTitle(boolean z) {
        this.hideTitle = z;
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ChooseSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView arrow;
        TextView subtitle;
        TextView title;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.title = (TextView) view.findViewById(R.id.title);
            this.subtitle = (TextView) view.findViewById(R.id.subtitle);
            this.arrow = (ImageView) view.findViewById(R.id.arrow);
            this.subtitle.setOnClickListener(onClickListener);
            this.subtitle.setTag(this);
            this.arrow.setOnClickListener(onClickListener);
            this.arrow.setTag(this);
        }
    }
}
