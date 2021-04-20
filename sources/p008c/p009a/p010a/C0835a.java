package p008c.p009a.p010a;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: c.a.a.a */
public final class C0835a extends Lambda implements Function2<String, String, Unit> {

    /* renamed from: a */
    public final /* synthetic */ Context f756a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0835a(Context context) {
        super(2);
        this.f756a = context;
    }

    public Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "savedValue");
        C0837c.f761k.mo12911a(this.f756a, str, str2);
        return Unit.INSTANCE;
    }
}
