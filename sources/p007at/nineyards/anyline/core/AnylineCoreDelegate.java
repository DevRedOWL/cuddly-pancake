package p007at.nineyards.anyline.core;

import p007at.nineyards.anyline.core.custom.anyline_core_customJNI;

/* renamed from: at.nineyards.anyline.core.AnylineCoreDelegate */
public abstract class AnylineCoreDelegate {

    /* renamed from: a */
    private long f441a;

    /* renamed from: b */
    private boolean f442b;

    public abstract void anylineCoreReport(Variable variable, String str);

    public abstract void anylineCoreReturn(Variable variable);

    protected AnylineCoreDelegate(long j, boolean z) {
        this.f442b = z;
        this.f441a = j;
    }

    public AnylineCoreDelegate() {
        this(anyline_core_customJNI.new_AnylineCoreDelegate(), true);
        anyline_core_customJNI.AnylineCoreCallbackConnector_init_AnylineCoreDelegate(this, this.f441a, this.f442b, true);
    }

    protected static long getCPtr(AnylineCoreDelegate anylineCoreDelegate) {
        if (anylineCoreDelegate == null) {
            return 0;
        }
        return anylineCoreDelegate.f441a;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        destroy();
    }

    public synchronized void destroy() {
        if (this.f441a != 0) {
            if (this.f442b) {
                this.f442b = false;
                anyline_core_customJNI.destroy_AnylineCoreDelegate(this.f441a);
            }
            this.f441a = 0;
        }
    }
}
