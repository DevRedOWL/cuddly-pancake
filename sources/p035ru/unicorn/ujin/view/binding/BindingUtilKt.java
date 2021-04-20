package p035ru.unicorn.ujin.view.binding;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.BindingAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u0004H\u0007\u001a\u0018\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, mo51343d2 = {"drawable", "", "iv", "Landroid/widget/ImageView;", "Landroid/graphics/drawable/Drawable;", "textSizeValue", "tv", "Landroid/widget/TextView;", "size", "", "app_kortrosRelease"}, mo51344k = 2, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.binding.BindingUtilKt */
/* compiled from: BindingUtil.kt */
public final class BindingUtilKt {
    @BindingAdapter({"src_drawable"})
    public static final void drawable(ImageView imageView, Drawable drawable) {
        Intrinsics.checkNotNullParameter(imageView, "iv");
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        imageView.setImageDrawable(drawable);
    }

    @BindingAdapter({"src_text_size"})
    public static final void textSizeValue(TextView textView, int i) {
        Intrinsics.checkNotNullParameter(textView, "tv");
        if (i == 0) {
            textView.setTextSize((float) 14);
        } else {
            textView.setTextSize((float) i);
        }
    }
}
