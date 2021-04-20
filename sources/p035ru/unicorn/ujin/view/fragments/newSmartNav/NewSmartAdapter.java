package p035ru.unicorn.ujin.view.fragments.newSmartNav;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.util.GlideApp;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.BaseAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.BaseHolder;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.SimpleHolder;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.fragments.newSmartNav.NewSmartAdapter */
public class NewSmartAdapter extends BaseAdapter<Schema, BaseHolder> implements View.OnClickListener {
    private PublishProcessor<Schema> simpleClick = PublishProcessor.create();

    public Schema getItemById(String str) {
        return null;
    }

    public PublishProcessor<Schema> simpleClicks() {
        return this.simpleClick;
    }

    /* access modifiers changed from: protected */
    public BaseHolder getViewHolder(View view, int i, int i2) {
        return new SimpleHolder(LayoutInflater.from(view.getContext()).inflate(R.layout.item_smart_card, (ViewGroup) view, false), this);
    }

    /* access modifiers changed from: protected */
    public void onBindViewHolder(BaseHolder baseHolder, Schema schema, int i, int i2) {
        SimpleHolder simpleHolder = (SimpleHolder) baseHolder;
        simpleHolder.descr.setText(Html.fromHtml(schema.getDescription()));
        simpleHolder.title.setText(Html.fromHtml(schema.getTitle()));
        simpleHolder.title.setTypeface(simpleHolder.title.getTypeface(), 1);
        showImage(simpleHolder.icon, schema.getIconUrl(), 30);
        if (schema.getProviderIconUrl() != null && !schema.getProviderIconUrl().isEmpty()) {
            GlideApp.with((View) simpleHolder.iconProvider).load(schema.getProviderIconUrl()).into((ImageView) simpleHolder.iconProvider);
        }
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

    public void onClick(View view) {
        this.simpleClick.onNext((Schema) getItem(((BaseHolder) view.getTag()).getAdapterPosition()));
    }
}
