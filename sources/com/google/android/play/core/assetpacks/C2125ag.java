package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.play.core.tasks.C2415i;

/* renamed from: com.google.android.play.core.assetpacks.ag */
final class C2125ag extends C2124af<ParcelFileDescriptor> {
    C2125ag(C2131am amVar, C2415i<ParcelFileDescriptor> iVar) {
        super(amVar, iVar);
    }

    /* renamed from: e */
    public final void mo33603e(Bundle bundle, Bundle bundle2) throws RemoteException {
        super.mo33603e(bundle, bundle2);
        this.f1523a.mo34076e((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
