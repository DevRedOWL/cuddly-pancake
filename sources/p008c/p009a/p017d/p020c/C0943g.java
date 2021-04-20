package p008c.p009a.p017d.p020c;

import android.content.ComponentName;
import android.content.Context;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import android.nfc.cardemulation.CardEmulation;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.mobileid.requester.nfc.NFCService;
import p008c.p009a.p010a.C0837c;
import p008c.p009a.p017d.p023e.C0956d;
import p035ru.unicorn.ujin.view.activity.navigation.helper.SharedHelper;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Contact;

/* renamed from: c.a.d.c.g */
public final class C0943g {

    /* renamed from: a */
    public static C0956d f994a;

    /* renamed from: b */
    public static final C0943g f995b = new C0943g();

    /* renamed from: a */
    public final void mo13009a(Context context, C0837c cVar, C0956d dVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cVar, SharedHelper.APP_PREFERENCES);
        Intrinsics.checkNotNullParameter(dVar, "requesterListener");
        if (cVar.f764c && cVar.f762a) {
            mo13010a(context, dVar);
        } else if (mo13011a(context)) {
            f994a = null;
            CardEmulation.getInstance(NfcAdapter.getDefaultAdapter(context)).removeAidsForService(new ComponentName(context, NFCService.class), Contact.Type.other);
        }
    }

    /* renamed from: a */
    public final boolean mo13011a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("nfc");
        if (systemService != null) {
            return ((NfcManager) systemService).getDefaultAdapter() != null && context.getPackageManager().hasSystemFeature("android.hardware.nfc.hce");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.nfc.NfcManager");
    }

    /* renamed from: a */
    public final void mo13010a(Context context, C0956d dVar) {
        if (mo13011a(context)) {
            Object systemService = context.getSystemService("nfc");
            if (systemService != null) {
                NfcAdapter defaultAdapter = ((NfcManager) systemService).getDefaultAdapter();
                boolean z = true;
                if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
                    z = false;
                }
                if (z) {
                    f994a = dVar;
                    CardEmulation.getInstance(NfcAdapter.getDefaultAdapter(context)).registerAidsForService(new ComponentName(context, NFCService.class), Contact.Type.other, CollectionsKt.listOf("FDBA3E9EF6E04B65B6A81C259E306918"));
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.nfc.NfcManager");
        }
    }
}
