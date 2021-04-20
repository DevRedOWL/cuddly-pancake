package p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.ButtonSection */
public class ButtonSection extends SingleSection<ButtonProps, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<ButtonProps> specialClicks = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.button_section;
    }

    public void setType(int i) {
    }

    public PublishProcessor<ButtonProps> getSpecialClicks() {
        return this.specialClicks;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, ButtonProps buttonProps, List<Object> list) {
        viewHolder.button.setEnabled(buttonProps.isEnable());
        viewHolder.button.setText(buttonProps.getTitle());
        if (buttonProps.getType() != null) {
            viewHolder.button.setType(buttonProps.getType());
        }
        if (buttonProps.getBackgroundRes() != 0) {
            viewHolder.button.setBackgroundResource(buttonProps.getBackgroundRes());
        }
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        getSpecialClicks().onNext(getData());
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.ButtonSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        DynamicBackgroundButton button;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.button = (DynamicBackgroundButton) view.findViewById(R.id.button);
            this.button.setOnClickListener(onClickListener);
        }
    }
}
