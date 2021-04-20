package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import com.google.android.play.core.internal.C2289ca;
import com.google.android.play.core.tasks.Tasks;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.play.core.assetpacks.bb */
final class C2147bb {

    /* renamed from: a */
    private final C2289ca<C2220s> f1590a;

    C2147bb(C2289ca<C2220s> caVar) {
        this.f1590a = caVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final InputStream mo33679a(int i, String str, String str2, int i2) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) Tasks.await(this.f1590a.mo33869a().mo33620h(i, str, str2, i2));
            if (parcelFileDescriptor != null && parcelFileDescriptor.getFileDescriptor() != null) {
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            }
            throw new C2155bj(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)}), i);
        } catch (ExecutionException e) {
            throw new C2155bj(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)}), e, i);
        } catch (InterruptedException e2) {
            throw new C2155bj("Extractor was interrupted while waiting for chunk file.", e2, i);
        }
    }
}
