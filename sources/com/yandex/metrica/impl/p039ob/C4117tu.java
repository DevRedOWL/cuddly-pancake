package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.IParamsCallback;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.yandex.metrica.impl.ob.tu */
public class C4117tu implements C4124tx {

    /* renamed from: a */
    private static final IIdentifierCallback f4991a = new IIdentifierCallback() {
        public void onReceive(Map<String, String> map) {
        }

        public void onRequestError(IIdentifierCallback.Reason reason) {
        }
    };

    /* renamed from: b */
    private final AtomicReference<IIdentifierCallback> f4992b;

    public C4117tu(IIdentifierCallback iIdentifierCallback) {
        this.f4992b = new AtomicReference<>(iIdentifierCallback);
    }

    /* renamed from: a */
    public void mo41503a(Map<String, String> map) {
        this.f4992b.getAndSet(f4991a).onReceive(map);
    }

    /* renamed from: a */
    public void mo41502a(IParamsCallback.Reason reason, Map<String, String> map) {
        this.f4992b.getAndSet(f4991a).onRequestError(m5520a(reason));
    }

    /* renamed from: com.yandex.metrica.impl.ob.tu$2 */
    static /* synthetic */ class C41192 {

        /* renamed from: a */
        static final /* synthetic */ int[] f4993a = new int[IParamsCallback.Reason.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.yandex.metrica.IParamsCallback$Reason[] r0 = com.yandex.metrica.IParamsCallback.Reason.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4993a = r0
                int[] r0 = f4993a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.yandex.metrica.IParamsCallback$Reason r1 = com.yandex.metrica.IParamsCallback.Reason.NETWORK     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f4993a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.yandex.metrica.IParamsCallback$Reason r1 = com.yandex.metrica.IParamsCallback.Reason.INVALID_RESPONSE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C4117tu.C41192.<clinit>():void");
        }
    }

    /* renamed from: a */
    private IIdentifierCallback.Reason m5520a(IParamsCallback.Reason reason) {
        int i = C41192.f4993a[reason.ordinal()];
        if (i == 1) {
            return IIdentifierCallback.Reason.NETWORK;
        }
        if (i != 2) {
            return IIdentifierCallback.Reason.UNKNOWN;
        }
        return IIdentifierCallback.Reason.INVALID_RESPONSE;
    }
}
