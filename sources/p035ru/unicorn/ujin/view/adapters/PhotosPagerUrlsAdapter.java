package p035ru.unicorn.ujin.view.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.PagerAdapter;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import java.util.ArrayList;
import p035ru.unicorn.ujin.data.developerPage.CarouselPhoto;
import p035ru.unicorn.ujin.view.customViews.photoView.PhotoView;

/* renamed from: ru.unicorn.ujin.view.adapters.PhotosPagerUrlsAdapter */
public class PhotosPagerUrlsAdapter extends PagerAdapter {
    private ArrayList<CarouselPhoto> images;

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public PhotosPagerUrlsAdapter(ArrayList<CarouselPhoto> arrayList) {
        this.images = arrayList;
    }

    public int getCount() {
        return this.images.size();
    }

    public CharSequence getPageTitle(int i) {
        return this.images.get(i).getTitle();
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        PhotoView photoView = new PhotoView(viewGroup.getContext());
        ((RequestBuilder) Glide.with((View) photoView).load(this.images.get(i).getImg()).thumbnail(Glide.with((View) photoView).load(this.images.get(i).getThumbnail())).diskCacheStrategy(DiskCacheStrategy.ALL)).into((ImageView) photoView);
        viewGroup.addView(photoView);
        return photoView;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }
}
