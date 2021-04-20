package p008c.p009a.p010a.p012e;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.mobileid.access.key.Key;
import org.mobileid.access.key.KeyAction;
import org.mobileid.access.key_sort.Sort;
import p008c.p009a.p010a.C0837c;
import p008c.p009a.p017d.p019b.C0911a;

/* renamed from: c.a.a.e.b */
public class C0844b {

    /* renamed from: a */
    public final Context f779a;

    public C0844b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f779a = context;
    }

    /* renamed from: a */
    public final C0911a.C0914c mo12926a(boolean z) {
        C0911a.C0914c cVar = new C0911a.C0914c();
        for (Key accessPointType$aclib_api2_6826_release : mo12924a()) {
            cVar.f911a.set(accessPointType$aclib_api2_6826_release.getAccessPointType$aclib_api2_6826_release());
        }
        if (z) {
            cVar.f911a.set(4);
        }
        return cVar;
    }

    /* renamed from: a */
    public List<Key> mo12924a() {
        return C0837c.C0838a.m367a(C0837c.f761k, this.f779a, (Sort) null, 2);
    }

    /* renamed from: a */
    public List<Key> mo12925a(C0911a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "accessPoint");
        List a = C0837c.C0838a.m367a(C0837c.f761k, this.f779a, (Sort) null, 2);
        ArrayList arrayList = new ArrayList();
        for (Object next : a) {
            Key key = (Key) next;
            if (aVar.f901a.f911a.get(key.getAccessPointType$aclib_api2_6826_release()) && key.validate() == KeyAction.USE) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
