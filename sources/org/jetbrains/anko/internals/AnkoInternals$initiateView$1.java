package org.jetbrains.anko.internals;

import android.content.Context;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 1}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"getConstructor1", "Ljava/lang/reflect/Constructor;", "T", "kotlin.jvm.PlatformType", "Landroid/view/View;", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 5})
/* compiled from: Internals.kt */
final class AnkoInternals$initiateView$1 extends Lambda implements Function0<Constructor<T>> {
    final /* synthetic */ Class $viewClass;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnkoInternals$initiateView$1(Class cls) {
        super(0);
        this.$viewClass = cls;
    }

    public final Constructor<T> invoke() {
        return this.$viewClass.getConstructor(new Class[]{Context.class});
    }
}
