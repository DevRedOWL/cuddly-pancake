package p035ru.unicorn.ujin.util;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/util/LoaderUtils;", "", "()V", "getImageLoader", "Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "context", "Landroid/content/Context;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.util.LoaderUtils */
/* compiled from: LoaderUtils.kt */
public final class LoaderUtils {
    public static final LoaderUtils INSTANCE = new LoaderUtils();

    private LoaderUtils() {
    }

    @JvmStatic
    public static final CircularProgressDrawable getImageLoader(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(context);
        circularProgressDrawable.setStrokeWidth(5.0f);
        circularProgressDrawable.setCenterRadius(30.0f);
        circularProgressDrawable.setColorFilter(new PorterDuffColorFilter(context.getResources().getColor(R.color.gray), PorterDuff.Mode.SRC_ATOP));
        circularProgressDrawable.start();
        return circularProgressDrawable;
    }
}
