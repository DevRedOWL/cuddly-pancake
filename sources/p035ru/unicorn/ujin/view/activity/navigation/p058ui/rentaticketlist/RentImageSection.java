package p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.RentImageSection */
class RentImageSection extends SingleSection<List<SomeString>, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<List<SomeString>> imageClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_images;
    }

    RentImageSection() {
    }

    public PublishProcessor<List<SomeString>> imageClicks() {
        return this.imageClick;
    }

    public void onClick(View view) {
        ViewHolder viewHolder = (ViewHolder) view.getTag();
        if (viewHolder != null && getAdapterPositionForViewHolder(viewHolder) != -1) {
            List list = (List) getData();
            if (view instanceof ConstraintLayout) {
                this.imageClick.onNext(list);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, List<SomeString> list, List<Object> list2) {
        drawImage(viewHolder, list, this);
    }

    private void drawImage(ViewHolder viewHolder, List<SomeString> list, View.OnClickListener onClickListener) {
        Context context = viewHolder.nsv.getContext();
        viewHolder.f6859ll.removeAllViews();
        for (int i = 0; i < list.size(); i++) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.image_holder, (ViewGroup) null);
            inflate.setOnClickListener(onClickListener);
            inflate.setTag(viewHolder);
            viewHolder.f6859ll.addView(inflate);
            Picasso.get().load(list.get(i).getSomeString()).placeholder((int) R.drawable.ic_svg_zaglushka).into((ImageView) inflate.findViewById(R.id.iv));
        }
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.RentImageSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: ll */
        LinearLayout f6859ll;
        HorizontalScrollView nsv;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.nsv = (HorizontalScrollView) view.findViewById(R.id.nsv);
            this.f6859ll = (LinearLayout) view.findViewById(R.id.ll);
            this.f6859ll.setTag(this);
            this.f6859ll.setOnClickListener(onClickListener);
        }
    }
}
