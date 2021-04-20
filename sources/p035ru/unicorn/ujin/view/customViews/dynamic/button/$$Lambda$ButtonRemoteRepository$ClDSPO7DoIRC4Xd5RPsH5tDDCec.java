package p035ru.unicorn.ujin.view.customViews.dynamic.button;

import p035ru.unicorn.ujin.data.realm.ResourceV2;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.button.-$$Lambda$ButtonRemoteRepository$ClDSPO7DoIRC4Xd5RPsH5tDDCec  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ButtonRemoteRepository$ClDSPO7DoIRC4Xd5RPsH5tDDCec implements Function {
    public static final /* synthetic */ $$Lambda$ButtonRemoteRepository$ClDSPO7DoIRC4Xd5RPsH5tDDCec INSTANCE = new $$Lambda$ButtonRemoteRepository$ClDSPO7DoIRC4Xd5RPsH5tDDCec();

    private /* synthetic */ $$Lambda$ButtonRemoteRepository$ClDSPO7DoIRC4Xd5RPsH5tDDCec() {
    }

    public final Object apply(Object obj) {
        return ResourceV2.Companion.success(((ResourceV2) obj).getService(), ((ResourceV2) obj).getData());
    }
}
