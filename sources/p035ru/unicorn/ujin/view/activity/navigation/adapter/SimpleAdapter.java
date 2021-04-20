package p035ru.unicorn.ujin.view.activity.navigation.adapter;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.Collections;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.util.GlideApp;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema;
import p035ru.unicorn.ujin.view.adapters.ItemTouchHelperAdapter;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.adapter.SimpleAdapter */
public class SimpleAdapter extends BaseAdapter<Schema, BaseHolder> implements View.OnClickListener, ItemTouchHelperAdapter {
    public static final int TYPE_BOTTON = 2;
    public static final int TYPE_SIMPLE = 0;
    public static final int TYPE_START = 1;
    private PublishProcessor<Schema> simpleClick = PublishProcessor.create();

    public Schema getItemById(String str) {
        return null;
    }

    public PublishProcessor<Schema> simpleClicks() {
        return this.simpleClick;
    }

    /* access modifiers changed from: protected */
    public BaseHolder getViewHolder(View view, int i, int i2) {
        if (i == 0) {
            return new SimpleHolder(LayoutInflater.from(view.getContext()).inflate(R.layout.item_simple, (ViewGroup) view, false), this);
        }
        if (i == 1) {
            return new StartHolder(LayoutInflater.from(view.getContext()).inflate(R.layout.item_start, (ViewGroup) view, false), this);
        }
        if (i != 2) {
            return null;
        }
        return new StartHolder(LayoutInflater.from(view.getContext()).inflate(R.layout.item_bottom, (ViewGroup) view, false), this);
    }

    /* access modifiers changed from: protected */
    public void onBindViewHolder(BaseHolder baseHolder, Schema schema, int i, int i2) {
        if (i == 0) {
            SimpleHolder simpleHolder = (SimpleHolder) baseHolder;
            simpleHolder.descr.setText(Html.fromHtml(schema.getDescription()));
            simpleHolder.title.setText(Html.fromHtml(schema.getTitle()));
            simpleHolder.title.setTypeface(simpleHolder.title.getTypeface(), 1);
            showImage(simpleHolder.icon, schema.getIconUrl(), 30);
            if (schema.getProviderIconUrl() != null && !schema.getProviderIconUrl().isEmpty()) {
                GlideApp.with((View) simpleHolder.iconProvider).load(schema.getProviderIconUrl()).into((ImageView) simpleHolder.iconProvider);
            }
        } else if (i == 1) {
            StartHolder startHolder = (StartHolder) baseHolder;
            startHolder.descr.setText(Html.fromHtml(schema.getDescription()));
            showImage(startHolder.icon, schema.getIconUrl(), 30);
        } else if (i == 2) {
            StartHolder startHolder2 = (StartHolder) baseHolder;
            startHolder2.descr.setText(Html.fromHtml(schema.getTitle()));
            showImage(startHolder2.icon, schema.getIconUrl(), 40);
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

    public boolean onItemMove(int i, int i2) {
        if (i < i2) {
            int i3 = i;
            while (i3 < i2) {
                int i4 = i3 + 1;
                Collections.swap(getData(), i3, i4);
                i3 = i4;
            }
        } else {
            for (int i5 = i; i5 > i2; i5--) {
                Collections.swap(getData(), i5, i5 - 1);
            }
        }
        notifyItemMoved(i, i2);
        return true;
    }

    public void onItemDismiss(int i) {
        getData().remove(i);
        notifyItemRemoved(i);
    }
}
