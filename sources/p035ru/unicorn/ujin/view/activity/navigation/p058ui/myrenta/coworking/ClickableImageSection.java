package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.coworking;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingData;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.coworking.ClickableImageSection */
class ClickableImageSection extends SingleSection<TalkingData, ViewHolder> implements View.OnClickListener {
    PublishProcessor<TalkingData> onImageClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_image_section;
    }

    ClickableImageSection() {
    }

    public PublishProcessor<TalkingData> getOnImageClick() {
        return this.onImageClick;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, TalkingData talkingData, List<Object> list) {
        Picasso.get().load(talkingData.getSchema().getUrl()).into(viewHolder.image);
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        getOnImageClick().onNext(getData());
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.coworking.ClickableImageSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.image = (ImageView) view.findViewById(R.id.image);
            this.image.setOnClickListener(onClickListener);
        }
    }
}
