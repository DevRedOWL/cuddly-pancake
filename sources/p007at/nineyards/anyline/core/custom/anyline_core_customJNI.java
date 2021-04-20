package p007at.nineyards.anyline.core.custom;

import p007at.nineyards.anyline.core.AnylineCoreDelegate;

/* renamed from: at.nineyards.anyline.core.custom.anyline_core_customJNI */
public class anyline_core_customJNI {
    public static final native void AnylineCoreCallbackConnector_init_AnylineCoreDelegate(AnylineCoreDelegate anylineCoreDelegate, long j, boolean z, boolean z2);

    public static final native void destroy_AnylineCoreDelegate(long j);

    public static final native long new_AnylineCoreDelegate();
}
