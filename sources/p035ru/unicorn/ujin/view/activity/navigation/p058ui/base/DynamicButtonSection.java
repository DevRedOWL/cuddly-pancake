package p035ru.unicorn.ujin.view.activity.navigation.p058ui.base;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.base.DynamicButtonSection */
public class DynamicButtonSection extends SingleSection<ButtonModel, ViewHolder> implements View.OnClickListener {
    private DynamicBackgroundButton button = null;
    PublishProcessor<IButtonData> someAction = PublishProcessor.create();
    private DynamicBackgroundButton.Type type;

    public PublishProcessor<IButtonData> getSomeAction() {
        return this.someAction;
    }

    public void setSomeAction(PublishProcessor<IButtonData> publishProcessor) {
        this.someAction = publishProcessor;
    }

    public boolean setEnabled(boolean z) {
        DynamicBackgroundButton dynamicBackgroundButton = this.button;
        if (dynamicBackgroundButton == null) {
            return false;
        }
        dynamicBackgroundButton.setEnabled(z);
        return true;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, ButtonModel buttonModel, List<Object> list) {
        this.button = viewHolder.dbbutton;
        viewHolder.dbbutton.setText(buttonModel.getTitle());
        if (buttonModel.getType().equals(DynamicBackgroundButton.Type.OUTLINED)) {
            viewHolder.dbbutton.setTextColor(viewHolder.dbbutton.getContext().getResources().getColor(R.color.brandTextSecondary));
            viewHolder.dbbutton.invalidate();
        }
    }

    public int getLayoutId() {
        return this.type == null ? R.layout.dynamic_button_section : R.layout.dynamic_button_section_outlined;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        this.someAction.onNext(new IButtonData());
    }

    public void setButtonType(DynamicBackgroundButton.Type type2) {
        this.type = type2;
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.base.DynamicButtonSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        DynamicBackgroundButton dbbutton;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.dbbutton = (DynamicBackgroundButton) view.findViewById(R.id.button);
            this.dbbutton.setTag(this);
            this.dbbutton.setOnClickListener(onClickListener);
        }
    }
}
