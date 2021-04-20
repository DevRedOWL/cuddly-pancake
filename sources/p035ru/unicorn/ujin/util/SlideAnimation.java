package p035ru.unicorn.ujin.util;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J(\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, mo51343d2 = {"Lru/unicorn/ujin/util/SlideAnimation;", "Landroid/view/animation/Animation;", "view", "Landroid/view/View;", "fromHeight", "", "toHeight", "(Landroid/view/View;II)V", "getFromHeight", "()I", "setFromHeight", "(I)V", "getToHeight", "setToHeight", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "applyTransformation", "", "interpolatedTime", "", "transformation", "Landroid/view/animation/Transformation;", "initialize", "width", "height", "parentWidth", "parentHeight", "willChangeBounds", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.util.SlideAnimation */
/* compiled from: SlideAnimation.kt */
public final class SlideAnimation extends Animation {
    private int fromHeight;
    private int toHeight;
    private View view;

    public boolean willChangeBounds() {
        return true;
    }

    public SlideAnimation(View view2, int i, int i2) {
        Intrinsics.checkNotNullParameter(view2, "view");
        this.view = view2;
        this.fromHeight = i;
        this.toHeight = i2;
    }

    public final int getFromHeight() {
        return this.fromHeight;
    }

    public final int getToHeight() {
        return this.toHeight;
    }

    public final View getView() {
        return this.view;
    }

    public final void setFromHeight(int i) {
        this.fromHeight = i;
    }

    public final void setToHeight(int i) {
        this.toHeight = i;
    }

    public final void setView(View view2) {
        Intrinsics.checkNotNullParameter(view2, "<set-?>");
        this.view = view2;
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        int height = this.view.getHeight();
        int i = this.toHeight;
        if (height != i) {
            int i2 = this.fromHeight;
            this.view.getLayoutParams().height = (int) (((float) i2) + (((float) (i - i2)) * f));
            this.view.requestLayout();
        }
    }

    public void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
    }
}
