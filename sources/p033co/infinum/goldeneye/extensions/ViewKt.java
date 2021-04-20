package p033co.infinum.goldeneye.extensions;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0004"}, mo51343d2 = {"isMeasured", "", "Landroid/view/View;", "isNotMeasured", "goldeneye_release"}, mo51344k = 2, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.extensions.ViewKt */
/* compiled from: View.kt */
public final class ViewKt {
    public static final boolean isMeasured(View view) {
        Intrinsics.checkParameterIsNotNull(view, "receiver$0");
        return view.getHeight() > 0 && view.getWidth() > 0;
    }

    public static final boolean isNotMeasured(View view) {
        Intrinsics.checkParameterIsNotNull(view, "receiver$0");
        return !isMeasured(view);
    }
}
