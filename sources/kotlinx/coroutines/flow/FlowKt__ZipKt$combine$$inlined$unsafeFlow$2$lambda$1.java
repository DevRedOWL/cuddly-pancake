package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "T", "R", "invoke", "()[Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$5$1"}, mo51344k = 3, mo51345mv = {1, 4, 0})
/* compiled from: Zip.kt */
public final class FlowKt__ZipKt$combine$$inlined$unsafeFlow$2$lambda$1 extends Lambda implements Function0<T[]> {
    final /* synthetic */ FlowKt__ZipKt$combine$$inlined$unsafeFlow$2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combine$$inlined$unsafeFlow$2$lambda$1(FlowKt__ZipKt$combine$$inlined$unsafeFlow$2 flowKt__ZipKt$combine$$inlined$unsafeFlow$2) {
        super(0);
        this.this$0 = flowKt__ZipKt$combine$$inlined$unsafeFlow$2;
    }

    public final T[] invoke() {
        int length = this.this$0.$flows$inlined.length;
        Intrinsics.reifiedOperationMarker(0, "T?");
        return new Object[length];
    }
}
