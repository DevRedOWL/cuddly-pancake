package p008c.p009a.p017d.p020c;

import android.content.Context;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p008c.p009a.p014b.C0871f;
import p008c.p009a.p014b.C0878g;
import p008c.p009a.p017d.p019b.C0911a;

/* renamed from: c.a.d.c.b */
public final class C0938b implements C0871f.C0877c {

    /* renamed from: a */
    public final /* synthetic */ Ref.ObjectRef f986a;

    /* renamed from: b */
    public final /* synthetic */ C0911a f987b;

    /* renamed from: c */
    public final /* synthetic */ Context f988c;

    public C0938b(Ref.ObjectRef objectRef, C0911a aVar, Context context) {
        this.f986a = objectRef;
        this.f987b = aVar;
        this.f988c = context;
    }

    /* renamed from: a */
    public final void mo12949a(byte[] bArr) {
        Object obj;
        Intrinsics.checkNotNullParameter(bArr, "parsed");
        Ref.ObjectRef objectRef = this.f986a;
        if (C0878g.m461a(bArr)) {
            this.f987b.f902b = ByteBuffer.wrap(bArr, 1, 2).order(ByteOrder.BIG_ENDIAN).asShortBuffer().get() & UShort.MAX_VALUE;
            String a = C0942f.f993b.mo13008a(this.f988c, this.f987b);
            short s = ByteBuffer.wrap(bArr, 3, 2).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get() & UShort.MAX_VALUE;
            if (a != null) {
                C0942f fVar = C0942f.f993b;
                obj = C0942f.f992a.mo12971a(C0878g.m464a((int) s, a), C0878g.C0879a.f854f);
                objectRef.element = obj;
            }
        }
        obj = null;
        objectRef.element = obj;
    }
}
