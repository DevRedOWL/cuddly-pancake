package org.jetbrains.anko;

import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 1}, mo51342d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aC\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u001a\b\b\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\bH\b\u001a>\u0010\u0000\u001a\u00020\u0001*\u00020\u000b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\b\u001aG\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\f2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u001a\b\b\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\bH\b¨\u0006\r"}, mo51343d2 = {"selector", "", "Landroid/app/Fragment;", "title", "", "items", "", "onClick", "Lkotlin/Function2;", "Landroid/content/DialogInterface;", "", "Landroid/content/Context;", "Lorg/jetbrains/anko/AnkoContext;", "commons_release"}, mo51344k = 2, mo51345mv = {1, 1, 5})
/* compiled from: AndroidSelectors.kt */
public final class AndroidSelectorsKt {
    public static /* bridge */ /* synthetic */ void selector$default(AnkoContext ankoContext, CharSequence charSequence, List list, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = null;
        }
        Intrinsics.checkParameterIsNotNull(ankoContext, "$receiver");
        Intrinsics.checkParameterIsNotNull(list, FirebaseAnalytics.Param.ITEMS);
        Intrinsics.checkParameterIsNotNull(function2, "onClick");
        selector(ankoContext.getCtx(), charSequence, (List<? extends CharSequence>) list, (Function2<? super DialogInterface, ? super Integer, Unit>) function2);
    }

    public static final void selector(AnkoContext<?> ankoContext, CharSequence charSequence, List<? extends CharSequence> list, Function2<? super DialogInterface, ? super Integer, Unit> function2) {
        Intrinsics.checkParameterIsNotNull(ankoContext, "$receiver");
        Intrinsics.checkParameterIsNotNull(list, FirebaseAnalytics.Param.ITEMS);
        Intrinsics.checkParameterIsNotNull(function2, "onClick");
        selector(ankoContext.getCtx(), charSequence, list, function2);
    }

    public static /* bridge */ /* synthetic */ void selector$default(Fragment fragment, CharSequence charSequence, List list, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = null;
        }
        Intrinsics.checkParameterIsNotNull(fragment, "$receiver");
        Intrinsics.checkParameterIsNotNull(list, FirebaseAnalytics.Param.ITEMS);
        Intrinsics.checkParameterIsNotNull(function2, "onClick");
        selector((Context) fragment.getActivity(), charSequence, (List<? extends CharSequence>) list, (Function2<? super DialogInterface, ? super Integer, Unit>) function2);
    }

    public static final void selector(Fragment fragment, CharSequence charSequence, List<? extends CharSequence> list, Function2<? super DialogInterface, ? super Integer, Unit> function2) {
        Intrinsics.checkParameterIsNotNull(fragment, "$receiver");
        Intrinsics.checkParameterIsNotNull(list, FirebaseAnalytics.Param.ITEMS);
        Intrinsics.checkParameterIsNotNull(function2, "onClick");
        selector((Context) fragment.getActivity(), charSequence, list, function2);
    }

    public static /* bridge */ /* synthetic */ void selector$default(Context context, CharSequence charSequence, List list, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = null;
        }
        selector(context, charSequence, (List<? extends CharSequence>) list, (Function2<? super DialogInterface, ? super Integer, Unit>) function2);
    }

    public static final void selector(Context context, CharSequence charSequence, List<? extends CharSequence> list, Function2<? super DialogInterface, ? super Integer, Unit> function2) {
        Intrinsics.checkParameterIsNotNull(context, "$receiver");
        Intrinsics.checkParameterIsNotNull(list, FirebaseAnalytics.Param.ITEMS);
        Intrinsics.checkParameterIsNotNull(function2, "onClick");
        AndroidAlertBuilder androidAlertBuilder = new AndroidAlertBuilder(context);
        if (charSequence != null) {
            androidAlertBuilder.setTitle(charSequence);
        }
        androidAlertBuilder.items(list, function2);
        androidAlertBuilder.show();
    }
}
