package p035ru.unicorn.ujin.view.adapters;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.ujin.view.adapters.ViewPagerBuilderAdapter */
public class ViewPagerBuilderAdapter extends PagerAdapter {
    private Context context;
    private String[] headers;
    private TypedArray images;
    private LayoutInflater layoutInflater;
    private String[] texts;

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public ViewPagerBuilderAdapter(Context context2) {
        this.context = context2;
        this.images = context2.getResources().obtainTypedArray(R.array.builder_icons);
        this.headers = context2.getResources().getStringArray(R.array.builder_titles);
        this.texts = context2.getResources().getStringArray(R.array.builder_descriptions);
    }

    public int getCount() {
        return this.images.length();
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        this.layoutInflater = (LayoutInflater) this.context.getSystemService("layout_inflater");
        View inflate = this.layoutInflater.inflate(R.layout.layout_pager2, (ViewGroup) null);
        ((ImageView) inflate.findViewById(R.id.imageView_pager_ID)).setImageResource(this.images.getResourceId(i, -1));
        ((TextView) inflate.findViewById(R.id.textView_pager_header_ID)).setText(this.headers[i]);
        ((TextView) inflate.findViewById(R.id.textView_pager_ID)).setText(this.texts[i]);
        ((ViewPager) viewGroup).addView(inflate, 0);
        return inflate;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        ((ViewPager) viewGroup).removeView((View) obj);
    }
}
