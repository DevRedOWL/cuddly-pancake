package p046io.reactivex.rxkotlin;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(mo51341bv = {1, 0, 2}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0015\u0010\u0005\u001a\u0011H\u0002¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b2\u0015\u0010\t\u001a\u0011H\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n¢\u0006\u0004\b\u000b\u0010\f"}, mo51343d2 = {"<anonymous>", "Lkotlin/Pair;", "T", "R", "", "p1", "Lkotlin/ParameterName;", "name", "first", "p2", "second", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, mo51344k = 3, mo51345mv = {1, 1, 8})
/* renamed from: io.reactivex.rxkotlin.FlowableKt$combineLatest$2 */
/* compiled from: flowable.kt */
final class FlowableKt$combineLatest$2 extends FunctionReference implements Function2<T, R, Pair<? extends T, ? extends R>> {
    public static final FlowableKt$combineLatest$2 INSTANCE = new FlowableKt$combineLatest$2();

    FlowableKt$combineLatest$2() {
        super(2);
    }

    public final String getName() {
        return "<init>";
    }

    public final KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(Pair.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/Object;Ljava/lang/Object;)V";
    }

    public final Pair<T, R> invoke(T t, R r) {
        Intrinsics.checkParameterIsNotNull(t, "p1");
        Intrinsics.checkParameterIsNotNull(r, "p2");
        return new Pair<>(t, r);
    }
}
