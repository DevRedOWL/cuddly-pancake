package p035ru.unicorn.ujin.view.customViews.dynamic;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import p035ru.unicorn.ujin.data.developerPage.CarouselPhoto;
import p035ru.unicorn.ujin.view.activity.UrlCarouselViewActivity;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.C5992Image;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.ImageGalleryAdapter$instantiateItem$2 */
/* compiled from: ImageGalleryHolder.kt */
final class ImageGalleryAdapter$instantiateItem$2 implements View.OnClickListener {
    final /* synthetic */ ImageView $imageView;
    final /* synthetic */ int $position;
    final /* synthetic */ ImageGalleryAdapter this$0;

    ImageGalleryAdapter$instantiateItem$2(ImageGalleryAdapter imageGalleryAdapter, ImageView imageView, int i) {
        this.this$0 = imageGalleryAdapter;
        this.$imageView = imageView;
        this.$position = i;
    }

    public final void onClick(View view) {
        Context context = this.$imageView.getContext();
        ArrayList arrayList = new ArrayList();
        Iterable<C5992Image> access$getGallery$p = this.this$0.gallery;
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(access$getGallery$p, 10));
        for (C5992Image url : access$getGallery$p) {
            arrayList2.add(Boolean.valueOf(arrayList.add(new CarouselPhoto(url.getUrl(), "", ""))));
        }
        List list = (List) arrayList2;
        Unit unit = Unit.INSTANCE;
        UrlCarouselViewActivity.start(context, arrayList, (ArrayList<Integer>) null, "", this.$position, false);
    }
}
