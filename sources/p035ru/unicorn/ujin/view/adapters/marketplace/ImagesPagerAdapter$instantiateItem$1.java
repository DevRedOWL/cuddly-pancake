package p035ru.unicorn.ujin.view.adapters.marketplace;

import android.view.View;
import java.util.ArrayList;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.developerPage.CarouselPhoto;
import p035ru.unicorn.ujin.data.realm.FileData;
import p035ru.unicorn.ujin.view.activity.UrlCarouselViewActivity;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.adapters.marketplace.ImagesPagerAdapter$instantiateItem$1 */
/* compiled from: ImagesPagerAdapter.kt */
final class ImagesPagerAdapter$instantiateItem$1 implements View.OnClickListener {
    final /* synthetic */ int $position;
    final /* synthetic */ ImagesPagerAdapter this$0;

    ImagesPagerAdapter$instantiateItem$1(ImagesPagerAdapter imagesPagerAdapter, int i) {
        this.this$0 = imagesPagerAdapter;
        this.$position = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        for (FileData url : this.this$0.getData()) {
            arrayList.add(new CarouselPhoto(url.getUrl(), "", ""));
        }
        UrlCarouselViewActivity.start(view != null ? view.getContext() : null, arrayList, (ArrayList<Integer>) null, (String) null, this.$position, false);
    }
}
