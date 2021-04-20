package p008c.p009a.p017d.p020c;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.mobileid.requester.nfc.NFCService;
import p008c.p009a.p017d.p019b.C0911a;

/* renamed from: c.a.d.c.i */
public final class C0945i extends Lambda implements Function1<byte[], byte[]> {

    /* renamed from: a */
    public final /* synthetic */ NFCService.C5499c f997a;

    /* renamed from: b */
    public final /* synthetic */ C0911a f998b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0945i(NFCService.C5499c cVar, C0911a aVar) {
        super(1);
        this.f997a = cVar;
        this.f998b = aVar;
    }

    public Object invoke(Object obj) {
        byte[] bArr;
        byte[] bArr2 = (byte[]) obj;
        Intrinsics.checkNotNullParameter(bArr2, "sessionReply");
        C0942f fVar = C0942f.f993b;
        C0911a aVar = this.f998b;
        byte[] b = C0936a.f980f.mo13006b(bArr2);
        Context baseContext = this.f997a.f6392a.getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "baseContext");
        Intrinsics.checkNotNullParameter(aVar, "accessPoint");
        Intrinsics.checkNotNullParameter(b, "data");
        Intrinsics.checkNotNullParameter(baseContext, "context");
        if (aVar.f901a.f911a.get(3)) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = null;
            C0942f.f992a.f856b = new C0938b(objectRef, aVar, baseContext);
            C0942f.f992a.mo12970a(b);
            bArr = (byte[]) objectRef.element;
        } else {
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = null;
            C0942f.f992a.f856b = new C0939c(objectRef2);
            C0942f.f992a.mo12970a(b);
            bArr = (byte[]) objectRef2.element;
        }
        if (bArr != null) {
            this.f997a.f6392a.f6388b = new C0944h(this);
            return C0936a.f980f.mo13005a(bArr2, bArr);
        }
        NFCService.m6912a(this.f997a.f6392a, C0911a.C0912a.EMPTY);
        return null;
    }
}
