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
import org.mobileid.time_key.web_service.TimeKeyWebService;

/* renamed from: c.a.c.j */
public final class C0904j extends Lambda implements Function2<Scope, DefinitionParameters, TimeKeyWebService> {

    /* renamed from: a */
    public static final C0904j f894a = new C0904j();

    public C0904j() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        Scope scope = (Scope) obj;
        Intrinsics.checkNotNullParameter(scope, "$receiver");
        Intrinsics.checkNotNullParameter((DefinitionParameters) obj2, "it");
        TimeKeyWebService.Companion companion = TimeKeyWebService.Companion;
        String string = ((Context) scope.get((KClass<?>) Reflection.getOrCreateKotlinClass(Context.class), (Qualifier) null, (Function0<DefinitionParameters>) null)).getString(C5489R.string.base_url);
        Intrinsics.checkNotNullExpressionValue(string, "get<Context>().getString(R.string.base_url)");
        return companion.create(string);
    }
}
