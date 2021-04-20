package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart;

import java.util.List;
import p046io.reactivex.Flowable;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.-$$Lambda$MainSmartViewModel$ryupbMBLndMBStc9a-wxoNdlGV8  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$MainSmartViewModel$ryupbMBLndMBStc9awxoNdlGV8 implements Function {
    public static final /* synthetic */ $$Lambda$MainSmartViewModel$ryupbMBLndMBStc9awxoNdlGV8 INSTANCE = new $$Lambda$MainSmartViewModel$ryupbMBLndMBStc9awxoNdlGV8();

    private /* synthetic */ $$Lambda$MainSmartViewModel$ryupbMBLndMBStc9awxoNdlGV8() {
    }

    public final Object apply(Object obj) {
        return Flowable.fromArray((List) obj).flatMapIterable($$Lambda$MainSmartViewModel$iGyI7k7bltGYuBg1uegQGawT8M.INSTANCE).filter($$Lambda$MainSmartViewModel$3LveqF79GSROIWZuYvAqmSVxVg8.INSTANCE).map($$Lambda$ZQdAGHiVk_XuabZ1xrA9ltHQd8s.INSTANCE).flatMapIterable($$Lambda$MainSmartViewModel$19Q6dSdmRtDN5fhhaEgSq3w7hQk.INSTANCE).toList().toFlowable();
    }
}
