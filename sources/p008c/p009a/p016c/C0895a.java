package p008c.p009a.p016c;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p008c.p009a.p017d.p019b.C0933e;
import p008c.p009a.p017d.p019b.C0934f;

/* renamed from: c.a.c.a */
public final class C0895a extends Lambda implements Function2<Scope, DefinitionParameters, C0933e> {

    /* renamed from: a */
    public static final C0895a f885a = new C0895a();

    public C0895a() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        Scope scope = (Scope) obj;
        Intrinsics.checkNotNullParameter(scope, "$receiver");
        Intrinsics.checkNotNullParameter((DefinitionParameters) obj2, "it");
        return new C0934f((Context) scope.get((KClass<?>) Reflection.getOrCreateKotlinClass(Context.class), (Qualifier) null, (Function0<DefinitionParameters>) null));
    }
}
