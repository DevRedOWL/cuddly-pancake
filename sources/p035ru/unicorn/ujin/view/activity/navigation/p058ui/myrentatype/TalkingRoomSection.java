package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingData;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.TalkingRoomSection */
public class TalkingRoomSection extends MultiSection<TalkingData, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<List<String>> imageClick;
    private boolean isCoworking;
    private PublishProcessor<TalkingData> specialClick;

    public TalkingRoomSection() {
        this(false);
    }

    public TalkingRoomSection(boolean z) {
        this.specialClick = PublishProcessor.create();
        this.imageClick = PublishProcessor.create();
        this.isCoworking = z;
    }

    public PublishProcessor<TalkingData> specialClicks() {
        return this.specialClick;
    }

    public PublishProcessor<List<String>> imageClicks() {
        return this.imageClick;
    }

    public int getLayoutId() {
        return this.isCoworking ? R.layout.item_coworking : R.layout.item_talking_;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        int adapterPositionForViewHolder;
        ViewHolder viewHolder = (ViewHolder) view.getTag();
        if (viewHolder != null && (adapterPositionForViewHolder = getAdapterPositionForViewHolder(viewHolder)) != -1) {
            TalkingData talkingData = (TalkingData) getData(adapterPositionForViewHolder);
            if (view instanceof ConstraintLayout) {
                this.imageClick.onNext(talkingData.getData());
            } else if (view.getId() == R.id.arrow || view.getId() == R.id.title || view.getId() == R.id.position) {
                this.specialClick.onNext(talkingData);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, TalkingData talkingData, int i, List<Object> list) {
        if (!this.isCoworking) {
            viewHolder.label.setText(talkingData.getAddress());
        } else if (talkingData.isBusy()) {
            viewHolder.label.setText(getSpannableString(viewHolder, talkingData));
        } else {
            viewHolder.label.setText(String.valueOf(talkingData.getAddress()));
        }
        viewHolder.position.setText(talkingData.getTitle());
        if (talkingData.getData() == null || talkingData.getData().isEmpty()) {
            viewHolder.itemView.setOnClickListener((View.OnClickListener) null);
            viewHolder.f6823ll.setVisibility(8);
            return;
        }
        drawImage(viewHolder, talkingData.getData(), this);
    }

    private SpannableString getSpannableString(ViewHolder viewHolder, TalkingData talkingData) {
        String str = "Коворкинг " + talkingData.getAddress();
        if (!talkingData.isBusy()) {
            return new SpannableString(str);
        }
        SpannableString spannableString = new SpannableString(str + "  •  Занято");
        spannableString.setSpan(new ForegroundColorSpan(viewHolder.position.getResources().getColor(R.color.brandMain)), spannableString.length() + -6, spannableString.length(), 33);
        return spannableString;
    }

    private void drawImage(ViewHolder viewHolder, List<String> list, View.OnClickListener onClickListener) {
        Context context = viewHolder.nsv.getContext();
        for (int i = 0; i < list.size(); i++) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.image_holder, (ViewGroup) null);
            inflate.setOnClickListener(onClickListener);
            inflate.setTag(viewHolder);
            viewHolder.f6823ll.addView(inflate);
            Picasso.get().load(list.get(i)).placeholder((int) R.drawable.ic_svg_zaglushka).into((ImageView) inflate.findViewById(R.id.iv));
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.TalkingRoomSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView arrow;
        TextView label;

        /* renamed from: ll */
        LinearLayout f6823ll;
        HorizontalScrollView nsv;
        TextView position;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.position = (TextView) view.findViewById(R.id.position);
            this.label = (TextView) view.findViewById(R.id.title);
            this.nsv = (HorizontalScrollView) view.findViewById(R.id.nsv);
            this.f6823ll = (LinearLayout) view.findViewById(R.id.ll);
            this.arrow = (ImageView) view.findViewById(R.id.arrow);
            this.f6823ll.setTag(this);
            this.f6823ll.setOnClickListener(onClickListener);
            this.arrow.setTag(this);
            this.arrow.setOnClickListener(onClickListener);
            this.label.setTag(this);
            this.label.setOnClickListener(onClickListener);
            this.position.setTag(this);
            this.position.setOnClickListener(onClickListener);
        }
    }
}
