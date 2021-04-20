package p008c.p009a.p016c;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.scope.Scope;
import p008c.p009a.p024e.p029d.C0980a;
import p008c.p009a.p024e.p029d.C0981b;

/* renamed from: c.a.c.h */
public final class C0902h extends Lambda implements Function2<Scope, DefinitionParameters, C0980a> {

    /* renamed from: a */
    public static final C0902h f892a = new C0902h();

    public C0902h() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter((Scope) obj, "$receiver");
        Intrinsics.checkNotNullParameter((DefinitionParameters) obj2, "it");
        return new C0981b();
    }
}
