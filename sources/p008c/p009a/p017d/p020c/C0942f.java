package p008c.p009a.p017d.p020c;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import org.mobileid.Api;
import org.mobileid.access.key.Key;
import org.mobileid.access.key.KeyAction;
import p008c.p009a.p010a.C0837c;
import p008c.p009a.p010a.p012e.C0843a;
import p008c.p009a.p014b.C0878g;
import p008c.p009a.p017d.p019b.C0911a;

/* renamed from: c.a.d.c.f */
public final class C0942f {

    /* renamed from: a */
    public static final C0878g.C0879a f992a = new C0878g.C0879a();

    /* renamed from: b */
    public static final C0942f f993b = new C0942f();

    /* renamed from: a */
    public final String mo13008a(Context context, C0911a aVar) {
        String keyIdForRequest$aclib_api2_6826_release = Api.INSTANCE.getKeyIdForRequest$aclib_api2_6826_release();
        Key a = keyIdForRequest$aclib_api2_6826_release != null ? C0837c.f761k.mo12909a(context, keyIdForRequest$aclib_api2_6826_release) : null;
        if (a == null) {
            List<Key> a2 = new C0843a(context).mo12925a(aVar);
            if (!a2.isEmpty()) {
                return ((Key) ((ArrayList) a2).get(0)).getMobileId$aclib_api2_6826_release();
            }
            return null;
        } else if (a.validate() != KeyAction.USE) {
            return null;
        } else {
            if (aVar.f901a.f911a.get(a.getAccessPointType$aclib_api2_6826_release())) {
                return a.getMobileId$aclib_api2_6826_release();
            }
            return null;
        }
    }
}
