package p008c.p009a.p010a.p012e;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.mobileid.access.key.Key;
import p008c.p009a.p017d.p019b.C0911a;

/* renamed from: c.a.a.e.c */
public final class C0845c extends C0844b {

    /* renamed from: b */
    public final String f780b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0845c(Context context, String str) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "keyId");
        this.f780b = str;
    }

    /* renamed from: a */
    public List<Key> mo12924a() {
        List<Key> a = super.mo12924a();
        ArrayList arrayList = new ArrayList();
        for (T next : a) {
            if (Intrinsics.areEqual((Object) ((Key) next).getId(), (Object) this.f780b)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<Key> mo12925a(C0911a aVar) {
        Object obj;
        Intrinsics.checkNotNullParameter(aVar, "accessPoint");
        Iterator it = ((ArrayList) super.mo12925a(aVar)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) ((Key) obj).getId(), (Object) this.f780b)) {
                break;
            }
        }
        Key key = (Key) obj;
        return key != null ? CollectionsKt.listOf(key) : CollectionsKt.emptyList();
    }
}
