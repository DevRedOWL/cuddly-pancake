package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C2241ag;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.play.core.assetpacks.dd */
final class C2203dd {

    /* renamed from: a */
    private static final C2241ag f1819a = new C2241ag("VerifySliceTaskHandler");

    /* renamed from: b */
    private final C2138at f1820b;

    C2203dd(C2138at atVar) {
        this.f1820b = atVar;
    }

    /* renamed from: b */
    private final void m1061b(C2202dc dcVar, File file) {
        try {
            File o = this.f1820b.mo33647o(dcVar.f1714k, dcVar.f1815a, dcVar.f1816b, dcVar.f1817c);
            if (o.exists()) {
                try {
                    if (C2183ck.m1013a(C2201db.m1059a(file, o)).equals(dcVar.f1818d)) {
                        f1819a.mo33811d("Verification of slice %s of pack %s successful.", dcVar.f1817c, dcVar.f1714k);
                        return;
                    }
                    throw new C2155bj(String.format("Verification failed for slice %s.", new Object[]{dcVar.f1817c}), dcVar.f1713j);
                } catch (NoSuchAlgorithmException e) {
                    throw new C2155bj("SHA256 algorithm not supported.", e, dcVar.f1713j);
                } catch (IOException e2) {
                    throw new C2155bj(String.format("Could not digest file during verification for slice %s.", new Object[]{dcVar.f1817c}), e2, dcVar.f1713j);
                }
            } else {
                throw new C2155bj(String.format("Cannot find metadata files for slice %s.", new Object[]{dcVar.f1817c}), dcVar.f1713j);
            }
        } catch (IOException e3) {
            throw new C2155bj(String.format("Could not reconstruct slice archive during verification for slice %s.", new Object[]{dcVar.f1817c}), e3, dcVar.f1713j);
        }
    }

    /* renamed from: a */
    public final void mo33765a(C2202dc dcVar) {
        File h = this.f1820b.mo33640h(dcVar.f1714k, dcVar.f1815a, dcVar.f1816b, dcVar.f1817c);
        if (h.exists()) {
            m1061b(dcVar, h);
            File i = this.f1820b.mo33641i(dcVar.f1714k, dcVar.f1815a, dcVar.f1816b, dcVar.f1817c);
            if (!i.exists()) {
                i.mkdirs();
            }
            if (!h.renameTo(i)) {
                throw new C2155bj(String.format("Failed to move slice %s after verification.", new Object[]{dcVar.f1817c}), dcVar.f1713j);
            }
            return;
        }
        throw new C2155bj(String.format("Cannot find unverified files for slice %s.", new Object[]{dcVar.f1817c}), dcVar.f1713j);
    }
}
