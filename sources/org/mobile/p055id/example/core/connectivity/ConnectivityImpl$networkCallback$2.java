package org.mobile.p055id.example.core.connectivity;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo51343d2 = {"<anonymous>", "org/mobile/id/example/core/connectivity/ConnectivityImpl$getNetworkCallback$1", "invoke", "()Lorg/mobile/id/example/core/connectivity/ConnectivityImpl$getNetworkCallback$1;"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: org.mobile.id.example.core.connectivity.ConnectivityImpl$networkCallback$2 */
/* compiled from: ConnectivityImpl.kt */
final class ConnectivityImpl$networkCallback$2 extends Lambda implements Function0<ConnectivityImpl$getNetworkCallback$1> {
    final /* synthetic */ ConnectivityImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConnectivityImpl$networkCallback$2(ConnectivityImpl connectivityImpl) {
        super(0);
        this.this$0 = connectivityImpl;
    }

    public final ConnectivityImpl$getNetworkCallback$1 invoke() {
        return this.this$0.getNetworkCallback();
    }
}
