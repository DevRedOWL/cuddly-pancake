package p035ru.unicorn.ujin.util;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ$\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0013"}, mo51343d2 = {"Lru/unicorn/ujin/util/AnimationUtils;", "", "()V", "animateViewGone", "", "view", "Landroid/view/View;", "animateViewMaxLines", "lines", "", "textView", "Landroid/widget/TextView;", "onAnimatedEnd", "Lkotlin/Function0;", "animateViewVisible", "rotateView", "from", "", "to", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.util.AnimationUtils */
/* compiled from: AnimationUtils.kt */
public final class AnimationUtils {
    public static final AnimationUtils INSTANCE = new AnimationUtils();

    private AnimationUtils() {
    }

    public final void rotateView(float f, float f2, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new DecelerateInterpolator());
        animationSet.setFillAfter(true);
        animationSet.setFillEnabled(true);
        RotateAnimation rotateAnimation = new RotateAnimation(f, f2, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(500);
        rotateAnimation.setFillAfter(true);
        animationSet.addAnimation(rotateAnimation);
        view.startAnimation(animationSet);
    }

    public final void animateViewMaxLines(int i, TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        ObjectAnimator ofInt = ObjectAnimator.ofInt(textView, "maxLines", new int[]{i});
        Intrinsics.checkNotNullExpressionValue(ofInt, "animation");
        ofInt.setDuration(500);
        ofInt.start();
    }

    public final void animateViewMaxLines(int i, TextView textView, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(function0, "onAnimatedEnd");
        ObjectAnimator ofInt = ObjectAnimator.ofInt(textView, "maxLines", new int[]{i});
        Intrinsics.checkNotNullExpressionValue(ofInt, "animation");
        ofInt.setDuration(500);
        ofInt.addListener(new AnimationUtils$animateViewMaxLines$1(function0));
        ofInt.start();
    }

    public final void animateViewVisible(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setVisibility(0);
        view.setAlpha(0.0f);
        view.animate().translationY(0.0f).alpha(1.0f).setListener((Animator.AnimatorListener) null);
    }

    public final void animateViewGone(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.animate().translationY(-1.0f).alpha(0.0f).setListener(new AnimationUtils$animateViewGone$1(view));
    }
}
