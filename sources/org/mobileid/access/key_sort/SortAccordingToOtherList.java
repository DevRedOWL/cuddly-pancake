package org.mobileid.access.key_sort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.mobileid.access.key.Key;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0007\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, mo51343d2 = {"Lorg/mobileid/access/key_sort/SortAccordingToOtherList;", "Lorg/mobileid/access/key_sort/Sort;", "", "Lorg/mobileid/access/key/Key;", "keyList", "key", "", "containsKey", "(Ljava/util/List;Lorg/mobileid/access/key/Key;)Z", "sortKeys", "(Ljava/util/List;)Ljava/util/List;", "oldKeyList", "Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
public final class SortAccordingToOtherList implements Sort {
    public final List<Key> oldKeyList;

    public SortAccordingToOtherList(List<? extends Key> list) {
        Intrinsics.checkNotNullParameter(list, "oldKeyList");
        this.oldKeyList = list;
    }

    private final boolean containsKey(List<? extends Key> list, Key key) {
        T t;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (Intrinsics.areEqual((Object) ((Key) t).getId(), (Object) key.getId())) {
                break;
            }
        }
        return t != null;
    }

    public List<Key> sortKeys(List<? extends Key> list) {
        T t;
        Intrinsics.checkNotNullParameter(list, "keyList");
        ArrayList arrayList = new ArrayList();
        for (Key key : this.oldKeyList) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (Intrinsics.areEqual((Object) ((Key) t).getId(), (Object) key.getId())) {
                    break;
                }
            }
            Key key2 = (Key) t;
            if (key2 != null) {
                arrayList.add(key2);
            }
        }
        for (Key key3 : list) {
            if (!containsKey(arrayList, key3)) {
                arrayList.add(key3);
            }
        }
        return arrayList;
    }
}
