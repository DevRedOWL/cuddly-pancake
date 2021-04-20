package p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets;

import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.tickets.ButtonSection */
public class ButtonSection extends SingleSection<ButtonModel, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<Integer> onClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_button_section;
    }

    public PublishProcessor<Integer> getOnClick() {
        return this.onClick;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, ButtonModel buttonModel, List<Object> list) {
        viewHolder.button.setText(buttonModel.getTitle());
    }

    public void onClick(View view) {
        if (((ViewHolder) view.getTag()) != null) {
            this.onClick.onNext(((ButtonModel) getData()).getKey());
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.tickets.ButtonSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        Button button;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.button = (Button) view.findViewById(R.id.button);
            this.button.setOnClickListener(onClickListener);
            this.button.setTag(this);
        }
    }
}
