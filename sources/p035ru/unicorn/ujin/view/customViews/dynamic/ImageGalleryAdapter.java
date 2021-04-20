package p035ru.unicorn.ujin.view.customViews.dynamic;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.C5992Image;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.GalleryField;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/dynamic/ImageGalleryAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "gallery", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/dialogs/dataEntry/Image;", "Lkotlin/collections/ArrayList;", "clickable", "", "(Ljava/util/ArrayList;Z)V", "getClickable", "()Z", "destroyItem", "", "container", "Landroid/view/ViewGroup;", "position", "", "object", "", "getCount", "instantiateItem", "isViewFromObject", "view", "Landroid/view/View;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.ImageGalleryAdapter */
/* compiled from: ImageGalleryHolder.kt */
public final class ImageGalleryAdapter extends PagerAdapter {
    private final boolean clickable;
    /* access modifiers changed from: private */
    public final ArrayList<C5992Image> gallery;

    public boolean isViewFromObject(View view, Object obj) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(obj, "object");
        return view == obj;
    }

    public ImageGalleryAdapter(ArrayList<C5992Image> arrayList, boolean z) {
        Intrinsics.checkNotNullParameter(arrayList, GalleryField.JsonFields.fieldName);
        this.gallery = arrayList;
        this.clickable = z;
    }

    public final boolean getClickable() {
        return this.clickable;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        Intrinsics.checkNotNullParameter(obj, "object");
        viewGroup.removeView((View) obj);
    }

    public int getCount() {
        return this.gallery.size();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object instantiateItem(android.view.ViewGroup r6, int r7) {
        /*
            r5 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 0
            r2 = 2131558591(0x7f0d00bf, float:1.8742502E38)
            android.view.View r0 = r0.inflate(r2, r6, r1)
            if (r0 == 0) goto L_0x00a5
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            java.util.ArrayList<ru.unicorn.ujin.view.dialogs.dataEntry.Image> r2 = r5.gallery
            java.lang.Object r2 = r2.get(r7)
            ru.unicorn.ujin.view.dialogs.dataEntry.Image r2 = (p035ru.unicorn.ujin.view.dialogs.dataEntry.C5992Image) r2
            ru.unicorn.ujin.view.dialogs.dataEntry.ImageMeta r3 = r2.getMetaData()
            r4 = -1
            if (r3 == 0) goto L_0x002d
            int r3 = r3.getWidth()
            goto L_0x002e
        L_0x002d:
            r3 = -1
        L_0x002e:
            if (r3 <= 0) goto L_0x0076
            ru.unicorn.ujin.view.dialogs.dataEntry.ImageMeta r3 = r2.getMetaData()
            if (r3 == 0) goto L_0x003a
            int r4 = r3.getHeight()
        L_0x003a:
            if (r4 <= 0) goto L_0x0076
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.CENTER
            r0.setScaleType(r3)
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            ru.unicorn.ujin.util.GlideRequests r3 = p035ru.unicorn.ujin.util.GlideApp.with((android.view.View) r3)
            java.util.ArrayList<ru.unicorn.ujin.view.dialogs.dataEntry.Image> r4 = r5.gallery
            java.lang.Object r4 = r4.get(r7)
            ru.unicorn.ujin.view.dialogs.dataEntry.Image r4 = (p035ru.unicorn.ujin.view.dialogs.dataEntry.C5992Image) r4
            java.lang.String r4 = r4.getUrl()
            ru.unicorn.ujin.util.GlideRequest r3 = r3.load((java.lang.String) r4)
            ru.unicorn.ujin.view.dialogs.dataEntry.ImageMeta r4 = r2.getMetaData()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r4 = r4.getWidth()
            ru.unicorn.ujin.view.dialogs.dataEntry.ImageMeta r2 = r2.getMetaData()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r2 = r2.getHeight()
            ru.unicorn.ujin.util.GlideRequest r2 = r3.override((int) r4, (int) r2)
            r2.into((android.widget.ImageView) r0)
            goto L_0x0090
        L_0x0076:
            r2 = r0
            android.view.View r2 = (android.view.View) r2
            ru.unicorn.ujin.util.GlideRequests r2 = p035ru.unicorn.ujin.util.GlideApp.with((android.view.View) r2)
            java.util.ArrayList<ru.unicorn.ujin.view.dialogs.dataEntry.Image> r3 = r5.gallery
            java.lang.Object r3 = r3.get(r7)
            ru.unicorn.ujin.view.dialogs.dataEntry.Image r3 = (p035ru.unicorn.ujin.view.dialogs.dataEntry.C5992Image) r3
            java.lang.String r3 = r3.getUrl()
            ru.unicorn.ujin.util.GlideRequest r2 = r2.load((java.lang.String) r3)
            r2.into((android.widget.ImageView) r0)
        L_0x0090:
            r2 = r0
            android.view.View r2 = (android.view.View) r2
            r6.addView(r2, r1)
            boolean r6 = r5.clickable
            if (r6 == 0) goto L_0x00a4
            ru.unicorn.ujin.view.customViews.dynamic.ImageGalleryAdapter$instantiateItem$2 r6 = new ru.unicorn.ujin.view.customViews.dynamic.ImageGalleryAdapter$instantiateItem$2
            r6.<init>(r5, r0, r7)
            android.view.View$OnClickListener r6 = (android.view.View.OnClickListener) r6
            r0.setOnClickListener(r6)
        L_0x00a4:
            return r0
        L_0x00a5:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "null cannot be cast to non-null type android.widget.ImageView"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.customViews.dynamic.ImageGalleryAdapter.instantiateItem(android.view.ViewGroup, int):java.lang.Object");
    }
}
