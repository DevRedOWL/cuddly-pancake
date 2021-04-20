package org.mobileid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.parameter.DefinitionParametersKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "Lorg/koin/core/parameter/DefinitionParameters;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 0}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
public final class Api$checkMobileQR$qrRequester$2 extends Lambda implements Function0<DefinitionParameters> {
    public final /* synthetic */ CoroutineScope $scope;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Api$checkMobileQR$qrRequester$2(CoroutineScope coroutineScope) {
        super(0);
        this.$scope = coroutineScope;
    }

    public final DefinitionParameters invoke() {
        return DefinitionParametersKt.parametersOf(this.$scope);
    }
}
