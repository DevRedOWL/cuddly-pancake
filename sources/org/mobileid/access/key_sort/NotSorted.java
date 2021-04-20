package org.mobileid.access.key_sort;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.mobileid.access.key.Key;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo51343d2 = {"Lorg/mobileid/access/key_sort/NotSorted;", "Lorg/mobileid/access/key_sort/Sort;", "", "Lorg/mobileid/access/key/Key;", "keyList", "sortKeys", "(Ljava/util/List;)Ljava/util/List;", "<init>", "()V", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
public final class NotSorted implements Sort {
    public List<Key> sortKeys(List<? extends Key> list) {
        Intrinsics.checkNotNullParameter(list, "keyList");
        return list;
    }
}
