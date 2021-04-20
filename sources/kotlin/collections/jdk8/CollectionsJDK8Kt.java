package kotlin.collections.jdk8;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0010%\n\u0002\b\u0003\u001aA\u0010\u0000\u001a\u0002H\u0001\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0003\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u0006\u001a\u0002H\u0001H\b¢\u0006\u0002\u0010\u0007\u001aH\u0010\b\u001a\u00020\t\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0003\"\t\b\u0001\u0010\u0001¢\u0006\u0002\b\u0003*\u0012\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0006\b\u0001\u0012\u0002H\u00010\n2\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u000b\u001a\u0002H\u0001H\b¢\u0006\u0002\u0010\f¨\u0006\r"}, mo51343d2 = {"getOrDefault", "V", "K", "Lkotlin/internal/OnlyInputTypes;", "", "key", "defaultValue", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "", "", "value", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z", "kotlin-stdlib-jdk8"}, mo51344k = 2, mo51345mv = {1, 1, 15}, mo51346pn = "kotlin.collections")
/* compiled from: Collections.kt */
public final class CollectionsJDK8Kt {
    private static final <K, V> V getOrDefault(Map<? extends K, ? extends V> map, K k, V v) {
        if (map != null) {
            return map.getOrDefault(k, v);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
    }

    private static final <K, V> boolean remove(Map<? extends K, ? extends V> map, K k, V v) {
        if (map != null) {
            return TypeIntrinsics.asMutableMap(map).remove(k, v);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
    }
}
