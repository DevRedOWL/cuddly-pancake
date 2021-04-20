package p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.AddRoomSection */
public class AddRoomSection extends SingleSection<SomeString, TitleHolder> implements View.OnClickListener {
    private PublishProcessor<SomeString> classDeviceClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_title;
    }

    public PublishProcessor<SomeString> specialClicks() {
        return this.classDeviceClick;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(TitleHolder titleHolder, SomeString someString, List<Object> list) {
        titleHolder.title.setText("+ Добавить другое помещение");
    }

    /* access modifiers changed from: protected */
    public TitleHolder createViewHolder(View view) {
        return new TitleHolder(view, this);
    }

    public void onClick(View view) {
        specialClicks().onNext(new SomeString(""));
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.AddRoomSection$TitleHolder */
    public class TitleHolder extends RecyclerView.ViewHolder {
        @BindView(2131363684)
        TextView title;

        public TitleHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            ButterKnife.bind((Object) this, view);
            this.title = (TextView) view.findViewById(R.id.title);
            view.setOnClickListener(onClickListener);
        }
    }
}
