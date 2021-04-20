package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.section;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;
import p035ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect;
import p035ru.unicorn.ujin.view.customViews.IntellectView;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.section.IntellectSection */
public class IntellectSection extends SingleSection<Intellect, TitleHolder> implements IntellectView.OnMakeBetterClick {
    PublishProcessor<String> onClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.intellect_layout_custom;
    }

    public PublishProcessor<String> getOnClick() {
        return this.onClick;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(TitleHolder titleHolder, Intellect intellect, List<Object> list) {
        ((IntellectView) titleHolder.itemView).bindIntellect(intellect.getIntellect().intValue());
    }

    /* access modifiers changed from: protected */
    public TitleHolder createViewHolder(View view) {
        return new TitleHolder(view, this);
    }

    public void onMakeBetterClickListener() {
        getOnClick().onNext("go");
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.section.IntellectSection$TitleHolder */
    public class TitleHolder extends RecyclerView.ViewHolder {
        public TitleHolder(View view, IntellectView.OnMakeBetterClick onMakeBetterClick) {
            super(view);
            ((IntellectView) view).setOnMakeBetterClick(onMakeBetterClick);
        }
    }
}
