package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.C2311u;
import com.google.android.play.core.tasks.C2415i;
import java.util.List;

/* renamed from: com.google.android.play.core.assetpacks.af */
class C2124af<T> extends C2311u {

    /* renamed from: a */
    final C2415i<T> f1523a;

    /* renamed from: b */
    final /* synthetic */ C2131am f1524b;

    C2124af(C2131am amVar, C2415i<T> iVar) {
        this.f1524b = amVar;
        this.f1523a = iVar;
    }

    C2124af(C2131am amVar, C2415i iVar, byte[] bArr) {
        this(amVar, iVar);
    }

    C2124af(C2131am amVar, C2415i iVar, char[] cArr) {
        this(amVar, iVar);
    }

    C2124af(C2131am amVar, C2415i iVar, int[] iArr) {
        this(amVar, iVar);
    }

    C2124af(C2131am amVar, C2415i iVar, short[] sArr) {
        this(amVar, iVar);
    }

    /* renamed from: b */
    public void mo33600b(int i, Bundle bundle) {
        this.f1524b.f1539e.mo33820b();
        C2131am.f1535a.mo33811d("onStartDownload(%d)", Integer.valueOf(i));
    }

    /* renamed from: c */
    public void mo33601c(List<Bundle> list) {
        this.f1524b.f1539e.mo33820b();
        C2131am.f1535a.mo33811d("onGetSessionStates", new Object[0]);
    }

    /* renamed from: d */
    public void mo33602d(Bundle bundle, Bundle bundle2) {
        this.f1524b.f1540f.mo33820b();
        C2131am.f1535a.mo33811d("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    /* renamed from: e */
    public void mo33603e(Bundle bundle, Bundle bundle2) throws RemoteException {
        this.f1524b.f1539e.mo33820b();
        C2131am.f1535a.mo33811d("onGetChunkFileDescriptor", new Object[0]);
    }

    /* renamed from: f */
    public void mo33604f(Bundle bundle, Bundle bundle2) {
        this.f1524b.f1539e.mo33820b();
        C2131am.f1535a.mo33811d("onRequestDownloadInfo()", new Object[0]);
    }

    /* renamed from: g */
    public void mo33605g(Bundle bundle) {
        this.f1524b.f1539e.mo33820b();
        int i = bundle.getInt("error_code");
        C2131am.f1535a.mo33809b("onError(%d)", Integer.valueOf(i));
        this.f1523a.mo34075d(new AssetPackException(i));
    }

    /* renamed from: h */
    public final void mo33606h(int i) {
        this.f1524b.f1539e.mo33820b();
        C2131am.f1535a.mo33811d("onCancelDownload(%d)", Integer.valueOf(i));
    }

    /* renamed from: i */
    public void mo33607i() {
        this.f1524b.f1539e.mo33820b();
        C2131am.f1535a.mo33811d("onCancelDownloads()", new Object[0]);
    }

    /* renamed from: j */
    public final void mo33608j(int i) {
        this.f1524b.f1539e.mo33820b();
        C2131am.f1535a.mo33811d("onGetSession(%d)", Integer.valueOf(i));
    }

    /* renamed from: k */
    public void mo33609k(Bundle bundle) {
        this.f1524b.f1539e.mo33820b();
        C2131am.f1535a.mo33811d("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }

    /* renamed from: l */
    public void mo33610l(Bundle bundle) {
        this.f1524b.f1539e.mo33820b();
        C2131am.f1535a.mo33811d("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }

    /* renamed from: m */
    public void mo33611m(Bundle bundle) {
        this.f1524b.f1539e.mo33820b();
        C2131am.f1535a.mo33811d("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }

    /* renamed from: n */
    public void mo33612n() {
        this.f1524b.f1539e.mo33820b();
        C2131am.f1535a.mo33811d("onRemoveModule()", new Object[0]);
    }
}
