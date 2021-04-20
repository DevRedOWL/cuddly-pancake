package p035ru.unicorn.ujin.view.extensions;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000Z\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001aa\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003\"\b\b\u0002\u0010\u0001*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0006\u001a\u0004\u0018\u0001H\u00042\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0004\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\bH\bø\u0001\u0000¢\u0006\u0002\u0010\t\u001a{\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003\"\b\b\u0002\u0010\n*\u00020\u0003\"\b\b\u0003\u0010\u0001*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0006\u001a\u0004\u0018\u0001H\u00042\b\u0010\u000b\u001a\u0004\u0018\u0001H\n2 \u0010\u0007\u001a\u001c\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\fH\bø\u0001\u0000¢\u0006\u0002\u0010\r\u001a\u0001\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003\"\b\b\u0002\u0010\n*\u00020\u0003\"\b\b\u0003\u0010\u000e*\u00020\u0003\"\b\b\u0004\u0010\u0001*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0006\u001a\u0004\u0018\u0001H\u00042\b\u0010\u000b\u001a\u0004\u0018\u0001H\n2\b\u0010\u000f\u001a\u0004\u0018\u0001H\u000e2&\u0010\u0007\u001a\"\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\u000e\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0010H\bø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a¯\u0001\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003\"\b\b\u0002\u0010\n*\u00020\u0003\"\b\b\u0003\u0010\u000e*\u00020\u0003\"\b\b\u0004\u0010\u0012*\u00020\u0003\"\b\b\u0005\u0010\u0001*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0006\u001a\u0004\u0018\u0001H\u00042\b\u0010\u000b\u001a\u0004\u0018\u0001H\n2\b\u0010\u000f\u001a\u0004\u0018\u0001H\u000e2\b\u0010\u0013\u001a\u0004\u0018\u0001H\u00122,\u0010\u0007\u001a(\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u0012\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0014H\bø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a\n\u0010\u0016\u001a\u00020\u0017*\u00020\u0018\u001a2\u0010\u0019\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u001a*\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u0002H\u001a\u0012\u0004\u0012\u00020\u00170\u001f\u001a2\u0010\u0019\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u001a*\u00020 2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u0002H\u001a\u0012\u0004\u0012\u00020\u00170\u001f\u001a2\u0010\u0019\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u001a*\u00020 2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001a0!2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u0002H\u001a\u0012\u0004\u0012\u00020\u00170\u001f\u001a\u0012\u0010\"\u001a\u00020\u0017*\u00020\u00182\u0006\u0010#\u001a\u00020$\u0002\u0007\n\u0005\b20\u0001¨\u0006%"}, mo51343d2 = {"safeLet", "R", "T1", "", "T2", "p1", "p2", "block", "Lkotlin/Function2;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "T3", "p3", "Lkotlin/Function3;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "T4", "p4", "Lkotlin/Function4;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "T5", "p5", "Lkotlin/Function5;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "hideKeyboard", "", "Landroid/view/View;", "observe", "T", "Landroidx/appcompat/app/AppCompatActivity;", "data", "Landroidx/lifecycle/LiveData;", "eventCallBack", "Lkotlin/Function1;", "Landroidx/fragment/app/Fragment;", "Landroidx/lifecycle/MutableLiveData;", "setVisible", "visible", "", "app_kortrosRelease"}, mo51344k = 2, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.extensions.ExtensionKt */
/* compiled from: extension.kt */
public final class ExtensionKt {
    public static final <T1, T2, R> R safeLet(T1 t1, T2 t2, Function2<? super T1, ? super T2, ? extends R> function2) {
        Intrinsics.checkNotNullParameter(function2, "block");
        if (t1 == null || t2 == null) {
            return null;
        }
        return function2.invoke(t1, t2);
    }

    public static final <T1, T2, T3, R> R safeLet(T1 t1, T2 t2, T3 t3, Function3<? super T1, ? super T2, ? super T3, ? extends R> function3) {
        Intrinsics.checkNotNullParameter(function3, "block");
        if (t1 == null || t2 == null || t3 == null) {
            return null;
        }
        return function3.invoke(t1, t2, t3);
    }

    public static final <T1, T2, T3, T4, R> R safeLet(T1 t1, T2 t2, T3 t3, T4 t4, Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> function4) {
        Intrinsics.checkNotNullParameter(function4, "block");
        if (t1 == null || t2 == null || t3 == null || t4 == null) {
            return null;
        }
        return function4.invoke(t1, t2, t3, t4);
    }

    public static final <T1, T2, T3, T4, T5, R> R safeLet(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> function5) {
        Intrinsics.checkNotNullParameter(function5, "block");
        if (t1 == null || t2 == null || t3 == null || t4 == null || t5 == null) {
            return null;
        }
        return function5.invoke(t1, t2, t3, t4, t5);
    }

    public static final <T> void observe(AppCompatActivity appCompatActivity, LiveData<T> liveData, Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "$this$observe");
        Intrinsics.checkNotNullParameter(liveData, "data");
        Intrinsics.checkNotNullParameter(function1, "eventCallBack");
        liveData.observe(appCompatActivity, new ExtensionKt$observe$1(function1));
    }

    public static final <T> void observe(Fragment fragment, LiveData<T> liveData, Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragment, "$this$observe");
        Intrinsics.checkNotNullParameter(liveData, "data");
        Intrinsics.checkNotNullParameter(function1, "eventCallBack");
        liveData.observe(fragment.getViewLifecycleOwner(), new ExtensionKt$observe$2(function1));
    }

    public static final <T> void observe(Fragment fragment, MutableLiveData<T> mutableLiveData, Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragment, "$this$observe");
        Intrinsics.checkNotNullParameter(mutableLiveData, "data");
        Intrinsics.checkNotNullParameter(function1, "eventCallBack");
        mutableLiveData.observe(fragment.getViewLifecycleOwner(), new ExtensionKt$observe$3(function1));
    }

    public static final void setVisible(View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "$this$setVisible");
        view.setVisibility(z ? 0 : 8);
    }

    public static final void hideKeyboard(View view) {
        Intrinsics.checkNotNullParameter(view, "$this$hideKeyboard");
        Object systemService = view.getContext().getSystemService("input_method");
        if (systemService != null) {
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }
}
