package p046io.reactivex.rxkotlin;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(mo51341bv = {1, 0, 2}, mo51342d1 = {"\u0000\u0013\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002¨\u0006\u0005"}, mo51343d2 = {"io/reactivex/rxkotlin/ObservableKt$toIterable$1", "", "(Ljava/util/Iterator;)V", "iterator", "", "rxkotlin"}, mo51344k = 1, mo51345mv = {1, 1, 8})
/* renamed from: io.reactivex.rxkotlin.ObservableKt$toIterable$1 */
/* compiled from: observable.kt */
public final class ObservableKt$toIterable$1 implements Iterable<T>, KMappedMarker {
    final /* synthetic */ Iterator receiver$0;

    ObservableKt$toIterable$1(Iterator<? extends T> it) {
        this.receiver$0 = it;
    }

    public Iterator<T> iterator() {
        return this.receiver$0;
    }
}
