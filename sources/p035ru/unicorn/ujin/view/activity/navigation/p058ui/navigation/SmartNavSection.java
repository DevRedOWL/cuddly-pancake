package p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation;

import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.util.AppUtils;
import p035ru.unicorn.ujin.util.GlideApp;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.navigation.SmartNavSection */
public class SmartNavSection extends MultiSection<Schema, ViewHolder> implements View.OnClickListener {
    public static final int TYPE_BOTTON = 2;
    public static final int TYPE_SIMPLE = 0;
    public static final int TYPE_START = 1;
    private PublishProcessor<Schema> simpleClick = PublishProcessor.create();
    public int type;

    public void onClick(View view) {
    }

    public PublishProcessor<Schema> simpleClicks() {
        return this.simpleClick;
    }

    public int getLayoutId() {
        int i = this.type;
        if (i != 0) {
            return i != 1 ? R.layout.item_bottom : R.layout.item_start;
        }
        return R.layout.item_simple;
    }

    private void showImage(ImageView imageView, String str, int i) {
        if (str == null || str.isEmpty()) {
            str = "https://pro100.media/api/ihome/images/icons/icons8-heating-room-50_negative.png?r=8";
        }
        imageView.setColorFilter(imageView.getResources().getColor(R.color.brandAppSchemaIconColor), PorterDuff.Mode.SRC_ATOP);
        int dpToPx = AppUtils.dpToPx(imageView.getContext(), i);
        GlideApp.with(imageView.getContext()).load(str).override(dpToPx, dpToPx).into(imageView);
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, Schema schema, int i, List<Object> list) {
        viewHolder.descr.setText(schema.getDescription());
        viewHolder.title.setText(schema.getTitle());
        showImage(viewHolder.icon, schema.getIconUrl(), 30);
    }

    public void setType(int i) {
        this.type = i;
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.navigation.SmartNavSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView descr;
        ImageView icon;
        TextView title;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.title = (TextView) view.findViewById(R.id.title);
            this.descr = (TextView) view.findViewById(R.id.state);
            this.icon = (ImageView) view.findViewById(R.id.icon);
            view.setOnClickListener(onClickListener);
            view.setTag(this);
        }
    }
}
