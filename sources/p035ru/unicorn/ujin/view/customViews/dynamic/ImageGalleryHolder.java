package p035ru.unicorn.ujin.view.customViews.dynamic;

import android.view.View;
import java.util.Timer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.PassDetailFragment2;
import p035ru.unicorn.ujin.view.customViews.WrapContentHeightViewPager;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Field;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.GalleryField;
import p051me.relex.circleindicator.CircleIndicator;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/dynamic/ImageGalleryHolder;", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "item", "Lru/unicorn/ujin/view/dialogs/dataEntry/Field;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.ImageGalleryHolder */
/* compiled from: ImageGalleryHolder.kt */
public final class ImageGalleryHolder extends BaseViewHolder {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageGalleryHolder(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "itemView");
    }

    public void bind(Field field) {
        Intrinsics.checkNotNullParameter(field, "item");
        GalleryField galleryField = (GalleryField) field;
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        WrapContentHeightViewPager wrapContentHeightViewPager = (WrapContentHeightViewPager) view.findViewById(C5619R.C5622id.vpImageGallery);
        Intrinsics.checkNotNullExpressionValue(wrapContentHeightViewPager, "itemView.vpImageGallery");
        wrapContentHeightViewPager.setAdapter(new ImageGalleryAdapter(galleryField.getImageList(), galleryField.getClickable()));
        if (galleryField.getImageList().size() > 1) {
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            ((CircleIndicator) view2.findViewById(C5619R.C5622id.ciViewPager)).setViewPager((WrapContentHeightViewPager) view3.findViewById(C5619R.C5622id.vpImageGallery));
        } else {
            View view4 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view4, "itemView");
            CircleIndicator circleIndicator = (CircleIndicator) view4.findViewById(C5619R.C5622id.ciViewPager);
            Intrinsics.checkNotNullExpressionValue(circleIndicator, "itemView.ciViewPager");
            circleIndicator.setVisibility(8);
        }
        if (galleryField.getAutoSwipe()) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = new ImageGalleryHolder$bind$TimerTask(this, galleryField);
            new Timer().scheduleAtFixedRate((ImageGalleryHolder$bind$TimerTask) objectRef.element, PassDetailFragment2.CANCEL_DIALOG_DELAY, 6000);
            View view5 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view5, "itemView");
            ((WrapContentHeightViewPager) view5.findViewById(C5619R.C5622id.vpImageGallery)).addOnPageChangeListener(new ImageGalleryHolder$bind$1(this, objectRef, galleryField));
        }
    }
}
