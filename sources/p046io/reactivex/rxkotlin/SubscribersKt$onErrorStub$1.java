package p046io.reactivex.rxkotlin;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p046io.reactivex.exceptions.OnErrorNotImplementedException;
import p046io.reactivex.plugins.RxJavaPlugins;

@Metadata(mo51341bv = {1, 0, 2}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "it", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 8})
/* renamed from: io.reactivex.rxkotlin.SubscribersKt$onErrorStub$1 */
/* compiled from: subscribers.kt */
final class SubscribersKt$onErrorStub$1 extends Lambda implements Function1<Throwable, Unit> {
    public static final SubscribersKt$onErrorStub$1 INSTANCE = new SubscribersKt$onErrorStub$1();

    SubscribersKt$onErrorStub$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "it");
        RxJavaPlugins.onError(new OnErrorNotImplementedException(th));
    }
}
