package p035ru.unicorn.ujin.view.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.PagerAdapter;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.developerPage.CarouselPhoto;
import p035ru.unicorn.ujin.data.realm.ComplexInfo;
import p035ru.unicorn.ujin.util.GlideApp;
import p035ru.unicorn.ujin.view.activity.UrlCarouselViewActivity;
import p035ru.unicorn.ujin.viewModel.RealmViewModel;

/* renamed from: ru.unicorn.ujin.view.adapters.ViewPagerAdapter */
public class ViewPagerAdapter extends PagerAdapter {
    private String complexId;
    private Context context;
    private LayoutInflater layoutInflater;
    /* access modifiers changed from: private */
    public RealmViewModel viewModel;

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public ViewPagerAdapter(Context context2, RealmViewModel realmViewModel, String str) {
        this.context = context2;
        this.viewModel = realmViewModel;
        this.complexId = str;
    }

    public int getCount() {
        return this.viewModel.getComplexInfoById(this.complexId).getImageList().size();
    }

    public Object instantiateItem(ViewGroup viewGroup, final int i) {
        this.layoutInflater = LayoutInflater.from(this.context);
        View inflate = this.layoutInflater.inflate(R.layout.layout_pager, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.imageView2);
        final ComplexInfo complexInfoById = this.viewModel.getComplexInfoById(this.complexId);
        if (complexInfoById != null) {
            if (complexInfoById.getImageListBytes() == null || complexInfoById.getImageListBytes().size() != complexInfoById.getImageList().size()) {
                this.viewModel.updateComplexInfoByteImageList(complexInfoById);
            } else if (complexInfoById.getImageListBytes().get(i) != null) {
                GlideApp.with((View) imageView).load(complexInfoById.getImageListBytes().get(i)).into(imageView);
            }
            GlideApp.with((View) imageView).load(complexInfoById.getImageList().get(i)).listener((RequestListener) new RequestListener<Drawable>() {
                public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
                    return false;
                }

                public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z) {
                    Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                    ViewPagerAdapter.this.viewModel.updateComplexInfoPicture(complexInfoById, i, byteArrayOutputStream.toByteArray());
                    return false;
                }
            }).into(imageView);
        }
        imageView.setOnClickListener(new View.OnClickListener(imageView, i) {
            private final /* synthetic */ ImageView f$1;
            private final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                ViewPagerAdapter.lambda$instantiateItem$0(ComplexInfo.this, this.f$1, this.f$2, view);
            }
        });
        viewGroup.addView(inflate, 0);
        return inflate;
    }

    static /* synthetic */ void lambda$instantiateItem$0(ComplexInfo complexInfo, ImageView imageView, int i, View view) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = complexInfo.getImageList().iterator();
        while (it.hasNext()) {
            arrayList.add(new CarouselPhoto(it.next(), "", ""));
        }
        UrlCarouselViewActivity.start(imageView.getContext(), arrayList, (ArrayList<Integer>) null, (String) null, i, false);
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }
}
