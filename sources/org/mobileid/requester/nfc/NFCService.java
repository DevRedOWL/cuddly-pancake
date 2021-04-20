package org.mobileid.requester.nfc;

import android.nfc.cardemulation.HostApduService;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.mobileid.Api;
import p008c.p009a.p014b.C0878g;
import p008c.p009a.p017d.p019b.C0911a;
import p008c.p009a.p017d.p020c.C0936a;
import p008c.p009a.p017d.p020c.C0943g;
import p008c.p009a.p017d.p023e.C0956d;
import p008c.p009a.p031f.C0988c;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001d\u0010\tJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R5\u0010\u0019\u001a!\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, mo51343d2 = {"Lorg/mobileid/requester/nfc/NFCService;", "Landroid/nfc/cardemulation/HostApduService;", "Lorg/mobileid/requester/bluetooth_access_requster/AccessPoint$Access;", "result", "", "done", "(Lorg/mobileid/requester/bluetooth_access_requster/AccessPoint$Access;)[B", "", "logFirebaseSuccessEvents", "()V", "logRequestFirebase", "", "reason", "onDeactivated", "(I)V", "commandApdu", "Landroid/os/Bundle;", "extras", "processCommandApdu", "([BLandroid/os/Bundle;)[B", "accessResult", "Lorg/mobileid/requester/bluetooth_access_requster/AccessPoint$Access;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "next", "Lkotlin/Function1;", "replyApplicationType", "[B", "<init>", "Companion", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
public final class NFCService extends HostApduService {

    /* renamed from: a */
    public final byte[] f6387a = {1, 1, 0, 0, 0, 0};

    /* renamed from: b */
    public Function1<? super byte[], byte[]> f6388b = new C5497a(this);

    /* renamed from: c */
    public C0911a.C0912a f6389c;

    /* renamed from: org.mobileid.requester.nfc.NFCService$a */
    public static final class C5497a extends Lambda implements Function1<byte[], byte[]> {

        /* renamed from: a */
        public final /* synthetic */ NFCService f6390a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5497a(NFCService nFCService) {
            super(1);
            this.f6390a = nFCService;
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter((byte[]) obj, "it");
            return this.f6390a.f6387a;
        }
    }

    /* renamed from: org.mobileid.requester.nfc.NFCService$b */
    public static final class C5498b extends Lambda implements Function1<byte[], byte[]> {

        /* renamed from: a */
        public final /* synthetic */ NFCService f6391a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5498b(NFCService nFCService) {
            super(1);
            this.f6391a = nFCService;
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter((byte[]) obj, "it");
            return this.f6391a.f6387a;
        }
    }

    /* renamed from: org.mobileid.requester.nfc.NFCService$c */
    public static final class C5499c extends Lambda implements Function1<byte[], byte[]> {

        /* renamed from: a */
        public final /* synthetic */ NFCService f6392a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5499c(NFCService nFCService) {
            super(1);
            this.f6392a = nFCService;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0064  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r11) {
            /*
                r10 = this;
                byte[] r11 = (byte[]) r11
                java.lang.String r0 = "accessPointName"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                c.a.d.b.a r0 = new c.a.d.b.a
                c.a.d.c.a r1 = p008c.p009a.p017d.p020c.C0936a.f980f
                java.lang.String r2 = "command"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r2)
                int r2 = r1.mo13007c(r11)
                r3 = 0
                if (r2 <= 0) goto L_0x0029
                int r1 = r1.mo13007c(r11)
                java.nio.charset.Charset r2 = p008c.p009a.p017d.p020c.C0936a.f975a
                java.lang.String r4 = "COMMANDS_CHARSET"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
                java.lang.String r4 = new java.lang.String
                r5 = 6
                r4.<init>(r11, r5, r1, r2)
                goto L_0x002a
            L_0x0029:
                r4 = r3
            L_0x002a:
                c.a.d.b.a$c r1 = new c.a.d.b.a$c
                r1.<init>()
                r2 = 1
                r5 = 3
                r6 = 0
                if (r4 == 0) goto L_0x0069
                int r7 = r4.length()
                r8 = 4
                if (r7 <= r8) goto L_0x0069
                char r7 = r4.charAt(r8)
                r9 = 99
                if (r7 == r9) goto L_0x0056
                r9 = 101(0x65, float:1.42E-43)
                if (r7 == r9) goto L_0x0054
                r9 = 110(0x6e, float:1.54E-43)
                if (r7 == r9) goto L_0x0052
                r9 = 112(0x70, float:1.57E-43)
                if (r7 == r9) goto L_0x0050
                goto L_0x005c
            L_0x0050:
                r7 = 0
                goto L_0x0057
            L_0x0052:
                r7 = 1
                goto L_0x0057
            L_0x0054:
                r7 = 2
                goto L_0x0057
            L_0x0056:
                r7 = 3
            L_0x0057:
                java.util.BitSet r9 = r1.f911a
                r9.set(r7)
            L_0x005c:
                char r4 = r4.charAt(r5)
                r7 = 98
                if (r4 != r7) goto L_0x0069
                java.util.BitSet r4 = r1.f911a
                r4.set(r8)
            L_0x0069:
                c.a.d.b.a$a r4 = p008c.p009a.p017d.p019b.C0911a.C0912a.UNKNOWN
                r0.<init>(r1, r6, r4)
                c.a.d.c.f r1 = p008c.p009a.p017d.p020c.C0942f.f993b
                org.mobileid.requester.nfc.NFCService r4 = r10.f6392a
                android.content.Context r4 = r4.getBaseContext()
                java.lang.String r7 = "baseContext"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r7)
                java.lang.String r7 = "accessPoint"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r7)
                java.lang.String r7 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r7)
                c.a.d.b.a$c r7 = r0.f901a
                java.util.BitSet r7 = r7.f911a
                boolean r5 = r7.get(r5)
                if (r5 == 0) goto L_0x009e
                c.a.b.g$a r1 = p008c.p009a.p017d.p020c.C0942f.f992a
                byte[] r2 = new byte[r2]
                r4 = 20
                r2[r6] = r4
                c.a.b.h$c r4 = p008c.p009a.p014b.C0878g.C0879a.f854f
                byte[] r1 = r1.mo12971a(r2, r4)
                goto L_0x00b2
            L_0x009e:
                java.lang.String r1 = r1.mo13008a(r4, r0)
                if (r1 == 0) goto L_0x00b1
                c.a.b.g$a r2 = p008c.p009a.p017d.p020c.C0942f.f992a
                byte[] r1 = p008c.p009a.p014b.C0878g.m465a((java.lang.String) r1)
                c.a.b.h$c r4 = p008c.p009a.p014b.C0878g.C0879a.f854f
                byte[] r1 = r2.mo12971a(r1, r4)
                goto L_0x00b2
            L_0x00b1:
                r1 = r3
            L_0x00b2:
                if (r1 == 0) goto L_0x00c4
                org.mobileid.requester.nfc.NFCService r2 = r10.f6392a
                c.a.d.c.i r3 = new c.a.d.c.i
                r3.<init>(r10, r0)
                r2.f6388b = r3
                c.a.d.c.a r0 = p008c.p009a.p017d.p020c.C0936a.f980f
                byte[] r3 = r0.mo13005a(r11, r1)
                goto L_0x00cb
            L_0x00c4:
                org.mobileid.requester.nfc.NFCService r11 = r10.f6392a
                c.a.d.b.a$a r0 = p008c.p009a.p017d.p019b.C0911a.C0912a.EMPTY
                org.mobileid.requester.nfc.NFCService.m6912a(r11, r0)
            L_0x00cb:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: org.mobileid.requester.nfc.NFCService.C5499c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final byte[] m6912a(NFCService nFCService, C0911a.C0912a aVar) {
        nFCService.f6389c = aVar;
        Api.Firebase firebase = Api.INSTANCE.getFirebase();
        if (firebase != null) {
            Bundle bundle = Bundle.EMPTY;
            Intrinsics.checkNotNullExpressionValue(bundle, "Bundle.EMPTY");
            firebase.logRequestNfcUsedSuccess(bundle);
        }
        C0956d dVar = C0943g.f994a;
        if (dVar != null) {
            dVar.result(aVar);
        }
        nFCService.f6388b = null;
        return null;
    }

    public void onDeactivated(int i) {
        C0956d dVar;
        this.f6388b = new C5498b(this);
        if (this.f6389c == null && (dVar = C0943g.f994a) != null) {
            dVar.result(C0911a.C0912a.UNKNOWN);
        }
        this.f6389c = null;
    }

    public byte[] processCommandApdu(byte[] bArr, Bundle bundle) {
        Intrinsics.checkNotNullParameter(bArr, "commandApdu");
        C0936a aVar = C0936a.f980f;
        Intrinsics.checkNotNullParameter(bArr, "command");
        C0936a.C0937a aVar2 = C0936a.C0937a.UNKNOWN;
        if (C0878g.m462a(bArr, C0936a.f976b)) {
            aVar2 = C0936a.C0937a.SELECT_APP_TYPE;
        } else if (C0878g.m462a(bArr, C0936a.f977c)) {
            aVar2 = C0936a.C0937a.SELECT_COMMAND;
        } else if (C0878g.m462a(bArr, C0936a.f978d)) {
            aVar2 = C0936a.C0937a.SELECT_DATA;
        }
        "APDU " + aVar2 + ": " + C0988c.m582a(bArr);
        if (aVar2 == C0936a.C0937a.SELECT_COMMAND && this.f6388b != null) {
            C0956d dVar = C0943g.f994a;
            if (dVar != null) {
                dVar.started();
            }
            Api.Firebase firebase = Api.INSTANCE.getFirebase();
            if (firebase != null) {
                Bundle bundle2 = Bundle.EMPTY;
                Intrinsics.checkNotNullExpressionValue(bundle2, "Bundle.EMPTY");
                firebase.logRequestNfcUsed(bundle2);
            }
            this.f6388b = new C5499c(this);
        }
        C0936a aVar3 = C0936a.f980f;
        Function1<? super byte[], byte[]> function1 = this.f6388b;
        return aVar3.mo13004a(function1 != null ? function1.invoke(bArr) : null);
    }
}
