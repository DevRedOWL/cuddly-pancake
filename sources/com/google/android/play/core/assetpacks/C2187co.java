package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C2241ag;
import java.io.File;
import java.io.IOException;

/* renamed from: com.google.android.play.core.assetpacks.co */
final class C2187co {

    /* renamed from: a */
    private static final C2241ag f1761a = new C2241ag("MergeSliceTaskHandler");

    /* renamed from: b */
    private final C2138at f1762b;

    C2187co(C2138at atVar) {
        this.f1762b = atVar;
    }

    /* renamed from: b */
    private static void m1030b(File file, File file2) {
        if (file.isDirectory()) {
            file2.mkdirs();
            for (File file3 : file.listFiles()) {
                m1030b(file3, new File(file2, file3.getName()));
            }
            if (!file.delete()) {
                String valueOf = String.valueOf(file);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb.append("Unable to delete directory: ");
                sb.append(valueOf);
                throw new C2155bj(sb.toString());
            }
        } else if (file2.exists()) {
            String valueOf2 = String.valueOf(file2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 51);
            sb2.append("File clashing with existing file from other slice: ");
            sb2.append(valueOf2);
            throw new C2155bj(sb2.toString());
        } else if (!file.renameTo(file2)) {
            String valueOf3 = String.valueOf(file);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 21);
            sb3.append("Unable to move file: ");
            sb3.append(valueOf3);
            throw new C2155bj(sb3.toString());
        }
    }

    /* renamed from: a */
    public final void mo33735a(C2186cn cnVar) {
        File i = this.f1762b.mo33641i(cnVar.f1714k, cnVar.f1758a, cnVar.f1759b, cnVar.f1760c);
        if (i.exists()) {
            File j = this.f1762b.mo33642j(cnVar.f1714k, cnVar.f1758a, cnVar.f1759b);
            if (!j.exists()) {
                j.mkdirs();
            }
            m1030b(i, j);
            try {
                this.f1762b.mo33644l(cnVar.f1714k, cnVar.f1758a, cnVar.f1759b, this.f1762b.mo33643k(cnVar.f1714k, cnVar.f1758a, cnVar.f1759b) + 1);
            } catch (IOException e) {
                f1761a.mo33809b("Writing merge checkpoint failed with %s.", e.getMessage());
                throw new C2155bj("Writing merge checkpoint failed.", e, cnVar.f1713j);
            }
        } else {
            throw new C2155bj(String.format("Cannot find verified files for slice %s.", new Object[]{cnVar.f1760c}), cnVar.f1713j);
        }
    }
}
