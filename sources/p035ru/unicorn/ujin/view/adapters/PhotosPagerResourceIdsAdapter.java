package p035ru.unicorn.ujin.view.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.PagerAdapter;
import com.bumptech.glide.Glide;
import java.util.ArrayList;
import p035ru.unicorn.ujin.view.customViews.photoView.PhotoView;

/* renamed from: ru.unicorn.ujin.view.adapters.PhotosPagerResourceIdsAdapter */
public class PhotosPagerResourceIdsAdapter extends PagerAdapter {
    private ArrayList<Integer> images;

    public CharSequence getPageTitle(int i) {
        return "";
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public PhotosPagerResourceIdsAdapter(ArrayList<Integer> arrayList) {
        this.images = arrayList;
    }

    public int getCount() {
        return this.images.size();
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        PhotoView photoView = new PhotoView(viewGroup.getContext());
        Glide.with((View) photoView).load(this.images.get(i)).into((ImageView) photoView);
        viewGroup.addView(photoView);
        return photoView;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }
}
