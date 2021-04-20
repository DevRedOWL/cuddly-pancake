package p008c.p009a.p010a.p012e;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.mobileid.access.key.Key;
import p008c.p009a.p017d.p019b.C0911a;

/* renamed from: c.a.a.e.a */
public final class C0843a extends C0844b {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0843a(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    public List<Key> mo12924a() {
        List<Key> a = super.mo12924a();
        ArrayList arrayList = new ArrayList();
        for (T next : a) {
            if (((Key) next).isDefault()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<Key> mo12925a(C0911a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "accessPoint");
        List<Key> a = super.mo12925a(aVar);
        ArrayList arrayList = new ArrayList();
        for (T next : a) {
            if (((Key) next).isDefault()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
