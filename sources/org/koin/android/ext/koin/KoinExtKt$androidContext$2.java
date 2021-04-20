package org.koin.android.ext.koin;

import android.app.Application;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.scope.Scope;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "Landroid/app/Application;", "Lorg/koin/core/scope/Scope;", "it", "Lorg/koin/core/parameter/DefinitionParameters;", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 15})
/* compiled from: KoinExt.kt */
final class KoinExtKt$androidContext$2 extends Lambda implements Function2<Scope, DefinitionParameters, Application> {
    final /* synthetic */ Context $androidContext;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    KoinExtKt$androidContext$2(Context context) {
        super(2);
        this.$androidContext = context;
    }

    public final Application invoke(Scope scope, DefinitionParameters definitionParameters) {
        Intrinsics.checkParameterIsNotNull(scope, "$receiver");
        Intrinsics.checkParameterIsNotNull(definitionParameters, "it");
        return (Application) this.$androidContext;
    }
}
