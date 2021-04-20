package p035ru.unicorn.ujin.view.adapters.marketplace;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewpager.widget.PagerAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.FileData;
import p035ru.unicorn.ujin.util.GlideApp;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u0018\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, mo51343d2 = {"Lru/unicorn/ujin/view/adapters/marketplace/ImagesPagerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "data", "", "Lru/unicorn/ujin/data/realm/FileData;", "context", "Landroid/content/Context;", "(Ljava/util/List;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "destroyItem", "", "container", "Landroid/view/ViewGroup;", "position", "", "object", "", "getCount", "instantiateItem", "isViewFromObject", "", "view", "Landroid/view/View;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.adapters.marketplace.ImagesPagerAdapter */
/* compiled from: ImagesPagerAdapter.kt */
public final class ImagesPagerAdapter extends PagerAdapter {
    private Context context;
    private List<? extends FileData> data;

    public boolean isViewFromObject(View view, Object obj) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(obj, "object");
        return view == obj;
    }

    public ImagesPagerAdapter(List<? extends FileData> list, Context context2) {
        Intrinsics.checkNotNullParameter(list, "data");
        this.data = list;
        this.context = context2;
    }

    public final Context getContext() {
        return this.context;
    }

    public final List<FileData> getData() {
        return this.data;
    }

    public final void setContext(Context context2) {
        this.context = context2;
    }

    public final void setData(List<? extends FileData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public int getCount() {
        return this.data.size();
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        View inflate = LayoutInflater.from(this.context).inflate(R.layout.item_offer_image_pager, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(inflate, "view");
        GlideApp.with((View) (AppCompatImageView) inflate.findViewById(C5619R.C5622id.imageView)).load(((FileData) this.data.get(i)).getUrl()).into((ImageView) (AppCompatImageView) inflate.findViewById(C5619R.C5622id.imageView));
        ((AppCompatImageView) inflate.findViewById(C5619R.C5622id.imageView)).setOnClickListener(new ImagesPagerAdapter$instantiateItem$1(this, i));
        viewGroup.addView(inflate, 0);
        return inflate;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        Intrinsics.checkNotNullParameter(obj, "object");
        viewGroup.removeView((View) obj);
    }
}
