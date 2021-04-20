package p035ru.unicorn.ujin.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, mo51343d2 = {"ru/unicorn/ujin/util/AnimationUtils$animateViewMaxLines$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.util.AnimationUtils$animateViewMaxLines$1 */
/* compiled from: AnimationUtils.kt */
public final class AnimationUtils$animateViewMaxLines$1 extends AnimatorListenerAdapter {
    final /* synthetic */ Function0 $onAnimatedEnd;

    AnimationUtils$animateViewMaxLines$1(Function0 function0) {
        this.$onAnimatedEnd = function0;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.$onAnimatedEnd.invoke();
    }
}
