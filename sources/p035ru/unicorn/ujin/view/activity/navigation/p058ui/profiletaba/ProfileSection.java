package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.util.GlideApp;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profiletaba.ProfileSection */
public class ProfileSection extends MultiSection<Schema, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<Schema> specialClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_profile_bottom;
    }

    public PublishProcessor<Schema> specialClicks() {
        return this.specialClick;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, Schema schema, int i, List<Object> list) {
        showImage(viewHolder.icon, schema.getIconUrl(), 30);
        viewHolder.label.setText(schema.getTitle());
        viewHolder.description.setText(schema.getDescription());
    }

    private void showImage(ImageView imageView, String str, int i) {
        if (str == null || str.isEmpty()) {
            str = "https://pro100.media/api/ihome/images/icons/icons8-heating-room-50_negative.png?r=8";
        }
        imageView.setColorFilter(imageView.getResources().getColor(R.color.brandAppSchemaIconColor), PorterDuff.Mode.SRC_ATOP);
        int dpToPx = dpToPx((float) i, imageView.getContext());
        GlideApp.with(imageView.getContext()).load(str).override(dpToPx, dpToPx).into(imageView);
    }

    private int dpToPx(float f, Context context) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        ViewHolder viewHolder = (ViewHolder) view.getTag();
        if (viewHolder != null) {
            this.specialClick.onNext((Schema) getData(getAdapterPositionForViewHolder(viewHolder)));
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profiletaba.ProfileSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView description;
        ImageView icon;
        TextView label;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.icon = (ImageView) view.findViewById(R.id.icon);
            this.label = (TextView) view.findViewById(R.id.label);
            this.description = (TextView) view.findViewById(R.id.description);
            view.setTag(this);
            view.setOnClickListener(onClickListener);
        }
    }
}
