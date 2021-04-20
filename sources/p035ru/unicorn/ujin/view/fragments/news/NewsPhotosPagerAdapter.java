package p035ru.unicorn.ujin.view.fragments.news;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.PagerAdapter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.ImageData;
import p035ru.unicorn.ujin.util.GlideApp;
import p035ru.unicorn.ujin.util.GlideRequests;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\u0010\tJ \u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0007H\u0016J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/news/NewsPhotosPagerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "photosList", "Lio/realm/RealmList;", "Lru/unicorn/ujin/data/realm/ImageData;", "clickListener", "Lkotlin/Function1;", "", "", "(Lio/realm/RealmList;Lkotlin/jvm/functions/Function1;)V", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "getPhotosList", "()Lio/realm/RealmList;", "destroyItem", "container", "Landroid/view/ViewGroup;", "position", "object", "", "getCount", "instantiateItem", "isViewFromObject", "", "view", "Landroid/view/View;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.news.NewsPhotosPagerAdapter */
/* compiled from: NewsPhotosPagerAdapter.kt */
public final class NewsPhotosPagerAdapter extends PagerAdapter {
    private final Function1<Integer, Unit> clickListener;
    private final RealmList<ImageData> photosList;

    public boolean isViewFromObject(View view, Object obj) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(obj, "object");
        return view == obj;
    }

    public NewsPhotosPagerAdapter(RealmList<ImageData> realmList, Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(realmList, "photosList");
        Intrinsics.checkNotNullParameter(function1, "clickListener");
        this.photosList = realmList;
        this.clickListener = function1;
    }

    public final Function1<Integer, Unit> getClickListener() {
        return this.clickListener;
    }

    public final RealmList<ImageData> getPhotosList() {
        return this.photosList;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        Intrinsics.checkNotNullParameter(obj, "object");
        viewGroup.removeView((View) obj);
    }

    public int getCount() {
        return this.photosList.size();
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_photo_news, viewGroup, false);
        if (inflate != null) {
            ImageView imageView = (ImageView) inflate;
            imageView.setOnClickListener(new NewsPhotosPagerAdapter$instantiateItem$1(this, i));
            View view = imageView;
            GlideRequests with = GlideApp.with(view);
            ImageData imageData = this.photosList.get(i);
            with.load(imageData != null ? imageData.getSource() : null).into(imageView);
            viewGroup.addView(view, 0);
            return imageView;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
    }
}
