package collections;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 1}, mo51342d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a3\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005H\b\u001a'\u0010\u0000\u001a\u00020\u0001*\u00020\u00072\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0005H\b\u001a'\u0010\u0000\u001a\u00020\u0001*\u00020\t2\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\b¨\u0006\n"}, mo51343d2 = {"forEach", "", "E", "Landroid/util/SparseArray;", "action", "Lkotlin/Function2;", "", "Landroid/util/SparseBooleanArray;", "", "Landroid/util/SparseIntArray;", "commons_release"}, mo51344k = 2, mo51345mv = {1, 1, 5})
/* compiled from: SparseArrays.kt */
public final class SparseArraysKt {
    public static final <E> void forEach(SparseArray<E> sparseArray, Function2<? super Integer, ? super E, Unit> function2) {
        Intrinsics.checkParameterIsNotNull(sparseArray, "$receiver");
        Intrinsics.checkParameterIsNotNull(function2, "action");
        int size = sparseArray.size();
        int i = size - 1;
        if (i >= 0) {
            int i2 = 0;
            while (size == sparseArray.size()) {
                function2.invoke(Integer.valueOf(sparseArray.keyAt(i2)), sparseArray.valueAt(i2));
                if (i2 != i) {
                    i2++;
                } else {
                    return;
                }
            }
            throw new ConcurrentModificationException();
        }
    }

    public static final void forEach(SparseBooleanArray sparseBooleanArray, Function2<? super Integer, ? super Boolean, Unit> function2) {
        Intrinsics.checkParameterIsNotNull(sparseBooleanArray, "$receiver");
        Intrinsics.checkParameterIsNotNull(function2, "action");
        int size = sparseBooleanArray.size();
        int i = size - 1;
        if (i >= 0) {
            int i2 = 0;
            while (size == sparseBooleanArray.size()) {
                function2.invoke(Integer.valueOf(sparseBooleanArray.keyAt(i2)), Boolean.valueOf(sparseBooleanArray.valueAt(i2)));
                if (i2 != i) {
                    i2++;
                } else {
                    return;
                }
            }
            throw new ConcurrentModificationException();
        }
    }

    public static final void forEach(SparseIntArray sparseIntArray, Function2<? super Integer, ? super Integer, Unit> function2) {
        Intrinsics.checkParameterIsNotNull(sparseIntArray, "$receiver");
        Intrinsics.checkParameterIsNotNull(function2, "action");
        int size = sparseIntArray.size();
        int i = size - 1;
        if (i >= 0) {
            int i2 = 0;
            while (size == sparseIntArray.size()) {
                function2.invoke(Integer.valueOf(sparseIntArray.keyAt(i2)), Integer.valueOf(sparseIntArray.valueAt(i2)));
                if (i2 != i) {
                    i2++;
                } else {
                    return;
                }
            }
            throw new ConcurrentModificationException();
        }
    }
}
