package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.mobileid.Api;
import org.mobileid.access.key.Key;
import org.mobileid.access.key_sort.Sort;
import org.mobileid.time_key.util.TimeKeyParams;
import p008c.p009a.p010a.C0837c;
import p008c.p009a.p010a.p012e.C0843a;
import p008c.p009a.p014b.C0878g;
import p008c.p009a.p017d.p019b.C0911a;
import p008c.p009a.p017d.p019b.C0929d;
import p008c.p009a.p017d.p023e.C0956d;
import p035ru.unicorn.ujin.view.activity.navigation.helper.SharedHelper;

/* renamed from: b */
public final class C1770b extends BroadcastReceiver implements C0956d {

    /* renamed from: b */
    public static final C1771a f1376b = new C1771a();

    /* renamed from: a */
    public C0837c f1377a;

    /* renamed from: b$a */
    public static final class C1771a {
    }

    public C1770b(C0837c cVar) {
        Intrinsics.checkNotNullParameter(cVar, SharedHelper.APP_PREFERENCES);
        this.f1377a = cVar;
    }

    public void found() {
    }

    public void onReceive(Context context, Intent intent) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        if (intent != null) {
            "Screen ON detected, ScreenOnReceiver[" + hashCode() + ']';
            Api.Firebase firebase = Api.INSTANCE.getFirebase();
            if (firebase != null) {
                firebase.setCurrentEvent(Api.Firebase.REQUEST_ON_SCREEN_ON);
            }
            C0837c.C0838a aVar = C0837c.f761k;
            Intrinsics.checkNotNullParameter(context, "context");
            Iterator it = C0837c.C0838a.m367a(aVar, context, (Sort) null, 2).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Key) obj).isDefault()) {
                    break;
                }
            }
            if (!(obj != null)) {
                TimeKeyParams a = TimeKeyParams.Companion.mo60138a(context);
                C0878g.m459a(context, a.getNotificationChannelId(), a.getNotificationTitle(), a.getDefaultKeyIsNotSetNotification(), a.getIconId());
                return;
            }
            C0929d.C0931b.m517a(context, this.f1377a, this, new C0843a(context));
        }
    }

    public void result(C0911a.C0912a aVar) {
        Api.Firebase firebase;
        Intrinsics.checkNotNullParameter(aVar, "result");
        if (aVar != C0911a.C0912a.UNKNOWN && (firebase = Api.INSTANCE.getFirebase()) != null) {
            Bundle bundle = Bundle.EMPTY;
            Intrinsics.checkNotNullExpressionValue(bundle, "Bundle.EMPTY");
            firebase.logRequestOnScreenOnSuccess(bundle);
        }
    }

    public void started() {
    }
}
