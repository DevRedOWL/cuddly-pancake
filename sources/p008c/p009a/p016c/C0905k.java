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
import org.mobileid.C5489R;
import org.mobileid.requester.web_service.simple_key.SimpleKeyWebService;

/* renamed from: c.a.c.k */
public final class C0905k extends Lambda implements Function2<Scope, DefinitionParameters, SimpleKeyWebService> {

    /* renamed from: a */
    public static final C0905k f895a = new C0905k();

    public C0905k() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        Scope scope = (Scope) obj;
        Intrinsics.checkNotNullParameter(scope, "$receiver");
        Intrinsics.checkNotNullParameter((DefinitionParameters) obj2, "it");
        SimpleKeyWebService.Companion companion = SimpleKeyWebService.Companion;
        String string = ((Context) scope.get((KClass<?>) Reflection.getOrCreateKotlinClass(Context.class), (Qualifier) null, (Function0<DefinitionParameters>) null)).getString(C5489R.string.key_issue_authority);
        Intrinsics.checkNotNullExpressionValue(string, "get<Context>().getString…ring.key_issue_authority)");
        return companion.create(string);
    }
}
