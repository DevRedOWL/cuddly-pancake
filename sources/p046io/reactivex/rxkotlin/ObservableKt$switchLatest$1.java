package p046io.reactivex.rxkotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p046io.reactivex.Observable;
import p046io.reactivex.ObservableSource;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 2}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "Lio/reactivex/Observable;", "T", "", "it", "apply"}, mo51344k = 3, mo51345mv = {1, 1, 8})
/* renamed from: io.reactivex.rxkotlin.ObservableKt$switchLatest$1 */
/* compiled from: observable.kt */
final class ObservableKt$switchLatest$1<T, R> implements Function<T, ObservableSource<? extends R>> {
    public static final ObservableKt$switchLatest$1 INSTANCE = new ObservableKt$switchLatest$1();

    ObservableKt$switchLatest$1() {
    }

    public final Observable<T> apply(Observable<T> observable) {
        Intrinsics.checkParameterIsNotNull(observable, "it");
        return observable;
    }
}
