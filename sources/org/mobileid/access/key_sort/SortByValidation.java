package org.mobileid.access.key_sort;

import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.mobileid.access.key.Key;
import org.mobileid.access.key.KeyAction;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo51343d2 = {"Lorg/mobileid/access/key_sort/SortByValidation;", "Lorg/mobileid/access/key_sort/Sort;", "", "Lorg/mobileid/access/key/Key;", "keyList", "sortKeys", "(Ljava/util/List;)Ljava/util/List;", "<init>", "()V", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
public final class SortByValidation implements Sort {

    /* renamed from: org.mobileid.access.key_sort.SortByValidation$a */
    public static final class C5494a<T> implements Comparator<Key> {

        /* renamed from: a */
        public static final C5494a f6377a = new C5494a();

        public int compare(Object obj, Object obj2) {
            KeyAction validate = ((Key) obj).validate();
            KeyAction validate2 = ((Key) obj2).validate();
            KeyAction keyAction = KeyAction.USE;
            if (validate == keyAction && validate2 == keyAction) {
                return 0;
            }
            return validate != KeyAction.USE ? 1 : -1;
        }
    }

    public List<Key> sortKeys(List<? extends Key> list) {
        Intrinsics.checkNotNullParameter(list, "keyList");
        return CollectionsKt.sortedWith(list, C5494a.f6377a);
    }
}
